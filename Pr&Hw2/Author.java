public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String Aname, String Aemail, char Agender)
    {
        name = Aname;
        email = Aemail;
        gender = Agender;
    }
    public String getName()
    {return name;}

    public String getEmail()
    {return email;}

    public char getGender()
    {return gender;}

    public void setEmail(String Aemail)
    {
        email = Aemail;
    }

    public String toString()
    {
        return "name: " + name + ", gender: " + gender + ", email: " + email;
    }
    public static void main(String[] args) {
            Author A = new Author("Maxim", "Maxim@mail.ru", 'M');
            System.out.println(A);
    }
}

