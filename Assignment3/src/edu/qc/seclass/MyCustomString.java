package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface {

    private String currentString;

    public String getString() {
        if (this.currentString.isEmpty()) {    // If the string is null, it should return null
            return null;
        }
        else {
            return this.currentString;        // return current string
        }
    }

    public void setString(String currentString) {
        this.currentString = currentString;   // sets the value of the current string.
    }

    public int countNumbers() {
        int numberCount = 0;
        boolean previousNumber = false;

        if (this.currentString.isEmpty()) {  // if the current string is empty, it should  return 0.
            return 0;
        } else if (this.currentString == null) {       // if current string is null, throw NullPointerException
            throw new NullPointerException();
        } else {
            for (int i = 0; i < currentString.length(); i++) {
                if (Character.isDigit(currentString.charAt(i))) {
                    if (!previousNumber) {
                        numberCount++;
                        previousNumber = true;
                    }
                } else {
                    previousNumber = false;
                }

            }
            return numberCount;
        }
    }

    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd){
        StringBuffer buffer = new StringBuffer();

        if(n <= 0){
            throw new IllegalArgumentException();  //n less than or equal to zero
        }
        else if(this.currentString == null && 0 < n){
            throw new NullPointerException();      //the current string is null and n is greater than zero
        }
        else if(this.currentString.length() < n){
            return "";
        }

        if (startFromEnd ==false){
            for(int i= n-1; i <this.currentString.length(); i +=n){
                buffer.append(this.currentString.charAt(i));
            }
        }
        else {
            for(int i= this.currentString.length() -n; i >=0; i -= n){
                buffer.insert(0, this.currentString.charAt(i));
            }
        }
        return buffer.toString();

    }

    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition){
        if(startPosition > endPosition) {
            throw new IllegalArgumentException();
        }
        else if((startPosition <= endPosition) && ((startPosition < 1)|| endPosition > this.currentString.length())) {
            throw new MyIndexOutOfBoundsException();
        }
        else if((startPosition <=endPosition) && ((endPosition > 0 && endPosition > 0 && this.currentString == null))) {
            throw new NullPointerException();
        }
        else {
            StringBuffer buffer = new StringBuffer();
            for(int i=0; i <this.currentString.length(); i++){
                if(Character.isDigit(currentString.charAt(i)) && startPosition -1 <= i &&  endPosition -1 >= i) {
                    switch (currentString.charAt(i)) {
                        case '0':
                            buffer.append("Zero");
                            break;
                        case '1':
                            buffer.append("One");
                            break;
                        case '2':
                            buffer.append("Two");
                            break;
                        case '3':
                            buffer.append("Three");
                            break;
                        case '4':
                            buffer.append("Four");
                            break;
                        case '5':
                            buffer.append("Five");
                            break;
                        case '6':
                            buffer.append("Six");
                            break;
                        case '7':
                            buffer.append("Seven");
                            break;
                        case '8':
                            buffer.append("eight");
                            break;
                        case '9':
                            buffer.append("Nine");
                            break;
                    }
                }
                else {
                    buffer.append(this.currentString.charAt(i));
                }
            }
            this.currentString = buffer.toString();
        }
    }
}
