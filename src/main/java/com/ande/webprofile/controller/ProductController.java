package com.ande.webprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ande.webprofile.domain.repository.ProductRepository;
import com.ande.webprofile.service.ProductService;

@Controller
public class ProductController {
	@RequestMapping ("/products")
	public String list (Model model) {
		
		model.addAttribute("products", productRepository.getAllProducts());
		
		return "products";
		
	}
	
	@RequestMapping("/update/stock")
	public String updateStock(Model model) {
	   productService.updateAllStock();
	   return "redirect:/products";
	}
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductService productService;
	
}
