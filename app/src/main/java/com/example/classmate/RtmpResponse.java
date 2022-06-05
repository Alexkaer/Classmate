package com.example.classmate;

import java.io.Serializable;

/**
 * FileName: RtmpResponse
 * Author: Minson
 * Created Date: 2022/3/14 20:38
 * Email: Minson.xu@trustsl.com
 * Description:
 */

public class RtmpResponse implements Serializable {

    /**
     * status : 0
     * msg : 成功
     * object : {"msg":"Operation succeeded","code":"200","data":{"id":"423434009176006656","url":"rtmp://rtmp01open.ys7.com:1935/v3/openlive/629936731_1_1?expire=1647227434&id=423434009176006656&t=6e9a13632c6ff04ebd2726d6a3f428831a6962ec1eb5b3bac85183752e482da5&ev=100&supportH265=1","expireTime":"2022-03-14 11:10:34"}}
     */

    private String status;
    private String msg;
    private ObjectBean object;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ObjectBean getObject() {
        return object;
    }

    public void setObject(ObjectBean object) {
        this.object = object;
    }

    public static class ObjectBean implements Serializable {
        /**
         * msg : Operation succeeded
         * code : 200
         * data : {"id":"423434009176006656","url":"rtmp://rtmp01open.ys7.com:1935/v3/openlive/629936731_1_1?expire=1647227434&id=423434009176006656&t=6e9a13632c6ff04ebd2726d6a3f428831a6962ec1eb5b3bac85183752e482da5&ev=100&supportH265=1","expireTime":"2022-03-14 11:10:34"}
         */

        private String msg;
        private String code;
        private DataBean data;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean implements Serializable {
            /**
             * id : 423434009176006656
             * url : rtmp://rtmp01open.ys7.com:1935/v3/openlive/629936731_1_1?expire=1647227434&id=423434009176006656&t=6e9a13632c6ff04ebd2726d6a3f428831a6962ec1eb5b3bac85183752e482da5&ev=100&supportH265=1
             * expireTime : 2022-03-14 11:10:34
             */

            private String id;
            private String url;
            private String expireTime;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getExpireTime() {
                return expireTime;
            }

            public void setExpireTime(String expireTime) {
                this.expireTime = expireTime;
            }
        }
    }
}
