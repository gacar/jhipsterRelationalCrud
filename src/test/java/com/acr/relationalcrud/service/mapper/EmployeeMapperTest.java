package com.acr.relationalcrud.service.mapper;

import org.junit.jupiter.api.BeforeEach;

class EmployeeMapperTest {

    private EmployeeMapper employeeMapper;

    @BeforeEach
    public void setUp() {
        employeeMapper = new EmployeeMapperImpl();
    }
}
