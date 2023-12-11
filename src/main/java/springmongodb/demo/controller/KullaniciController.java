package springmongodb.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springmongodb.demo.entitiy.Kullanici;
import springmongodb.demo.repository.KullaniciRepository;
import springmongodb.demo.service.IKullaniciService;

import java.util.List;


@RestController
@RequestMapping("/personals")
public class KullaniciController {


    @Autowired
    private IKullaniciService iKullaniciService;



    @GetMapping("/all")
    public  ResponseEntity<List<Kullanici>> getAllKullanicilar(){
        List<Kullanici> kullaniciListesi = iKullaniciService.getAll();
        return  new ResponseEntity<>(kullaniciListesi, HttpStatus.OK);
    }

    @PostMapping("/kullaniciKaydet")
        public ResponseEntity<Kullanici> kaydet(@Validated @RequestBody Kullanici kullanici){
        Kullanici kaydedilenKullanici = iKullaniciService.save(kullanici);
        return new ResponseEntity<>(kaydedilenKullanici,HttpStatus.OK);
    }

    }




