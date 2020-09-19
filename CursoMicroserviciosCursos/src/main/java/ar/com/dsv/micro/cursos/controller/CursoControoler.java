/**
 * 
 */
package ar.com.dsv.micro.cursos.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ar.com.dsv.micro.common.controllers.GenericController;
import ar.com.dsv.micro.cursos.entity.Curso;
import ar.com.dsv.micro.cursos.service.CursoService;

/**
 * @author Daniel E. Dalmagro
 *
 */
public class CursoControoler extends GenericController<Curso, CursoService> {

	@PutMapping("/editar/{id}")
	public ResponseEntity<?> editar(@RequestBody Curso curso, @PathVariable Long id ){
		Curso  cursoBD = null;
		Optional<Curso> opt = this.entidadService.findById(id);
		
		//Si no está presente, devuelvo not found
		if (!opt.isPresent()) {
			return ResponseEntity.notFound().build(); 
		}
		
		cursoBD = opt.get();
		
		cursoBD.setNombre(curso.getNombre());
		cursoBD.setEstado(curso.getEstado());
		
		this.entidadService.save(cursoBD);
		return ResponseEntity.ok().body(cursoBD);			
	}

}
