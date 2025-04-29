package dev.java.Cadastrodeninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {


    @GetMapping("/BOASVINDAS") //pega informacoes QUE ESTA ESCRITO NO METODO BOAS VINDAS AQUI EMBAIXO
  //  @PostMapping // MANDAR
    //@PutMapping // ALTERAR
    //@PatchMapping // ALTERA TBM
   // @DeleteMapping// DELETA



    public String boasVindas () {
        return "essa e minha primeira mensagem nessa rota";
    }
}
