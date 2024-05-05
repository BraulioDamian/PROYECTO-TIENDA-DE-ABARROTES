/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBObjetos;

/**
 *
 * @author braul
 */
import java.time.LocalDateTime;

public class Usuario {
    private int usuarioID;
    private String nombreUsuario;
    private String contraseña;
    private Rol rol;
    private String email;
    private String nombreCompleto;
    private LocalDateTime ultimoLogin;
    private String preguntaSeguridad;
    private String respuestaSeguridad;

    
    
        
public enum Rol {
    ADMINISTRADOR,
    GERENTE,
    EMPLEADO,
    SUPERVISOR
}

    // Constructor
    public Usuario(int usuarioID, String nombreUsuario, String contraseña, Rol rol, String email, String nombreCompleto, LocalDateTime ultimoLogin) {
        this.usuarioID = usuarioID;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
        this.email = email;
        this.nombreCompleto = nombreCompleto;
        this.ultimoLogin = ultimoLogin;
    }
    
        // Constructor vacío necesario para el método 'obtenerUsuariosSimplificado'
    public Usuario() {
    }

    // Getters
    public int getUsuarioID() {
        return usuarioID;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Rol getRol() {
        return rol;
    }

    public String getEmail() {
        return email;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    // Setters
    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

        public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }
    // toString
    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioID=" + usuarioID +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", rol='" + rol + '\'' +
                ", email='" + email + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", ultimoLogin=" + ultimoLogin +
                '}';
    }
}

