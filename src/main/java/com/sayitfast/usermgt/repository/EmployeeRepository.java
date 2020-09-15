package com.sayitfast.usermgt.repository;

import com.sayitfast.usermgt.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA. User: Rhett Herring 9/14/20 1:57 PM
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
