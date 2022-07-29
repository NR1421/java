package com.springBootCrudMysql.SpringBootCrudMysql.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootCrudMysql.SpringBootCrudMysql.model.UserAccount;
import com.springBootCrudMysql.SpringBootCrudMysql.model.UserAccountRepository;


@Service
@Transactional
public class UserAccountService {
	 @Autowired
	    private UserAccountRepository repo;
	     
	    public List<UserAccount> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(UserAccount product) {
	        repo.save(product);
	    }
	     
	    public UserAccount get(Integer id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(Integer id) {
	        repo.deleteById(id);
	    }

}
