package com.terre.demo.domain.entity;

import com.terre.demo.domain.entity.core.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    private int userId;

    private String userName;

    private String password;

    private String email;
}
