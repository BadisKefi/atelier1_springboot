package com.badis.scientists.services;

import com.badis.scientists.entities.Scientist;

import java.util.List;

public interface ScientistService {
    Scientist saveScientist(Scientist s);
    Scientist updateScientist(Scientist s);
    void deleteScientist(Scientist s);
    void deleteScientistById(Long id);
    Scientist getScientist(Long id);
    List<Scientist> getAllScientists();
}
