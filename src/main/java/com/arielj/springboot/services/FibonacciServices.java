package com.arielj.springboot.services;

import com.arielj.springboot.models.FibonacciModels;
import com.arielj.springboot.repositories.FibonacciRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class FibonacciServices {
    @Autowired
    FibonacciRepositories fibonacciRepositories;

    public ArrayList<FibonacciModels> getInputs(){
      return   (ArrayList<FibonacciModels>) fibonacciRepositories.findAll();
    }

    public FibonacciModels saveInput(FibonacciModels fibonacciModels){
        System.out.println("El numero ingresado es : "+fibonacciModels.getInput());

        try{
            if (fibonacciModels.getInput()>=0){
                fibonacciModels.setSuccess(fibonacciModels.isFibonacci(fibonacciModels.getInput()));
                System.out.println(fibonacciModels.isSuccess());
                    if (fibonacciModels.isSuccess()){
                        fibonacciModels.setMessage("   Pertenece a Fibonacci" );
                        System.out.println(fibonacciModels.getMessage());
                    }else{
                        fibonacciModels.setMessage("No pertenece a Fibonacci" + " - " +"el valor "+ fibonacciModels.getInput()+" no corresponde a la serie Fibonacci ");
                        System.out.println(fibonacciModels.getMessage());
                    }
            }

            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            System.out.println(localDateTime.format(formatter));

            fibonacciModels.setDate(localDateTime.format(formatter) +" - datetime actual");

            return fibonacciRepositories.save(fibonacciModels);
        }catch (Exception ex){

            return fibonacciRepositories.save(fibonacciModels);
        }

    }

    public Optional<FibonacciModels> getById(Long id){

        return fibonacciRepositories.findById(id);
    }

    public boolean deleteInput(Long id){
        try{
            fibonacciRepositories.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
