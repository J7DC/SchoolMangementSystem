package com.jdc.schoolMgntSystem;

import com.jdc.schoolMgntSystem.constants.Common;
import jdk.vm.ci.meta.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@ComponentScan
//@EnableWebMvc
@SpringBootApplication
public class SchoolMgntSystemApplication  {
	private static final Logger Log = LoggerFactory.getLogger(SchoolMgntSystemApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SchoolMgntSystemApplication.class, args);
		Log.info("Server is Up ! ");


	}

}
