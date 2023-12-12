package springmongodb.demo.service;


import springmongodb.demo.entitiy.Ogrenci;

import java.util.List;

public interface IOgrenciService {
    List<Ogrenci> getAll();

    Ogrenci getById(Long okulNo);

    Ogrenci save(Ogrenci ogrenci);

    Ogrenci update(Ogrenci ogrenci);


    Ogrenci delete(Long okulNo);


}