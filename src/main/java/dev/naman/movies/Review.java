package dev.naman.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String mdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private String genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;
}
