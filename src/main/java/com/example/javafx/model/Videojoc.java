package com.example.javafx.model;

public class Videojoc {
    private int id;
    private String nom;
    private String plataforma;
    private int anyLlançament;
    private String desenvolupador;
    private int puntuacio;

    public Videojoc(String nom, String plataforma, int anyLlançament, String desenvolupador, int puntuacio) {
        this.id = System.identityHashCode(this);
        this.nom = nom;
        this.plataforma = plataforma;
        this.anyLlançament = anyLlançament;
        this.desenvolupador = desenvolupador;
        this.puntuacio = puntuacio;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAnyLlançament() {
        return anyLlançament;
    }

    public void setAnyLlançament(int anyLlançament) {
        this.anyLlançament = anyLlançament;
    }

    public String getDesenvolupador() {
        return desenvolupador;
    }

    public void setDesenvolupador(String desenvolupador) {
        this.desenvolupador = desenvolupador;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    @Override
    public String toString() {
        return "Videojoc{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", anyLlançament=" + anyLlançament +
                ", desenvolupador='" + desenvolupador + '\'' +
                ", puntuacio=" + puntuacio +
                '}';
    }
}
