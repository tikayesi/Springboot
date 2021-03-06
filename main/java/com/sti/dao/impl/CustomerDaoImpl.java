package com.sti.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.init.RepositoriesPopulatedEvent;

import com.sti.dao.api.CustomerDao;
import com.sti.dao.model.Customer;
import com.sti.dao.repository.CustomerRepository;

public class CustomerDaoImpl extends BaseImpl implements CustomerDao{
	
	@Autowired
	private CustomerRepository repository;

	@Override
	public Customer getById(int id) throws Exception {
		return repository.findOne(id);
	}

	@Override
	public Customer save(Customer customer) throws Exception {
		return repository.save(customer);
	}

	@Override
	public void delete(Customer customer) throws Exception {
		repository.delete(customer);
		
	}

	@Override
	public List<Customer> getList() throws Exception {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<Customer> query = critB.createQuery(Customer.class);
		Root<Customer> root = query.from(Customer.class);
		query.select(root);
		
		TypedQuery<Customer> q = em.createQuery(query);
		
		return q.getResultList();
	}
	

}
