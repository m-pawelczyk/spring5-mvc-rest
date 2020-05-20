package guru.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 20.05.2020
 * created VendorListDTO in guru.springfamework.api.v1.model
 * in project spring5-mvc-rest
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorListDTO {

    List<VendorDTO> vendors;
}
