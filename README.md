spring.version:3.0.5.RELEASE + cxf.version:2.4.2  

需注意: 
cxf.version2.X 需要再spring-context.xml中引入这仨哥们(cxf3.x中不需要):

```
<import resource="classpath:META-INF/cxf/cxf.xml"/>
<import resource="classpath:META-INF/cxf/cxf-extension-xml.xml"/>
<import resource="classpath:META-INF/cxf/cxf-servlet.xml"/>
```
参考文章:
1. 常规使用,通过wsdl生成JAVA代码调用
https://blog.csdn.net/baibinboss/article/details/67637455
https://blog.csdn.net/yhahaha_/article/details/81395397#%E4%B8%89%E3%80%81%E6%B5%8B%E8%AF%95
http://cxf.apache.org/index.html
2. 不生成JAVA代码,动态调用
https://blog.csdn.net/dlgdlg_2008/article/details/81276285
https://blog.csdn.net/qq_18675693/article/details/52134805