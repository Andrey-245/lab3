public class Main {

    public static void main(String[] args) {

        Street HowPhoto = new Street(new Photo(0));

        Shorty unnamed1 = new Shorty(TypeOfLocation.STREET, new Photo((int) (Math.random() * 20)), "unnamed1");
        Shorty unnamed2 = new Shorty(TypeOfLocation.STREET, new Photo((int) (Math.random() * 20)), "unnamed2");
        Shorty unnamed3 = new Shorty(TypeOfLocation.STREET, new Photo((int) (Math.random() * 20)), "unnamed3");
        Shorty unnamed4 = new Shorty(TypeOfLocation.STREET, new Photo((int) (Math.random() * 0)), "unnamed3");

        Shorty Miga = new Shorty(TypeOfLocation.YELLOW_CAR, new Photo(0), "Miga");
        Shorty Kozlic = new Shorty(TypeOfLocation.YELLOW_CAR, new Photo(0), "Kozlic");
        Shorty Gylio = new Shorty(TypeOfLocation.YELLOW_CAR, new Photo(0), "Gylio");
        Shorty Neznaika = new Shorty(TypeOfLocation.YELLOW_CAR, new Photo(0), "Neznaika");
        Photo photo = photograph. takephoto((int)(Math.random() * 20), HowPhoto, "street", "Miga", (int) (Math.random() * 20) );

        unnamed1.takePhoto((int)(Math.random() * 20), HowPhoto, "street", "Miga", (int) (Math.random() * 20) );

        unnamed2.takePhoto((int)(Math.random() * 20), HowPhoto, "street", "Kozlic", (int) (Math.random() * 15));

        unnamed3.takePhoto((int)(Math.random() * 20), HowPhoto, "street", "Gylio", (int) (Math.random() * 10) );

        unnamed4.takePhoto((int)(Math.random() * 0), HowPhoto, "street", "Neznaika", (int) (Math.random() * 0));

    }
}
