package springmongodb.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import springmongodb.demo.entitiy.Ogrenci;

import java.util.List;
import java.util.Optional;

@Repository
public interface OgrenciRepository extends MongoRepository<Ogrenci,Long> {

    Optional<Ogrenci> findByOkulNo(Long okulNo);
    void deleteByOkulNo(Long okulNo);

}
