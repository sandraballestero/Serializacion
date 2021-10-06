package org.iesfm.instituto;

import java.util.List;
import java.util.Objects;

public class Grupo {
    private String titulo;
    private int curso;
    private String letra;
    private List<Alumno> alumnos;

    public Grupo() {

    }

    public Grupo(String titulo, int curso, String letra, List<Alumno> alumnos) {
        this.titulo = titulo;
        this.curso = curso;
        this.letra = letra;
        this.alumnos = alumnos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo grupo = (Grupo) o;
        return curso == grupo.curso && Objects.equals(titulo, grupo.titulo) && Objects.equals(letra, grupo.letra) && Objects.equals(alumnos, grupo.alumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, curso, letra, alumnos);
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "titulo='" + titulo + '\'' +
                ", curso=" + curso +
                ", letra='" + letra + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }
}
