package com.badis.scientists.services;

import com.badis.scientists.entities.Scientist;
import com.badis.scientists.repos.ScientistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScientistServiceImpl implements ScientistService {
    @Autowired
    ScientistRepository scientistRepository;

    @Override
    public Scientist saveScientist(Scientist s) {
        return scientistRepository.save(s);
    }

    @Override
    public Scientist updateScientist(Scientist s) {
        return scientistRepository.save(s);
    }

    @Override
    public void deleteScientist(Scientist s) {
        scientistRepository.delete(s);
    }

    @Override
    public void deleteScientistById(Long id) {
        scientistRepository.deleteById(id);
    }

    @Override
    public Scientist getScientist(Long id) {
        return scientistRepository.findById(id).get();
    }

    @Override
    public List<Scientist> getAllScientists() {
        return scientistRepository.findAll();
    }
}
