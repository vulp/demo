package com.myproject.demo.repository;

import com.myproject.demo.domain.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends MongoRepository<Test, Long> {

}
