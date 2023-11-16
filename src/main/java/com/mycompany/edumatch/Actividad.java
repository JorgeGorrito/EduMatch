package com.mycompany.edumatch;

public class Actividad {
    private int horaInicio;
    private int horaFinalizacion;
    private int numeroDia;

    private Actividad(Builder builder) {
        this.horaInicio = builder.horaInicio;
        this.horaFinalizacion = builder.horaFinalizacion;
        this.numeroDia = builder.numeroDia;
    }

    public int obtenerHoraInicio() {
        return this.horaInicio;
    }

    public int obtenerHoraFinalizacion() {
        return this.horaFinalizacion;
    }

    
    public static class Builder {
        private int horaInicio;
        private int horaFinalizacion;
        private int numeroDia;

        public Builder() {
            
        }

        public Builder withHoraInicio(int horaInicio) {
            this.horaInicio = horaInicio;
            return this;
        }

        public Builder withHoraFinalizacion(int horaFinalizacion) {
            this.horaFinalizacion = horaFinalizacion;
            return this;
        }

        public Builder withNumeroDia(int numeroDia) {
            this.numeroDia = numeroDia;
            return this;
        }

        public Actividad build() {
            return new Actividad(this);
        }
    }
}
