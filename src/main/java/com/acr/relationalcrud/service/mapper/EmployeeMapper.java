package com.acr.relationalcrud.service.mapper;

import com.acr.relationalcrud.domain.Employee;
import com.acr.relationalcrud.service.dto.EmployeeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Employee} and its DTO {@link EmployeeDTO}.
 */
@Mapper(componentModel = "spring")
public interface EmployeeMapper extends EntityMapper<EmployeeDTO, Employee> {}
