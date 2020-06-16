package entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Car {
	
	private int mileage;
	private Wheel wheels;
	private String[] arrData;
	private List<String> listData;
	private Set<String> setData;
	private Map<String, Integer> mapData;
	private Properties pros;
	
	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public Wheel getWheels() {
		return wheels;
	}

	public void setWheels(Wheel wheels) {
		this.wheels = wheels;
	}

	public String[] getArrData() {
		return arrData;
	}

	public void setArrData(String[] arrData) {
		this.arrData = arrData;
	}

	public List<String> getListData() {
		return listData;
	}

	public void setListData(List<String> listData) {
		this.listData = listData;
	}

	public Set<String> getSetData() {
		return setData;
	}

	public void setSetData(Set<String> setData) {
		this.setData = setData;
	}

	public Map<String, Integer> getMapData() {
		return mapData;
	}

	public void setMapData(Map<String, Integer> mapData) {
		this.mapData = mapData;
	}

	public Properties getPros() {
		return pros;
	}

	public void setPros(Properties pros) {
		this.pros = pros;
	}

	public Car() {
		
	}
	
	public Car(int mileage, Wheel wheels) {
		this.mileage = mileage;
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Car [mileage=" + mileage + ", wheels=" + wheels + ", arrData=" + Arrays.toString(arrData)
				+ ", listData=" + listData + ", setData=" + setData + ", mapData=" + mapData + ", pros=" + pros + "]";
	}
	
	public void init() {
		//在对象被使用之前调用 需要在xml中配置
		System.out.println("init start");
	}
	
	public void destory() {
		//在容器被释放时调用 需要在xml中配置
		System.out.println("destory start");
	}
	
}
