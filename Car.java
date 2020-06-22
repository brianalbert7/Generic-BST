package lab08treespt1pt2sum18testers;


/**
   Programmed by    Stephen Brower
   Date Modified    2/10/2014 - added comments in JavaDoc format
   Updated by       Linda Yang
*/


public class Car implements Comparable<Car>
{
    private int yearModel;
    private String make;
    private int speed;

   /**
      Constructor`
      @param newYearModel The year of the Car.
      @param newMake The make of the Car.
   */

    public Car(int newYearModel, String newMake)
    {
        yearModel = newYearModel;
        make = newMake;
        speed = 0;
    }

   /**
      The getYearModel method returns a Car
      object's yearModel.
      @return The value in the yearModel field.
   */

    public int getYearModel()
    {
        return yearModel;
    }

   /**
      The getMake method returns a Car
      object's make.
      @return The value in the make field.
   */

    public String getMake()
    {
        return make;
    }

   /**
      The getSpeed method returns a Car
      object's speed.
      @return The value in the speed field.
   */

    public int getSpeed()
    {
        return speed;
    }

   /**
      The accelerate method increases speed.
   */

    public void accelerate()
    {
        // i am ommitting a regulator
        speed += 5;
    }

   /**
      The brake method decreases speed.
   */

    public void brake()
    {
        speed-=5;
        if (speed < 0)
            speed = 0;
    }

   /**
      The equals method compares this Car to another Object .
      @param The object to test for equality.
      @return boolean with result of test for equality.
   */

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Car))
            throw new ClassCastException("A Car object expected.");

        Car otherCar = (Car) obj;  // cast the Object to a Car

        if (make.equalsIgnoreCase(otherCar.getMake())
            && yearModel == otherCar.getYearModel())
            return true;
        else
            return false;
    }

   /**
      The compareTo method compares this Car to another Object .
      if this car is before other car, return a value < 0.
      if this car is after other car, return a value > 0.
      if this car is equal to other car, return 0.
      @param The object to test for equality.
      @return int with result of comparison.
   */

    public int compareTo(Car anotherCar)
    throws ClassCastException
    {
        if (!(anotherCar instanceof Car))
            throw new ClassCastException("A Car object expected.");

        if (getYearModel() < anotherCar.getYearModel())
            return -1;
        else if (getYearModel() > anotherCar.getYearModel())
            return 1;
        else
            return make.compareToIgnoreCase(anotherCar.getMake());
    }

   /**
      The toString method returns a Car
      object's yearModel, make, speed as a String.
      @return A String with values in the yearModel, make, speed fields.
   */

    public String toString()
    {
        return "[Car " + yearModel +" "+ make+"]";
    }

}