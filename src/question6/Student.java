package question6;

class Student implements DetailInfo {
    private static int maxcount;
    private String name;

    public void setter(String name) {
        this.name = name;
    }

    public String getter() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
    }

    @Override
    public int count() {
        return name.length();
    }
}