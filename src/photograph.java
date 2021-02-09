public class photograph extends ShortyBoss{

    public photograph(TypeOfLocation street, Photo photo, String name) {
        super(street, photo, name);
    }

    public static Photo takephoto(int i, Street howPhoto, String street, String miga, int i1) {

        return Photo.takephoto((int)(Math.random() * 20), howPhoto, "street", "Miga", (int) (Math.random() * 20) );
    }
}
