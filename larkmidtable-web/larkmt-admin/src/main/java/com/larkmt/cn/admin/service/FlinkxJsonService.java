package com.larkmt.cn.admin.service;

import com.larkmt.cn.admin.dto.FlinkXJsonBuildDto;

/**
 * com.guoliang.flinkx json构建服务层接口
 *
 * @author zhouhongfa@gz-yibo.com
 * @version 1.0
 * @since 2019/8/1
 */
public interface FlinkxJsonService {

    /**
     * build flinkx json
     *
     * @param dto
     * @return
     */
    String buildJobJson(FlinkXJsonBuildDto dto);
}
