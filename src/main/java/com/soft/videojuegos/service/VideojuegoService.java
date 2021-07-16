package com.soft.videojuegos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.soft.videojuegos.domain.Videojuego;
import com.soft.videojuegos.repository.VideojuegoRepository;

@Service
public class VideojuegoService {
    
    private final VideojuegoRepository videojuegoRepository;

    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }
    
     	
	public List<Videojuego> buscarDestacados(){		
		return videojuegoRepository.findAll();
	}

}
