package org.zakharov.dao;

import org.springframework.stereotype.Repository;
import org.zakharov.model.User;

import java.util.*;

@Repository
public class UserDAO {
    private static final Map<String, User> usrMap = new HashMap<>();

    static {
        initUsr();
    }

    private static void initUsr(){
        User user1 = new User("1", "Max", "Caulfield", "1995");
        User user2 = new User("2", "Chloe", "Price", "1995");
        User user3 = new User("3", "Rachel", "Ember", "1994");

        usrMap.put(user1.getId(), user1);
        usrMap.put(user2.getId(), user2);
        usrMap.put(user3.getId(), user3);
    }

    public User getUsr(String id){
        return usrMap.get(id);
    }

    public User addUsr(User usr){
        usrMap.put(usr.getId(), usr);
        return usr;
    }

    public User updateUsr(User usr){
        usrMap.put(usr.getId(), usr);
        return usr;
    }

    public void deleteUsr(String id){
        usrMap.remove(id);
    }

    public List<User> getAllUsers(){
        Collection<User> collection = usrMap.values();
        List<User> list = new ArrayList<>();
        list.addAll(collection);
        return list;
    }
}
