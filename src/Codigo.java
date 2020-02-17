import java.util.Calendar;

public class Codigo extends Interface {

    private int day;
    private int month;
    private int year;
    private int result;
    private int yearBorn;
    private int age;
    private int resultAge;
    private int currentAge;
//=====================================================================================================================
    public Codigo(){

    }
//=====================================================================================================================
    public void myAgeCode(){
        Calendar calend = Calendar.getInstance();

        do {
            System.out.print("Type The Year You Were Born: ");
            setYearBorn(input.nextInt());

            if (yearBorn < calend.get(Calendar.YEAR) -150 || yearBorn > calend.get(Calendar.YEAR)){
                System.out.println("\n\t!! Invalid Year !!\n");
            }

        }while (getYearBorn() < calend.get(Calendar.YEAR) -150 || getYearBorn() > calend.get(Calendar.YEAR));

        if (getYearBorn() == calend.get(Calendar.YEAR)){
            do {
                System.out.print("Type The Month You Were Born: ");
                month = input.nextInt();

                if (month < 1 || month > calend.get(Calendar.MONTH) +1){
                    System.out.println("\n\t!! Invalid Month !!\n");
                }
                else {
                    System.out.println("Your Age Is: " + month + " Months Old");
                }
            }while (month < 1 || month > calend.get(Calendar.MONTH) +1);
        }

        else {
            do {
                System.out.print("Type The Month You Were Born: ");
                month = input.nextInt();

                if (month < 1 || month >= 13){
                    System.out.println("\n\t!! Invalid Month !!\n");
                }
                else {
                    setYear(calend.get(Calendar.YEAR));

                    if (month <= calend.get(Calendar.MONTH) +1){
                        setResult(getYear() - getYearBorn());
                    }
                    else {
                        setResult(getYear() - getYearBorn() -1);
                    }
                    if (getResult() == 0){
                        month = 14 - month;
                        System.out.println("Your Age Is: " + month + " Months Old");
                    }
                    else {
                        System.out.println("Your Age Is: " + getResult() + " Years Old");
                    }
                }
            }while (month <= 0 || month > 12);
        }
    }
//=====================================================================================================================
    public void myYearCode(){
        System.out.print("Type Your Age: ");
        setCurrentAge(input.nextInt());
        System.out.print("Type The Month You Were Born: ");
        month = input.nextInt();

        Calendar calend = Calendar.getInstance();
        setAge(calend.get(Calendar.YEAR));

        if (month <= calend.get(Calendar.MONTH) +1){
            setResultAge(getAge() - getCurrentAge());
        }
        else {
            setResultAge(getAge() - getCurrentAge() -1);
        }

        System.out.println("The Year You Were Born Is: " + getResultAge());
    }
//=====================================================================================================================
    public void todaysDay(){
        Calendar calend = Calendar.getInstance();
        day = calend.get(Calendar.DATE);
        month = calend.get(Calendar.MONTH) +1;
        year = calend.get(Calendar.YEAR);

        System.out.println("Day " + day + " Month " + month + " Year " + year);
    }
//=====================================================================================================================
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getResultAge() {
        return resultAge;
    }
    public void setResultAge(int resultAge) {
        this.resultAge = resultAge;
    }

    public int getCurrentAge() {
        return currentAge;
    }
    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }

    public int getYearBorn() {
        return yearBorn;
    }
    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }
//=====================================================================================================================
}
