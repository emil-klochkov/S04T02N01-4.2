package cat.itacademy.s04.t02.n01.S04T02N01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "cat.itacademy.s04.t02.n01")
@EnableJpaRepositories("cat.itacademy.s04.t02.n01.repository")
@EntityScan("cat.itacademy.s04.t02.n01.model")
public class S04T02N01Application {
	public static void main(String[] args) {
		SpringApplication.run(S04T02N01Application.class, args);
	}
}