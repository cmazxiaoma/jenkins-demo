package com.jenkins.demo.service;

import com.jenkins.demo.model.Girl;

import java.util.List;

/**
 * @author xiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2019/3/29 13:28
 */
public interface IGirlService {

    List<Girl> findAll();
}
