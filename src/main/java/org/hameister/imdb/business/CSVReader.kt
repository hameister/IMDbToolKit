package org.hameister.imdb.business

import org.apache.commons.csv.CSVFormat
import org.hameister.imdb.data.FilmRepository
import org.hameister.imdb.domain.Film
import org.springframework.beans.factory.annotation.Autowired
import java.io.FileReader

class CSVReader(val filmRepository: FilmRepository) {

    fun importFilms() {
        val file = FileReader("/Users/hameister/Documents/imdb_data/title.basics.tsv")
        val records = CSVFormat.TDF.withQuote('"').withQuote(' ').withFirstRecordAsHeader().parse(file)
        val filmList: ArrayList<Film> = ArrayList()

        for ((i, record) in records.withIndex()) {


            val film = Film()
            film.tconst = record.get(0)
            film.titleType = record.get(1)
            film.primaryTitle = record.get(2)
            film.originalTitle = record.get(3)
            film.isAdult = record.get(4)
            film.startYear = record.get(5)
            film.endYear = record.get(6)
            film.runtimeMinutes = record.get(7)
            film.genres = record.get(8)
            filmList.add(film)
            // Save in bulks of 50
            if (filmList.size % 50 == 0) {
                filmRepository.saveAll(filmList)
                filmList.clear()
            }

        }
        println("Finished: ${filmRepository.count()}")
    }
}