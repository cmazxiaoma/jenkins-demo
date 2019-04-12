package com.jenkins.demo.service.impl;

import com.jenkins.demo.dao.GirlRepository;
import com.jenkins.demo.model.Girl;
import com.jenkins.demo.service.IGirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2019/3/29 13:30
 */
@Service
public class GirlServiceImpl implements IGirlService {

    @Autowired
    private GirlRepository girlRepository;


    @Override
    public List<Girl> findAll() {
        return girlRepository.findAll();
    }
}
