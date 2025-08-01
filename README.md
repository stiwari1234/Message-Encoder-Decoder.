# Message-Encoder-Decoder.
Simple Cryptography with a GUI Interface

This project implements the Caesar Cipher, a classical encryption technique, using Java Swing to provide an interactive graphical user interface (GUI). Encrypt and decrypt text seamlessly by shifting characters with a specified key.

# Features:
Graphical User Interface: Easy-to-use GUI for inputting text and shift values.
Encryption: Transform your text into a secure format using a customizable shift value.
Decryption: Retrieve the original message by reversing the shift.
Robust Input Handling: Supports both uppercase and lowercase letters while keeping non-alphabetic characters unchanged.

# Getting Started
Prerequisites:
Java Development Kit (JDK) installed on your machine (JDK 8 or above).
Any IDE like IntelliJ IDEA, Eclipse, or NetBeans (optional for development).

# How It Works
Input Text: Enter the text you want to encrypt or decrypt in the Text field.
Specify Shift Value: Enter the shift (key) in the Shift field.
Encrypt/Decrypt:
Click Encrypt to generate the encoded message.
Click Decrypt to retrieve the original message.
View Results: The result will appear in the Result field.

# Understanding the Code
* Encryption Logic:
Each letter is shifted by the specified key. For example, 'A' with a shift of 3 becomes 'D'.
Non-alphabetic characters are not modified.

* Decryption Logic:
Simply reverse the shift by using the formula 26 - shift (since there are 26 letters in the alphabet).

* GUI Components:
JFrame for the main application window.
JPanel to organize components like text fields, labels, and buttons.
Event listeners (ActionListener) to handle button clicks for encryption and decryption.
