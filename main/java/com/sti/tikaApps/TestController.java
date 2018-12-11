//package com.sti.tikaApps;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/test")
//public class TestController {
//	
//	
////	@GetMapping("/hello")
////	public String hello() {
////		return "hello";
////	}
//	
//	@GetMapping("/hello")
//	public String hello(@RequestParam(value="data", defaultValue="") String data) {
//		return "hello" + data;
//	}
//	
//	@GetMapping("/hello/{data}")
//	public String helloPathVariable(@PathVariable("data") String data) {
//		return "hello" + data;
//	}
//	
//	@PostMapping("/hello")
//	public String hello(@RequestBody Customer customer) {
//		return"hello" + customer.getFirstName();
//	}
//}
