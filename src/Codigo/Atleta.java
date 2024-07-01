package Codigo;

import java.io.Serializable;

public class Atleta implements Serializable{
    private String nombre;
    private int edad;
    private float peso;
    private float estatura;

    public Atleta(String nombre, int edad, float peso, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Atleta{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estatura=" + estatura + '}';
    }
}
