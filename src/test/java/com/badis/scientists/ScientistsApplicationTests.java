package com.badis.scientists;

import com.badis.scientists.entities.Scientist;
import com.badis.scientists.repos.ScientistRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ScientistsApplicationTests {
    @Autowired
    private ScientistRepository scientistRepository;
    @Test
    public void testCreateScientist() {
        Scientist s = new Scientist("ibn al hytham", new Date());
        scientistRepository.save(s);
    }
    @Test
    public void testFindScientist()
    {
        Scientist s = scientistRepository.findById(1L).get();
        System.out.println(s);
    }
    @Test
    public void testUpdateScientist()
    {
        Scientist s = scientistRepository.findById(1L).get();
        s.setScientistName(s.getScientistName() + "! updated name");
        scientistRepository.save(s);
    }
    @Test
    public void testDeleteScientists()
    {
        scientistRepository.deleteById(1L);;
    }

    @Test
    public void testListAllScientists()
    {
        List<Scientist> scientists = scientistRepository.findAll();
        for (Scientist s : scientists)
        {
            System.out.println(s);
        }
    }
}
