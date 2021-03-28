/*
 * Copyright (C) 2021 David Jansen <davidwalterjansen@gmail.com>
 *
 * This program was developed as part of learning in the course of 
 * Web Development offered by the Federal Institute of Northern Minas Gerais - IFNMG
 * in the period 2021/1 in the ANP mode.
 * After the end of the course you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * During the course, the content is the intellectual property of the developers and any 
 * redistribution or modification without their consent is prohibited.
 */
package io.github.annedavideike.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author David Jansen <davidwalterjansen@gmail.com>
 */
@Named("quizDavid")
@SessionScoped
public class QuizDavid implements Serializable {
    
    private final String question;
    private final String rightAnswer;
    private final List<String> options;
    private String answer;

    public QuizDavid() {
        this.question = "Quanto tempo a luz do sol leva, aproximadamente, para chegar até o planeta Terra?";
        this.rightAnswer = "8 minutos";
        this.options = new ArrayList<>();
        options.add("Imediatamente");
        options.add("Um dia");
        options.add("8 minutos");
        options.add("8 segundos");
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
        System.out.println("Resposta do usuairo" + answer);
        System.out.println("Resposta certa" + rightAnswer);
        if( rightAnswer.equals(answer) ) {
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
