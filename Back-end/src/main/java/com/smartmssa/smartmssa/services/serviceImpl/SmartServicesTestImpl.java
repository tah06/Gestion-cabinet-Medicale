package com.smartmssa.smartmssa.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartmssa.smartmssa.dao.SmartTestRepository;
import com.smartmssa.smartmssa.entity.SmartTest;
import com.smartmssa.smartmssa.services.SmartServicesTest;

@Service
public class SmartServicesTestImpl implements SmartServicesTest{

    // ******************************************************************************************
    // * Create  your class services Implement in the same repo of the service Implement Test ***
    // * You can delete the class service implement test ****************************************
    // ******************************************************************************************
    
    @Autowired
    private SmartTestRepository smartTestRepository;

    @Override
    public String welcome() {
        SmartTest defaulTest = new SmartTest();
        return defaulTest.getWelcome();
    }

    @Override
    public String goodbye() {
        SmartTest defaulTest = new SmartTest();
        return defaulTest.getGoodbye();
    }
}