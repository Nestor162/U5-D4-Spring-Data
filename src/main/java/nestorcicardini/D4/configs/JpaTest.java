package nestorcicardini.D4.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import nestorcicardini.D4.dao.ProductRepository;

@Component
public class JpaTest implements CommandLineRunner {
	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

	}

}
