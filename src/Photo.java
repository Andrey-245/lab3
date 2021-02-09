import java.util.Objects;

public class Photo {
Street howPhoto;
    Photo(int HowPhoto) {

    }

    public Photo(Street howPhoto) {
        this.howPhoto = howPhoto;
    }

    public static Photo takephoto(int i, Street howPhoto, String street, String miga, int i1) {

        return null;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "howPhoto=" + howPhoto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Objects.equals(howPhoto, photo.howPhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(howPhoto);
    }
}