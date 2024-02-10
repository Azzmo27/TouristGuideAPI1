package com.example.touristguideapi.service;

import com.example.touristguideapi.modul.TouristAttractions;
import com.example.touristguideapi.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {


    private TouristRepository touristRepository = new TouristRepository();

    public void addAttraction(TouristAttractions attraction) {
        touristRepository.addAttraction(attraction);
    }

    public List<TouristAttractions> getAllAttractions() {
        return touristRepository.getAllAttractions();
    }

    public TouristAttractions getAttractionByName(String name) {
        return touristRepository.getAttractionByName(name);
    }

    public void updateAttraction(String name, TouristAttractions updatedAttraction) {
        touristRepository.updateAttraction(name, updatedAttraction);
    }

    public void deleteAttraction(String name) {
        touristRepository.deleteAttraction(name);
    }
}

