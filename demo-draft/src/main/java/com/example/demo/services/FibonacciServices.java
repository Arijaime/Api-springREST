package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.FibonacciModel;
import com.example.demo.repositories.FibonacciRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FibonacciServices {

    @Autowired
    FibonacciRepositories fibonacciRepositories;

    public ArrayList<FibonacciModel> getInputs(){
        return(ArrayList<FibonacciModel>) fibonacciRepositories.findAll();
    }
    
    public FibonacciModel saveInput(FibonacciModel fibonacciInput){
        return fibonacciRepositories.save(fibonacciInput);
    }
    
}
