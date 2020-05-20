package guru.springfamework.repositories;

import guru.springfamework.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 20.05.2020
 * created VendorRepository in guru.springfamework.repositories
 * in project spring5-mvc-rest
 */
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
