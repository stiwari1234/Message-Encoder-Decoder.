import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageEncoder {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Caesar Cipher");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        frame.setVisible(true);
    }
    
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        
        JLabel userLabel = new JLabel("Text:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        
        JLabel shiftLabel = new JLabel("Shift:");
        shiftLabel.setBounds(10, 50, 80, 25);
        panel.add(shiftLabel);
        
        JTextField shiftText = new JTextField(20);
        shiftText.setBounds(100, 50, 165, 25);
        panel.add(shiftText);
        
        JButton encryptButton = new JButton("Encrypt");
        encryptButton.setBounds(10, 80, 150, 25);
        panel.add(encryptButton);
        
        JButton decryptButton = new JButton("Decrypt");
        decryptButton.setBounds(170, 80, 150, 25);
        panel.add(decryptButton);
        
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(10, 110, 80, 25);
        panel.add(resultLabel);
        
        JTextField resultText = new JTextField(20);
        resultText.setBounds(100, 110, 165, 25);
        panel.add(resultText);
        
        encryptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = userText.getText();
                int shift = Integer.parseInt(shiftText.getText());
                String encryptedText = encrypt(text, shift);
                resultText.setText(encryptedText);
            }
        });
        
        decryptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = userText.getText();
                int shift = Integer.parseInt(shiftText.getText());
                String decryptedText = decrypt(text, shift);
                resultText.setText(decryptedText);
            }
        });
    }
    
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + shift) % 26 + base);
            }
            result.append(ch);
        }
        
        return result.toString();
    }
    
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

}
