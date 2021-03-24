package br.com.alura.leilao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeilaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeilaoApplication.class, args);
		
		finalizarAplicacao(args);
	}

	private static void finalizarAplicacao(String[] args) {
		if(args != null && args.length == 1) {
			System.out.println("\n\nFinalizando aplicacao....\n\n");
			if(args[0].equalsIgnoreCase("exit")) {
				System.exit(1);
			}
		}
	}

}
