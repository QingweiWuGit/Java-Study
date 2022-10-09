package Polymorphism.circus;

public class Lion extends Animal implements IAct {
    private String color;
    private String sex;

    public Lion() {
    }

    public Lion(String name, int age, String color, String sex) {
        super(name, age);
        this.setColor(color);
        this.setSex(sex);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢吃各种肉类");
    }

    @Override
    public void skill() {
        System.out.println("技能：擅长钻火圈");
    }

    @Override
    public void act() {
        System.out.println("表演者：" + this.getName());
        System.out.println("年龄：" + this.getAge() + "岁");
        System.out.println("性别：" + this.getSex());
        System.out.println("毛色：" + this.getColor());
        this.skill();
        this.love();
    }
}
