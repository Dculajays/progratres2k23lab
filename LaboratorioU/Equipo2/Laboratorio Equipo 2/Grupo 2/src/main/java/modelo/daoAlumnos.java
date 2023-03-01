/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsAlumnos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class daoAlumnos {

    private static final String SQL_SELECT = "SELECT carnet_alumno, nombre_alumno, direccion_alumno, telefono_alumno, email_alumno, estatus_alumno  FROM alumnos";
    private static final String SQL_INSERT = "INSERT INTO alumnos(nombre_alumno, direccion_alumno, telefono_alumno, email_alumno, estatus_alumno ) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE alumnos SET nombre_alumno=?, direccion_alumno=?, telefono_alumno=?, email_alumno=?, estatus_alumno =? WHERE carnet_alumno = ?";
    private static final String SQL_DELETE = "DELETE FROM alumnos WHERE carnet_alumno=?";
    private static final String SQL_SELECT_NOMBRE = "SELECT carnet_alumno, nombre_alumno, direccion_alumno, telefono_alumno, email_alumno, estatus_alumno FROM alumnos WHERE nombre_alumno = ?";
    private static final String SQL_SELECT_ID = "SELECT carnet_alumno, nombre_alumno, direccion_alumno, telefono_alumno, email_alumno, estatus_alumno FROM alumnos WHERE carnet_alumno = ?";    

    public List<clsAlumnos> consultaAlumnos() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsAlumnos> alumnos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("carnet_alumno");
                String nombre = rs.getString("nombre_alumno");
                String direccion = rs.getString("direccion_alumno");
                int telefono = rs.getInt("telefono_alumno");
                String correo = rs.getString("email_alumno");
                int estatus = rs.getInt("estatus_alumno");
                
                clsAlumnos alumno = new clsAlumnos();
                alumno.setcarnet_alumno(id);
                alumno.setnombre_alumno(nombre);
                alumno.setdireccion_alumno(direccion);
                alumno.settelefono_alumno(telefono);
                alumno.setemail_alumno(correo);
                //alumno.setestatus_alumno(estatus);
                alumnos.add(alumno);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return alumnos;
    }
/*
    public int ingresaAlumnos(clsAlumnos alumno) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, alumno.getcarnet_alumno());
            stmt.setString(2, alumno.getContrasenaUsuario());

            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int actualizaUsuarios(clsUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getNombreUsuario());
            stmt.setString(2, usuario.getContrasenaUsuario());
            stmt.setInt(3, usuario.getIdUsuario());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int borrarUsuarios(clsUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getIdUsuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public clsUsuario consultaUsuariosPorNombre(clsUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + usuario);
            stmt = conn.prepareStatement(SQL_SELECT_NOMBRE);
            //stmt.setInt(1, usuario.getIdUsuario());            
            stmt.setString(1, usuario.getNombreUsuario());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("usuid");
                String nombre = rs.getString("usunombre");
                String contrasena = rs.getString("usucontrasena");

                //usuario = new clsUsuario();
                usuario.setIdUsuario(id);
                usuario.setNombreUsuario(nombre);
                usuario.setContrasenaUsuario(contrasena);
                System.out.println(" registro consultado: " + usuario);                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return usuario;
    }
    public clsUsuario consultaUsuariosPorId(clsUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + usuario);
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, usuario.getIdUsuario());            
            //stmt.setString(1, usuario.getNombreUsuario());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("usuid");
                String nombre = rs.getString("usunombre");
                String contrasena = rs.getString("usucontrasena");

                //usuario = new clsUsuario();
                usuario.setIdUsuario(id);
                usuario.setNombreUsuario(nombre);
                usuario.setContrasenaUsuario(contrasena);
                System.out.println(" registro consultado: " + usuario);                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return usuario;
    }    */
}
