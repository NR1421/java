package com.springBootCrudMysql.SpringBootCrudMysql.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;


import com.springBootCrudMysql.SpringBootCrudMysql.model.UserAccount;
import com.springBootCrudMysql.SpringBootCrudMysql.service.UserAccountService;
@RestController
public class Controller {
	
	@Autowired
    private UserAccountService service;
 // RESTful API methods for Retrieval operations
    @GetMapping("/accounts")
public List<UserAccount> list() {
    return service.listAll();
}
 // RESTful API methods for Create operations
    @PostMapping("/accounts")
    public void add(@RequestBody UserAccount account) {
        service.save(account);
    }
 // RESTful API methods for retrieving  
    @GetMapping("/accounts/{id}")
    public ResponseEntity<UserAccount> get(@PathVariable Integer id) {
        try {
        	UserAccount account = service.get(id);
            return new ResponseEntity<UserAccount>(account, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<UserAccount>(HttpStatus.NOT_FOUND);
        }      
    }
 // RESTful API methods for update(put) by id
    @PutMapping("/accounts/{id}")
    public ResponseEntity<?> update(@RequestBody UserAccount account, @PathVariable Integer id) {
        try {
        	//UserAccount existAccount = service.get(id);
            service.save(account);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
 // RESTful API methods for delete by id
    @DeleteMapping("/accounts/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
