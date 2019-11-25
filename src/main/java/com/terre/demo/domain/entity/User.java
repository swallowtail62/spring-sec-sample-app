package com.terre.demo.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int userId;

    private String userName;

    private String password;

    private String email;
}
