/*Javier ALejandro Torres Martinez ING.Tics Practica No.12 Compra de un producto*/
package proyectos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practica12 extends JFrame {

    private JTextField precioProductoTextField;
    private JTextField cantidadPagadaTextField;
    private JButton calcularButton;

    public Practica12() {
        // Configurar la ventana
        setTitle("Practica 12 - Compra de Producto");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Crear los componentes
        JLabel precioProductoLabel = new JLabel("Precio del producto:");
        precioProductoLabel.setBounds(20, 20, 150, 20);
        add(precioProductoLabel);

        precioProductoTextField = new JTextField();
        precioProductoTextField.setBounds(170, 20, 100, 20);
        add(precioProductoTextField);

        JLabel cantidadPagadaLabel = new JLabel("Cantidad pagada:");
        cantidadPagadaLabel.setBounds(20, 50, 150, 20);
        add(cantidadPagadaLabel);

        cantidadPagadaTextField = new JTextField();
        cantidadPagadaTextField.setBounds(170, 50, 100, 20);
        add(cantidadPagadaTextField);

        calcularButton = new JButton("Generar Recibo");
        calcularButton.setBounds(20, 90, 150, 30);
        add(calcularButton);

        // Agregar un ActionListener al botón
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarRecibo();
            }
        });
    }

    private void generarRecibo() {
        try {
            double precioProducto = Double.parseDouble(precioProductoTextField.getText());
            double cantidadPagada = Double.parseDouble(cantidadPagadaTextField.getText());

            double totalAPagar = precioProducto;
            double cambio = cantidadPagada - totalAPagar;

            String recibo = "----- Recibo de Compra -----\n";
            recibo += "Fecha: " + obtenerFechaActual() + "\n";
            recibo += "Precio del producto: $" + precioProducto + "\n";
            recibo += "Cantidad pagada: $" + cantidadPagada + "\n";
            recibo += "Total a pagar: $" + totalAPagar + "\n";
            recibo += "Cambio: $" + cambio + "\n";
            recibo += "¡Gracias por su compra!\n";
            
            JOptionPane.showMessageDialog(null, recibo, "Recibo de Compra", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String obtenerFechaActual() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaActual = new Date();
        return formatoFecha.format(fechaActual);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Practica12 programa = new Practica12();
            programa.setVisible(true);
        });
    }
}

