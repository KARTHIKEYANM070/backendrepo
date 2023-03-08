package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.entity;
import com.example.demo.repository.repository;

@Service
public class service {

	@Autowired
	repository Erepo;
	public String addDetails(entity ee) {
		Erepo.save(ee);
		return "Data added";
	}
	public String updateDetails(entity ee) {
		Erepo.saveAndFlush(ee);
		return "Data updated";
	}
	
	public String deleteDetails(int id) {
		Erepo.deleteById(id);
		return "data Deleted";
	}
	public List<entity> sortByField(String field){
		return Erepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public Optional<entity> getById(int id) {
		return Erepo.findById(id);
	}
	public List<entity> showDetails(){
		return Erepo.findAll();
	}
	
	public List<entity> getWithPagination(int offset,int pageSize){
		Page<entity> page = Erepo.findAll(PageRequest.of(offset,pageSize));
		return page.getContent();
	}
}