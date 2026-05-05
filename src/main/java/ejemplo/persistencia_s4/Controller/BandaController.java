package ejemplo.persistencia_s4.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejemplo.persistencia_s4.model.Banda;
import ejemplo.persistencia_s4.service.BandaService;

@RestController
@RequestMapping("api/v1/bandas")
public class BandaController {
    @Autowired
    private BandaService bandaService;

    @PostMapping
    public Banda postBanda(@RequestBody Banda banda){
        return bandaService.crear(banda);
    }

    @GetMapping()
    public List<Banda> getBandas(){
        return bandaService.listarTodas();
    }
}
