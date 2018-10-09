package assignment;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


                String[] keyword = {"int", "if", "byte", "long", "String", "double", "else", "switch", "float"};
                String[] identifiers = {"a", "b", "c", "d", "e"};
                String[] operand = {"-", " +", "/","=", "*"};
                String[] operator = {"<", ">", "&&", "||", "!=", "=="};
                String[] value = {"1", "2", "3", "4", "5", "6", "7", "8"};
                String[] others = {"{", "}", ";", ")", "(", ","};

                String list="";

                try {

                    //Opening file
                    Scanner input = new Scanner (new File("E:\\a.txt"));
                   

                    //Reading from file
                    while (input.hasNextLine()){
                    	list += input.nextLine() + " ";
                    }

                    //Closing file
                    input.close();

                } catch (Exception e){
                    System.out.println("File not found");
                }

                //Splitting the string text

                String[] newArrayList = list.split(" ");


                for( int i=0; i<newArrayList.length; i++){
                    for( int j=i+1; j<newArrayList.length; j++){
                        if((newArrayList[i]).equals(newArrayList[j]))
                        	newArrayList[j] = "";
                    }

                }

                System.out.println("File readed.");
                System.out.println("A symbol table:");


                System.out.print("\nkeyword:");
                for( int i=0; i<newArrayList.length; i++){
                    for( int j=0; j<keyword.length; j++){
                        if((newArrayList[i]).equals(keyword[j])){
                            System.out.print(" " + newArrayList[i] + ",");
                        }
                    }
                }

                System.out.print("\nIdentifiers:");
                for( int i=0; i<newArrayList.length; i++){
                    for( int j=0; j<identifiers.length; j++){
                        if((newArrayList[i]).equals(identifiers[j])){
                            System.out.print(" " +newArrayList[i] + ",");
                        }
                    }
                }

                System.out.print("\nMath Operators:");
                for( int i=0; i<newArrayList.length; i++){
                    for( int j=0; j<operand.length; j++){
                        if((newArrayList[i]).equals(operand[j])){
                            System.out.print(" " +newArrayList[i] + ",");
                        }
                    }
                }

                System.out.print("\nLogical Operators:");
                for( int i=0; i<newArrayList.length; i++){
                    for( int j=0; j<operator.length; j++){
                        if((newArrayList[i]).equals(operator[j])){
                            System.out.print(" " +newArrayList[i] + ",");
                        }
                    }
                }

                System.out.print("\nValues:");
                for( int i=0; i<newArrayList.length; i++){
                    for( int j=0; j<value.length; j++){
                        if((newArrayList[i]).equals(value[j])){
                            System.out.print(" " +newArrayList[i] + ",");
                        }
                    }
                }


                System.out.print("\nOthers:");
                for( int i=0; i<newArrayList.length; i++){
                    for( int j=0; j<others.length; j++){
                        if((newArrayList[i]).equals(others[j])){
                            System.out.print(" " +newArrayList[i]);
                        }
                    }
                }


    }
}

