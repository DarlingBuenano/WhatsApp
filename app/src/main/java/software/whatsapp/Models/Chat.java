package software.whatsapp.Models;

public class Chat {
    private String URLImagenPerfil;
    private String NombreChat;
    private String Mensaje;
    private String Fecha;
    private int NumeroMensajes;

    public Chat(String urlimagen, String nombrechat, String mensaje, String hora){
        this.URLImagenPerfil = urlimagen;
        this.NombreChat = nombrechat;
        this.Mensaje = mensaje;
        this.Fecha = hora;
    }

    public Chat(){
        this.URLImagenPerfil = "urlimagen";
        this.NombreChat = "Darlyn Buenaño";
        this.Mensaje = "Realizaremos un meet hoy a las 18:30";
        this.Fecha = "8:13 p.m.";
        this.NumeroMensajes = 5;
    }

    public String getURLImagenPerfil() {
        return URLImagenPerfil;
    }

    public void setURLImagenPerfil(String URLImagenPerfil) {
        this.URLImagenPerfil = URLImagenPerfil;
    }

    public String getNombreChat() {
        return NombreChat;
    }

    public void setNombreChat(String nombreChat) {
        NombreChat = nombreChat;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public int getNumeroMensajes() {
        return NumeroMensajes;
    }

    public void setNumeroMensajes(int numeroMensajes) {
        NumeroMensajes = numeroMensajes;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }
}
