package com.knownsense.springnativevault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(value = {VaultRuntimeHints.class})
public class SpringNativeVaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNativeVaultApplication.class, args);
	}

}
