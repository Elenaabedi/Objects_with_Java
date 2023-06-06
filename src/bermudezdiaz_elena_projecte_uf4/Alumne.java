/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bermudezdiaz_elena_projecte_uf4;

/**
 *
 * @author Elena
 */
public abstract class Alumne extends Persona {

    // =============================================================== Constructor ===============================================================

    public Alumne(String dni, String nom, String cognom) {
        super(dni, nom, cognom);
    }

    // ================================================================ To String ================================================================

    @Override
    public String toString() {
        return super.toString();
    }
    
    // ======================================================== Mètode inserir assignatura =======================================================

    public abstract void inserirAssignatures(Assignatures as);

}
