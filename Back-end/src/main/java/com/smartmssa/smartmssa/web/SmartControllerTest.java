package com.smartmssa.smartmssa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.smartmssa.smartmssa.services.serviceImpl.SmartServicesTestImpl;
import com.smartmssa.smartmssa.web.api.SmartControllerTestApi;

@RestController
@CrossOrigin("*")
public class SmartControllerTest implements SmartControllerTestApi {

    // *********************************************************************************
    // * Create your class controller in the same repo of the Controller Test
    // ********
    // * You can delete the class Controller test
    // **************************************
    // *********************************************************************************

    @Autowired
    private SmartServicesTestImpl smartServicesTestImpl;

    @Override
    public ResponseEntity<String> welcom() {
        return ResponseEntity.status(HttpStatus.OK).body(smartServicesTestImpl.welcome());
    }

    @Override

    public ResponseEntity<String> goodbye() {
        return ResponseEntity.status(HttpStatus.OK).body(smartServicesTestImpl.goodbye());
    }
}