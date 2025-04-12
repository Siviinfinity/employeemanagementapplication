package com.exampleemployeeapi.Employeeapi.controller;

import com.exampleemployeeapi.Employeeapi.entity.Employeedata;
import com.exampleemployeeapi.Employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Employeecontroller {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping
    public Employeedata addEmployeedata(@RequestBody Employeedata employeedata){
       return employeeService.createEmployeedata(employeedata);
    }
    @PostMapping("/add")
    public List<Employeedata> addEmployeedata(@RequestBody List<Employeedata> employeedata){
        return employeeService.createEmployeedata(employeedata);
    }
    @GetMapping("/Employeedata/{Id}")
    public Employeedata getEmployeedataById(@PathVariable int Id){
        return employeeService.getEmployeedataById(Id);
    }
    @GetMapping("/getEmployeedata")
    public List<Employeedata> getAllEmployeedata(){
        return employeeService.getEmployeedatas();
    }
    @PutMapping("/PutEmployeedata")
    public Employeedata updateEmployeedata(@RequestBody Employeedata employeedata){
        return (Employeedata) employeeService.updateEmployeedata(employeedata);

    }
    @DeleteMapping("/Employeedata/{Id}")
    public String deleteEmployeedata(@PathVariable int Id){
        return employeeService.DeleteEmployeedataById(Id);
    }

    @GetMapping("/test")
    public String test(){
        return "working..";
    }
}
