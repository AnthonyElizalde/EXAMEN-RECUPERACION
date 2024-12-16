package BuscaminasRecuperacion;

public class ClassCasilla {

private boolean mina;
private boolean descubierta;
private boolean marcada;
private int minasAdyacentes;

public  void Casilla() {
    this.mina = false;
    this.descubierta = false;
    this.marcada = false;
    this.minasAdyacentes = 0;
}

public boolean isMina() {
    return mina;
}

public void setMina(boolean mina) {
    this.mina = mina;
}

public boolean isDescubierta() {
    return descubierta;
}

public void setDescubierta(boolean descubierta) {
    this.descubierta = descubierta;
}

public boolean isMarcada() {
    return marcada;
}

public void setMarcada(boolean marcada) {
    this.marcada = marcada;
}

public int getMinasAdyacentes() {
    return minasAdyacentes;
}

public void setMinasAdyacentes(int minasAdyacentes) {
    this.minasAdyacentes = minasAdyacentes;
}
}
