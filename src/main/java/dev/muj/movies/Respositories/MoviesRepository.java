package dev.muj.movies.Respositories;

import dev.muj.movies.Model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoviesRepository extends MongoRepository <Movie, ObjectId>{

    Optional<Movie> findMovieByImdbId(String imdbId);



}
