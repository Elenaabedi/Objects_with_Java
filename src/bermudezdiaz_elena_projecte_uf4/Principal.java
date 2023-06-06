/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bermudezdiaz_elena_projecte_uf4;

/**
 *
 * @author Elena
 */
public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static Universitat uni = new Universitat("UAB");

    public static void main(String[] args) {
        
        // ======================================================= CREACIÓ DE CLASSES I PROVES ==============================================================

        // ========================================================== Creació d'assignatures ================================================================
        
        Assignatures assig1 = new Assignatures("Àlgebra");
        Assignatures assig2 = new Assignatures("Fonaments d'informàtica");
        Assignatures assig3 = new Assignatures("Electricitat i electrònica");
        Assignatures assig4 = new Assignatures("Fonaments d'ingenieria");
        Assignatures assig5 = new Assignatures("Càlcul");
        Assignatures assig6 = new Assignatures("Organització i estió d'empreses");
        Assignatures assig7 = new Assignatures("Fonaments de les computadores");
        Assignatures assig8 = new Assignatures("Metodología de la programació");
        Assignatures assig9 = new Assignatures("Matemàtica discreta");
        
        // =========================================================== Creació d'alumnes becats ==============================================================
        
        AlumneBecat alub1 = new AlumneBecat("Estudis", "45512369Y", "Manel", "Fernàndez");
        AlumneBecat alub2 = new AlumneBecat("Investigació", "74896512R", "Alba", "García");
        AlumneBecat alub3 = new AlumneBecat("Deportiva", "78932564D", "Lidia", "Peña");
        AlumneBecat alub4 = new AlumneBecat("Idiomes", "56987452I", "Ricard", "Vendrell");
                
        // =========================================================== Modificacions alumnes becats ==========================================================
        
        alub1.setDni("56987541Y");
        alub2.setCognom("Rodoreda");
        alub3.setNom("Sílvia");
        alub4.setTipusBeca("Movilitat");
        
        // ========================================================= Creació alumnes doctorats ===============================================================
        
        AlumneDoctorat alud1 = new AlumneDoctorat("Bernat Comes", "Indefinit" ,"55874965P", "Eduard", "Monclús");
        AlumneDoctorat alud2 = new AlumneDoctorat("Lluïssa Martí", "Temporal","54872356U", "Laia", "Ferrer");
        AlumneDoctorat alud3 = new AlumneDoctorat("Manel Estiarte", "Indefinit","87965236K", "Susana", "Figueres");
        AlumneDoctorat alud4 = new AlumneDoctorat("Mireia Sánchez","Temporal" ,"78525456P", "Jordi", "Castany");
        
        // ======================================================= Modificacions alumnes doctorats ===========================================================
        
        alud1.setCognom("Fidel");
        alud2.setDni("89652154T");
        alud3.setNom("Paula");
        alud4.setProfTutor("Josep Burgaya");
        alud1.setTipusContracte("Temporal");
        
        // ========================================================== Creació de professors ==================================================================
        
        Professor prof1 = new Professor(2014,"87956987H", "Pere", "Tàpies");
        Professor prof2 = new Professor(1995,"58962147L", "Ovidi", "Monlló");
        Professor prof3 = new Professor(2008,"48357689H", "Núria", "Feliu");
        Professor prof4 = new Professor(2001,"52198532M", "Mª Del Mar", "Bonet");
        
        // ======================================================= Modificació professors ====================================================================
        
        prof1.setCognom("Lladoner");
        prof2.setDni("98545879Y");
        prof3.setIniciDocencia(2009);
        prof4.setNom("Eva");
        
        // ======================================================= Assignar assignatures Alumnes becats ======================================================
        
        alub1.inserirAssignatures(assig1);
        alub1.inserirAssignatures(assig2);
        alub1.inserirAssignatures(assig3);
        alub2.inserirAssignatures(assig4);
        alub2.inserirAssignatures(assig5);
        alub2.inserirAssignatures(assig6);
        alub3.inserirAssignatures(assig7);
        alub3.inserirAssignatures(assig8);
        alub3.inserirAssignatures(assig9);
        alub4.inserirAssignatures(assig1);
        alub4.inserirAssignatures(assig2);
        alub4.inserirAssignatures(assig3);
        
        // ======================================================= Assignar assignatures Alumnes doctorats ===================================================
        
        alud1.inserirAssignatures(assig1);
        alud1.inserirAssignatures(assig2);
        alud1.inserirAssignatures(assig3);
        alud2.inserirAssignatures(assig4);
        alud2.inserirAssignatures(assig5);
        alud2.inserirAssignatures(assig6);
        alud3.inserirAssignatures(assig7);
        alud3.inserirAssignatures(assig8);
        alud3.inserirAssignatures(assig9);
        alud4.inserirAssignatures(assig1);
        alud4.inserirAssignatures(assig2);
        alud4.inserirAssignatures(assig3);
        
        // ========================================================== Assignar assignatures Professors =======================================================
        
        prof1.inserirAssignatures(assig1);
        prof1.inserirAssignatures(assig2);
        prof1.inserirAssignatures(assig3);
        prof2.inserirAssignatures(assig4);
        prof2.inserirAssignatures(assig5);
        prof2.inserirAssignatures(assig6);
        prof3.inserirAssignatures(assig7);
        prof3.inserirAssignatures(assig8);
        prof3.inserirAssignatures(assig9);
        prof4.inserirAssignatures(assig1);
        prof4.inserirAssignatures(assig2);
        prof4.inserirAssignatures(assig3);
        
        // ====================================================== Creació universitat i modificacions ========================================================
        
        
        
        uni.setNom("Universitat Autònoma de Barcelona");
        
        uni.afegirMembre(alub1);
        uni.afegirMembre(alub2);
        uni.afegirMembre(alub3);
        uni.afegirMembre(alub4);
        
        uni.afegirMembre(alud1);
        uni.afegirMembre(alud2);
        uni.afegirMembre(alud3);
        uni.afegirMembre(alud4);
        
        uni.afegirMembre(prof1);
        uni.afegirMembre(prof2);
        uni.afegirMembre(prof3);
        uni.afegirMembre(prof4);
        
        uni.afegirMembre("Estudis", "47796586P", "Marc", "Lobato");
        uni.afegirMembre("Esportiva", "47789215H", "Edurne", "Aragües");
        uni.afegirMembre(2004, "36521458T", "Anna", "Volguer");
        uni.afegirMembre("Jordi Basté", "Temporal", "89659874Y", "Mireia", "Hurtado");
        
//        uni.afegirMembre("Estudis", "47796586P", "Marc", "Lobato"); // Comprovar que funcionar el "else" per no inserir un DNI repetit
        
        // ========================================= Afegir assignatures ArrayList Assignatures Universitat  =================================================
        
        uni.afegirAssignaturaArray(assig1);
        uni.afegirAssignaturaArray(assig2);
        uni.afegirAssignaturaArray(assig3);
        uni.afegirAssignaturaArray(assig4);
        uni.afegirAssignaturaArray(assig5);
        uni.afegirAssignaturaArray(assig6);
        uni.afegirAssignaturaArray(assig7);
        uni.afegirAssignaturaArray(assig8);
        uni.afegirAssignaturaArray(assig9);
        
        menu(uni);

    }
    
    public static void menu(Universitat uni) {
        
        //======================================================================= Menú =======================================================================
        
        int opcio = Util.OpcioMenu("\n MENÚ" 
                + "\n=========================================================================================\n"
                + "\n   Tria una de les següents opcions: \n"
                + "\n   1. Llistar tots els membres de la Universitat."
                + "\n   2. Llistar tots els alumnes."
                + "\n   3. Llistar només els alumnes de doctorat."
                + "\n   4. Llistar tots els professors."
                + "\n   5. Cercar i mostrar informació d’un membre per el seu DNI."
                + "\n   6. Eliminar membres demanant el DNI."
                + "\n   7. Llistar les assignatures de la Universitat amb els professors i alumnes vinculats."
                + "\n   8. Sortir.\n", 1, 8);

        switch (opcio) {
            case 1:
                /* Llistar tots els membres de la Universitat */
                uni.llistarMembresUniversitat();
                menu(uni);
                break;
            case 2:
                /* Llistar tots els alumnes */
                uni.llistarAlumnesUniversitat();
                menu(uni);
                break;
            case 3:
                /* Llistar només els alumnes de doctorat */
                uni.llistarAlumnesDoctoratUniversitat();
                menu(uni);
                break;
            case 4:
                /* Llistar tots els professors */
                uni.llistarProfessoratUniversitat();
                menu(uni);
                break;
            case 5:
                /* Cercar i mostrar informació d’un membre per el seu DNI */
                uni.cercarMembreUniversitatDNI(Util.demanarStringWithNextLine("\nIntrodueix el DNI a cercar: "));
                menu(uni);
                break;
            case 6:
                /* Eliminar membres demanant el DNI */
                uni.eliminarMembre(Util.demanarStringWithNextLine("\nIntrodueix el DNI a eliminar: "));
                menu(uni);
                break;
            case 7:
                /* Llistar les assignatures de la Universitat mostrant el professors que les imparteixen i els alumnes matriculats. */
                uni.llistarAssignatures();
                menu(uni);
                break;
            case 8:
                System.out.println("\nEL PROGRAMA HA FINALITZAT");
                break;
            default:
                throw new AssertionError();
       
        }
  
    }
                      
}
