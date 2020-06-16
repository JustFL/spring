package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import entity.Car;
import entity.Director;
import entity.Door;
import entity.Star;

/**
 * spring控制反转和依赖注入
 * 控制反转指将创建对象和管理对象的权力反转给spring容器 程序员只需将要创建的类写入xml配置文件中 其中每一个bean标签就表示一个类型
 * 依赖注入分为手动注入和自动注入
 * 手动注入又可分为
 * 1>设值注入
 * 2>构造器注入
 * 3>静态注入
 * 4>实例注入
 * 自动装配
 * 遍历整个配置文件 从上下文中自动装配 参考Autowire.xml
 * @author summerKiss
 *
 */

public class Demo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config/TagAop.xml");
		Director dir = ac.getBean("director", Director.class);
		dir.film();
		//star.math();
		
		ac.close();
	}
}
