package ejemplo.persistencia_s4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejemplo.persistencia_s4.model.Banda;
import ejemplo.persistencia_s4.repository.BandasRepository;

@Service
public class BandaService {
    @Autowired
    private BandasRepository bandasRepository;

    public Banda crear(Banda banda) {
        return bandasRepository.save(banda);
    }

    public List<Banda> listarTodas() {
        return bandasRepository.findAll();
    }
    
}
