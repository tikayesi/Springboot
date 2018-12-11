//package com.sti.tikaApps;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/tugas")
//public class Controllerdua {
//	
//	@GetMapping("/Customer/{customerNumber}")
//	public String customerPathVariable(@PathVariable("customerNumber") Integer customerNumber) {
//		return "customer " + customerNumber;
//	}
//	
//	@PostMapping("/Customer")
//	public Customer hello(@RequestBody Customer customer) {
//		return customer;
//	}
//	
//	@PutMapping("/Customer")
//	public Customer update(@RequestBody Customer cust) {
//		cust.setFirstName("tikem");
//		return cust;
//	}
//	
//	@DeleteMapping("/Customer{customerNumber}")
//	public Customer delet(@PathVariable String customerNumber) {
//		Customer customer = new Customer();
//		customer.setCustomerNumber(Integer.parseInt(customerNumber));
//		return customer;
//	}
//	
//	@DeleteMapping("/Cuss/{customerNumber}")
//	public String delete(@PathVariable("customerNumber") String customerNumber) {
//		return "delete " + customerNumber;
//	}
//	
//	@GetMapping("/test")
//	public ArrayList<Customer> Getlist(){
//		ArrayList<Customer> list = new ArrayList<Customer>();
//		return list ;
//	}
//	
//	@GetMapping("/Customers")
//	public List<Customer> getlistall(){
//		Customer cs = new Customer();
//		cs.setCustomerNumber(123879);
//		cs.setFirstName("Ticca");
//		ArrayList<Customer> list = new ArrayList<Customer>();
//		list.add(cs);
//		return list ;
//		
//	}
//	@PostMapping("/customerss")
//	public Customer post(@RequestParam ("id") String customer) {
//		Customer cs = new Customer();
//		cs.setFirstName(customer);
//		return cs;
//	}
//	
//	@GetMapping("/riska/{firstName}")
//	public String nama(@PathVariable("firstName") String firstName) {
//		return firstName;
//	}
//}
//
