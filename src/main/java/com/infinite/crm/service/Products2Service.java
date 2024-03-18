package com.infinite.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.crm.model.Products2;
import com.infinite.crm.repository.Products2Repository;

@Service
public class Products2Service {
	
	@Autowired
	private Products2Repository prodRepo;
	
	public Products2 adduser(Products2 newProduct) {
		// TODO Auto-generated method stub
		return prodRepo.save(newProduct);
	}

	public List<Products2> productList() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}

	public Object findproduct(Long id) {
		// TODO Auto-generated method stub
		return prodRepo.findById(id);
	}

	public boolean exist(Long id) {
		// TODO Auto-generated method stub
		return prodRepo.existsById(id);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		prodRepo.deleteById(id);
	}

	public Products2 findById(Long id,Products2 newProduct) {
		// TODO Auto-generated method stub
		return prodRepo.findById(id).map(product -> {
			product.setPname(newProduct.getPname());
			product.setRating(newProduct.getRating());
			product.setPrice(newProduct.getPrice());
			product.setBrand(newProduct.getBrand());
			return prodRepo.save(product);
		}).get();
	}

	public Products2 productById(Long id) {
		// TODO Auto-generated method stub
		return prodRepo.findById(id).get();
	}

}
