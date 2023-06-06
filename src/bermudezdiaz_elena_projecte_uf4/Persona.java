/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bermudezdiaz_elena_projecte_uf4;

/**
 *
 * @author Elena
 */
public abstract class Persona {
    
    private String dni;
    private String nom;
    private String cognom;
    
    // =============================================================== Constructor ===============================================================

    public Persona(String dni, String nom, String cognom) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
    }
    
    // ============================================================ Getters i Setters ============================================================

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    
    // ================================================================ To String ================================================================

    @Override
    public String toString() {
        return  "Nom ............................... " 
                + nom 
                + "\nCognom ............................ " 
                + cognom 
                + "\nDNI ............................... " 
                + dni;
    }

}
