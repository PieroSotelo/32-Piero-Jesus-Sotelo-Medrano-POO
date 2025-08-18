import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame {
    private JTextField txtNum1, txtNum2;
    private JButton btnSuma, btnResta, btnMult, btnDiv;
    private JLabel lblResultado;

    public CalculadoraGUI() {
        setTitle("Calculadora");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lbl1 = new JLabel("Número 1:");
        lbl1.setBounds(10, 10, 80, 25);
        add(lbl1);

        txtNum1 = new JTextField();
        txtNum1.setBounds(100, 10, 150, 25);
        add(txtNum1);

        JLabel lbl2 = new JLabel("Número 2:");
        lbl2.setBounds(10, 40, 80, 25);
        add(lbl2);

        txtNum2 = new JTextField();
        txtNum2.setBounds(100, 40, 150, 25);
        add(txtNum2);

        btnSuma = new JButton("Sumar");
        btnSuma.setBounds(10, 80, 100, 25);
        add(btnSuma);

        btnResta = new JButton("Restar");
        btnResta.setBounds(120, 80, 100, 25);
        add(btnResta);

        btnMult = new JButton("Multiplicar");
        btnMult.setBounds(10, 110, 100, 25);
        add(btnMult);

        btnDiv = new JButton("Dividir");
        btnDiv.setBounds(120, 110, 100, 25);
        add(btnDiv);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(10, 140, 200, 25);
        add(lblResultado);

        // Eventos
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(txtNum1.getText());
                    double n2 = Double.parseDouble(txtNum2.getText());
                    double res = 0;

                    if (e.getSource() == btnSuma) res = n1 + n2;
                    if (e.getSource() == btnResta) res = n1 - n2;
                    if (e.getSource() == btnMult) res = n1 * n2;
                    if (e.getSource() == btnDiv) {
                        if (n2 == 0) {
                            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
                            return;
                        }
                        res = n1 / n2;
                    }

                    lblResultado.setText("Resultado: " + res);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese números válidos");
                }
            }
        };

        btnSuma.addActionListener(listener);
        btnResta.addActionListener(listener);
        btnMult.addActionListener(listener);
        btnDiv.addActionListener(listener);
    }
}
