package chapter3.util;

public class WarningMessage {
	
	public static final int DO_NOT_EXIST_PARENT_NODE = 0;
	public static final int ALREADY_EXIST_NODE = 1;
	
	public static void warning(int warningMessage, Object w){
		switch (warningMessage) {
		case DO_NOT_EXIST_PARENT_NODE: 
			System.out.println("Warning : ParentNode�� �������� �ʾ� RootNode�� ����˴ϴ�. ( ID : " +  w.toString() + " )\n");
			break;
		case ALREADY_EXIST_NODE:
			System.out.println("Warning : �̹� ���� ID�� ���� ��尡 �����մϴ�. ( ID : " + w.toString() + " )\n");
			break;
		}
	}
}
