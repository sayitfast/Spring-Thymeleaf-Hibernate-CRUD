package com.sayitfast.usermgt.service;

import com.sayitfast.usermgt.model.Employee;
import java.util.List;
import org.springframework.data.domain.Page;

/**
 * Created by IntelliJ IDEA. User: Rhett Herring 9/14/20 2:00 PM
 */
public interface EmployeeService {

  List<Employee> getAllEmployees();

  void saveEmployee(Employee employee);

  Employee getEmployeeById(long id);

  void deleteEmployeeById(long id);

  Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
