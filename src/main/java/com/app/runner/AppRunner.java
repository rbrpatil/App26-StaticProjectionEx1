package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repository.ProductRepository;
@Component
public class AppRunner implements CommandLineRunner {
	@Autowired
	ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.findByProdCost(10.2)
		.forEach(p->System.out.println(
				p.getProdCode()
				+ ","
				+p.getProdModel()
				));
		
		repo.findByProdVendor("M")
		.forEach(p->System.out.println(
				p.getProdVendor()
				+ ","
				+p.getProdCost()
				));
	}

}
