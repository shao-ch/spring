package cn.tellsea.Beanlifecycle.test;

import cn.tellsea.Beanlifecycle.config.AppConfig;
import cn.tellsea.Beanlifecycle.config.PersonBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Tellsea
 * @date 2020-8-10
 */
public class AppTest {

	public static void main(String[] args) {
		System.out.println("容器开始创建....");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("容器创建成功....");
		PersonBean personBean = applicationContext.getBean(PersonBean.class);
		System.out.println("从容器中获得的bean：" + personBean);
		applicationContext.close();
		System.out.println("IOC容器销毁....");
	}
}