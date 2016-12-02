package com.irahul.tbtf.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.irahul.tbtf.entity.User;

@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class TestUserService extends AbstractJUnit4SpringContextTests  {
	@Autowired
	private UserService userService;

	@Test
	public void testPin(){
		Assert.assertEquals(false, userService.isATMPinValid(1, "12345"));
		Assert.assertEquals(false, userService.isATMPinValid(1, null));
		Assert.assertEquals(true, userService.isATMPinValid(1, "1234"));
	}
	
	@Test
	public void testGetUser(){
		User userGet = userService.getUser(123);
		
		Assert.assertTrue(userGet instanceof User);
		Assert.assertEquals(123, userGet.getId());
		Assert.assertNull(userGet.getFirstName());
		Assert.assertNull(userGet.getLastName());
		System.out.println(userGet);
	}
	
}
