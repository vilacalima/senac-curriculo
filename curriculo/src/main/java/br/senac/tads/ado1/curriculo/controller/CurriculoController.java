package br.senac.tads.ado1.curriculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/curriculo")
public class CurriculoController {
    @GetMapping("/getCurriculo")
    public ModelAndView saudar2() {
        ModelAndView mv = new ModelAndView("Curriculo");
        mv.addObject("nome", "Robson Vilaça Lima");
        mv.addObject("skil", "Desenvolvedor");
        mv.addObject("email", "robsonvilaca.lima@gmail.com");
        mv.addObject("telefone", "(11) 93000-4230");
        mv.addObject("idade", "26 Anos");
        mv.addObject("civil", "Casado");

        mv.addObject("objetivo", "Desenvolver-me continuamente na profissção na área da Tecnologia da informação e suas " +
                                                        "vertentes e contribuir para o desenvolvimento da empresa");
        mv.addObject("cursos", "Java, " +
                "Análise e desenvilvimento de sistemas - Cursando");
        mv.addObject("idioma", "Inglês: Compreende bem, fala razoalvemente, lê bem escreve razoalvemente.");
        mv.addObject("github", "https://github.com/vilacalima");

        return mv;
    }

}
