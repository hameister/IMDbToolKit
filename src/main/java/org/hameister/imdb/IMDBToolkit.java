package org.hameister.imdb;

import org.hameister.imdb.business.CSVReader;
import org.hameister.imdb.data.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IMDBToolkit  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(IMDBToolkit.class, args);
    }

    @Autowired
    FilmRepository filmRepository;

    @Override
    public void run(String... args) throws Exception {

        CSVReader csvReader = new CSVReader(filmRepository);
        csvReader.importFilms();
    }
}
