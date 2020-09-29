package com.contentcenter.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author F*WT
 * @Date 2020/9/29 21:31
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseResult implements Serializable {
    private static final long serialVersionUID = -3948389268046368059L;

    private Integer code;

    private String msg;

    private Object data;

}
