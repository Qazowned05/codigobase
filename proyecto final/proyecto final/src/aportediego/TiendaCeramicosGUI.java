package aportediego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiendaCeramicosGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el marco principal
            JFrame frame = new JFrame("Tienda de Cer�micos");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            // Crear un panel para organizar los componentes
            JPanel panel = new JPanel();
            frame.add(panel, BorderLayout.CENTER);

            panel.setLayout(new BorderLayout());

            // Crear el men�
            JMenuBar menuBar = new JMenuBar();
            frame.setJMenuBar(menuBar);

            // Men� Archivo
            JMenu archivoMenu = new JMenu("Archivo");
            menuBar.add(archivoMenu);

            JMenuItem salirMenuItem = new JMenuItem("Salir");
            salirMenuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            archivoMenu.add(salirMenuItem);

            // Men� Mantenimiento
            JMenu mantenimientoMenu = new JMenu("Mantenimiento");
            menuBar.add(mantenimientoMenu);

            JMenuItem consultarMenuItem = new JMenuItem("Consultar cer�mico");
            JMenuItem modificarMenuItem = new JMenuItem("Modificar cer�mico");
            JMenuItem listarMenuItem = new JMenuItem("Listar cer�micos");

            mantenimientoMenu.add(consultarMenuItem);
            mantenimientoMenu.add(modificarMenuItem);
            mantenimientoMenu.add(listarMenuItem);

            // A�adir un listener al men� de mantenimiento para abrir la ventana de b�squeda cuando se selecciona el elemento Consultar cer�mico
            mantenimientoMenu.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getActionCommand().equals("Consultar cer�mico")) {
                        JDialog busquedaDialog = new JDialog(frame, "Consultar cer�mico", true);
                        busquedaDialog.setSize(400, 200);

                        // A�adir componentes a la ventana de b�squeda aqu�

                        busquedaDialog.setVisible(true);
                    }
                }
            });

            // Men� Ventas
            JMenu ventasMenu = new JMenu("Ventas");
            menuBar.add(ventasMenu);

            JMenuItem venderMenuItem = new JMenuItem("Vender");
            JMenuItem reportesMenuItem = new JMenuItem("Generar reportes");

            ventasMenu.add(venderMenuItem);
            ventasMenu.add(reportesMenuItem);

            // Men� Configuraci�n
            JMenu configuracionMenu = new JMenu("Configuraci�n");
            menuBar.add(configuracionMenu);

            JMenuItem descuentosMenuItem = new JMenuItem("Configurar descuentos");
            JMenuItem obsequiosMenuItem = new JMenuItem("Configurar obsequios");
            JMenuItem cantidadOptimaMenuItem = new JMenuItem("Configurar cantidad �ptima");
            JMenuItem cuotaDiariaMenuItem = new JMenuItem("Configurar cuota diaria");

            configuracionMenu.add(descuentosMenuItem);
            configuracionMenu.add(obsequiosMenuItem);
            configuracionMenu.add(cantidadOptimaMenuItem);
            configuracionMenu.add(cuotaDiariaMenuItem);

            // Men� Ayuda
            JMenu ayudaMenu = new JMenu("Ayuda");
            menuBar.add(ayudaMenu);

            JMenuItem acercaDeMenuItem = new JMenuItem("Acerca de Tienda");
            ayudaMenu.add(acercaDeMenuItem);

            frame.setVisible(true);
        });
    }
}