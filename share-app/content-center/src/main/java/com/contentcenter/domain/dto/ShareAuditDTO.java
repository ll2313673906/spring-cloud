package com.contentcenter.domain.dto;
import com.contentcenter.domain.enums.AuditStatusEnum;

import lombok.Data;

/**
 * @Author F*WT
 * @Date 2020/9/29 20:50
 * @Description
 */
@Data
public class ShareAuditDTO {
    /**
     * 审核状态
     */
    private AuditStatusEnum auditStatusEnum;
    /**
     * 原因
     */
    private String reason;
}
