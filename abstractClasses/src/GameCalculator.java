public abstract class GameCalculator {//base

    public abstract void hesapla();
    //herkesin hesaplası olmak zorunda
    //herkes kendi hesaplasını yazacak,override edecek
    //abstract sınıflar new lenemez

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
