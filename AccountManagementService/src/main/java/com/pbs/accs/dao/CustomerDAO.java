package com.pbs.accs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pbs.accs.dto.Customer;
@Repository
public interface CustomerDAO extends JpaRepository<Customer,Integer>
{

}
