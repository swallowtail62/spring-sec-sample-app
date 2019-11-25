package com.terre.demo.adapter.repository.jpa;

import com.terre.demo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserJpaRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
}
