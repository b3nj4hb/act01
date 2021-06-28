package pe.edu.upeu.act01.dao;

import java.util.List;

import pe.edu.upeu.act01.model.Alumno;

public interface AlumnoDao {
	int create(Alumno a);
	int update(Alumno a);
	int delete(int id);
	Alumno read(int id);
	List<Alumno> readAll();
}
