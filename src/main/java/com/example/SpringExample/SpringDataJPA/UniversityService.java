package com.example.SpringExample.SpringDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UniversityService {

    private UniversityRepository universityRepository;

    @Autowired
    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public University save(University university){
        return universityRepository.save(university);
    }

    public void saveAll (List<University> universities){
        universityRepository.saveAll(universities);
    }

    public List<University> readAll (){
        return universityRepository.findAll();
    }

    public University readById(int id){
        return universityRepository.getOne(id);
    }

    public University readByName(String name){
        return universityRepository.findByName(name);
    }

    public void deleteById(int id){
        universityRepository.deleteById(id);
    }

    @Transactional
    public void updateName(int id, String name){
        universityRepository.updateName(id, name);
    }



}
