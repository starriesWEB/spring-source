package org.springframework.pojo;

/**
 * @author starry
 * @version 1.0
 * @date 2024/1/25 14:42
 * @Description
 */
public class UserB extends AbstractUser{
	@Override
	public void showMe() {
		System.out.println("i am userB");
	}
}
