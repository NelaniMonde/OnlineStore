package com.mondenelani.onlineStore.Repositories;

import com.mondenelani.onlineStore.Models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long>
{
}
