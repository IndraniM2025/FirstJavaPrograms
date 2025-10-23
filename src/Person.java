public class Person {

        String name ;
        String email ;
        String course ;

    public Person (String name, String email)
    {
        this.name = name;
        this.email = email;
    }
    public void Display ()
    {
       System.out.println("Name :" +name);
       System.out.println("Email :" +email);
       System.out.println(("Course :" +course));
    }
    public void Walk()
    {
        System.out.println("I can Walk");
    }

}
