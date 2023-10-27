package com.acr.relationalcrud.service.mapper;

import com.acr.relationalcrud.domain.Employee;
import com.acr.relationalcrud.domain.Task;
import com.acr.relationalcrud.service.dto.EmployeeDTO;
import com.acr.relationalcrud.service.dto.TaskDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring")
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {
    @Mapping(target = "employee", source = "employee", qualifiedByName = "employeeId")
    TaskDTO toDto(Task s);

    @Named("employeeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    EmployeeDTO toDtoEmployeeId(Employee employee);
}
