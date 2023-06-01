package nestorcicardini.D4.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import nestorcicardini.D4.entities.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
