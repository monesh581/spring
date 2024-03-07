package com.example.demosprintsql.practice;

import org.springframework.data.repository.CrudRepository;

public interface userRespo extends CrudRepository<user,Integer> {
}
