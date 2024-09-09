package com.Generic2;

import java.util.HashMap;
import java.util.Map;

import static com.Generic2.TypeVisite.*;

public class VisiteMedicale  {
    private String patientName;
    private  String doctorName;
    public TypeVisite visiteType;
    public String date;
    public Map<TypeVisite,String> visites;

    public VisiteMedicale(String patientName, String doctorName, TypeVisite visiteType, String date) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.visiteType = visiteType;
        this.date = date;
        this.visites=new HashMap<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public TypeVisite getVisiteType() {
        return visiteType;
    }

    public void setVisiteType(TypeVisite visiteType) {
        this.visiteType = visiteType;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public  void ajouterVisite(TypeVisite visite, String patientName){
        visites.put(visite,getPatientName());
    }
    @VisiteCritique(visite = URGENCE, doctorName ="")
    public TypeVisite aVisiteCritique(){
        TypeVisite b = URGENCE;
        if(false){
            return  b;
        }else {
            return getVisiteType();
        }
    }

    public Map<TypeVisite, String> getVisites() {
        return visites;
    }
}
