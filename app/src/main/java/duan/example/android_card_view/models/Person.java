package duan.example.android_card_view.models;

public class Person {
    String name;
    String git;
    int photoId;

    public Person(String name, String git, int photoId) {
        this.name = name;
        this.git = git;
        this.photoId = photoId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getGit() {
        return git;
    }

    public String getName() {
        return name;
    }
}
