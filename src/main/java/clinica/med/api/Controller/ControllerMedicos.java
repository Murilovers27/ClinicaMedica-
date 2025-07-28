package clinica.med.api.Controller;

import org.springframework.web.bind.annotation.RestController;

import clinica.med.api.Record.DadosMedicos;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ControllerMedicos {
    @PostMapping("path")
    public void dadosMedicos (@RequestBody DadosMedicos dados) {
        System.out.println(dados);
    }
}
