package components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.AbstractListModel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;

public class RightScrollListPanel extends JPanel{
	
	JScrollPane lists;
	private class listComponent extends JPanel{
		
		ImageIcon languageImage;
		JLabel title, languageIcon;
		
		
		public listComponent(){
			this.initializeObjects();
			this.setBorder(new EmptyBorder(20,50,20,50));
			this.setBackground(Color.gray);
			title.setForeground(Color.white);
			this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			addObjects();
		}
		private void initializeObjects() {
			languageImage = resizeImage(new ImageIcon("./Resources/languageLogo/java.png"));
			languageIcon = new JLabel(languageImage);
			title = new JLabel("Title of the Code");
		}
		private ImageIcon resizeImage(ImageIcon image) {
			Image newIcon = image.getImage().getScaledInstance(50,  50, Image.SCALE_SMOOTH);
			return new ImageIcon(newIcon);
		}
		
		private void addObjects() {
			
			this.add(languageIcon);
			this.add(Box.createRigidArea(new Dimension(50, 0)));
			this.add(title);
		}
	}
	
	
	public RightScrollListPanel() {
		this.setBounds(0, 150, 800, 550);
		this.setBackground(Color.gray);
		ListModel<listComponent> listItems = new AbstractListModel<>() {
			
			@Override
			public int getSize() {
				return 100;
			}
			
			@Override
			public listComponent getElementAt(int index) {
				listComponent item = new listComponent();
				return item;
			}
			
		};
		
		JList<listComponent> list = new JList<>(listItems);
		list.setCellRenderer((jlist, value, index, isSelected, cellHasFocus) -> {
            value.setBackground(isSelected ? Color.LIGHT_GRAY : Color.darkGray);
            return value;
        });
		
		list.setLayoutOrientation(JList.VERTICAL);
        list.setFixedCellHeight(100); 
//        list.setBorder(new EmptyBorder(10, 20, 10, 20));
		lists = new JScrollPane(list);
        lists.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        lists.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        lists.setPreferredSize(new Dimension(800, 550)); 
		
		this.add(lists);
		
	}
	
	
}
