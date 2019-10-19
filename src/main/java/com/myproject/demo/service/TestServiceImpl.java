package com.myproject.demo.service;

import com.myproject.demo.domain.Test;
import com.myproject.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService  {

    TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public List findAllTests() throws Exception {
        return testRepository.findAll();
    }

    @Override
    public Test addTest() throws Exception {
        Test test = new Test();
        test.setName("test123");//TODO only for testing
        return testRepository.save(test);
    }
}
