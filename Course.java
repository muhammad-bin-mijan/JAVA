public class Course
{
  public String code;
  public String title;
  
  public Course(String c,String t)
  {
    code=c;
    title=t;
  }
  public Course(String c)//constructor overloading
  {
    code=c;
    title="Not setted yet";
  }
}