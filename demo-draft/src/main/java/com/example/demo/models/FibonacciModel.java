package com.example.demo.models;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="entries")
public class FibonacciModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable=false)
    
    private Long input;
    private Boolean success;
    private String message;
    private Date date;


    public Long getInput() {
        return input;
    }
    public void setInput(Long input) {
        this.input = input;
    }
    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
