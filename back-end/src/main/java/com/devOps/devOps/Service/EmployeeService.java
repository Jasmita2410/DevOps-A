package com.devOps.devOps.Service;

import com.devOps.devOps.Dto.EmployeeDTO;
import com.devOps.devOps.Dto.LoginDTO;
import com.devOps.devOps.response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);

}
