/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author shark
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.util.List;

public class MyNavigableLabel extends JPanel {
    private MyLabel myLabel;
    private JButton btnAnterior;
    private JButton btnSiguiente;
    private List<ImageIcon> imageList;
    private int currentImageIndex = 0;
    
    public MyNavigableLabel() {
        initComponents();
        setupMouseListeners();
    }
    private void setupMouseListeners() {
    myLabel.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            applyZoom(2.0); // Aumenta el tamaño en un factor de 1.2, por ejemplo
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            applyZoom(0.5); // Regresa al tamaño original
        }
    });
}

private void applyZoom(double zoomFactor) {
    if (imageList != null && !imageList.isEmpty() && currentImageIndex >= 0 && currentImageIndex < imageList.size()) {
        ImageIcon icon = imageList.get(currentImageIndex);
        int originalWidth = myLabel.getWidth();
        int originalHeight = myLabel.getHeight();
        int zoomedWidth = (int) (originalWidth * zoomFactor);
        int zoomedHeight = (int) (originalHeight * zoomFactor);

        // Ajusta la imagen
        Image image = icon.getImage().getScaledInstance(zoomedWidth, zoomedHeight, Image.SCALE_SMOOTH);
        myLabel.setIcon(new ImageIcon(image));

        // Ajusta el tamaño del label para que coincida con el nuevo tamaño de la imagen
        myLabel.setPreferredSize(new Dimension(zoomedWidth, zoomedHeight));
        myLabel.revalidate(); // Importante para aplicar los cambios de tamaño
        repaint(); // Repinta el panel y el label para mostrar los cambios
    }
}
    public void setImages(List<ImageIcon> images) {
        this.imageList = images;
        showImageAtIndex(currentImageIndex); // Muestra la primera imagen
    }
    // Método para mostrar la imagen en el índice actual
    private void showImageAtIndex(int index) {
    if (imageList != null && index >= 0 && index < imageList.size()) {
        ImageIcon icon = imageList.get(index);
        myLabel.setIcon(icon);
        myLabel.updateSize(); // Asegura que el tamaño inicial sea correcto
    }
}
    private void initComponents() {
        setLayout(new BorderLayout());
        
        myLabel = new MyLabel();
        add(myLabel, BorderLayout.CENTER);
        
        JPanel buttonPanel = new JPanel();
        btnAnterior = new JButton("<");
        btnSiguiente = new JButton(">");
        buttonPanel.add(btnAnterior);
        buttonPanel.add(btnSiguiente);
        add(buttonPanel, BorderLayout.SOUTH);
    }
     // Método para mostrar la imagen siguiente
    public void showNextImage() {
        if (currentImageIndex < imageList.size() - 1) {
            currentImageIndex++;
            showImageAtIndex(currentImageIndex);
        }
    }

    // Método para mostrar la imagen anterior
    public void showPreviousImage() {
        if (currentImageIndex > 0) {
            currentImageIndex--;
            showImageAtIndex(currentImageIndex);
        }
    }
    public int getMyLabelWidth() {
        return myLabel.getWidth();  // Obtiene el ancho del JLabel
    }

    public int getMyLabelHeight() {
        return myLabel.getHeight(); // Obtiene la altura del JLabel
    }
    // Métodos públicos para configurar la imagen y el texto de MyLabel
    public void setIcon(ImageIcon icon) {
        myLabel.setIcon(icon);
    }
    
    public void setText(String text) {
        myLabel.setText(text);
    }
    
    // Método público para añadir ActionListener a los botones
    public void addAnteriorButtonListener(ActionListener listener) {
        btnAnterior.addActionListener(listener);
    }
    
    public void addSiguienteButtonListener(ActionListener listener) {
        btnSiguiente.addActionListener(listener);
    }
    
}
