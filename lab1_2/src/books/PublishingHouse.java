package books;

public class PublishingHouse {
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) this.name = name;
        else {
            this.name = "Задали пустое значение названия издательства";
            System.out.println(name);
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PublishingHouse(String name) {
        setName(name);
    }

    public PublishingHouse(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
