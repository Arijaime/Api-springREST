package com.arielj.springboot.controllers;

import com.arielj.springboot.models.FibonacciModels;
import com.arielj.springboot.services.FibonacciServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/isFibonacci")
public class FibonacciControllers {
    @Autowired
    FibonacciServices fibonacciServices;

    @GetMapping()
    public ArrayList<FibonacciModels> getInputs(){

        return fibonacciServices.getInputs();
    }

    @PostMapping()
    public FibonacciModels saveInputs(@RequestBody FibonacciModels fibonacciModels){
        return this.fibonacciServices.saveInput(fibonacciModels);
    }

    @GetMapping(path="/{id}")
    public Optional<FibonacciModels> getInputById(@PathVariable("id") Long id){
        return this.fibonacciServices.getById(id);
    }

    @DeleteMapping(path ="{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.fibonacciServices.deleteInput(id);
        if (ok){
            return "Se elimino la entrada con el id " + id;
        }else{
            return "No se pudo eliminar la entrada con el id"+id;
        }
    }

}
