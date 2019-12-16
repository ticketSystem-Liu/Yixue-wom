package com.wom.model.dao.request;

import lombok.Data;

import java.util.Date;

@Data
public class UpdateWoListDto {
    private Integer id;
    //工单状态
    private Integer workType;
    //问题补充
    private String  problem;
    //处理描述
    private String dispose;
    //图片附件
    private String update_by;
    //更新时间
    private Date update_at;
}
