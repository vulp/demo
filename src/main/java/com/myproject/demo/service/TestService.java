package com.myproject.demo.service;

import com.myproject.demo.domain.Test;

import java.util.List;

public interface TestService {

    List findAllTests() throws Exception;

    Test addTest() throws Exception;
}
