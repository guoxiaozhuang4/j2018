/**
 * 	@date: 2018年2月1日下午11:17:21
 */
package a0201;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author guoxiaozhuang4
 * @Decription TODO
 * @date 下午11:17:21
 */
public class a2317 {

	public static void main(String[] args) {
		
		//因为log4j2.xml里面没有定义该包的Logger,所以不能打印出来
		Logger logger = LoggerFactory.getLogger("a0201");
		
		logger.info("12312");
	}
}
