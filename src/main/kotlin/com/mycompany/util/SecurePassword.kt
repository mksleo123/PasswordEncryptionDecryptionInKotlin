package com.mycompany.util

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor


  class  SecurePassword {
    private val pwdEncy = "NADIMRIZK"
    private val pwdAlgoEncy = "PBEWITHMD5ANDDES"

    fun Decryptor(encryptedText: String) {
        try {
            val decryptor = StandardPBEStringEncryptor()
            decryptor.setPassword(pwdEncy)
            decryptor.setAlgorithm(pwdAlgoEncy)
            val decryptedText: String = decryptor.decrypt(encryptedText)
            println("\n\n\nNOTE : The Word start AFTER the colon sybmol and SINGLE Whitespace  i.e. ': '")
            println("Encrypted text: $encryptedText")
            println("Decrypted text: $decryptedText")
        } catch (E: Exception) {
            println("ERROR: encrypted word: $encryptedText is NOT a Possible or Valid Encrypted word ")
        }
    }

    fun Encryptor(word: String?) {
        println("\n\n\nNOTE : The Word start AFTER the colon sybmol and SINGLE Whitespace  i.e. ': '")
        val encryptor = StandardPBEStringEncryptor()
        encryptor.setPassword(pwdEncy)
        encryptor.setAlgorithm(pwdAlgoEncy)
        val encryptedText: String = encryptor.encrypt(word)
        println("Encrypted text: $encryptedText")
        val decryptor = StandardPBEStringEncryptor()
        //		    decryptor.setPassword("mySecretPassword");
        decryptor.setPassword(pwdEncy)
        decryptor.setAlgorithm(pwdAlgoEncy)
        val decryptedText: String = decryptor.decrypt(encryptedText)
        println("Decrypted text: $decryptedText")
    }
}