package com.arielj.springboot.repositories;

import com.arielj.springboot.models.FibonacciModels;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface FibonacciRepositories extends CrudRepository <FibonacciModels,Long>{

    public abstract ArrayList<FibonacciModels>findByInput(Integer input);

}
