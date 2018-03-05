package views;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class ProductDialog extends JDialog{

	private static final long serialVersionUID = 1L;
	protected JTextField txName;
	protected JFormattedTextField txPrice;
	protected JButton btnImage;
	protected JFileChooser fileChooser;

	public ProductDialog() {
		setSize(500, 300);
		setLocationRelativeTo(null);
		setLayout(new GridBagLayout());
		getContentPane().setBackground(Color.WHITE);
		setTitle(ConstantsUI.TEXT_TITLE_ADD_PRUDUCT_PRODUCT);
		setIconImage(new ImageIcon(getClass().getResource(ConstantsUI.ICON_PATH)).getImage());

		GridSystem gridSystem = new GridSystem(this);

		txName = new JTextField();
		txName.setBorder(BorderFactory.createTitledBorder(ConstantsUI.TEXT_NAME));
		add(txName, gridSystem.insertComponent(1, 1, 10, 0.15));
		
		txPrice = new JFormattedTextField(ConstantsUI.getIntegerFormatter());
		txPrice.setValue(0);
		txPrice.setBorder(BorderFactory.createTitledBorder(ConstantsUI.TEXT_PRICE));
		add(txPrice, gridSystem.insertComponent(2, 1, 10, 0.15));

		btnImage = new JButton(ConstantsUI.TEXT_ADD_OR_DROP_IMAGE);
		btnImage.setPreferredSize(GridSystem.INIT_DIMENSION);
		btnImage.setBackground(Color.WHITE);
		add(btnImage, gridSystem.insertComponent(3, 2, 8, 0.5));

		JButton btnAddProduct = new JButton(ConstantsUI.TEXT_ADD_PRODUCT);
		btnAddProduct.setPreferredSize(GridSystem.INIT_DIMENSION);
		btnAddProduct.setBackground(ConstantsUI.BTN_COLOR);
		btnAddProduct.setForeground(Color.WHITE);
		gridSystem.addExternalBorder(10,0,10,0);
		add(btnAddProduct, gridSystem.insertComponent(4, 3, 6, 0.2) );
		
		fileChooser = new JFileChooser();
		setVisible(true);;
	}
	
	public static void main(String[] args) {
		new ProductDialog();
	}
}