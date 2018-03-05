package views;

import java.awt.Color;
import java.text.NumberFormat;

import javax.swing.text.NumberFormatter;

public class ConstantsUI {
	
	public static final String EMPTY_STRING = "";
	public static final Color BTN_COLOR = Color.decode("#4d90fe");
	
	public static final String TIITLE = "Order Manager v1";
	
	public static final String TEXT_NAME = "Name:";
	public static final String TEXT_PRICE = "Price:";
	public static final String TEXT_ADD_OR_DROP_IMAGE = "Add or drop image";
	public static final String TEXT_TITLE_ADD_PRUDUCT_PRODUCT = "Add product";
	public static final String TEXT_ADD_PRODUCT = "Add product";
	public static final String ICON_PATH = "/imgs/icon.png";
	
	public static final NumberFormatter getIntegerFormatter(){
		NumberFormat format = NumberFormat.getInstance();
		NumberFormatter formatter = new NumberFormatter(format);
		formatter.setValueClass(Integer.class);
		formatter.setMinimum(0);
		formatter.setMaximum(Integer.MAX_VALUE);
		formatter.setAllowsInvalid(false);
		return formatter;
	}
}