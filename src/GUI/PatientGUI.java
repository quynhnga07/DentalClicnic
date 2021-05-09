package GUI;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import DTO.PatientDTO;
import DAL.PatientDAL;
import BLL.PatientBLL;

public class PatientGUI extends JFrame 
{

	private JPanel contentPane;
	private JTextField textFieldSearchName;
	private JTextField textFieldSearchICard;
	private JTextField textFieldID;
	private JTextField textFieldFullName;
	private JTextField textFieldICard;
	private JTextField textFieldAddress;
	private JTextField textFieldPhone;
	private JTable table;
	private JTable table_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					PatientGUI frame = new PatientGUI();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PatientGUI() 
	{
		initComponents();
		loadAllPatients();
	}
	
	public void initComponents()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1134, 750);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(SystemColor.activeCaption);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u00CCM KI\u1EBEM TH\u00D4NG TIN", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.windowBorder));
		panel.setBounds(21, 25, 528, 381);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FullName");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNewLabel.setBounds(27, 40, 68, 21);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ICard ");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNewLabel_1.setBounds(27, 91, 68, 31);
		panel.add(lblNewLabel_1);
		
		textFieldSearchName = new JTextField();
		textFieldSearchName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textFieldSearchName.setBounds(105, 35, 252, 25);
		panel.add(textFieldSearchName);
		textFieldSearchName.setColumns(10);
		
		textFieldSearchICard = new JTextField();
		textFieldSearchICard.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textFieldSearchICard.setBounds(105, 91, 252, 25);
		panel.add(textFieldSearchICard);
		textFieldSearchICard.setColumns(10);
		
		JButton btnNewButtonSearch = new JButton("SEARCH");
		btnNewButtonSearch.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, SystemColor.textInactiveText, null, null, null));
		btnNewButtonSearch.setFont(new Font("Sitka Small", Font.BOLD, 14));
		btnNewButtonSearch.setBounds(398, 58, 108, 31);
		panel.add(btnNewButtonSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 147, 508, 229);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "TH\u00D4NG TIN B\u1EC6NH NH\u00C2N", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.controlDkShadow));
		panel_1.setBounds(562, 28, 548, 378);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("IDPatient");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 29, 74, 22);
		panel_1.add(lblNewLabel_2);
		
		textFieldID = new JTextField();
		textFieldID.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textFieldID.setBounds(94, 29, 154, 25);
		panel_1.add(textFieldID);
		textFieldID.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("FullName");
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 81, 74, 22);
		panel_1.add(lblNewLabel_3);
		
		textFieldFullName = new JTextField();
		textFieldFullName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textFieldFullName.setBounds(94, 81, 154, 25);
		panel_1.add(textFieldFullName);
		textFieldFullName.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("ICard ");
		lblNewLabel_4.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 134, 74, 16);
		panel_1.add(lblNewLabel_4);
		
		textFieldICard = new JTextField();
		textFieldICard.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textFieldICard.setBounds(94, 131, 154, 25);
		panel_1.add(textFieldICard);
		textFieldICard.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNewLabel_5.setBounds(10, 185, 74, 22);
		panel_1.add(lblNewLabel_5);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textFieldAddress.setBounds(94, 182, 154, 25);
		panel_1.add(textFieldAddress);
		textFieldAddress.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Phonenumber");
		lblNewLabel_6.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNewLabel_6.setBounds(271, 32, 103, 19);
		panel_1.add(lblNewLabel_6);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textFieldPhone.setBounds(384, 29, 154, 25);
		panel_1.add(textFieldPhone);
		textFieldPhone.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("DateOfBirth ");
		lblNewLabel_7.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNewLabel_7.setBounds(271, 81, 103, 25);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Gender");
		lblNewLabel_8.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNewLabel_8.setBounds(271, 134, 70, 17);
		panel_1.add(lblNewLabel_8);
		
		JButton btnNewButtonSave = new JButton("SAVE");
		btnNewButtonSave.setFont(new Font("Sitka Small", Font.BOLD, 14));
		btnNewButtonSave.setBounds(32, 276, 103, 33);
		panel_1.add(btnNewButtonSave);
		
		JButton btnNewButtonUpdate = new JButton("UPDATE");
		btnNewButtonUpdate.setFont(new Font("Sitka Small", Font.BOLD, 14));
		btnNewButtonUpdate.setBounds(221, 276, 103, 33);
		panel_1.add(btnNewButtonUpdate);
		
		JButton btnNewButtonDelete = new JButton("DELETE");
		
		btnNewButtonDelete.setFont(new Font("Sitka Small", Font.BOLD, 14));
		btnNewButtonDelete.setBounds(395, 276, 103, 33);
		panel_1.add(btnNewButtonDelete);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Undefined"}));
		comboBox.setBounds(369, 130, 70, 21);
		panel_1.add(comboBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(388, 81, 94, 19);
		panel_1.add(dateChooser);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DANH S\u00C1CH B\u1EC6NH NH\u00C2N ", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textInactiveText));
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_2.setBounds(22, 429, 1088, 274);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 21, 1068, 243);
		panel_2.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				int row = table_1.getSelectedRow();
				if (row != -1) 
				{
					textFieldID.setText(table_1.getValueAt(row, 0).toString());
					textFieldFullName.setText(table_1.getValueAt(row, 1).toString());
					comboBox.setSelectedItem(table_1.getValueAt(row, 2).toString());
					textFieldICard.setText(table_1.getValueAt(row, 3).toString());
					textFieldAddress.setText(table_1.getValueAt(row, 4).toString());
					
					textFieldPhone.setText(table_1.getValueAt(row, 5).toString());
					
				//	dateChooser.setDate(table_1.getValueAt(row, 5).toString());
					
				}
			}
			
		});
		scrollPane_1.setViewportView(table_1);
		
		
	}
	
	public void loadAllPatients()
	{
		String []header = {"ID", "FULLNAME", "GENDER", "ICARD", "ADDRESS", "PHONENUMBER"}; 
		DefaultTableModel dtm = new DefaultTableModel(header, 0);
		ArrayList<PatientDTO> arr = new ArrayList<PatientDTO>();
		PatientBLL  patientBLL  = new PatientBLL();
		arr = patientBLL.getAllPatients();
		PatientDTO patientDTO = new PatientDTO();
		for(int i = 0; i<arr.size(); i++)
		{
			patientDTO = arr.get(i);
			int id = patientDTO.getId();
			String name = patientDTO.getName();
			String gender = patientDTO.getGender();
			String icard = patientDTO.getiCard();
			String address = patientDTO.getAddress();
			String phone = patientDTO.getPhone();
			Object [] row = {id, name, gender, icard, address, phone};
			dtm.addRow(row);
			
		}
		table_1.setModel(dtm);
	}
}
