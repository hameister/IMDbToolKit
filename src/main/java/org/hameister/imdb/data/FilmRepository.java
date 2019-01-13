package org.hameister.imdb.data;

import org.hameister.imdb.domain.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, String> {
}
