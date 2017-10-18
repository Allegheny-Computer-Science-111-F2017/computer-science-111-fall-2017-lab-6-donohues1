package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
/**
 *  This class uses strings to manipulate dna.
 *  The program will replace dna.
 *
 *  <p>Bugs: This program has no known bugs, but is missing code.
 *  @author Sarah Donohue
 */

public class ManipulateDna {

  /**
  *  The main method will input values and display dna.
  *  The program will display dna using methods.
  *
  *  <p>Bugs: This program has no known bugs.
  *
  *  @author Sarah Donohue
  */
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Sarah Donohue " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("I am going to manipulate the DNA string " + dna);
    // Step Two: Compute the complement of the DNA String
    String sequence = dna;
    sequence = sequence.replace('A', 't');
    sequence = sequence.replace('C', 'g');
    sequence = sequence.replace('T', 'a');
    sequence = sequence.replace('G', 'c');

    sequence = sequence.toUpperCase();

    System.out.println("Enter a string only containing C, G, T, and A: " + dna);
    System.out.println("Complement of: " + dna + " is " + sequence);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random random = new Random();
    char randomChar = dna.charAt(random.nextInt(4));
    int randomInt = random.nextInt(4);
    String first = dna.substring(0,randomInt) + randomChar + dna.substring(randomInt);
    System.out.println("Inserting " + randomChar + " at position " + randomInt + " gives " + first);
    
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    String two = (dna.substring(0, randomInt) + dna.substring(randomInt + 1, dna.length()));

    System.out.println("Deleting from position " + randomInt + " gives " + two);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    char randomReplace = dna.charAt(random.nextInt(4));
    int randomIntTwo = random.nextInt(4);
    String three = dna.substring(0, randomIntTwo) + randomReplace + dna.substring(randomIntTwo + 1);
    System.out.println("Changing position " + " gives " + three);
    // Step Six: Display a final thankyou message
    System.out.println("Thank you for using my ManipulationDna Program.");
    System.out.println("Have a nice day.");
  }

}
