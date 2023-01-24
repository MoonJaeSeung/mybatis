package com.NetVillage.NetVillage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.NetVillage.NetVillage")
//프로젝트 하위에 있는 Mapper들을 빈으로 등록하고 인식할 수 있게 해준다.
public class NetVillageApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetVillageApplication.class, args);
	}

}
