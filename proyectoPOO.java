    // 1- Usuario se registrara con su nombre, apellido, correo y contraseña.
    // 2- Usuario podra ver la galeria de NFT y sus precios.
    // 3- Usuario podra comprar un NFT
    // 5- Se felicitara al usuario por su compra y se le mostrara el NFT que compro.

import java.util.Scanner;

public class proyectoPOO {  
    public static void main(String[] args) {
        Scanner Datos = new Scanner(System.in); // Esto registra los datos que va a ingresar el usuario y los guarda en la variable Datos

        // --- PUNTO 1: REGISTRO DEL USUARIO ---
        System.out.println("=== REGISTRO DE USUARIO ===");
        System.out.print("Ingresa tu nombre: ");// 1-imprimen mensaje en pantalla para que el usuario ingrese su nombre
        String nombre = Datos.nextLine();// 2- registra el mensaje que el usuario ingresa y lo guarda en la variable nombre

        System.out.print("Ingresa tu apellido: ");// 1-
        String apellido = Datos.nextLine();// 2-

        System.out.print("Ingresa tu correo: ");// 1-
        String correo = Datos.nextLine();// 2-

        System.out.print("Ingresa tu contraseña: ");// 1-
        String contrasena = Datos.nextLine();// 2-

        // Creas el objeto Usuario con los datos ingresados
        Usuario usuarioActual = new Usuario(nombre, apellido, correo, contrasena); // 3- Crea un objeto de la clase Usuario con los datos ingresados por el usuario y lo guarda en la variable usuarioActual
        System.out.println("\n¡Bienvenido, " + usuarioActual.getNombre() + " " + usuarioActual.getApellido() + "!\n");

        // --- PUNTO 2: MOSTRAR GALERÍA ---
        Galeria miGaleria = new Galeria("Tienda"); // 4- Crea un objeto de la clase Galeria con el nombre "Tienda" y lo guarda en la variable miGaleria
        miGaleria.nftsgaleria();// esta variable llama al metodo nftsgaleria que crea los objetos NFTob y los agrega a la lista NFTList de la galeria

        System.out.println("=== GALERÍA DE NFTs ==="); // imprime mensaje en pantalla
        for (int i = 0; i < miGaleria.getNFTList().size(); i++) { // 5- Recorre la lista de NFTs en la galeria y los imprime en pantalla con su nombre y precio
            NFTob nft = miGaleria.getNFTList().get(i);
            System.out.println((i + 1) + ". " + nft.getName() + " - Precio: $" + nft.getPrice());
        }

        // --- PUNTO 3: COMPRAR UN NFT ---
        System.out.print("\nEscribe el número del NFT que deseas comprar (1 al " + miGaleria.getNFTList().size() + "): ");
        int opcion = Datos.nextInt();// 6- Pide al usuario que ingrese el número del NFT que desea comprar y lo guarda en la variable opcion

        // Como la lista empieza en 0, restamos 1 al número que eligió el usuario

        NFTob nftElegido = miGaleria.getNFTList().get(opcion - 1);

        // Agregamos el objeto NFT a la lista 'misNfts' del usuario
        usuarioActual.agregarNft(nftElegido); // 7- Llama al método agregarNft del objeto usuarioActual para agregar el NFT elegido a la lista de NFTs del usuario

        // --- PUNTO 5: FELICITACIÓN Y MOSTRAR COMPRA ---
        System.out.println("\n¡Felicitaciones " + usuarioActual.getNombre() + " por tu compra!");
        System.out.println("Has adquirido el NFT: " + nftElegido.getName() + " por un valor de $" + nftElegido.getPrice());// 8- Imprime mensaje en pantalla felicitando al usuario por su compra y mostrando el nombre y precio del NFT adquirido  

        Datos.close();// 9- Cierra el objeto Scanner para liberar recursos
    }
}