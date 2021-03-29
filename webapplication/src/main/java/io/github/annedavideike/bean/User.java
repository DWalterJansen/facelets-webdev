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
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author David Jansen <davidwalterjansen@gmail.com>
 */
@Named("user")
@SessionScoped
public class User implements Serializable {
    
    private String name;
    private Boolean status;

    public User() {
    }

    public String getName() {
        return name;
    }
    
    public String logar() {
        this.status = true;
        return "main";
    }

    public Boolean getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }
}
