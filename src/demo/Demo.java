package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import entity.Car;
import entity.Director;
import entity.Door;
import entity.Star;

/**
 * spring���Ʒ�ת������ע��
 * ���Ʒ�תָ����������͹�������Ȩ����ת��spring���� ����Աֻ�轫Ҫ��������д��xml�����ļ��� ����ÿһ��bean��ǩ�ͱ�ʾһ������
 * ����ע���Ϊ�ֶ�ע����Զ�ע��
 * �ֶ�ע���ֿɷ�Ϊ
 * 1>��ֵע��
 * 2>������ע��
 * 3>��̬ע��
 * 4>ʵ��ע��
 * �Զ�װ��
 * �������������ļ� �����������Զ�װ�� �ο�Autowire.xml
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
