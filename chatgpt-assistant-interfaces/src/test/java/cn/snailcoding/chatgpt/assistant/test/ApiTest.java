package cn.snailcoding.chatgpt.assistant.test;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * @author jiansheng_xu
 * @description 单元测试
 */
public class ApiTest {
    @Test
    public void query_unanswered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/28888821254141/topics?scope=unanswered_questions&count=20");

        get.addHeader("Content-Type", "application/json;charset=utf8");
        get.addHeader("cookie","tfstk=fbnnT_seA51bfnXJtcqBjF75eJLtd6Z75bI8wuFy75P19_HPy7Wre5nL9vEUE_lxw8PEwkCkqfqUP2F897qoFjv9MnKxdvZ72IdvDDRmWaZfTMSPwNWaEWAbZH-xdv6wTcjYrnQkO2QDK7lz85zaF5SUabzz_d2ze67PYbkwI8NNY7yUzA5ae8QFaUnP0WHtncJXmYE-8xAIbJ43ZgFGqUJ8LyDmKDA2gcxz-SkUsgAjDbRu_-mwN6FSjAoUFf-OxuDaEjqESCSnZvujN-lej6yn8xDYS0OVqRgZOPenSL7aTxPQY5mWFgNEJYo8rDRVeWoI9c4jV6ATwqHtYPc26Gc7r2u4Y0ADbgWR7ZJmkgwwec75Pyy_IS6C-f7vkUOoJdvGuPaUCJ8eIdb5Pyy_ISpMIZz_8Rwe8; zsxq_access_token=056BC230-A07D-B4FD-B0AB-7EFD9E5206CE_D22019A74BFEBA24; zsxqsessionid=b096082af67961cf827a492bccac666f; abtest_env=product");
        CloseableHttpResponse response = httpClient.execute(get);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/4844815584141418/answer");
        post.addHeader("cookies","tfstk=fbnnT_seA51bfnXJtcqBjF75eJLtd6Z75bI8wuFy75P19_HPy7Wre5nL9vEUE_lxw8PEwkCkqfqUP2F897qoFjv9MnKxdvZ72IdvDDRmWaZfTMSPwNWaEWAbZH-xdv6wTcjYrnQkO2QDK7lz85zaF5SUabzz_d2ze67PYbkwI8NNY7yUzA5ae8QFaUnP0WHtncJXmYE-8xAIbJ43ZgFGqUJ8LyDmKDA2gcxz-SkUsgAjDbRu_-mwN6FSjAoUFf-OxuDaEjqESCSnZvujN-lej6yn8xDYS0OVqRgZOPenSL7aTxPQY5mWFgNEJYo8rDRVeWoI9c4jV6ATwqHtYPc26Gc7r2u4Y0ADbgWR7ZJmkgwwec75Pyy_IS6C-f7vkUOoJdvGuPaUCJ8eIdb5Pyy_ISpMIZz_8Rwe8; zsxq_access_token=056BC230-A07D-B4FD-B0AB-7EFD9E5206CE_D22019A74BFEBA24; zsxqsessionid=b096082af67961cf827a492bccac666f; abtest_env=product");
        post.addHeader("Content-Type", "application/json;charset=utf8");

        String paramJson = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"自己去百度！\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"silenced\": false\n" +
                "  }\n" +
                "}";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
}
