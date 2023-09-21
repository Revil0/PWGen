package com.leucisa.pwgen;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class PWGenerator 
{
    public static void main( String[] args )
    {
        String pass = generateSecurePassword();

        System.out.println("The Passay generated password is:" +pass);
    }

    public static String generateSecurePassword() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter desired password length:");

        int pwLength = myObj.nextInt();
        myObj.close();
        System.out.println("Length set to " + pwLength);
        
        CharacterRule LCR = new CharacterRule(EnglishCharacterData.LowerCase);
        LCR.setNumberOfCharacters(2);

        CharacterRule UCR = new CharacterRule(EnglishCharacterData.UpperCase);
        UCR.setNumberOfCharacters(2);

        CharacterRule DR = new CharacterRule(EnglishCharacterData.Digit);
        DR.setNumberOfCharacters(2);

        CharacterRule SR = new CharacterRule(EnglishCharacterData.Special);
        SR.setNumberOfCharacters(2);

        PasswordGenerator passGen = new PasswordGenerator();
        String password = passGen.generatePassword(pwLength, LCR, UCR, DR);

        return password;
    }
}