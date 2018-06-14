package com.zr;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean implements InitializingBean,DisposableBean {
   //org.springframework.beans.factory.InitializingBean 接口指定一个单一的方法
   public void afterPropertiesSet() {
      // do some initialization work
   }

   //org.springframework.beans.factory.DisposableBean 接口指定一个单一的方法
   public void destroy() throws Exception {
      // do some destruction work
   }
}