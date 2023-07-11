package cl.fernando.ejercicio7m5;

public class Presentador {

    private Modelo modelo;

    private VistaPresentador vistaPresentador;

    public Presentador(VistaPresentador vistaPresentador){
        this.vistaPresentador = vistaPresentador;
        modelo = new Modelo();
    }

    public void evaluarContrasena(String password){

        int nivelFuerza = modelo.validarClave(password);

        if (nivelFuerza == Modelo.DEBIL){
            this.vistaPresentador.mostrarDebil();

        } else if (nivelFuerza == Modelo.MEDIO){
            this.vistaPresentador.mostrarMedio();

        } else if (nivelFuerza == Modelo.FUERTE) {
            this.vistaPresentador.mostrarFuerte();

        } else {
            this.vistaPresentador.mostrarError();
        }
    }
}
