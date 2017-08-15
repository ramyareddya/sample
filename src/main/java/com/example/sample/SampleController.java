package com.example.sample;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 8/14/2017.
 */
@RestController
@RequestMapping("/test")
public class SampleController {
    List<Employee> employeeList = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET)
    public String logname(){
        return "Hello world";
    }

    @RequestMapping(path = "employee",method = RequestMethod.GET)
    public List<Employee> getEmployees(){
        employeeList = employees();
        return employeeList;
    }

    @RequestMapping(path = "saveemployee",method = RequestMethod.POST)
    public List<Employee> saveEmployees(@RequestBody Employee employee){
        employeeList.add(employee);
        return employeeList;
    }



    private List<Employee> employees() {
        Employee employee = new Employee();
        employee.setFirstName("ramya");
        employee.setLastName("vinod");
        employee.setNumber("12222222");
        Employee employee1 = new Employee();
        employee1.setFirstName("sirisha");
        employee1.setLastName("sirisha");
        employee1.setNumber("333333333");
        Employee employee2 = new Employee();
        employee2.setFirstName("vinod");
        employee2.setLastName("weww");
        employee2.setNumber("3333333333");
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        return employeeList;
    }

//    Collection<Bookmark> readBookmarks(@PathVariable String userId) {
//        this.validateUser(userId);
//        return this.bookmarkRepository.findByAccountUsername(userId);
//    }


}
