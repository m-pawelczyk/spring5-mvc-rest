package guru.springfamework.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 19.05.2020
 * created AbstractRestControllerTest in guru.springfamework.controllers.v1
 * in project spring5-mvc-rest
 */
public abstract class AbstractRestControllerTest {

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
