package guru.springfamework.services;

import guru.springfamework.api.v1.model.CategoryDTO;

import java.util.List;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 19.05.2020
 * created CategoryService in guru.springfamework.services
 * in project spring5-mvc-rest
 */
public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
