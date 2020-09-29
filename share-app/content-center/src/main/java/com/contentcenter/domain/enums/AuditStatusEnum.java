package com.contentcenter.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author F*WT
 * @Date 2020/9/29 21:35
 * @Description
 */
@Getter
@AllArgsConstructor
public enum AuditStatusEnum {
    /**
     * 待审核
     */
    NOT_YET,
    /**
     * 审核通过
     */
    PASSED,
    /**
     * 审核不通过
     */
    REJECT
}
