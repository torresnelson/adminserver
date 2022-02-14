package com.meli.adminserver.adminserver;

import com.meli.adminserver.adminserver.util.ScopeUtils;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class AdminserverApplication {

	public static void main(String[] args) {
		ScopeUtils.calculateScopeSuffix();
		SpringApplication.run(AdminserverApplication.class, args);
	}

}
