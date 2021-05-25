package com.arielj.springboot.models;


import javax.persistence.*;

@Entity
@Table(name = "entries")
public class FibonacciModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private Long input;
    private boolean success;
    private String message;
    private String date;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getInput() {
        return input;
    }

    public void setInput(long input) {
        this.input = input;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isFibonacci(long n ) {
        int x, y, fib;
        x = -1;
        y = 1;
        fib = 0;
        while (fib < n) {
            fib = x + y;
            x = y;
            y = fib;
        }

        if (fib == n) return true;
        else {

            return false;

        }

    }

}
