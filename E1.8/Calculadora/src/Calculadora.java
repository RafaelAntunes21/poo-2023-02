import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel labelNumero1 = new JLabel("1º Número: ");
        labelNumero1.setBounds(20, 20, 100, 25);
        panel.add(labelNumero1);

        JTextField textNumero1 = new JTextField(10);
        textNumero1.setBounds(100, 20, 200, 25);
        panel.add(textNumero1);

        JLabel labelNumero2 = new JLabel("2º Número:");
        labelNumero2.setBounds(20, 50, 100, 25);
        panel.add(labelNumero2);

        JTextField textNumero2 = new JTextField(10);
        textNumero2.setBounds(100, 50, 200, 25);
        panel.add(textNumero2);

        JButton somarButton = new JButton("+");
        somarButton.setBounds(50, 80, 50, 25);
        panel.add(somarButton);

        JButton subtrairButton = new JButton("-");
        subtrairButton.setBounds(120, 80, 50, 25);
        panel.add(subtrairButton);

        JButton multiplicarButton = new JButton("*");
        multiplicarButton.setBounds(190, 80, 50, 25);
        panel.add(multiplicarButton);

        JButton dividirButton = new JButton("/");
        dividirButton.setBounds(260, 80, 50, 25);
        panel.add(dividirButton);

        JLabel resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(20, 120, 250, 25);
        panel.add(resultadoLabel);

        somarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());
                    double resultado = numero1 + numero2;
                    resultadoLabel.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Números inválidos");
                }
            }
        });

        subtrairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());
                    double resultado = numero1 - numero2;
                    resultadoLabel.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Números inválidos");
                }
            }
        });

        multiplicarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());
                    double resultado = numero1 * numero2;
                    resultadoLabel.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Números inválidos");
                }
            }
        });

        dividirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());
                    if (numero2 != 0) {
                        double resultado = numero1 / numero2;
                        resultadoLabel.setText("Resultado: " + resultado);
                    } else {
                        resultadoLabel.setText("Erro: Divisão por zero");
                    }
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Números inválidos");
                }
            }
        });

        frame.setVisible(true);
    }
}
