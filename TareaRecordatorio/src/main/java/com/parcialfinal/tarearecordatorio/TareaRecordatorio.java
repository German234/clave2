package com.parcialfinal.tarearecordatorio;

import java.time.LocalDate;

public class TareaRecordatorio {

    private int tareaID;
    private String titulo;
    private String descripcion;
    private LocalDate fechaTarea;
    private String estado;
    private boolean repetirDiariamente;

    public TareaRecordatorio() {}

    public TareaRecordatorio(int tareaID, String titulo, String descripcion,
                             LocalDate fechaTarea, String estado, boolean repetirDiariamente) {
        this.tareaID = tareaID;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaTarea = fechaTarea;
        this.estado = estado;
        this.repetirDiariamente = repetirDiariamente;
    }

    public int getTareaID() {
        return tareaID;
    }

    public void setTareaID(int tareaID) {
        this.tareaID = tareaID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaTarea() {
        return fechaTarea;
    }

    public void setFechaTarea(LocalDate fechaTarea) {
        this.fechaTarea = fechaTarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isRepetirDiariamente() {
        return repetirDiariamente;
    }

    public void setRepetirDiariamente(boolean repetirDiariamente) {
        this.repetirDiariamente = repetirDiariamente;
    }
}