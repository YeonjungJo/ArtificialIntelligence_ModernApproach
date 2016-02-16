package chapter3.util;

public class WarningMessage {
	
	public static final int DO_NOT_EXIST_PARENT_NODE = 0;
	public static final int ALREADY_EXIST_NODE = 1;
	
	public static void warning(int warningMessage, Object w){
		switch (warningMessage) {
		case DO_NOT_EXIST_PARENT_NODE: 
			System.out.println("Warning : ParentNode가 존재하지 않아 RootNode에 연결됩니다. ( ID : " +  w.toString() + " )\n");
			break;
		case ALREADY_EXIST_NODE:
			System.out.println("Warning : 이미 같은 ID를 가진 노드가 존재합니다. ( ID : " + w.toString() + " )\n");
			break;
		}
	}
}
