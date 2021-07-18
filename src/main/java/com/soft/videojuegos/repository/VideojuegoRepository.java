
package com.soft.videojuegos.repository;

import com.soft.videojuegos.domain.Videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Rami
 */
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    
    @Query("from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();
    
    @Query("from v Videojuego v where v.distribuidor.id=?1 order by v.nombre")
    List<Videojuego> buscarPorDistribuidor(int distribuidorId);
    
    
}
