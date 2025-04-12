package com.exampleemployeeapi.Employeeapi.service;

import com.exampleemployeeapi.Employeeapi.entity.Employeedata;
import com.exampleemployeeapi.Employeeapi.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public Employeedata createEmployeedata(Employeedata employeedata){
        return employeeRepo.save(employeedata);
    }
    public List<Employeedata> createEmployeedata(List<Employeedata> employeedata){
         employeeRepo.saveAll(employeedata);
        return  employeedata;
    }
    public Employeedata getEmployeedataById(Integer Id){
        return employeeRepo.findById(Long.valueOf(Id)).orElse(null);
    }
    public List<Employeedata> getEmployeedatas(){
        return employeeRepo.findAll();
    }
    public Object updateEmployeedata(Employeedata employeedata){
        Employeedata oldEmployeedata = null;
        Optional<Employeedata> OptionalEmployeedata=employeeRepo.findById(employeedata.getId());
        if(OptionalEmployeedata.isPresent()) {
            oldEmployeedata=OptionalEmployeedata.get();
            oldEmployeedata.setEmail("rahul@tcs.com");
            oldEmployeedata.setTeam("Devx");
        }else {
            return new Employeedata();
        }
        return employeedata;
        }
    public String DeleteEmployeedataById(int Id){
        employeeRepo.deleteById((long) Id);
        return "Employeedata deleted";
    }

//    public Object getEmployeedataById(long l) {
//        return null;
//    }
}

