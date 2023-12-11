package springmongodb.demo.service;

import springmongodb.demo.entitiy.Kullanici;

import java.util.List;

public interface IKullaniciService {
    List<Kullanici> getAll();

    Kullanici getById(Long id);

    Kullanici save(Kullanici kullanici);

    Kullanici update(Kullanici kullanici);

    Boolean delete(Long id);

}
