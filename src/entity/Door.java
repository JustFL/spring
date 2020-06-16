package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @Component ���ֱ�ǩ�Ƽ������� �����ʹ�ñ��� Ĭ�ϵ�id���������������������� 
 * �������ɵĹ�������� ��ȥ��ϸ̽����
 * @author summerKiss
 *
 */
@Component("panda")
public class Door {
	
	//�Զ��������ͽ���װ��
	@Autowired
	private Window win;
	private int length = 20;
	private int width = 10;
	
	@Override
	public String toString() {
		return "Door [win=" + win + ", length=" + length + ", width=" + width + "]";
	}
	
	
}
