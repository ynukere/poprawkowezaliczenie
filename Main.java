class Main {
  public static void main(String[] args) {
    int tablica[]= {5,10,15};
    int wynik = 0;
    for(int i = 0;i<tablica.length;i++){
        wynik = wynik + tablica[i];
    }
    System.out.println(wynik);
  }
}