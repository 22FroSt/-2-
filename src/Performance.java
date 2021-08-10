

import java.util.ArrayList;
import java.util.List;

public class Performance {

	public static void main(String[] args) {
		Member member1 = new Member("전민석");
		Member member2 = new Member("이태근");
		Member member3 = new Member("이준혁");
		Member member4 = new Member("김다희");
		Member member5 = new Member("오지언");
		
		List<Member> allMember = new ArrayList<>();
		allMember.add(member1);
		allMember.add(member2);
		allMember.add(member3);
		allMember.add(member4);
		allMember.add(member5);
		
		Project project = new Project("프로젝트", allMember);
		project.execute();
		project.finalResult();
		
	}

}