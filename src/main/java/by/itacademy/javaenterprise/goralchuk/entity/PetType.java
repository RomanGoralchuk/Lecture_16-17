package by.itacademy.javaenterprise.goralchuk.entity;

public enum PetType {
    CAT("cat"),
    DOG("dog"),
    FROG("frog"),
    PARROT("parrot"),
    COW("cow");
    private String code;

    PetType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
