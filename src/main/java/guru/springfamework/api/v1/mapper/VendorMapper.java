package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 20.05.2020
 * created VendorMapper in guru.springfamework.api.v1.mapper
 * in project spring5-mvc-rest
 */
@Mapper
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}
