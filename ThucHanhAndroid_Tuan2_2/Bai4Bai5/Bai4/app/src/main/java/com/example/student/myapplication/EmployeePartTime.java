package com.example.student.myapplication;

public class EmployeePartTime extends Employee {

    @Override
    public double TinhLuong() {
        return 150;
    }

    @Override
    public String toString() {
        return super.toString()+"=>PartTime = "+TinhLuong();
    }
}
