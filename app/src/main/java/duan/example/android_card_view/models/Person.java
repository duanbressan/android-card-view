package duan.example.android_card_view.models;

public class Person {
    String name;
    String age;
    int photoId;

    public Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
