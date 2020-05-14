package com.pbs.accs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pbs.accs.dto.Address;
@Repository
public interface AddressDAO extends JpaRepository<Address,Integer>
{

}
