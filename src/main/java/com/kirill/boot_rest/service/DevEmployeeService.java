package com.kirill.boot_rest.service;


import com.kirill.boot_rest.entity.DevEmployee;

import java.util.List;

public interface DevEmployeeService {

    List<DevEmployee> getAllEmployees();
    void saveEmployee(DevEmployee devEmployee);
    DevEmployee getEmployee(int id);
    void deleteEmployee(int id);

}
