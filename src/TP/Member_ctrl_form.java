package TP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JInternalFrame;
import javax.swing.SpringLayout;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import java.awt.TextField;
import java.awt.CardLayout;
import javax.swing.JSeparator;
import net.miginfocom.swing.MigLayout;
import java.awt.Panel;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JDesktopPane;
import java.awt.Label;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Component;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.border.LineBorder;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Member_ctrl_form extends JFrame {

	private JPanel contentPane;
	private JTextField USER_NAME;
	private JTextField USER_BIRTH;
	private JTextField USER_PHONE_NUMBER;
	private JTextField USER_MAIL;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Member_ctrl_form frame = new Member_ctrl_form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Member_ctrl_form() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 591, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(5, 5, 1603, 23);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton selectMemberManagementButton = new JButton("ȸ������");	//ȸ������
		selectMemberManagementButton.setBounds(0, 0, 97, 23);
		panel.add(selectMemberManagementButton);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(0, 28, 575, 457);
		contentPane.add(panel_5);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setLayout(null);
		
		JLabel labelName = new JLabel("�̸�");
		labelName.setBounds(16, 10, 41, 15);
		panel_5.add(labelName);
		
		//ȸ�� �̸��� �Է��� �ؽ�Ʈ �ʵ�
		USER_NAME = new JTextField();
		USER_NAME.setBounds(78, 7, 116, 21);
		panel_5.add(USER_NAME);
		USER_NAME.setColumns(10);
		
		
		JLabel labelBirth = new JLabel("�������");
		labelBirth.setBounds(16, 34, 57, 15);
		panel_5.add(labelBirth);
		
		//ȸ���� ��������� �Է��� �ؽ�Ʈ �ʵ�
		USER_BIRTH = new JTextField();
		USER_BIRTH.setBounds(78, 56, 217, 21);
		panel_5.add(USER_BIRTH);
		USER_BIRTH.setColumns(20);
		
		JLabel labelPhoneNumber = new JLabel("����ó");
		labelPhoneNumber.setBounds(16, 59, 41, 15);
		panel_5.add(labelPhoneNumber);
		
			//ȸ���� �޴���ȭ�� �Է��� �ؽ�Ʈ �ʵ�
			USER_PHONE_NUMBER = new JTextField();
			USER_PHONE_NUMBER.setBounds(78, 31, 116, 21);
			panel_5.add(USER_PHONE_NUMBER);
			USER_PHONE_NUMBER.setColumns(10);
			
			JLabel labelMail = new JLabel("�̸���");
			labelMail.setBounds(16, 84, 57, 23);
			panel_5.add(labelMail);
			
			//ȸ���� �̸��ϸ� �Է��� �ؽ�Ʈ �ʵ�
			USER_MAIL = new JTextField();
			USER_MAIL.setBounds(78, 87, 217, 21);
			panel_5.add(USER_MAIL);
			USER_MAIL.setColumns(20);
			
			//�̸��� �Է��ϰ� "ȸ���˻�" ��ư�� ������ �������,����ó,�̸����� ���� USER_BIRTH, USER_PHONE_NUMBER, USER_MAIL�� ���
			JButton memberSearchButton = new JButton("ȸ���˻�");	//ȸ�� �˻�
			memberSearchButton.setBackground(SystemColor.activeCaption);
			memberSearchButton.setBounds(12, 235, 97, 23);
			panel_5.add(memberSearchButton);
			memberSearchButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"�̸��� �Է��ϰ� ��ư�� ������ ����/����/�̸��� ������ �ؽ�Ʈ�ʵ忡 ������ ����","Message",JOptionPane.ERROR_MESSAGE);
					System.out.println("ȸ�� �˻�");
				}
			});
			// �ؽ�Ʈ �ʵ忡 ���� �Է��ϰ� "ȸ�����" ��ư�� ������ �̸�, �������, ����ó, �̸���, ������� USER_TABLE�� �����͸� ����
			JButton membershipRegistrationButton = new JButton("ȸ�����");	//ȸ�����
			membershipRegistrationButton.setBackground(SystemColor.activeCaption);
			membershipRegistrationButton.setBounds(12, 133, 97, 23);
			panel_5.add(membershipRegistrationButton);
			membershipRegistrationButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"�̸�/����/����/�̸����� �Է��ϰ� ��ư�� ������ ������� �����Ͽ� USER_TABLE�� �����͸� ����","Message",JOptionPane.ERROR_MESSAGE);
				}
			});
			
			//������ �ʵ��� ���� ��� �������� �𸣰���
			JButton membershipModificationButton = new JButton("ȸ������");	//ȸ�� ����
			membershipModificationButton.setBackground(SystemColor.activeCaption);
			membershipModificationButton.setBounds(12, 169, 97, 23);
			panel_5.add(membershipModificationButton);
			membershipModificationButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"��� ���̺� �ʵ忡 ���� ������ ������ ���� �����ϰ� ��ư�� Ŭ���ϸ� ������ ������ DB�� ����","Message",JOptionPane.ERROR_MESSAGE);
				}
			});
			
			//���̺��� ���� ��� �����ؼ� �����Ұ��� �𸣰���
			JButton deleteMembershipButton = new JButton("ȸ������");	//ȸ�� ����
			deleteMembershipButton.setBackground(SystemColor.activeCaption);
			deleteMembershipButton.setBounds(12, 202, 97, 23);
			panel_5.add(deleteMembershipButton);
			deleteMembershipButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"USER_BOOL�� ���� 0(false)�� ��ȯ","Message",JOptionPane.ERROR_MESSAGE);
				}
			});
			
					JLabel lblNewLabel_6 = new JLabel("");
					lblNewLabel_6.setBounds(16, 108, 57, 15);
					panel_5.add(lblNewLabel_6);
					
					JLabel lblNewLabel = new JLabel("\uC0AC\uC9C4");
					lblNewLabel.setForeground(Color.BLACK);
					lblNewLabel.setBackground(SystemColor.activeCaption);
					lblNewLabel.setBounds(354, 10, 166, 200);
					panel_5.add(lblNewLabel);
					
							//"ȸ�����" ��ư�� ������ USER_TABLE�� ���� ��� ������ JTABLE�� ���
							JButton membershipListButton = new JButton("\uD68C\uC6D0\uBAA9\uB85D\uBCF4\uAE30");
							membershipListButton.setBackground(SystemColor.activeCaption);
							membershipListButton.setBounds(12, 268, 154, 23);
							panel_5.add(membershipListButton);
							
							JButton btnNewButton = new JButton("\uC0AC\uC9C4\uB4F1\uB85D");
							btnNewButton.setBackground(SystemColor.activeCaption);
							btnNewButton.setBounds(392, 220, 97, 23);
							panel_5.add(btnNewButton);
							membershipListButton.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									JOptionPane.showMessageDialog(null,"���̺�ǥ�� ���� ��ħ��","Message",JOptionPane.ERROR_MESSAGE);
								}
							});
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}