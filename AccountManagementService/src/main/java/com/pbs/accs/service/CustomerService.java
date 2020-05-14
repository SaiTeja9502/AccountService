package com.pbs.accs.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pbs.accs.dao.CustomerDAO;
import com.pbs.accs.dto.Customer;
@Service
public class CustomerService 
{
	@Autowired
	CustomerDAO customerDao;
	public void setCustomerDao(CustomerDAO customerDao)
	{
		this.customerDao=customerDao;
	}
	
	@Transactional(readOnly=true)
	public Optional<Customer> getCustomer(int customerId)
	{
		return customerDao.findById(customerId);
	}
	
	@Transactional
	public void addCustomer(Customer customer)
	{
		customerDao.save(customer);
		customerDao.flush();
	}
	
	@Transactional
	public void updateCustomer(Customer customer)
	{
		customerDao.save(customer);
		customerDao.flush();
	}   
	
	@Transactional
	public void deleteCustomer(int customerId)
	{
		customerDao.deleteById(customerId);
		customerDao.flush();
	}
}
