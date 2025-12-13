package com.mondenelani.onlineStore.Repositories;

import com.mondenelani.onlineStore.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>
{
}
