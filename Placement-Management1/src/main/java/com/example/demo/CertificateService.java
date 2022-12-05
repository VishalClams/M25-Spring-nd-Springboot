package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CertificateService {
	@Autowired
	private CertificateRepository repo;
	//to retrieve all the data
	public List<Certificate> listAll() {
		
		return repo.findAll();
	}
	//to retrieve a specific row
	public Certificate get(Integer id) {
		
		return repo.findById(id).get();
	}
	//create
	public void save(Certificate certificate) {
		 repo.save(certificate);
		
	}
	//delete
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

}