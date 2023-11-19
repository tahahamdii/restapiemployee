package taha.userlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import taha.userlist.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
