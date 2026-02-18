import java.util.*;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Asistente> asistentes = new HashSet<>();
        boolean salir = false;


        //bucles de flujo
        while(!salir){
            System.out.println("Elige una opcion");
            System.out.println("1. Registrar nuevo asistente");
            System.out.println("2. Buscar un asistente por su mail");
            System.out.println("3. Mostrar numero de asistentes");
            System.out.println("4. Mostrar los mails de los asistentes");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Introduce los datos del asistente. ");
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Apellidos: ");
                    String apellidos = sc.nextLine();
                    System.out.println("Mail: ");
                    String mail = sc.nextLine();
                    Asistente a = new Asistente(nombre,apellidos,mail);
                    asistentes.add(a);
                    break;

                case 2:
                    System.out.println("Introduce el mail del asistente. ");
                    System.out.println("Mail: ");
                     mail = sc.nextLine();
                     for (Asistente a1 : asistentes){
                         if (a1.getMail().equals(mail)){
                             System.out.println("El mail del asistente ya esta registrado");
                         }else {
                             System.out.println("El mail del asistente  no esta registrado");
                         }
                     }
                     break;

                case 3:
                    System.out.println(asistentes.size());
                    break;


                case 4:
                    for (Asistente a1:asistentes){
                        System.out.println(a1.getMail());
                    }break;

                case 5:
                    salir = true;


            }sc.close();
        }
    }
}
