package org.springframework.aop;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/25 21:21
 * @Description
 */
public class AopBean implements ITest{
	private String str = "testStr";

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void test() {
		System.out.println(str);
	}

	@Override
	public void testMethod() {
		System.out.println("123");
	}
}
