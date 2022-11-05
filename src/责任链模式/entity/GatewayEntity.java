package 责任链模式.entity;

public class GatewayEntity {
    private int id;

    private String name;

    private int next;

    private  int pre;

    private String classPath;

    public GatewayEntity(int id, String name, int pre,int next, String classPath) {
        this.id = id;
        this.name = name;
        this.next = next;
        this.pre = pre;
        this.classPath = classPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getPre() {
        return pre;
    }

    public void setPre(int pre) {
        this.pre = pre;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
