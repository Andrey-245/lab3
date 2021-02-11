abstract class ShortyBoss {
    private String name;
    private TypeOfLocation location;
    private PhotoCamera howPhotoCamera;




    public ShortyBoss(TypeOfLocation street, PhotoCamera PhotoCamera, String name) {

    }

    public ShortyBoss() {

    }

    public void takePhoto(int i, Street  HowPhoto, String location, String name, int howPhoto) {
        System.out.println("После того как " + name + " вышел на " + location + ", коротыжка сфотографировал его аж " + howPhoto + " раз.");

    }


    @Override
    public String toString() {
        return "Shorty{" +
                "name='" + name + '\''  +
                ", location=" + location +
                ", HowPhoto=" + howPhotoCamera +
                '}';
    }





}