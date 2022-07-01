package edu.qc.seclass;

public class BuggyClass {

    //1. 100% statement coverage of buggyMethod1 and no fault.
    //2. less than 50% statement coverage of buggyMethod1 and fault.
    public int buggyMethod1(int a, int b) {
        if (b > 0) {
            int result = a / b;
            return result;
        }
        return a / b;
    }

    // 1. 100% statement coverage and  does not reveal the fault.
    // 2. more than 50% branch coverage reveals the fault.
    public int buggyMethod2(int a, int b){
        int result;

        if(b > 0){
            result = a / b;
        }
        else if (b % 2 == 0) {
            result = a / b;
        }
        else {
            result = a / b ;
        }
        return result;
    }

    // 1. 100% branch coverage and does not reveal the fault
    // 2. 100% statement coverage, does not achieve 100% branch coverage, and reveals the fault.
    public void buggyMethod3(){
        /*
        This is impossible to create a method. We can create the method more than 50% branch coverage and reveal the fault,
        but it is not 100% branch coverage and does not reveal the fault. Also, We can create the method less than
        100% statement coverage and does not reveal the fault, but it is not 100% statement coverage, does not achieve
        100% branch coverage, and reveals the fault because 100% branch coverage means that there have 100% statement
        coverage, so it is not possible.
         */
    }

    // 1. 100% statement coverage reveals the fault.
    // 2. 100% branch coverage and does not reveal the fault.
    public void buggyMethod4(){
        /*
        This is impossible to create a method. We cannot create 100% statement coverage and reveals the fault.
        because an error halt the program before 100% statement coverage is reached, but 100% branch coverage does not
        exist the error because 100% branch coverage means it covers every single statement. Thus, it is not possible.
         */
    }

    // 1. 100% statement coverage.
    // 2. the division by zero fault at line 4 cannot be revealed by any test suite.
    /*
    1.  public void buggyMethod5(int i){
    2.  int x;
    3.  [point where you can add code]
    4.  x =i/0;
    5.  [point where you can add code]
    6.  }
     */
    public void buggyMethod5(){
        /*
        This is impossible. I already explained in method 3 and 4 about why it is impossible to reach 100% statement
        coverage. When there has an error, the error halt the program, so at line 4, the code makes an error, so the
        error stop to executed line 5. Thus, It is not possible.
         */
    }
}
