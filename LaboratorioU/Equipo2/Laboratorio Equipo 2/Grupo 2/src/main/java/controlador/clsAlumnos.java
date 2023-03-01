/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.List;
import modelo.daoUsuario;
/**
 *
 * @author visitante
 */
public class clsAlumnos {
    private int carnet_alumno;
    private String nombre_alumno;
    private String direccion_alumno;
    private int telefono_alumno;
    private String email_alumno;
    private String estatus_alumno;

    public clsAlumnos() {
    }
    
    public clsAlumnos(int carnet_alumno) {
        this.carnet_alumno = carnet_alumno;
    }    
    
    public clsAlumnos(String nombre_alumno, String direccion_alumno, int telefono_alumno, String email_alumno, String estatus_alumno) {
        this.nombre_alumno = nombre_alumno;
        this.direccion_alumno = direccion_alumno;
        this.email_alumno = email_alumno;
        this.telefono_alumno = telefono_alumno;
        this.estatus_alumno = estatus_alumno;
    }
    
    public clsAlumnos(int carnet_alumno, String nombre_alumno, String direccion_alumno, int telefono_alumno, String email_alumno, String estatus_alumno) {
        this.carnet_alumno = carnet_alumno;
        this.nombre_alumno = nombre_alumno;
        this.direccion_alumno = direccion_alumno;
        this.email_alumno = email_alumno;
        this.telefono_alumno = telefono_alumno;
        this.estatus_alumno = estatus_alumno;
    }    

    public int getcarnet_alumno() {
        return carnet_alumno;
    }

    public void setcarnet_alumno(int carnet_alumno) {
        this.carnet_alumno = carnet_alumno;
    }

    public String getnombre_alumno() {
        return nombre_alumno;
    }

    public void setnombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public String getdireccion_alumno() {
        return direccion_alumno;
    }

    public void setdireccion_alumno(String direccion_alumno) {
        this.direccion_alumno = direccion_alumno;
    }
    
    public String getemail_alumno() {
        return email_alumno;
    }

    public void setemail_alumno(String email_alumno) {
        this.email_alumno = email_alumno;
    }
    
    public int gettelefono_alumno() {
        return telefono_alumno;
    }

    public void settelefono_alumno(int telefono_alumno) {
        this.telefono_alumno = telefono_alumno;
    }
    
    public String getestatus_alumno() {
        return estatus_alumno;
    }

    public void setestatus_alumno(String estatus_alumno) {
        this.direccion_alumno = direccion_alumno;
    }
    
    @Override
    public String toString() {
        return "clsAlumnos{" + "carnet_alumno=" + carnet_alumno + ", nombre_alumno=" + nombre_alumno + ", direccion_alumno=" + direccion_alumno + ", email_alumno=" + email_alumno + ", telefono_alumno=" + telefono_alumno + ", estatus_alumno=" + estatus_alumno + '}';
    }
    //Metodos de acceso a la capa controlador
    /*public clsUsuario getBuscarInformacionUsuarioPorNombre(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.consultaUsuariosPorNombre(usuario);
    }
    public clsUsuario getBuscarInformacionUsuarioPorId(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.consultaUsuariosPorId(usuario);
    }    
    public List<clsUsuario> getListadoUsuarios()
    {
        daoUsuario daousuario = new daoUsuario();
        List<clsUsuario> listadoUsuarios = daousuario.consultaUsuarios();
        return listadoUsuarios;
    }
    public int setBorrarUsuario(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.borrarUsuarios(usuario);
    }          
    public int setIngresarUsuario(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.ingresaUsuarios(usuario);
    }              
    public int setModificarUsuario(clsUsuario usuario)
    {
        daoUsuario daousuario = new daoUsuario();
        return daousuario.actualizaUsuarios(usuario);
    }      */        

    public List<clsAlumnos> getListadoAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int setBorrarAlumno(clsAlumnos alumno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIngresarAlumnos(clsAlumnos alumno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public clsAlumnos getBuscarInformacionUsuarioPorcarnet(clsAlumnos alumnos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setModificarAlumnos(clsAlumnos alumnos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
