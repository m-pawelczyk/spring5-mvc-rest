package guru.springfamework.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 20.05.2020
 * created Vendor in guru.springfamework.domain
 * in project spring5-mvc-rest
 */
@Data
@Entity
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
