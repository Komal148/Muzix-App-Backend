//
//package com.stackroute.muzixApp.config;
//
//
//import com.stackroute.muzixApp.domain.Track;
//import com.stackroute.muzixApp.repository.TrackRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements ApplicationRunner {
//    private TrackRepository trackRepository;
//    @Autowired
//    public DataLoader(TrackRepository trackRepository) {
//        this.trackRepository = trackRepository;
//    }
//    public void run(ApplicationArguments args) {
//        trackRepository.save(new Track(3, "lala", "hello"));
//    }
//
//
//}