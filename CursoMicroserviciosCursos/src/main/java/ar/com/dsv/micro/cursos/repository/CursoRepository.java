package ar.com.dsv.micro.cursos.repository;

import java.util.List;
import ar.com.dsv.micro.common.repository.EntidadRepository;
import ar.com.dsv.micro.cursos.entity.Curso;

public interface CursoRepository extends EntidadRepository<Curso> {

	public List<Curso> findByEstadoGreaterThan(Integer estado);
}
