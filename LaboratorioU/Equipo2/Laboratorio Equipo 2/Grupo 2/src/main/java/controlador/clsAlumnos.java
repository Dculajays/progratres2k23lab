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
    private int estatus_alumno;

    public clsAlumnos() {
    }
    
    public clsAlumnos(int IdAlumnos) {
        this.carnet_alumno = carnet_alumno;
    }    
    
    public clsAlumnos(String nombre_alumno, String ContrasenaUsuario) {
        this.nombre_alumno = nombre_alumno;
        this.ContrasenaUsuario = ContrasenaUsuario;
    }
    
    public clsUsuario(int IdUsuario, String NombreUsuario, String ContrasenaUsuario) {
        this.IdUsuario = IdUsuario;
        this.NombreUsuario = NombreUsuario;
        this.ContrasenaUsuario = ContrasenaUsuario;
    }    

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContrasenaUsuario() {
        return ContrasenaUsuario;
    }

    public void setContrasenaUsuario(String ContrasenaUsuario) {
        this.ContrasenaUsuario = ContrasenaUsuario;
    }
    @Override
    public String toString() {
        return "clsUsuario{" + "IdUsuario=" + IdUsuario + ", NombreUsuario=" + NombreUsuario + ", ContrasenaUsuario=" + ContrasenaUsuario + '}';
    }
    //Metodos de acceso a la capa controlador
    public clsUsuario getBuscarInformacionUsuarioPorNombre(clsUsuario usuario)
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
    }              
}