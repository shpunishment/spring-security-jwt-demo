# spring-security-jwt-demo
spring-security-jwt-demo是使用Spring Security对JWT Token认证的实现。

使用的数据模型[spring-security-rbac0-demo](https://github.com/shpunishment/spring-security-rbac0-demo)一致。

不同的是，[spring-security-rbac0-demo](https://github.com/shpunishment/spring-security-rbac0-demo)中使用的是Cookie和Session认证，这里使用JWT Token。

Json Web Token (JWT)，是为了在网络应用环境间传递声明而执行的一种基于JSON的开放标准（RFC 7519）。
RFC 7519 定义了一种简洁的，自包含的方法用于通信双方之间以JSON对象的形式安全的传递信息。
因为数字签名的存在，这些信息是可信的，JWT可以使用HMAC算法或者是RSA的公私秘钥对进行签名。
