package com.springBootCrudMysql.SpringBootCrudMysql.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

}
