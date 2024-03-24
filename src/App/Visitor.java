package App;

public class Visitor {
    private String name;
    private String contactInfo;
    private int visitCount;

    public Visitor(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.visitCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void incrementVisitCount() {
        visitCount++;
    }
}
