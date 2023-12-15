package com.app.multidatasource.application.userdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.multidatasource.application.userdb.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
