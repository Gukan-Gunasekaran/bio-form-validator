package com.introvertz_solutions.bio_validator.controller;

import com.introvertz_solutions.bio_validator.Repository.dataRepository;
import com.introvertz_solutions.bio_validator.entity.data;
import com.introvertz_solutions.bio_validator.service.dataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://front-end-iota-ruby.vercel.app/")
public class dataController {

    @Autowired
    dataService dataService;

    @Autowired
    dataRepository dataRepository;



    @PostMapping("/save")
    public ResponseEntity<?> saveBio(
            @RequestParam("uid") int uid,
            @RequestParam("img") MultipartFile img,
            @RequestParam("sign") MultipartFile sign) throws IOException {


        int max_img=45*1024;
        int max_size= 15*1024;

        if(img.getSize()>max_img){
            return ResponseEntity
                    .badRequest()
                    .body("image must within 15 kb");
        } else if (sign.getSize()>max_size) {
            return ResponseEntity
                    .badRequest()
                    .body("image must within 15 kb");
        }
        data d = new data();

         d.setUid(uid);
         d.setImg(img.getBytes());
         d.setSign(sign.getBytes());

         data saved=dataRepository.save(d);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saved);
    }
}
