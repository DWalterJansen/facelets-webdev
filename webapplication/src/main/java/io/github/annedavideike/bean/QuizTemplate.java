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
import javax.inject.Named;

/**
 *
 * @author David Jansen <davidwalterjansen@gmail.com>
 */
@Named("quizTemplate")
public class QuizTemplate implements Serializable {
    
    private final String question;
    private final String rightAnswer;
    private final List<String> options;
    private String userAnswer;

    public QuizTemplate() {
        this.question = "Question Text";
        this.rightAnswer = "RightAnswer Text";
        this.options = new ArrayList<>();
        options.add("Option 1");
        options.add("Option 2");
        options.add("Option 3");
        options.add("Option 4");
        //...
    }

    // Getters
    public String getQuestion() {
        return question;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    // Setters
    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }
    
    // Auxiliary methods
    public String verifyResponse() {
        if( rightAnswer.equals(userAnswer) ) {
            return "Correct";
        }
        else {
            return "Wrong";
        }
    }
}
