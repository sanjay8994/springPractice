package com.dgft.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dgft.model.RegModel;

@Component
@Repository
public class RegDAO {

	@Autowired
	JdbcTemplate template;
	
	private static final String qry="insert into practice.userReg(username ,email) values (?,?)" ;
	
	public void save(RegModel mod)
	{
	
		System.out.println("save method is called");
	  template.update(qry, mod.getUname(),mod.getEmail())	;
	}
	
}
