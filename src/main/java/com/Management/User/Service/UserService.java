package com.Management.User.Service;

import com.Management.User.Model.User;
import com.Management.User.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public Optional<User> getUserbyId(String id){
        return userRepo.findById(id);
    }

    public List<User> getUsers(){
        return userRepo.findAll();
    }

    // getByName add karo
      //get by age
    // delete by name
    // delete by age

    public User saveUser(User user){
       return userRepo.save(user);
    }

    public void deleteById(String id){
        userRepo.deleteById(id);
    }
}
