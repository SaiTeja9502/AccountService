package com.pbs.accs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pbs.accs.dto.Account;
@Repository
public interface AccountDAO extends JpaRepository<Account,Long>
{
	
}
