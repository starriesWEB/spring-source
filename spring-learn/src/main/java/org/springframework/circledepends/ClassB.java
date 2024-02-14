package org.springframework.circledepends;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/25 21:34
 * @Description
 */
public class ClassB {

	private ClassA classA;

	public ClassA getClassA() {
		return classA;
	}

	public void setClassA(ClassA classA) {
		this.classA = classA;
	}

	public void test() {
		System.out.println("ClassB Test");
	}

	public void show() {
		classA.test();
	}
}
