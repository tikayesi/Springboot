package com.sti.dao.api;

import java.util.List;

import com.sti.dao.model.Customer;

public interface CustomerDao {
	Customer getById(int id) throws Exception;
	Customer save(Customer customer) throws Exception;
	void delete(Customer customer) throws Exception;
	
	List<Customer> getList() throws Exception;
	
}
