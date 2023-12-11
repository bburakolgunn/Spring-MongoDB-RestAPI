package springmongodb.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import springmongodb.demo.entitiy.Ogrenci;

import java.util.List;

@Repository
public interface OgrenciRepository extends MongoRepository<Ogrenci,Long> {



}
