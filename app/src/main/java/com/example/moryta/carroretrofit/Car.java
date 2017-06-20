package com.example.moryta.carroretrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 19/06/2017.
 */

public class Car {
    @SerializedName("marca")
    private String marca;

    @SerializedName("modelo")
    private String modelo;

    @SerializedName("cor")
    private String cor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car carro = (Car) o;

        if (marca != null ? !marca.equals(carro.marca) : carro.marca != null) return false;
        if (modelo != null ? !modelo.equals(carro.modelo) : carro.modelo != null) return false;
        return cor != null ? cor.equals(carro.cor) : carro.cor == null;

    }

    @Override
    public int hashCode() {
        int result = marca != null ? marca.hashCode() : 0;
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (cor != null ? cor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
