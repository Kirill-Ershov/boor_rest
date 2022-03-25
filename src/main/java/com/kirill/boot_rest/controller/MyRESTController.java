package com.kirill.boot_rest.controller;

import com.kirill.boot_rest.entity.DevEmployee;
import com.kirill.boot_rest.service.DevEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private DevEmployeeService devEmployeeService;

    @GetMapping("/employees")
    public List<DevEmployee> showAllEmployees() {
        List<DevEmployee> allDevEmployees = devEmployeeService.getAllEmployees();
        return allDevEmployees;
    }

    @GetMapping("/employees/{id}")
    public DevEmployee getEmployee(@PathVariable int id) {
        DevEmployee devEmployee = devEmployeeService.getEmployee(id);
        return devEmployee;
    }

    @PostMapping("/employees")
    public DevEmployee addNewEmployee(@RequestBody DevEmployee devEmployee) {
        devEmployeeService.saveEmployee(devEmployee);
        return devEmployee;
    }

    @PutMapping("/employees")
    public DevEmployee updateEmployee(@RequestBody DevEmployee devEmployee) {
        devEmployeeService.saveEmployee(devEmployee);
        return devEmployee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {

        DevEmployee devEmployee = devEmployeeService.getEmployee(id);

        devEmployeeService.deleteEmployee(id);

        return "Employee with id=" + id + " was deleted";
    }

}
