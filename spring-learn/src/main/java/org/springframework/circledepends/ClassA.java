package org.springframework.circledepends;

import java.io.Serializable;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/25 21:34
 * @Description
 */
public class ClassA implements Serializable {

	private ClassB classB;

	public ClassB getClassB() {
		return classB;
	}

	public void setClassB(ClassB classB) {
		this.classB = classB;
	}

	public void test() {
		System.out.println("ClassA Test");
	}

	public void show() {
		classB.test();
	}

}
