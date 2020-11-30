
//201130

package com.yedam.collection;

public class Person { //SetExample2와 연결
	
	//field
	private String name;
	
	//constructor
	public Person(String name) {
		
	}
	
	//method
	public String getName() {
		return this.name;
	}

	
	
	//Shift+Alt+S => Generate hashcode and equals 클릭!
	//HashCode와 equals를 기준으로 동일하다 하지않다를 판단
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		boolean result = this.name.equals(p.name);
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
	
}
