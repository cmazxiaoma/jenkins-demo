package com.jenkins.demo.controller;

import com.jenkins.demo.model.Result;
import com.jenkins.demo.service.IGirlService;
import com.jenkins.demo.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2019/3/29 13:36
 */
@RestController
@RequestMapping("/girl")
public class GirlController {

    @Autowired
    private IGirlService girlService;

    @GetMapping("/list")
    public Result list() {
        return ResultGenerator.success(girlService.findAll());
    }
}
