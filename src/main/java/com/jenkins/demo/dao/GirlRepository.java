package com.jenkins.demo.dao;

import com.jenkins.demo.model.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

/**
 * @author xiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2019/3/29 13:29
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

}
