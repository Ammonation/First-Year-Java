import java.util.*;

class Module
{
  private ArrayList<Student> people = new ArrayList<>();

  /**
   * Add a student
   * @param student A students details
   */
  public void add( Student student )
  {
    people.add( student );
  }

  /**
   * Return the number of students who pass this module
   * @return Number of students who have passed
   */
  public int pass()
  {
    // Fill in code for the method
    int noPass = 0;
    for (int i = people.size();i>0;i--){
        //System.out.println(people.get(i-1));
        if (people.get(i-1).getMark()>=40){
            noPass++;
        }
    }
    return noPass;
  }

  /**
   * Return the number of students who fail this module
   * @return Number of students who have failed
   */
  public int fail()
  {
    // Fill in code for the method
    int noFail = people.size()-pass();
    return noFail;
  }

  /**
   * Return the name of the student with the highest mark
   *  There will only be 1 students who has the highest mark
   * @return Name of the student with the highest mark.
   */
  public String top()
  {
    // Fill in code for the method
    String stuName = people.get(0).getName();
    int mark = people.get(0).getMark();
    for (int i = 1;i<people.size();i++){
        if (people.get(i).getMark()>mark){
            mark = people.get(i).getMark();
            stuName = people.get(i).getName();
        }
    }
    return stuName;
  }

  /**
   * Return the average mark of students on the module
   * @return The average mark
   */
  public double average()
  {
    // Fill in code for the method
    double average;
    double mark = 0;
    double noStu = people.size();
    for (int i = 0;i<people.size();i++){
        mark = mark + people.get(i).getMark();
    }
    average = mark/noStu;
    return average;
  }
}
