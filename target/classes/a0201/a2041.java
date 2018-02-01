/**
 * 	@date: 2018年2月1日下午8:50:29
 */
package a0201;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author guoxiaozhuang4
 * @Decription TODO
 * @date 下午8:50:29
 */
public class a2041 {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		a2040 a2040 = applicationContext.getBean("2040", a2040.class);
		
		Logger logger = LoggerFactory.getLogger(a2041.class);
		
		logger.error("1234");
	}
}
