package com.example.firstproject;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int pid;
    private String brand;
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Laptop [pid=" + pid + ", brand=" + brand + "]";
    }
    public void compile()
    {
        System.out.println("Compling...");
    }
    
}
