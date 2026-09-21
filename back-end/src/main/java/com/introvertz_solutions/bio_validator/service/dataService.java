package com.introvertz_solutions.bio_validator.service;

import com.introvertz_solutions.bio_validator.Repository.dataRepository;
import com.introvertz_solutions.bio_validator.entity.data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dataService {

    @Autowired
    dataRepository dataRepository;

    public data saveData(data bd){
        return dataRepository.save(bd);
    }
}
