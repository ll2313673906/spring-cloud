package com.contentcenter.configuration;
import feign.Logger;

import org.springframework.context.annotation.Bean;

/**
 * @Author F*WT
 * @Date 2020/9/29 21:19
 * @Description
 */
public class GlobalFeignConfiguration {
    @Bean
    public Logger.Level level(){
        // 让feign打印所有请求的细节
        return Logger.Level.FULL;
    }
}
