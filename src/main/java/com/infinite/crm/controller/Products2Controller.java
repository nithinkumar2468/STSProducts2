package com.infinite.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infinite.crm.model.Products2;
import com.infinite.crm.service.Products2Service;

@RestController
public class Products2Controller {
	@Autowired
	private Products2Service prodService;
	
	@Autowired
	private Environment environment;

	@PostMapping("/product2")
	public Products2 newProduct(@RequestBody Products2 newProduct) {
		return prodService.adduser(newProduct);
	}

	@GetMapping("/products2")
	List<Products2> getAllProducts() {
		return prodService.productList();
	}

	/*
	 * @GetMapping("/products") public List<Products> getAllProductsfrom2() {
	 * 
	 * List<Products> response =proxy.getAllProducts(); logger.info("{}",response);
	 * return productService.productList(); }
	 */

	@GetMapping("/product2/{id}")
	public Products2 getProductById(@PathVariable Long id) {
		return prodService.productById(id);
	}

	@PutMapping("/product2/{id}")
	Products2 updateUser(@RequestBody Products2 newProduct, @PathVariable Long id) {
		return prodService.findById(id, newProduct);
	}

	@DeleteMapping("/product2/{id}")
	String deleteProduct(@PathVariable Long id) {
		prodService.delete(id);
		return "User with id " + id + " has been deleted success.";
	}

}
