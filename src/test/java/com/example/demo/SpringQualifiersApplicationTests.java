package com.example.demo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.annotations.Cold;
import com.example.annotations.Cream;
import com.example.components.Dessert;
import com.example.configurations.ConfigDessert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConfigDessert.class)
public class SpringQualifiersApplicationTests {

	@Autowired
	@Cold
	@Cream
	private Dessert dessert;
	
	@Test
	public void testInjectionComponents() {
		assertNotNull(dessert);
	}

}
