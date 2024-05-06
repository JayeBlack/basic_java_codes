public class _classes {
    String name = "jaye";
    int age = 19;
    String color = "black";

    _classes(int a) {
        this.age = a;

    }

    _classes() {
        String w = "hello";
        System.out.println(w);
    }

    public void say() {
        System.out.println(name + color + " is " + age + " years");
    }
    void bob(){
        System.out.println(name+ "schools at umat");
    }

    public static void main(String[] arg) {
        _classes o_of_myclass = new _classes(20);
        o_of_myclass.say();

        _classes h = new _classes();
        h.bob();

    }
}
