public class Grade {
    private String mark;
    private String id;

    public String getMark() {
        return mark;
    }
    public String getId() {
        return id;
    }

    public Grade(String id, String mark){
        this.mark = mark;
        this.id = id;
    }
}
