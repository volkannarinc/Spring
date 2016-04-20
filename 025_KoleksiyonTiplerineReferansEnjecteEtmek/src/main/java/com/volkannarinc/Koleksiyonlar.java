package com.volkannarinc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Koleksiyonlar {

	private List<Object>	list;
	private Set<?>			set;
	private Map<?, ?>		map;
	private Properties 		properties;
	
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	public Set<?> getSet() {
		return set;
	}
	public void setSet(Set<?> set) {
		this.set = set;
	}
	public Map<?, ?> getMap() {
		return map;
	}
	public void setMap(Map<?, ?> map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Lİst=" + list
				+"\n Set =" +set
				+"\n Map =" + map
				+"\n Properties" + properties;
	}
	
	
}
