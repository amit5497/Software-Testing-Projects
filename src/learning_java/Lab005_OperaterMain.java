package learning_java;
class Lab005_OperaterMain{
    public static void main(String args[]){
        Lab005_Operater lab = new Lab005_Operater();
        int a=10;
        int b=10;
        //1. Arithmetic Operators
        lab.addTwoNum(a,b);
        lab.SubtractTwoNum(a,b);
        lab.MultiplicatTwoNum(a,b);
        lab.DivisionOfTwoNum(a,b);
        lab.ModulusOfTwoNum(a,b);
        //	2. Relational (Comparison) Operators & Ternary Operator

        lab.EqualToOperator(a,b);
        lab.NotEqualToOperator(a,b);
        lab.LessThenOperator(a,b);
        lab.GreaterThenOperator(a,b);
        lab.LessThenEqualTOOperator(a,b);
        lab.GreaterThenEqualTOOperator(a,b);

    }


}
class Lab005_Operater {
    	/*1. Arithmetic Operators
    	Used for mathematical operations.
    		• + (Addition): a + b
    		• - (Subtraction): a - b
    		• * (Multiplication): a * b
    		• / (Division): a / b
    		• % (Modulus): a % b */
    public void addTwoNum(int a,int b){
        int c =a+b;
        System.out.println("Sum of two Number "+a+" + "+b+" = "+c);
    }

    public void SubtractTwoNum(int a, int b) {
        int c =a-b;
        System.out.println("Subtract of two Number "+a+" - "+b+" = "+c);
    }

    public void MultiplicatTwoNum(int a, int b) {
        int c =a*b;
        System.out.println("Multiplication of two Number "+a+" x "+b+" = "+c);
    }

    public void DivisionOfTwoNum(int a, int b) {
        int c =a/b;
        System.out.println("Division of two Number "+a+" / "+b+" = "+c);
    }

    public void ModulusOfTwoNum(int a, int b) {
        int c =a%b;
        System.out.println("Modulus of two Number "+a+" % "+b+" = "+c);
    }
    /*
    2. Relational (Comparison) Operators
    	Used to compare values.
 		• == (Equal to): a == b
     	• != (Not equal to): a != b
    		• < (Less than): a < b
    		• > (Greater than): a > b
  	     	• <= (Less than or equal to): a <= b
    		• >= (Greater than or equal to): a >= b
    7. Ternary Operator
    	Shorthand for if-else.
    		• condition ? valueIfTrue : valueIfFalse;
    		• Example: int result = (a > b) ? a : b;
     */
    public void EqualToOperator(int a, int b) {
        String c =(a == b) ? "A is Equal To  B" : "A is Not Equal To  B";
        System.out.println(c);
    }

    public void NotEqualToOperator(int a, int b) {
        String c =(a != b) ? "A is Not Equal To  B" : "A is Equal To  B";
        System.out.println(c);
    }

    public void LessThenOperator(int a, int b) {
        String c =(a<b) ? "Number A is Less then B" : "Number A is Not less then B";
        System.out.println(c);

    }

    public void GreaterThenOperator(int a, int b) {
        String c =(a>b) ? "Number A is greater then B" : "Number A is Not greater then B";
        System.out.println(c);
    }

    public void LessThenEqualTOOperator(int a, int b) {
        String c =(a<=b) ? "Number A is Less then Equal B" : "Number A is Not less then Equal B";
        System.out.println(c);
    }

    public void GreaterThenEqualTOOperator(int a, int b) {
        String c =(a>=b) ? "Number A is greater then Equal to B" : "Number A is Not greater then Equal to B";
        System.out.println(c);
    }


    //	3. Logical Operators
    //	Used for logical operations.
    //		• && (Logical AND): a && b
    //		• || (Logical OR): a || b
    //		• ! (Logical NOT): !a
    //	4. Bitwise Operators
    //	Operate on bits.
    //		• & (Bitwise AND): a & b
    //		• | (Bitwise OR): a | b
    //		• ^ (Bitwise XOR): a ^ b
    //		• ~ (Bitwise Complement): ~a
    //		• << (Left Shift): a << 2
    //		• >> (Right Shift): a >> 2
    //
    //	5. Assignment Operators
    //	Used to assign values.
    //		• = (Assignment): a = b
    //		• += (Add and assign): a += b
    //		• -= (Subtract and assign): a -= b
    //		• *= (Multiply and assign): a *= b
    //		• /= (Divide and assign): a /= b
    //		• %= (Modulus and assign): a %= b
    //	6. Unary Operators
    //	Operate on a single operand.
    //		• + (Unary plus): +a
    //		• - (Unary minus): -a
    //		• ++ (Increment): a++ or ++a
    //		• -- (Decrement): a-- or --a
    //		• ! (Logical NOT): !a
    //		• ~ (Bitwise Complement): ~a

    //	8. Instanceof Operator
    //	Checks if an object is an instance of a specific class.
    //		• Example: if (obj instanceof String) { ... }
    //	9. Type Cast Operators
    //	Convert one data type into another.
    //		• Example: int x = (int) 5.6;
}


