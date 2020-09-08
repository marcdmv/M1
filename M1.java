public class Main {

    public static void main(String[] args) {
        //FASE 1
        String nom = "Marc", cognom1 = "de Mas", cognom2 = "Valls";
        int dia = 18, mes = 11, any = 1989;
        System.out.println(cognom1 + " " + cognom2 +", " + nom);
        System.out.println(dia + "/" + mes + "/" + any);

        //FASE 2
        final int any_traspas_init = 1948; //definim any inicial
        int leap_year_periodicity = 4; //cada quants anys és any de traspàs
        int leap_years = (any - any_traspas_init)/leap_year_periodicity; //nombre d'anys de traspàs entre dos anys
        System.out.println("Hi ha " + leap_years + " anys de traspàs entre l'any " + any_traspas_init + " i el " + any);
        //FASE 3
        for (int i = any_traspas_init; i <= any; i = i+leap_year_periodicity) { //impresió dels anys de traspàs entre dos anys
            System.out.println(i);
        }
        boolean any_is_leap_year; //definim variable booleana
        if (any%leap_year_periodicity == 0) { //Si el mòdul és zero vol dir que és any de traspàs
            any_is_leap_year = true;
            String frase_1 = "L'any de naixament és de traspàs";
            System.out.println(frase_1);
        } else {
            any_is_leap_year = false;
            String frase_2 = "L'any de naixament no és de traspàs";
            System.out.println(frase_2);
        };

        String nom_complet = nom+" "+cognom1+" "+cognom2;
        String data_naixament = dia+"/"+mes+"/"+any;
        System.out.println("El meu nom és "+nom_complet);
        System.out.println("Vaig néixer el "+data_naixament);
        if (any_is_leap_year == true) { //utilitzem la variable que hem definit prèviament
            System.out.println("El meu any de naixement és de traspàs");
        } else if (any_is_leap_year == false) {
            System.out.println("El meu any de naixement no és de traspàs");
        };
    }
}
