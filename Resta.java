public class Resta {
   private int uno,dos,resultado;
    private int re;

    public int mostrarResultado() {
        return this.uno-this.dos;
    }
    @Override
    public String toString() {
        return "Resta [uno=" + uno + ", dos=" + dos + ", resultado=" + resultado + ", re=" + re + "]";
    }

    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public int getDos() {
        return dos;
    }

    public void setDos(int dos) {
        this.dos = dos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }


} 

