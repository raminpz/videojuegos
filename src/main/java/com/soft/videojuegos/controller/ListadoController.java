
package com.soft.videojuegos.controller;

import com.soft.videojuegos.domain.Videojuego;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soft.videojuegos.service.VideojuegoService;
import java.util.List;
import org.springframework.ui.Model;


@Controller
public class ListadoController {
	
	private final VideojuegoService videojuegoService;

    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }
	
	
		
    
    @RequestMapping("/")
    public String listarVideojuego(Model model){
            List<Videojuego> destacados = videojuegoService.buscarDestacados();
            model.addAttribute("videojuegos", destacados);
        
        return "listado";
    }
    
    @RequestMapping("/videojuegosPorDistribuidor")
    public String ListarVideojuegosPorDistribuidor(int distribuidorId, Model model){
        List<Videojuego> juegos = videojuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegos);
        return "listado";
        
    }
    
}
