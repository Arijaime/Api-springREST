package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.FibonacciModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FibonacciRepositories extends CrudRepository<FibonacciModel,Long> {
    public abstract ArrayList<FibonacciModel> findByinput(Integer input);
}