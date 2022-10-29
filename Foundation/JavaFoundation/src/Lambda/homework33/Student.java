package Lambda.homework33;

public class Student {
    private String name;
    private String sex;
    private String className;

    public Student() {
    }

    public Student(String name, String sex, String className) {
        this.setName(name);
        this.setSex(sex);
        this.setClassName(className);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String toString(){
      return "Student{name='"+this.getName()+"', sex='"+this.getSex()+"', className='"+this.getClassName()+"'}";
    };
}
