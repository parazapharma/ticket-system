package com.paraza.ts.ticketsystem.dao;

import com.paraza.ts.ticketsystem.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
