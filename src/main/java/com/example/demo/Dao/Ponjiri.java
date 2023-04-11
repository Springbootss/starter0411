package com.example.demo.Dao;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Member;

public interface Ponjiri extends CrudRepository<Member, Integer> {
	
	
//	@Query(value = "select * from Member where name=?",nativeQuery = true);
	

}
