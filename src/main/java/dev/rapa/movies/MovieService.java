package dev.rapa.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    //We want the framework to instantiate the class for us through Autowired
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    //Using Optional means it can return no movie at all while finding through ID
//    public Optional<Movie> getSingleMovie(ObjectId id) {
//        return movieRepository.findById(id);
//    }
    public Optional<Movie> getSingleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
