class Main {
    public static void main(String[] args) {
        System.out.println("This is is an project for unittesten and maven");

        StringOps strOps = new StringOps();
        System.out.println(strOps.reverse("hello"));

        Person person = new Person();
        System.out.println(person.getName());

    }
}