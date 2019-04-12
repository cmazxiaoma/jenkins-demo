package com.jenkins.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaoma
 * @version V1.0
 * @Description: TODO
 * @date 2019/3/29 13:26
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;
}
