spring.version:2.5.6 + cxf.version:2.4.2  

需注意: 
0. cxf.version:2.4.2跟spring4.X有冲突,spring3.X我没尝试,刚好工作需要Spring2.X就直接试了spring2.X
1. spring2.5.X不能在1.8及以上的版本中运行,解释见https://stackoverflow.com/questions/23813369/spring-java-error-namespace-element-annotation-config-on-jdk-1-5-and-high
![avatar](./statics/stack_spring2.5.X.png)

2. cxf.version2.X 需要再spring-context.xml中引入这仨哥们(cxf3.x中不需要):

```
<import resource="classpath:META-INF/cxf/cxf.xml"/>
<import resource="classpath:META-INF/cxf/cxf-extension-xml.xml"/>
<import resource="classpath:META-INF/cxf/cxf-servlet.xml"/>
```
参考文章:
https://blog.csdn.net/baibinboss/article/details/67637455
https://blog.csdn.net/yhahaha_/article/details/81395397#%E4%B8%89%E3%80%81%E6%B5%8B%E8%AF%95
http://cxf.apache.org/index.html