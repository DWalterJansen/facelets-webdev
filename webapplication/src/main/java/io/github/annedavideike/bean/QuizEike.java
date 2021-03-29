/*
 * Copyright (C) 2021 Eike Stálei <eikestalley at gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This source code is used in software development academic classes
 * at IFNMG - Campus Montes Claros by Professor Luis Guisso
 * and is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.annedavideike.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Eike Stálei <eikestaley at gmail.com>
 */
@Named("quizEike")
@RequestScoped
public class QuizEike implements Serializable {
    
    private final String question;
    private final String rightAnswer;
    private final List<String> options;
    private String answer;

    public QuizEike() {
        this.question = "Qual casa de Hogwarts tem o símbolo de cobra no brasão?";
        this.rightAnswer = "Sonserina";
        this.options = new ArrayList<>();
        options.add("Corvinal");
        options.add("Sonserina");
        options.add("Lufa-lufa");
        options.add("Grifinória");
    }
    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        System.out.println("sett " + answer);
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public List<String> getOptions() {
        return options;
    }

    // Auxiliary methods
    public String getVerifyResponse() {
        System.out.println("Resposta do usuário" + answer);
        System.out.println("Resposta certa" + rightAnswer);
        if( rightAnswer.equals(answer) ) {
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
            return "Parabéns! Você acertou!";
        }
        else {
            return "Que pena! Você errou!";
        }
    }
    public void nextPage() {
        System.out.println(this.answer);
    }
    
}

