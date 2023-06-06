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
public class Professor extends Persona {
    
    private int iniciDocencia;
    private ArrayList<Assignatures> LlistaAssignaturesProf;
    
    // =============================================================== Constructor ===============================================================

    public Professor(int iniciDocencia, String dni, String nom, String cognom) {
        super(dni, nom, cognom);
        this.iniciDocencia = iniciDocencia;
        int assig = -1;
        LlistaAssignaturesProf = new ArrayList<>();
    }
    
    // ============================================================ Getters i Setters ============================================================

    public int getIniciDocencia() {
        return iniciDocencia;
    }

    public void setIniciDocencia(int iniciDocencia) {
        this.iniciDocencia = iniciDocencia;
    }
    
    // ================================================================ To String ================================================================

    @Override
    public String toString() {
        return "\n PROFESSORS " 
                + "\n=================================================="
                + "\n" 
                + super.toString()
                + "\nAny inici Docència ................ " 
                + iniciDocencia;                
    }

    // ============================================= Creació dels mètodes per inserir assignatures ===============================================
    
    // Inserir Assignatures ArrayList
    
    public void inserirAssignatures(Assignatures as) {
        LlistaAssignaturesProf.add(as);
    }
    
    // Cercar Assignatures ArrayList retornant posició dins l'Array
    
    public int cercarAssignaturareturnPosicio(Assignatures as) {
        int posicio = -1;
        if (LlistaAssignaturesProf.size() > -1) {
            for (int i = 0; i < LlistaAssignaturesProf.size(); i++) {
                if (LlistaAssignaturesProf.get(i).getNomAssignatura().equals(as.getNomAssignatura())) {
                    posicio = i;
                }
            }
        }
        return posicio;
    }
    
    // Eliminar Assignatures ArrayList 
    
    public void EliminarAssignatures(Assignatures as) {
        int posicio = cercarAssignaturareturnPosicio(as);
        for (Assignatures LlistaAssig : LlistaAssignaturesProf) {
            if(LlistaAssig.getNomAssignatura().equals(as.getNomAssignatura())){
                LlistaAssignaturesProf.remove(posicio);
            }
        }
    }
    
    // ============================================================= Formatejar ArrayList =============================================================
    
    public void formatejarArrayListProf() {
        LlistaAssignaturesProf.clear();
        System.out.println("L'arrayList està buit.");
    }
    
    // ============================================================= Llistar Assignatures Prof =============================================================
    
    public void LlistarAssigProf() {
        
        for (Assignatures assignatures : LlistaAssignaturesProf) {
            System.out.println(assignatures.toString());
        }
        
    }
    
    
    
    
    
   
    
    
    
    

   

   
    
}
