/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Alexander
 */
public class MyLabel extends JLabel {

    private ImageIcon icon;
    private String text = "";
    private double zoomFactor = 1.0;

    public MyLabel() {
        this.setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK, 2));
        this.setOpaque(true);
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(120, 120));

        setupMouseListeners();
    }

    public void setZoomFactor(double zoomFactor) {
        this.zoomFactor = zoomFactor;
        updateSize();
    }

    /*void updateSize() {
        int width = (int) (120 * zoomFactor); // 120 es el tamaño base definido previamente
        int height = (int) (120 * zoomFactor);
        setPreferredSize(new Dimension(width, height));
        if (icon != null) {
            Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            setIcon(new ImageIcon(image));
        }
        revalidate();
        repaint();
    }*/
    void updateSize() {
        int baseWidth = 120;  // Ancho base sin zoom
        int baseHeight = 120; // Alto base sin zoom
        int width = (int) (baseWidth * zoomFactor);
        int height = (int) (baseHeight * zoomFactor);
        setPreferredSize(new Dimension(width, height));
        if (icon != null) {
            Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            setIcon(new ImageIcon(image));
        }
        revalidate();
        repaint();
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setTexto(String text) {
        this.text = text;
    }

    private void setupMouseListeners() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setZoomFactor(1.0); // Ajusta este valor según lo que necesites para el zoom
                setText(text);
                setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK, 2));
                setBackground(Color.yellow);
                setForeground(Color.black);
                setVerticalTextPosition(SwingConstants.BOTTOM);
                setHorizontalTextPosition(SwingConstants.CENTER);
                setHorizontalAlignment(JLabel.CENTER);
                setVerticalAlignment(JLabel.CENTER);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setZoomFactor(1.0); // Restablece el factor de zoom a 1
                setText(""); // Opcional, según tu diseño
                setBackground(Color.white); // Restablece el color de fondo
                setHorizontalAlignment(JLabel.CENTER);
                setVerticalAlignment(JLabel.CENTER);
            }

            /*@Override
            public void mouseExited(MouseEvent e) {
                setZoomFactor(1.0);
                setText("");
                setBackground(Color.white);
                setHorizontalAlignment(JLabel.CENTER);
                setVerticalAlignment(JLabel.CENTER);
            }*/
        });
    }

}
