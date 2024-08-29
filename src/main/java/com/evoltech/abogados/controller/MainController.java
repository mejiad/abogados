package com.evoltech.abogados.controller;

import com.evoltech.abogados.model.QueryDTO;
import com.evoltech.abogados.model.QueryDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/")
public class MainController {
    Logger logger = LoggerFactory.getLogger(MainController.class.getName());

    @GetMapping
    public String root(){
        return "Landing.html";
    }

    @GetMapping(path = "/busquedas")
    public String home(Model model){
        QueryDTO query = new QueryDTO();
        model.addAttribute("query", query);

        return "Busquedas.html";
    }

    @PostMapping(path = "/resultadoPost")
    public String resultadoPost(QueryDTO queryDTO ){
        logger.info("Iniciando la busqueda");

        logger.info("Valor de query:" + queryDTO.getPregunta());

        return "Resultado.html";
    }

    @GetMapping(path = "/query")
    public String query(QueryDTO query, Model model){
        logger.info("Entrando a Query");
        String resultado = """
                El resultado de la consulta fue exitoso.
                Se encontraron los siguientes documentos relacionados con la 
                consulta:
                1. Primer texto
                2. Segundo texto
                3. Tercer libro
                4. ...
                """;

        model.addAttribute("resultado", resultado);
        return "Resultado.html";
    }


    @GetMapping(path = "/resultado")
    public String resultado(Model model){

        return "Resultado.html";
    }

    @GetMapping(path = "/news")
    public String news(Model model){
        return "News.html";
    }

    @GetMapping(path = "/tutorials")
    public String tutorials(Model model){
        return "Tutorials.html";
    }
}