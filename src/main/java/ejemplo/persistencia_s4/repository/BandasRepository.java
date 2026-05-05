package ejemplo.persistencia_s4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ejemplo.persistencia_s4.model.Banda;

public interface BandasRepository extends JpaRepository<Banda, Long>{
    
}
