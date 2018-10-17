package com.spring.data.jpa.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.spring.data.jpa.bean.Employee;

public interface EmployeeRepositorie extends JpaRepository<Employee, Integer> {

	public List<Employee> findByName(String name);

	public List<Employee> findByEidAndName(int i, String string);

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Employee e set e.name=?1 where e.eid=?2")
	public void update_employee(String name,int id);

}
