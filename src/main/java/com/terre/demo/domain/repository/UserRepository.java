package com.terre.demo.domain.repository;

import com.terre.demo.domain.entity.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();
}
