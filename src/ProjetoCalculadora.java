import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JButton Calculadora;
    private JButton um;
    private JButton dois;
    private JButton quatro;
    private JButton cinco;
    private JButton seis;
    private JButton sete;
    private JButton oito;
    private JButton nove;
    private JButton btnSomar;
    private JButton btnSubtrair;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btnIgual;
    private JButton btnLimpar;
    private JTextField textField1;
    private JPanel panel1;
    private JButton zero;
    private JButton C;
    private JButton tres;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel valorUm;
    private JLabel valorDois;
    private JLabel resultado;
    private JButton JButton;

    public Calculadora() {

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Peguei informação da tela

                Integer primeiro = Integer.valueOf(valorUm.getText());
                Integer segundo = Integer.valueOf(valorDois.getText());

                //Processei
                Integer soma = primeiro + segundo;

                //mandei pra tela o resultado
                resultado.setText(soma.toString());

                System.out.println(primeiro);
                System.out.println(segundo);

            }
        });

        btnSubtrair.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer primeiro = Integer.valueOf(valorUm.getText());
                Integer segundo = Integer.valueOf(valorDois.getText());

                Integer subtrair = primeiro - segundo;

                resultado.setText(subtrair.toString());

                System.out.println(primeiro);
                System.out.println(segundo);
            }
        });
        btnMultiplicar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                //Peguei informação da tela

                Integer primeiro = Integer.valueOf(valorUm.getText());
                Integer segundo = Integer.valueOf(valorDois.getText());

                //Processei
                Integer multiplicar = primeiro + segundo;

                //mandei pra tela o resultado
                resultado.setText(multiplicar.toString());

                System.out.println(primeiro);
                System.out.println(segundo);

            }
        });
        btnDividir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                //Peguei informação da tela

                Integer primeiro = Integer.valueOf(valorUm.getText());
                Integer segundo = Integer.valueOf(valorDois.getText());

                //Processei
                Integer dividir = primeiro + segundo;

                //mandei pra tela o resultado
                resultado.setText(dividir.toString());

                System.out.println(primeiro);
                System.out.println(segundo);

            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Projeto Calculadora");
        frame.setContentPane(new Calculadora().panel1);
        frame.setSize(500,500);
        frame.setVisible(true);


    }

    private void createUIComponents(){}
}