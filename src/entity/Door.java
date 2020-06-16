package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @Component 这种标签推荐别名吧 如果不使用别名 默认的id会根据你的类型来进行生成 
 * 这种生成的规则很奇葩 不去详细探究了
 * @author summerKiss
 *
 */
@Component("panda")
public class Door {
	
	//自动根据类型进行装配
	@Autowired
	private Window win;
	private int length = 20;
	private int width = 10;
	
	@Override
	public String toString() {
		return "Door [win=" + win + ", length=" + length + ", width=" + width + "]";
	}
	
	
}
