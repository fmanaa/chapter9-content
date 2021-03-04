package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
	
	private final CustomerRepository customerRepository;

    public MainController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

   @GetMapping("/")
   public String hello() {
       return "welcome";
   }
   
   
	@GetMapping("/customers")
    public String customers(Model model) {
        List<Customer> customerList = new ArrayList<>();
        this.customerRepository.findAll().forEach(customerList::add);
        model.addAttribute("customers", customerList);
        return "customers";
    }
}