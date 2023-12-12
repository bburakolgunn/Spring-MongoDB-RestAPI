package springmongodb.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import springmongodb.demo.entitiy.Ogrenci;
import springmongodb.demo.service.IOgrenciService;

import java.util.List;


@RestController
@RequestMapping("/ogrenciler")
public class KullaniciController {


    @Autowired
    private IOgrenciService iOgrenciService;



    @GetMapping("/all")
    public  ResponseEntity<List<Ogrenci>> getAllOgrenciler(){
        List<Ogrenci> ogrenciListesi = iOgrenciService.getAll();
        return  new ResponseEntity<>(ogrenciListesi, HttpStatus.OK);
    }





    @PostMapping("/ogrenciKaydet")
        public ResponseEntity<Ogrenci> kaydet(@Validated @RequestBody Ogrenci ogrenci){
        Ogrenci kaydedilenKullanici = iOgrenciService.save(ogrenci);
        return new ResponseEntity<>(kaydedilenKullanici,HttpStatus.OK);
    }

    @DeleteMapping("/{okulNo}")
    public ResponseEntity<Ogrenci> deleteOgrenci(@PathVariable long okulNo){
        Ogrenci silinenOgrenci = iOgrenciService.delete(okulNo);
        return  new ResponseEntity<>(silinenOgrenci,HttpStatus.OK);
    }






    }




