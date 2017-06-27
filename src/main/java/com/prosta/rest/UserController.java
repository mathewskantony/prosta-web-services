package com.prosta.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prosta.model.User;
import com.prosta.service.UserService;

/**
 * Created by fan.jin on 2016-10-15.
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping( method = GET, value = "/user/{userId}" )
    public User loadById( @PathVariable Long userId ) {
        return this.userService.findById( userId );
    }

    @RequestMapping( method = GET, value= "/user/all")
    public List<User> loadAll() {
        return this.userService.findAll();
    }


    /*
     *  We are not using userService.findByUsername here(we could),
     *  so it is good that we are making sure that the user has role "ROLE_USER"
     *  to access this endpoint.
     */
    @RequestMapping("/whoami")
    @PreAuthorize("hasRole('USER')")
    public User user() {
        return (User)SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();
    }
}
