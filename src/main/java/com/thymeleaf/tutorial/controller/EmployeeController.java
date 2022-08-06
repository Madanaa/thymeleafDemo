package com.thymeleaf.tutorial.controller;

import com.thymeleaf.tutorial.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
    @GetMapping({"/employee","/home"})
    public String employee( Model m) {
        Employee emp = new Employee();
        emp.setName("Madan");
        emp.setMob("914567889");
        emp.setName("Sumit");
        emp.setMob("917843218");
        m.addAttribute("myEmp",emp);

        return "Employee";


    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @ResponseBody
    @GetMapping("/emp/{eid}")
    public String emp(@PathVariable("eid") String id) {
        return  " Your Employee :" +id;
    }


}
