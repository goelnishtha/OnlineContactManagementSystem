package com.example.Online.Contact.Management.System.Controllers;


import com.example.Online.Contact.Management.System.Models.Contacts;
import com.example.Online.Contact.Management.System.Repository.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ContactsController {

    @Autowired
    private ContactsRepository repo;

    @PostMapping("/addusers")
    public ResponseEntity<Map<String,String>> addusers(@RequestBody Contacts c){

    Contacts c1=repo.save(c);
    Map<String,String> response=new HashMap<>();
    response.put("status","Success!!");
    return ResponseEntity.ok(response);



    }
    @GetMapping("/viewallUsers")
    public ResponseEntity<List<Contacts>> viewAllUsers()
    {
        List<Contacts> vdata=repo.findAll();
        return ResponseEntity.ok(vdata);
    }

    @PostMapping("/updateUser")
    public ResponseEntity<Map<String,String>> updateUser(@RequestBody Contacts pt3){
        repo.updateUser(pt3.getName(), pt3.getEmail(), pt3.getPhono());
        Map<String,String> response=new HashMap<>();
        response.put("Status" , "Success");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/deleteUser")
    public ResponseEntity<Map<String,String>> deleteUser(@RequestBody Contacts pt2){
        repo.deleteUser(pt2.getEmail());
        Map<String,String> response=new HashMap<>();
        response.put("Status" , "Success");
        return ResponseEntity.ok(response);
    }







}
