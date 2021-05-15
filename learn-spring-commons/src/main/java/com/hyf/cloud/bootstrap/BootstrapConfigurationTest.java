package com.hyf.cloud.bootstrap;

import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration;
import org.springframework.cloud.bootstrap.BootstrapConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author baB_hyf
 * @date 2021/05/15
 */
@BootstrapConfiguration(exclude = RefreshAutoConfiguration.class) // exclude is invalid
public class BootstrapConfigurationTest {

	@Bean
	public Person person() {
		return new Person();
	}

	static class Person {
		public Person() {
			System.out.println(1);
		}
	}
}
