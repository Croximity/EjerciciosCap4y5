public class Ejercicio529 {
    private static void CancionPrueba() {

        String OpciTexto = "";

        String MostrarTexto = "";

        String mensaje = "", mensaje2 = "";

        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 1:
                    OpciTexto = "El primer";
                    MostrarTexto = "una perdiz picando peras del peral";
                    break;

                case 2:
                    OpciTexto = "El segundo";
                    MostrarTexto = "dos tortolitas y ";
                    break;

                case 3:
                    OpciTexto = "El tercer";
                    MostrarTexto = "tres gallinitas, ";
                    break;

                case 4:
                    OpciTexto = "El cuarto";
                    MostrarTexto = "cuatro pajaritos, ";
                    break;

                case 5:
                    OpciTexto = "El quinto";
                    MostrarTexto = "cinco anillos dorados, ";
                    break;

                case 6:
                    OpciTexto = "El sexto";
                    MostrarTexto = "seis mamás gansas, ";
                    break;

                case 7:
                    OpciTexto = "El septimo";
                    MostrarTexto = "siete cisnitos, ";
                    break;

                case 8:
                    OpciTexto = "El octavo";
                    MostrarTexto = "ocho lecheritas, ";
                    break;

                case 9:
                    OpciTexto = "El noveno";
                    MostrarTexto = "nueve bailarinas, ";
                    break;

                case 10:
                    OpciTexto = "El decimó";
                    MostrarTexto = "diez señores saltando, ";
                    break;

                case 11:
                    OpciTexto = "El undecimó";
                    MostrarTexto = "once gaiteritos, ";
                    break;

                case 12:
                    OpciTexto = "El duodecimó";
                    MostrarTexto = "doce tamborileros, ";
                    break;

            }

            OpciTexto += " día de Navidad, mi amor me mandó";

            mensaje2 = mensaje;
            mensaje = MostrarTexto;
            mensaje += mensaje2;

            System.out.println(OpciTexto + "\n");
            System.out.println(mensaje + ".\n\n");
        }
    }

    public static void main(String[] args) {
        CancionPrueba();
    }
}
