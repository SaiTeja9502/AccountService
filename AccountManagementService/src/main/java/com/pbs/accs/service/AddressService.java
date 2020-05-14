package com.pbs.accs.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pbs.accs.dao.AddressDAO;
import com.pbs.accs.dto.Address;
@Service
public class AddressService 
{
	@Autowired
	AddressDAO addressDao;
	public void setAddressDao(AddressDAO addressDao)
	{
		this.addressDao=addressDao;
	}
	
	@Transactional(readOnly=true)
	public Optional<Address> getAddress(int addressId)
	{
		return addressDao.findById(addressId);
	}
	
	@Transactional
	public void addAddress(Address address)
	{
		addressDao.save(address);
		addressDao.flush();
	}
	
	@Transactional
	public void updateAddress(Address address)
	{
		addressDao.save(address);
		addressDao.flush();
	}   
	
	@Transactional
	public void deleteAddress(int addressId)
	{
		addressDao.deleteById(addressId);
		addressDao.flush();
	}
}
