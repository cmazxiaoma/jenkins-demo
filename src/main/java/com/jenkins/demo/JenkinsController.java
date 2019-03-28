package com.jenkins.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2019/3/19 23:34
 */
@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

    @GetMapping("/hello")
    public String hello() {
        return "hello,jenkins,v2";
    }
}
