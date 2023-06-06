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
public class AlumneDoctorat extends Alumne {

    private String profTutor; // tipus de beca; estudis, movilitat, investigació, deportiva, formació pràctica, d'idiomes, emprenedors
    private String tipusContracte;
    private ArrayList<Assignatures> LlistaAssignaturesDoctorat;

    // ================================================================ Constructor ==============================================================
    
    public AlumneDoctorat(String profTutor, String tipusContracte, String dni, String nom, String cognom) {
        super(dni, nom, cognom);
        this.profTutor = profTutor;
        this.tipusContracte = tipusContracte;
        LlistaAssignaturesDoctorat = new ArrayList<>();
    }

    // ============================================================ Getters i Setters ============================================================
    
    public String getProfTutor() {
        return profTutor;
    }

    public void setProfTutor(String profTutor) {
        this.profTutor = profTutor;
    }

    public String getTipusContracte() {
        return tipusContracte;
    }

    public void setTipusContracte(String tipusContracte) {
        this.tipusContracte = tipusContracte;
    }

    // ================================================================ To String ================================================================
    
    @Override
    public String toString() {
        return "\n ALUMNE DOCTORAT "
                + "\n=================================================="
                + "\n" + super.toString()
                + "\nTipus de contracte ................ "
                + tipusContracte
                + "\nProfessor tutor ................... "
                + profTutor;
    }

    // ============================================= Creació dels mètodes per inserir assignatures ===============================================
    
    // Inserir Assignatures ArrayList
    
    @Override
    public void inserirAssignatures(Assignatures as) {
        LlistaAssignaturesDoctorat.add(as);
    }

    // Cercar Assignatures ArrayList retornant posició dins l'Array
    
    public int cercarAssignaturareturnPosicio(Assignatures as) {
        int posicio = -1;
        if (LlistaAssignaturesDoctorat.size() > -1) {
            for (int i = 0; i < LlistaAssignaturesDoctorat.size(); i++) {
                if (LlistaAssignaturesDoctorat.get(i).getNomAssignatura().equals(as.getNomAssignatura())) {
                    posicio = i;
                }
            }
        }
        return posicio;
    }

    // Eliminar Assignatures ArrayList
    
    public void EliminarAssignatures(Assignatures as) {
        int posicio = cercarAssignaturareturnPosicio(as);
        for (Assignatures LlistaAssig : LlistaAssignaturesDoctorat) {
            if (LlistaAssig.getNomAssignatura().equals(as.getNomAssignatura())) {
                LlistaAssignaturesDoctorat.remove(posicio);
            }
        }
    }

    // ============================================================= Formatejar ArrayList =================================================================
    
    public void formatejarArrayList() {
        LlistaAssignaturesDoctorat.clear();
        System.out.println("L'arrayList està buit.");
    }

    // ============================================================= Llistar Assignatures aluD =============================================================
    
    public void LlistarAssigAluD() {

        for (Assignatures assignatures : LlistaAssignaturesDoctorat) {
            System.out.println(assignatures.toString());
        }

    }

}
