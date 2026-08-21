package com.todolist;

import java.sql.SQLException;
import com.todolist.entity.User;
import com.todolist.repository.UserRepository;

public class App {
    public static void main(String[] args) {
        User user1 = new User(1L, "John Doe", "pass1234");
        UserRepository userRepository = new UserRepository();
        
        try {
            userRepository.saveUser(user1);
            
            System.out.println("User saved successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        System.out.println(userRepository.findByUsername(user1.getUsername()));
    }
}
