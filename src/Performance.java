

import java.util.ArrayList;
import java.util.List;

public class Performance {

	public static void main(String[] args) {
		Member member1 = new Member("���μ�");
		Member member2 = new Member("���±�");
		Member member3 = new Member("������");
		Member member4 = new Member("�����");
		Member member5 = new Member("������");
		
		List<Member> allMember = new ArrayList<>();
		allMember.add(member1);
		allMember.add(member2);
		allMember.add(member3);
		allMember.add(member4);
		allMember.add(member5);
		
		Project project = new Project("������Ʈ", allMember);
		project.execute();
		project.finalResult();
		
	}

}