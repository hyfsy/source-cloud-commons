package com.hyf.cloud.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author baB_hyf
 * @date 2021/05/15
 */
@Component
public class EnvComponent {

	@Resource
	Environment env;

	@PostConstruct
	public void getEnv() {
		System.out.println(1);
	}
}
