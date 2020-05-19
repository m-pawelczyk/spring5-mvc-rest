package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 19.05.2020
 * created CategoryMapper in guru.springfamework.api.v1.mapper
 * in project spring5-mvc-rest
 */
@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDTO categoryToCategoryDTO(Category category);
}
