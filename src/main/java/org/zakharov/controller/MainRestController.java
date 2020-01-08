package org.zakharov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.zakharov.dao.UserDAO;
import org.zakharov.model.User;

import java.util.List;

@RestController
public class MainRestController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping("/")
    @ResponseBody
    public String welcome(){
        return "Welcome to Rest CRUD";
    }

    @RequestMapping(value = "/users",
    method = RequestMethod.GET,
    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<User> getUsers(){
        List<User> list = userDAO.getAllUsers();
        return list;
    }

    @RequestMapping(value = "/users/{id}",
    method = RequestMethod.GET,
    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public User getUsr(@PathVariable("id") String id){
        return userDAO.getUsr(id);
    }

    @RequestMapping(value = "/users",
    method = RequestMethod.POST,
    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public User addUsr(@RequestBody User usr){
        return userDAO.addUsr(usr);
    }

    @RequestMapping(value = "/users",
            method = RequestMethod.PUT,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public User updatedUsr(@RequestBody User usr){
        return userDAO.updateUsr(usr);
    }

    @RequestMapping(value = "/users/{id}",
    method = RequestMethod.DELETE,
    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public void deleteUsr(@PathVariable("id") String id) {
        userDAO.deleteUsr(id);
    }
}
