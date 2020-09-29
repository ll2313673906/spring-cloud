package com.contentcenter.service;

import com.contentcenter.domain.dto.ShareDTO;

/**
 * @Author F*WT
 * @Date 2020/9/29 21:28
 * @Description
 */
public interface ShareService {
    /**
     * 获得分享详情
     * @return  ShareDTO
     */
    ShareDTO findById(Integer id);

    String getHello();
}
