public class Shorty {

    private String name;
    private TypeOfLocation location;
    private Photo HowPhoto;




    public Shorty(TypeOfLocation street, Photo photo, String name) {
        //System.out.println("Когда " + name + " вышел на " + location + ", коротыжка сфотографировал его аж " + howPhoto);
    }


    @Override
    public String toString() {
        return "Shorty{" +
                "name='" + name + '\''  +
                ", location=" + location +
                ", HowPhoto=" + HowPhoto +
                '}';
        }



    public void takePhoto(int i, Street  HowPhoto, String location, String name, int howPhoto) {
        System.out.println("После того как " + name + " вышел на " + location + ", коротыжка сфотографировал его аж " + howPhoto);
    }


}