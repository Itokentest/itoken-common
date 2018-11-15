package com.funtl.itoken.common.hystrix;

import com.funtl.itoken.common.constants.HttpStatusConstants;
import com.funtl.itoken.common.dto.BaseResult;
import com.funtl.itoken.common.utils.MapperUtils;
import com.google.common.collect.Lists;

/**
 * <p>Title: Fallback</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/15 16:28
 */
public class Fallback {


    /**
     * 通用的熔断方法
     * 502错误
     * @return
     */
    public static String badGateway() {
        BaseResult baseResult = BaseResult.notOk(Lists.newArrayList(
                new BaseResult.Error(
                        String.valueOf(HttpStatusConstants.BAD_GATEWAY.getStatus()),
                        String.valueOf(HttpStatusConstants.BAD_GATEWAY.getContent()))));

        try {
            return MapperUtils.obj2json(baseResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
