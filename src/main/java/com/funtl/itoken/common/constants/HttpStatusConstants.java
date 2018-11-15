package com.funtl.itoken.common.constants;

import javax.swing.text.StringContent;

/**
 * <p>Title: HttpStatusConstants</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/13 18:20
 */
public enum HttpStatusConstants {
    BAD_GATEWAY(502,"从上游服务器接收到无效响应");

    private int status;
    private String content;

    private HttpStatusConstants(int status, String content) {
        this.status = status;
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public String getContent() {
        return content;
    }
}
