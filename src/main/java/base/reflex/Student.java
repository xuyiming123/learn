package base.reflex;

/**
 *  Student类
 */
public  class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("有参构造 \n age = " + age + ",name = " + name);
    }

    public Student() {
        System.out.println("无参构造 \n age = " + age + ",name = " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void print(){
        System.out.println("age = " + age + ",name = " + name);
    }
}
