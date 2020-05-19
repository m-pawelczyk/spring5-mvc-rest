package guru.springfamework.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 19.05.2020
 * created Customer in guru.springfamework.domain
 * in project spring5-mvc-rest
 */
@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
}
