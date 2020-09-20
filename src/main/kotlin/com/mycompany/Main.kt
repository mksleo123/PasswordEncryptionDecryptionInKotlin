package com.mycompany

import com.mycompany.util.SecurePassword
import java.util.*

fun main() {

    val userChooseValue: Int
    var argvalue: String
    val s1=SecurePassword()
    val console = Scanner(System.`in`)
    println("\nSucure Password Communicator App")
    println("To \"Encrypt\" a Password, Enter the single character 'E'")
    println("To \"Decrypt\" a Password, Enter the single character 'D'")

    while (true){
        argvalue = console.next()
        userChooseValue = when(argvalue.toLowerCase()){
            "e" -> 1
            "d" -> 2
            else->{
                // System.out.println("did NOT get that, Please Enter 'Y' or 'N' only \n");
                println("\n---------------------------------")
                println("Could NOT Proceeses that, ")
                println("you Entered:  '$argvalue'")
                println("You get ONLY two(2) choices")
                println("Either 'E' OR '' ...Only ")
                println("\n---------------------------------")
                print("let's Try Again:  ")
                continue
            }
        }
            break // getout of the While(true) loop - for good
    }
    if (1 == userChooseValue) {
        print("Enter the Password you chose to \"ENCRYPT\":\n")
        argvalue = console.next()
        s1.Encryptor(argvalue)
    }
    if (2 == userChooseValue) {
        print("Enter the Password you chose to \"DECRYPT\":\n")
        argvalue = console.next()
        s1.Decryptor(argvalue)
    }
}
