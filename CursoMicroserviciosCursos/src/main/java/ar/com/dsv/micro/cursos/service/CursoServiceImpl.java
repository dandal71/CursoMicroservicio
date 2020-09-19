package ar.com.dsv.micro.cursos.service;

import org.springframework.stereotype.Service;

import ar.com.dsv.micro.common.repository.EntidadRepository;
import ar.com.dsv.micro.common.service.EntidadServiceImpl;
import ar.com.dsv.micro.cursos.entity.Curso;

@Service
public class CursoServiceImpl extends EntidadServiceImpl<Curso, EntidadRepository<Curso>> implements CursoService {


}
