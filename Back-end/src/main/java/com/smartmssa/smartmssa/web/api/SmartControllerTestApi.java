package com.smartmssa.smartmssa.web.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.smartmssa.smartmssa.utils.Constants;


@RequestMapping(Constants.APP_ROOT)
public interface  SmartControllerTestApi {

    // *****************************************************************************************
    // * Create  your class controller Api  in the same repo of the Controller Api Test ********
    // * You can delete the class Controller Api test ******************************************
    // *****************************************************************************************

    @GetMapping("/welcome")
    public ResponseEntity<String> welcom();

    @GetMapping("/goodbye")
    public ResponseEntity<String> goodbye();
}