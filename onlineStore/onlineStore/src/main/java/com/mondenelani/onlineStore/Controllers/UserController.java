package com.mondenelani.onlineStore.Controllers;

import com.mondenelani.onlineStore.Models.User;
import com.mondenelani.onlineStore.Repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/Users")
@AllArgsConstructor
@RestController
public class UserController
{
    private  UserRepository userRepository;

    @GetMapping
    public Iterable<User> userLists()
    {
        return userRepository.findAll();
    }



    //Proper Response
    @GetMapping("/{id}")
    public ResponseEntity<User> singleUser(@PathVariable Long id)
    {
        var user = userRepository.findById(id).orElse(null);
        var response = ResponseEntity.ok(user);

        if (user==null)
        {
            response  = ResponseEntity.notFound().build();
        }

        return response;

    }

//old way
   /* @GetMapping("/{id}")
    public User singleUser(@PathVariable Long id)
    {
        return  userRepository.findById(id).orElse(null);
    }*/



//    @GetMapping ("/ListForUsers")
//    public List<String> users()
//    {
//        List<String> demoList = new ArrayList<>();
//
//        demoList.add("Monde 1");
//        demoList.add("Monde 2");
//        demoList.add("Monde 3");
//        return demoList;
//    }

}
