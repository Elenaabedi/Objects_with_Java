/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bermudezdiaz_elena_projecte_uf4;

import java.util.ArrayList;

/**
 *
 * @author Elena
 */
public class Universitat {

    private String nom;
    private ArrayList<Persona> llistatPersones;
    private ArrayList<Assignatures> llistatAssignatures;

    // ================================================================ Constructor =============================================================
    public Universitat(String nom) {
        this.nom = nom;
        llistatPersones = new ArrayList<>();
        llistatAssignatures = new ArrayList<>();
    }

    // ============================================================ Getters i Setters ===========================================================
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // ============================================================ 1. Llistar Membres ==========================================================
    /*
    Llistar tots els membres
     */
    public void llistarMembresUniversitat() {

        if (llistatPersones.size() > -1) {
            System.out.println("\n*************************************************************************************************************");
            for (Persona llistatpers : llistatPersones) {
                if (llistatpers instanceof AlumneBecat) {
                    System.out.println(llistatpers.toString());
                }
            }
            System.out.println("\n*************************************************************************************************************");
            for (Persona llistatpers : llistatPersones) {
                if (llistatpers instanceof AlumneDoctorat) {
                    System.out.println(llistatpers.toString());
                }
            }
            System.out.println("\n*************************************************************************************************************");
            for (Persona llistatpers : llistatPersones) {
                if (llistatpers instanceof Professor) {
                    System.out.println(llistatpers.toString());
                }
            }
            System.out.println("\n*************************************************************************************************************\n");
        } else {
            System.out.println("\nEl llistat és buit.");
        }
    }

    /*
    Llistar tots els alumnes
     */
    public void llistarAlumnesUniversitat() {

        if (llistatPersones.size() > -1) {
            System.out.println("\n*************************************************************************************************************");
            for (Persona llistatpers : llistatPersones) {
                if (llistatpers instanceof AlumneBecat) {
                    System.out.println(llistatpers.toString());
                }
            }
            System.out.println("\n*************************************************************************************************************");
            for (Persona llistatpers : llistatPersones) {
                if (llistatpers instanceof AlumneDoctorat) {
                    System.out.println(llistatpers.toString());
                }
            }
            System.out.println("\n*************************************************************************************************************\n");
        } else {
            System.out.println("\nEl llistat és buit.");
        }
    }

    /*
    Llistar tots els alumnes de Doctorat
     */
    public void llistarAlumnesDoctoratUniversitat() {

        if (llistatPersones.size() > -1) {
            System.out.println("\n*************************************************************************************************************");
            for (Persona llistatpers : llistatPersones) {
                if (llistatpers instanceof AlumneDoctorat) {
                    System.out.println(llistatpers.toString());
                }
            }
            System.out.println("\n*************************************************************************************************************\n");
        } else {
            System.out.println("\nEl llistat és buit.");
        }
    }

    /*
    Llistar tots els Professors
     */
    public void llistarProfessoratUniversitat() {

        if (llistatPersones.size() > -1) {
            System.out.println("\n*************************************************************************************************************");
            for (Persona llistatpers : llistatPersones) {
                if (llistatpers instanceof Professor) {
                    System.out.println(llistatpers.toString());
                }
            }
            System.out.println("\n*************************************************************************************************************\n");
        } else {
            System.out.println("\nEl llistat és buit.");
        }
    }

    // ============================================================ 2. Cercar membre pel DNI ============================================================
    public int cercarMembreUniversitatDNIreturnPosicio(String dni) {
        int posicio = -1;
        if (llistatPersones.size() > -1) {
            for (int i = 0; i < llistatPersones.size(); i++) {
                if (llistatPersones.get(i).getDni().equals(dni)) {
                    posicio = i;
                }
            }
        }
        return posicio;
    }

    public void cercarMembreUniversitatDNI(String dniPersona) {

        if (llistatPersones.size() > -1 && cercarMembreUniversitatDNIreturnPosicio(dniPersona) != -1) {
            for (Persona persona : llistatPersones) {
                if (persona.getDni().equals(dniPersona)) {
                    System.out.println(persona.toString());
                }
            }
        } else {
            System.out.println("\n ERROR! Aquesta persona no existeix al llistat.");
        }
    }

    // ================================================================== Afegir membre =================================================================

    /*
    Afegir un AlumneBecat
     */
    public void afegirMembre(AlumneBecat alub) {
        if (cercarMembreUniversitatDNIreturnPosicio(alub.getDni()) == -1) {
            llistatPersones.add(alub);
        } else {
            System.out.println("\nNo es pot afegir a aquesta persona a la llista. Ja existeix una persona amb aquest DNI.");
        }
    }

    /*
    Afegir un AlumneDoctorat
     */
    public void afegirMembre(AlumneDoctorat alud) {
        if (cercarMembreUniversitatDNIreturnPosicio(alud.getDni()) == -1) {
            llistatPersones.add(alud);
        } else {
            System.out.println("\nNo es pot afegir a aquesta persona a la llista. Ja existeix una persona amb aquest DNI.");
        }
    }

    /*
    Afegir un Professor
     */
    public void afegirMembre(Professor prof) {
        if (cercarMembreUniversitatDNIreturnPosicio(prof.getDni()) == -1) {
            llistatPersones.add(prof);
        } else {
            System.out.println("\nNo es pot afegir a aquesta persona a la llista. Ja existeix una persona amb aquest DNI.");
        }
    }

    /*
    Afegir un AlumneBecat afegit característiques directament al mètode
     */
    public void afegirMembre(String tipusBeca, String dni, String nom, String cognom) {
        AlumneBecat alub = new AlumneBecat(tipusBeca, dni, nom, cognom);
        if (cercarMembreUniversitatDNIreturnPosicio(alub.getDni()) == -1) {
            llistatPersones.add(alub);
        } else {
            System.out.println("\nNo es pot afegir a aquesta persona a la llista. Ja existeix una persona amb aquest DNI.");
        }
    }

    /*
    Afegir un AlumneDoctorat afegit característiques directament al mètode
     */
    public void afegirMembre(String profTutor, String tipusContracte, String dni, String nom, String cognom) {
        AlumneDoctorat alud = new AlumneDoctorat(profTutor, tipusContracte, dni, nom, cognom);
        if (cercarMembreUniversitatDNIreturnPosicio(alud.getDni()) == -1) {
            llistatPersones.add(alud);
        } else {
            System.out.println("\nNo es pot afegir a aquesta persona a la llista. Ja existeix una persona amb aquest DNI.");
        }
    }

    /*
    Afegir un Professor afegit característiques directament al mètode
     */
    public void afegirMembre(int iniciDocencia, String dni, String nom, String cognom) {
        Professor prof = new Professor(iniciDocencia, dni, nom, cognom);
        if (cercarMembreUniversitatDNIreturnPosicio(prof.getDni()) == -1) {
            llistatPersones.add(prof);
        } else {
            System.out.println("\nNo es pot afegir a aquesta persona a la llista. Ja existeix una persona amb aquest DNI.");
        }
    }

    // ============================================================ Cercar assignatures pel nom ============================================================
    public int cercaAssignaturaxNom(String nomAssig) {
        int posicio = -1;
        if (llistatAssignatures.size() > -1) {
            for (int i = 0; i < llistatAssignatures.size(); i++) {
                if (llistatAssignatures.get(i).getNomAssignatura().equals(nomAssig)) {
                    posicio = i;
                }
            }
        }
        return posicio;
    }

    // ========================================================= Afegir assignatures a L'arrayList =========================================================
    public void afegirAssignaturaArray(Assignatures assig) {

        if (cercaAssignaturaxNom(assig.getNomAssignatura()) == -1) {
            llistatAssignatures.add(assig);
        } else {
            System.out.println("\nNo es pot afegir a aquesta Assignatura per que ja existeix a la llista.");
        }
    }

    // ================================================================= 6. Eliminar membre ================================================================
    public void eliminarMembre(String dni) {
        int posicio = cercarMembreUniversitatDNIreturnPosicio(dni);
        if (posicio != -1) {
            llistatPersones.remove(posicio);
            if (cercarMembreUniversitatDNIreturnPosicio(dni) == -1) {
                System.out.println("\nLa posició ha estat eliminada.");
            } else {
                System.out.println("\nNo s'ha pogut eliminar la posició.");
            }
        } else {
            System.out.println("\nNo s'ha trobat aquest DNI.");
        }
    }

    // ===================== 7. Llistar assignatures de la Universitat mostrant professors que les imparteixen i els alumnes matriculats ====================
    /*public void llistarAssignatures() {


        if (llistatAssignatures.size() > -1) {
            System.out.println("\n*************************************************************************************************************");
            for (Persona pers : llistatPersones) {
            if (pers instanceof Professor) {
                Professor prof = (Professor) pers;
                if (prof.cercarAssignaturareturnPosicio(assig) != -1) {
                    System.out.println(pers.toString());
                }
            } else if (pers instanceof AlumneDoctorat) {
                AlumneDoctorat alud = (AlumneDoctorat) pers;
                if (alud.cercarAssignaturareturnPosicio(assig) != -1) {
                    System.out.println(pers.toString());
                }
            } else if (pers instanceof AlumneBecat) {
                AlumneBecat alub = (AlumneBecat) pers;
                if (alub.cercarAssignaturareturnPosicio(assig) != -1) {
                    System.out.println(pers.toString());
                }
            }
        }
            System.out.println("\n*************************************************************************************************************");
        } else {
            System.out.println("L'array d'assignatures està buit.");
        }
    }*/
    
    // 7. Llistar assignatures de la Universitat mostrant professors que les imparteixen i els alumnes matriculats
public void llistarAssignatures() {
    if (llistatAssignatures.size() > 0) {
        System.out.println("\n*************************************************************************************************************");
        for (Assignatures assignatura : llistatAssignatures) {
            System.out.println(assignatura.toString());
            System.out.println("\nProfessors que imparteixen l'assignatura:");
            for (Persona persona : llistatPersones) {
                if (persona instanceof Professor) {
                    Professor professor = (Professor) persona;
                    int posicio = professor.cercarAssignaturareturnPosicio(assignatura);
                    if (posicio != -1) {
                        System.out.println(professor.toString());
                    }
                }
            }
            System.out.println("\nAlumnes Doctorat matriculats a l'assignatura:");
            for (Persona persona : llistatPersones) {
                if (persona instanceof AlumneDoctorat) {
                    AlumneDoctorat alumneDoctorat = (AlumneDoctorat) persona;
                    int posicio = alumneDoctorat.cercarAssignaturareturnPosicio(assignatura);
                    if (posicio != -1) {
                        System.out.println(alumneDoctorat.toString());
                    }
                }
            }
            System.out.println("\nAlumnes Becats matriculats a l'assignatura:");
            for (Persona persona : llistatPersones) {
                if (persona instanceof AlumneBecat) {
                    AlumneBecat alumneBecat = (AlumneBecat) persona;
                    int posicio = alumneBecat.cercarAssignaturareturnPosicio(assignatura);
                    if (posicio != -1) {
                        System.out.println(alumneBecat.toString());
                    }
                }
            }
        }
        System.out.println("\n*************************************************************************************************************");
    } else {
        System.out.println("L'array d'assignatures està buit.");
    }
}

// ================================================================= Formatejar ArrayList ================================================================
    public void formatejarArrayListPersones() {
        llistatPersones.clear();
        System.out.println("\nL'arrayList està buit.");
    }

    public void formatejarArrayListAssig() {
        llistatAssignatures.clear();
        System.out.println("\nL'arrayList està buit.");
    }

}
