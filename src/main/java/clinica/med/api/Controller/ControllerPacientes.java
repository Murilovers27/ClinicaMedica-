package clinica.med.api.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import clinica.med.api.Record.DadosPacientes;

@RestController
public class ControllerPacientes {

    @PostMapping("/pacientes")
    public void dadosPacientes(@RequestBody DadosPacientes dados){
        System.out.println(dados);
    }

}
