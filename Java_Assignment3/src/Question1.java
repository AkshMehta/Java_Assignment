interface table{
    void table(int n);
}

abstract class Abs{
    abstract void checkVowel(char c);
}

class Child extends Abs implements table{
    void checkVowel(char c){
        switch(c){ //Switch case
            case 'a' : 
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                        System.out.println(c+" is a vowel\n");
                        break;
            default : System.out.println(c+" is a consonent\n");
                        break;
        }
        
    }

    public void table(int n) {
        for(int i=1; i<=10; i++){  //Iterate  through loop
            System.out.println(n+ " * " + i + " = " + n*i);
        }
        
    }
}

class Question1{
    public static void main(String args[]){
        Child c = new Child();
        c.checkVowel('a');
        c.table(3);
    }
}