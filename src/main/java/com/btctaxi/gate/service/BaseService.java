package com.btctaxi.gate.service;

import com.btctaxi.common.Data;
import com.btctaxi.gate.config.DistConfig;
import com.btctaxi.gate.util.SMS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.client.RestTemplate;

public class BaseService {
    protected Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    protected Data data;
    @Autowired
    protected StringRedisTemplate kv;
    @Autowired
    protected RestTemplate http;
    @Autowired
    protected SMS sms;
    @Autowired
    protected DistConfig distConfig;
    @Autowired
    protected EmailService emailService;
}
