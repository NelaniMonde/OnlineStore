package com.mondenelani.onlineStore.Repositories;

import com.mondenelani.onlineStore.Models.Addresses;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Addresses,Long>
{
}
