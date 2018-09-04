package com.db.crypto_currency_exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CryptoCurrencyExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptoCurrencyExchangeApplication.class, args);
	}
}
