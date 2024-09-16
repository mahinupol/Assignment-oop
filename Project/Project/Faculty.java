public class Faculty {
    private String id;
    private String name;
    private String department;

    public Faculty(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Faculty [ID=" + id + ", Name=" + name + ", Department=" + department + "]";
    }
}
