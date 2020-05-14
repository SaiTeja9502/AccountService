package com.pbs.accs.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pbs.accs.dao.AccountDAO;
import com.pbs.accs.dto.Account;
@Service
public class AccountService 
{
	@Autowired 
	AccountDAO accountDao;
	public void setAccountDao(AccountDAO accountDao)
	{
		this.accountDao=accountDao;
	}
	
	@Transactional(readOnly=true)
	public Optional<Account> getAccount(Long accountNo)
	{
		return accountDao.findById(accountNo);
	}
	
	@Transactional
	public void addAccount(Account account)
	{
		accountDao.save(account);
		accountDao.flush();
	}
	
	@Transactional
	public void updateAccount(Account account)
	{
		accountDao.save(account);
		accountDao.flush();
	}   
	
	@Transactional
	public void deleteAccount(Long accountNo)
	{
		accountDao.deleteById(accountNo);
		accountDao.flush();
	}
	
}
