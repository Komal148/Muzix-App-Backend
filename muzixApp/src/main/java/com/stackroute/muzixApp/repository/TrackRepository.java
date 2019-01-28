package com.stackroute.muzixApp.repository;

import com.stackroute.muzixApp.domain.Track;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//public interface TrackRepository extends JpaRepository<Track,Integer> {
//
//  //Query ran method
//    @Query("Select t from Track t where t.trackName=?1")
//    public Track getByName(String track);
//}
//Repository Class for saving Track data

@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {
    //@Query("Select t from Track t where t.trackName = ?1")
//    public Track findByTrackName(String trackName);
}