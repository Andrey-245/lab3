public class photograph extends ShortyBoss{

    public photograph(TypeOfLocation street, PhotoCamera PhotoCamera, String name) {
        super(street, PhotoCamera, name);
    }

    public photograph() {
        super();
    }

    public static PhotoCamera takephoto(int i, Street howPhoto, String street, String miga, int i1) {

        return PhotoCamera.takephoto((int)(Math.random() * 20), howPhoto, "street", "Miga", (int) (Math.random() * 20) );
    }
}
