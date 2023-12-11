package springmongodb.demo.service;


import springmongodb.demo.entitiy.Ogrenci;

import java.util.List;

public interface IOgrenciService {
    List<Ogrenci> getAll();

    Ogrenci getById(Long id);

    Ogrenci save(Ogrenci ogrenci);

    Ogrenci update(Ogrenci ogrenci);

    Boolean delete(Long id);

}
