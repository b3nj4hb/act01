package pe.edu.upeu.act01.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import pe.edu.upeu.act01.config.Conexion;
import pe.edu.upeu.act01.dao.AlumnoDao;
import pe.edu.upeu.act01.model.Alumno;

public class AlumnoDaoImpl implements AlumnoDao {
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private Connection cx = null;

	@Override
	public int create(Alumno a) {
		int x = 0;
		String SQL = "insert into rol (idalumno, nombre, telefono, direccion) values(null, ?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, a.getNombre());
			x = ps.executeUpdate();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public int update(Alumno a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Alumno read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
