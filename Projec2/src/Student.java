public class Student {
    public int point;
    public String name;
    public String major;

    // Constructor
    public Student(String name, String major, int point) {
        this.name = name;
        this.major = major;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor() {
        this.major = major;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        if (point > 0) {
            this.point = point;
        }
    }

    public void displayInfo(){
        System.out.println("Student Name:"+name);
        System.out.println("Student Major:"+major);
        System.out.println("Student Point:"+point);
    }
}
