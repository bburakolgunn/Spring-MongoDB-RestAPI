package springmongodb.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmongodb.demo.entitiy.Kullanici;
import springmongodb.demo.repository.KullaniciRepository;

import java.util.List;
import java.util.Optional;

@Service
public class KullaniciService implements IKullaniciService {


    @Autowired
    private  KullaniciRepository kullaniciRepository;



    @Override
    public List<Kullanici> getAll() {
        //select * from Kullanici
    List<Kullanici> kullaniciListesi = kullaniciRepository.findAll();
    return  kullaniciListesi;
    }

    @Override
    public Kullanici getById(Long id) {
        // select * from Kullanici where id = id
        Optional<Kullanici> kullaniciDetayOptional = kullaniciRepository.findById(id);

        // Eğer kullanıcı bulunduysa, Optional'dan çıkar
        Kullanici kullaniciDetay = kullaniciDetayOptional.orElse(null);
        return kullaniciDetay;

    }

    @Override
    public Kullanici save(Kullanici kullanici) {
       //insert into Kullanici
        Kullanici kaydedilenKullanici = kullaniciRepository.save(kullanici);
        return kaydedilenKullanici;

    }

    @Override
    public Kullanici update(Kullanici kullanici) {
        Optional<Kullanici> optionalKullanici = kullaniciRepository.findById(kullanici.getId());
        Kullanici guncellemeKullanici = optionalKullanici.orElse(null);

        // Kullanici bulunamadıysa null döndür
        if (guncellemeKullanici == null) {
            return null;
        }
        guncellemeKullanici.setId(kullanici.getId());
        guncellemeKullanici.setAdi(kullanici.getAdi());
        guncellemeKullanici.setSoyadi(kullanici.getSoyadi());
        guncellemeKullanici.setOzellikler(kullanici.getOzellikler());
        Kullanici guncellenmisKullanici = kullaniciRepository.save(guncellemeKullanici);
        return guncellenmisKullanici;

    }

    @Override
    public Boolean delete(Long id) {
        kullaniciRepository.deleteById(id);
        return  true;
    }
}
