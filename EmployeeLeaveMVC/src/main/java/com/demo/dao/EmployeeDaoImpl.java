package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbctemp;

	public void save(Employee e) {
		String str="insert into leavetab values(?,?,?,?)";
		jdbctemp.update(str,new Object[] {e.getEmpno(),e.getStart_Date(),e.getEnd_Date(),e.getLeave_Type(),e.getLeave_Reason()
				});
		
	}

	
}
