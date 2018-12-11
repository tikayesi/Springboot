package com.sti.dao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sti.dao.api.CustomerDao;
import com.sti.dao.model.Customer;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private CustomerDao customerDao;
	
	@GetMapping("/Hello")
	public String hello(@RequestParam(value="id", defaultValue="") String id) {
		try {
			Customer customer = customerDao.getById(Integer.valueOf(id));
			if(customer==null) {
				return "data tidak ditemukan";
			} else {
				return "hello " + customer.getFirstName()+ customer.getLastName();
			}
		} catch (NumberFormatException e) {
			return "salah format input";
		} catch (Exception e) {
			return String.format("terjadi kesalahan sitem : %s", e.getMessage());
		}
	}
	
//	@PostMapping("/test")
//	public String test(@RequestBody Customer cust) {
//	return cust.getFirstName();
//	}
	
	@PostMapping("/post")
	public Customer post(@RequestBody Customer customer ) throws Exception {
		Customer cs = customerDao.save(customer);
		return cs ;
		
	}
	
	@PutMapping("/put")
	public Customer update(@RequestBody Customer customer) throws Exception {
		Customer cust = customerDao.save(customer);
		return cust;
	}
	
	@DeleteMapping("/Customer/{id}")
	public void delet(@PathVariable ("id")  Customer customer) throws Exception {
		customerDao.delete(customer);
	}
	
	@GetMapping("/Customer")
	public List<Customer> test()throws Exception{
		List<Customer> list = customerDao.getList();
		return list;
	}
	
	}

