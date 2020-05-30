package com.dhcc.zpc.author;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Ackmicra
 */
@SpringBootApplication
public class AuthorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorApplication.class, args);
    }

    /**
     * 启动服务器后POST访问：
     *      http://127.0.0.1:8082/oauth/token?username=sang&password=123&grant_type=password&client_id=password&scope=all&client_secret=123
     *
     * 这里参数都写在url上，方便，但也是一个post请求：
     *
     *  请求参数：
     *      username：用户名
     *      password：面膜
     *      grant_type：授权模式
     *      client_id：资源服务器id
     *      scope：资源服务器范围
     *      client_secret：资源服务器密码
     *  返回内容：
     *      access_token：就是令牌
     *      token_type：
     *      refresh_token：用来刷新令牌，可以用来刷新token，前提是token未过期
     *      expires_in：token的过期时间，再次刷新可以发现实现不在是1800，他减少了
     *      scope：
     *
     *  刷新token访问：
     *        http://127.0.0.1:8082/oauth/token?grant_type=refresh_token&refresh_token=4519a251-b480-4011-99ee-744e47ee6e82&client_id=password&client_secret=123
     *
     *  访问页面：
     *        http://localhost:8082/user/helloGet?access_token=cb43f5ba-07d5-425d-af63-523026caf126
     *
     *   不论Post还是Get请求，都需要把access_token和密码传到params里面再发请求
     *   或者增加Headers，key：Authorization   value：bearer cb43f5ba-07d5-425d-af63-523026caf126
     *
     *  当通过在认证服务器获取到token后，有三种方式访问资源服务器
     *      1. 在Headers中携带：key=Authorization，value=bearer 797c4200-8b10-4a2b-8764-33397749a8f7
     *      2. 拼接在URL中：http://localhost:8082/user/helloGet?access_token=cb43f5ba-07d5-425d-af63-523026caf126
     *      3. 在form表单中：name=access_token，value=797c4200-8b10-4a2b-8764-33397749a8f7
     */
}
