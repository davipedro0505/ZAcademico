package  IFPE.ZAcademico.controller;

import com.exemplo.escola.model.Aluno;
import com.exemplo.escola.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping("/cadastro-aluno")
    public String mostrarForm(Model model) {

        model.addAttribute("aluno", new Aluno());
        return "cadastro-aluno";
    }

    @PostMapping("/salvar-aluno")
    public String salvar(@ModelAttribute Aluno aluno, Model model) {

        service.salvar(aluno);
        model.addAttribute("mensagem", "Aluno salvo com sucesso!");

        return "cadastro-aluno";
    }
}
