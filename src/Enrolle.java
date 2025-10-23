public class Enrolle extends Person
{
public String Course = "History";
public Enrolle (String name, String email, String Course)
{
    super(name,email);
    this.Course = Course;
}

public void Talk()
{
    System.out.println("I can Talk !");
}
}
