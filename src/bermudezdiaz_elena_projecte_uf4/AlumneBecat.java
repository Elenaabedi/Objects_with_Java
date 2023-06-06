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
public class AlumneBecat extends Alumne{
    
    private String tipusBeca; // tipus de beca; estudis, movilitat, investigació, deportiva, formació pràctica, d'idiomes, emprenedors
    private ArrayList<Assignatures> LlistaAssignaturesBecat;
    
    // ================================================================ Constructor ==============================================================

    public AlumneBecat(String tipusBeca, String dni, String nom, String cognom) {
        super(dni, nom, cognom);
        this.tipusBeca = tipusBeca;
        LlistaAssignaturesBecat = new ArrayList<>();
    }
    
    // ============================================================ Getters i Setters ============================================================

    public String getTipusBeca() {
        return tipusBeca;
    }

    public void setTipusBeca(String tipusBeca) {
        this.tipusBeca = tipusBeca;
    }
    
    // ================================================================ To String ================================================================

    @Override
    public String toString() {
        return "\n ALUMNE BECAT " 
                + "\n==================================================" 
                + "\n" 
                + super.toString() 
                + "\nTipus de Beca ..................... " 
                + tipusBeca;
    }
    
    // ============================================= Creació dels mètodes per inserir assignatures ===============================================
    
    // Inserir Assignatures ArrayList
    
    @Override
    public void inserirAssignatures(Assignatures as) {
        LlistaAssignaturesBecat.add(as);
    }
    
    // Cercar Assignatures ArrayList retornant posició dins l'Array
    
    public int cercarAssignaturareturnPosicio(Assignatures as) {
        int posicio = -1;
        if (LlistaAssignaturesBecat.size() > -1) {
            for (int i = 0; i < LlistaAssignaturesBecat.size(); i++) {
                if (LlistaAssignaturesBecat.get(i).getNomAssignatura().equals(as.getNomAssignatura())) {
                    posicio = i;
                }
            }
        }
        return posicio;
    }
    
    // Eliminar Assignatures ArrayList
    
    public void EliminarAssignatures(Assignatures as) {
        int posicio = cercarAssignaturareturnPosicio(as);
        for (Assignatures LlistaAssig : LlistaAssignaturesBecat) {
            if(LlistaAssig.getNomAssignatura().equals(as.getNomAssignatura())){
                LlistaAssignaturesBecat.remove(posicio);
            }
        }
    }

    // ============================================================= Formatejar ArrayList =================================================================

    public void formatejarArrayList() {
        LlistaAssignaturesBecat.clear();
        System.out.println("L'arrayList està buit.");
    }
    
    // ============================================================= Llistar Assignatures aluB =============================================================
    
    public void LlistarAssigAluB() {
        
        for (Assignatures assignatures : LlistaAssignaturesBecat) {
            System.out.println(assignatures.toString());
        }
        
    }
    
}
