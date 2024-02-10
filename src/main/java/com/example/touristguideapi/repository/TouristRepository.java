package com.example.touristguideapi.repository;

import org.springframework.stereotype.Repository;
import com.example.touristguideapi.modul.TouristAttractions;

import java.util.ArrayList;
import java.util.List;


    @Repository
    public class TouristRepository {
        private List<TouristAttractions> attractions;

        public TouristRepository(){
            this.attractions = new ArrayList<>();
            attractions.add(new TouristAttractions("The Petra", "One of the seven wonders, and is located in Jordan. Travelers that are looking for a adventure come to explore this UNESCO World Heritage Site, discovering the fascinating history and breathtaking architecture of the Nabateans."));
            attractions.add(new TouristAttractions("The Taj Mahal", "One of the seven wonders, and is located in India. Visitors from across the world come to look at its beauty, immersing themselves in the symbol of eternal love and architectural greatness."));
            attractions.add(new TouristAttractions("The Eiffel Tower", "The attractions is located in Paris, and is known for the view of the city and couple usually indulge in the romantic ambiance of the cultural landmark"));
        }


        public void addAttraction(TouristAttractions attraction) {
            attractions.add(attraction);
        }


        public List<TouristAttractions> getAllAttractions() {
            return attractions;
        }

        public TouristAttractions getAttractionByName(String name) {
            for (TouristAttractions attraction : attractions) {
                if (attraction.getName().equals(name)) {
                    return attraction;
                }
            }
            return null;
        }


        public void updateAttraction(String name, TouristAttractions updatedAttraction) {
            for (int i = 0; i < attractions.size(); i++) {
                if (attractions.get(i).getName().equals(name)) {
                    attractions.set(i, updatedAttraction);
                    return;
                }
            }
        }

        public void deleteAttraction(String name) {
            attractions.removeIf(attraction -> attraction.getName().equals(name));
        }
    }





