import java.util.ArrayList;

public class Usuario {
   
   private String nombre;
   private String apellido;
   private String correo;
   private String contraseña;
   private ArrayList<NFTob> misNfts;

    // Constructor del usuario
    public Usuario(String nombre, String apellido, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        // Cuando el usuario se registra, su colección empieza vacía
        this.misNfts = new ArrayList<>(); 
    }
    
// Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCorreo() { return correo; }
    public String getContrasena() { return contraseña; }
    public ArrayList<NFTob> getMisNfts() { return misNfts; }

//Setters
    public void agregarNft(NFTob nft) {
        this.misNfts.add(nft);
    }
}
