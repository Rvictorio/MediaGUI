package Contas;

public class Notas {
    private float primeiraNota, segundaNota;

    public float getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(float primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public float getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(float segundaNota) {
        this.segundaNota = segundaNota;
    }

    public int notaDaMedia(float primeiraNota, float segundaNota){
        return (int) ((primeiraNota+segundaNota)/2.0);
    }
}
