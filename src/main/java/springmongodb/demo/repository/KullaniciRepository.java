package springmongodb.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import springmongodb.demo.entitiy.Kullanici;
@Repository
public interface KullaniciRepository extends MongoRepository<Kullanici,Long> {

    @Query(value = "{ 'id': { $exists: true }}", sort = "{'id' : -1}", count = true)
    Kullanici findTopByOrderByIdDesc();
}
