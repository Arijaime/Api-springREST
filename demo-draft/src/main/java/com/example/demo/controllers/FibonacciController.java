package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.FibonacciModel;
import com.example.demo.services.FibonacciServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/isFibonacci")

public class FibonacciController {
    @Autowired
    FibonacciServices fibonacciServices;

    @GetMapping
    public ArrayList <FibonacciModel> getFibonacciModel(){
        return fibonacciServices.getInputs();
    }

    @PostMapping
    public FibonacciModel saveFibonacciModel(@RequestBody FibonacciModel fibonacci){
        return this.fibonacciServices.saveInput(fibonacci);
    }
}
