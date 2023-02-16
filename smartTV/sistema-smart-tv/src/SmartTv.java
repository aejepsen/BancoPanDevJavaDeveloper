public class SmartTv {
  boolean ligada = false;
  int volume = 0;
  int canal = 0;

  public void ligar() {
    if (!ligada) {
      ligada = true;
    }
  }

  public void desligar() {
    if (ligada) {
      ligada = false;
    }
  }

  public void aumentarVolume() {
    if (ligada && volume < 100) {
      volume++;
      System.out.println("Aumentando Volume: " + volume);
    }
  }

  public void diminuirVolume() {
    if (ligada && volume > 0) {
      volume--;
      System.out.println("Diminuindo Volume: " + volume);
    }
  }

  public void aumentarCanal() {
    if (ligada && canal < 100) {
      canal++;
      System.out.println("Aumentando Canal: " + canal);
    }
  }

  public void diminuirCanal() {
    if (ligada && canal > 0) {
      canal--;
      System.out.println("Diminuindo Canal: " + canal);
    }
  }

  public void mudarCanal(int canal) {
    if (ligada && canal > 0 && canal < 100) {
      this.canal = canal;
      System.out.println("Mudando Canal: " + canal);
    }
  }
}