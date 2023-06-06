/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bermudezdiaz_elena_projecte_uf4;

/**
 *
 * @author elena
 */
public class Assignatures {
    
    private String nomAssignatura;
    
    // =============================================================== Constructor ===============================================================

    public Assignatures(String nomAssignatura) {
        this.nomAssignatura = nomAssignatura;
    }
    
    // ============================================================ Getters i Setters ============================================================

    public String getNomAssignatura() {
        return nomAssignatura;
    }

    public void setNomAssignatura(String nomAssignatura) {
        this.nomAssignatura = nomAssignatura;
    }

    // ================================================================ To String ================================================================
    
    @Override
    public String toString() {
        return "\n ASIGNATURES " 
                + "\n=================================================="
                + "\nNom Assignatura ................... " 
                + nomAssignatura;
    }

    
    
    
    
    
    
    
}
