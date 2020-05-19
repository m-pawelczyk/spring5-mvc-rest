package guru.springfamework.repositories;

import guru.springfamework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 19.05.2020
 * created CustomerRepository in guru.springfamework.repositories
 * in project spring5-mvc-rest
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
