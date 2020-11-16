package com.example.application2;

public class MembreEquipe {
    int idE;
    String NomE;
    String DescE;
    String ImgE;

    public MembreEquipe(int idE, String nomE, String descE, String imgE) {
        this.idE = idE;
        NomE = nomE;
        DescE = descE;
        ImgE = imgE;
    }

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public String getNomE() {
        return NomE;
    }

    public void setNomE(String nomE) {
        NomE = nomE;
    }

    public String getDescE() {
        return DescE;
    }

    public void setDescE(String descE) {
        DescE = descE;
    }

    public String getImgE() {
        return ImgE;
    }

    public void setImgE(String imgE) {
        ImgE = imgE;
    }
}
