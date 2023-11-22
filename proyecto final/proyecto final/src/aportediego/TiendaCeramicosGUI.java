package aportediego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiendaCeramicosGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el marco principal
            JFrame frame = new JFrame("Tienda de Cerámicos");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            // Crear un panel para organizar los componentes
            JPanel panel = new JPanel();
            frame.add(panel, BorderLayout.CENTER);

            panel.setLayout(new BorderLayout());

            // Crear el menú
            JMenuBar menuBar = new JMenuBar();
            frame.setJMenuBar(menuBar);

            // Menú Archivo
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

            // Menú Mantenimiento
            JMenu mantenimientoMenu = new JMenu("Mantenimiento");
            menuBar.add(mantenimientoMenu);

            JMenuItem consultarMenuItem = new JMenuItem("Consultar cerámico");
            JMenuItem modificarMenuItem = new JMenuItem("Modificar cerámico");
            JMenuItem listarMenuItem = new JMenuItem("Listar cerámicos");

            mantenimientoMenu.add(consultarMenuItem);
            mantenimientoMenu.add(modificarMenuItem);
            mantenimientoMenu.add(listarMenuItem);

            // Añadir un listener al menú de mantenimiento para abrir la ventana de búsqueda cuando se selecciona el elemento Consultar cerámico
            mantenimientoMenu.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getActionCommand().equals("Consultar cerámico")) {
                        JDialog busquedaDialog = new JDialog(frame, "Consultar cerámico", true);
                        busquedaDialog.setSize(400, 200);

                        // Añadir componentes a la ventana de búsqueda aquí

                        busquedaDialog.setVisible(true);
                    }
                }
            });

            // Menú Ventas
            JMenu ventasMenu = new JMenu("Ventas");
            menuBar.add(ventasMenu);

            JMenuItem venderMenuItem = new JMenuItem("Vender");
            JMenuItem reportesMenuItem = new JMenuItem("Generar reportes");

            ventasMenu.add(venderMenuItem);
            ventasMenu.add(reportesMenuItem);

            // Menú Configuración
            JMenu configuracionMenu = new JMenu("Configuración");
            menuBar.add(configuracionMenu);

            JMenuItem descuentosMenuItem = new JMenuItem("Configurar descuentos");
            JMenuItem obsequiosMenuItem = new JMenuItem("Configurar obsequios");
            JMenuItem cantidadOptimaMenuItem = new JMenuItem("Configurar cantidad óptima");
            JMenuItem cuotaDiariaMenuItem = new JMenuItem("Configurar cuota diaria");

            configuracionMenu.add(descuentosMenuItem);
            configuracionMenu.add(obsequiosMenuItem);
            configuracionMenu.add(cantidadOptimaMenuItem);
            configuracionMenu.add(cuotaDiariaMenuItem);

            // Menú Ayuda
            JMenu ayudaMenu = new JMenu("Ayuda");
            menuBar.add(ayudaMenu);

            JMenuItem acercaDeMenuItem = new JMenuItem("Acerca de Tienda");
            ayudaMenu.add(acercaDeMenuItem);

            frame.setVisible(true);
        });
    }
}