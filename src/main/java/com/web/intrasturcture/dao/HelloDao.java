package com.web.intrasturcture.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer>{

}
