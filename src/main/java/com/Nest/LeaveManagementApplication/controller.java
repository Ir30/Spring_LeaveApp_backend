package com.Nest.LeaveManagementApplication;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


    @GetMapping("/view")
    public  String view(){
        return "succes";
    }
}
