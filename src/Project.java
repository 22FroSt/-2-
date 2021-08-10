import java.util.List;

public class Project {

	private final String name;
	private final List<Member> members;
	private int total = 0;

	public Project(String name, List<Member> member) {
		this.name = name;
		this.members = member;
	}

	private void introduction() {
		System.out.println("Project : " + name);
	}

	private void executePosition(Position position) {
		int sum = 0;
		int allowMember = 0;
		for (Member one : members) {
			if (one.isValidPosition(position)) {
				int value = one.getValue(position);
				sum += value;
				allowMember++;
				System.out.println("李몄뿬�옄 : " + one.getName() + "/" + value);
			}
		}

		if (allowMember > 0) {
			int average = sum / allowMember;
			total += average;
			System.out.println("珥� �룊洹� : " + average);
		}
	}

	private void executeAnalysis() {
		System.out.println("[遺꾩꽍]");
		executePosition(Position.Analysis);
	}

	private void executeDesign() {
		System.out.println("[�꽕怨�]");
		executePosition(Position.Design);
	}

	private void executeImplementation() {
		System.out.println("[援ы쁽]");
		executePosition(Position.Implementation);
	}

	private void executeTest() {
		System.out.println("[�뀒�뒪�듃]");
		executePosition(Position.Test);
	}

	public void execute() {
		introduction();
		executeAnalysis();
		executeDesign();
		executeImplementation();
		executeTest();
	}

	public void finalResult() {
		System.out.println("寃곌낵");
		int average = total / 4;
		System.out.println("珥앺룊洹� :" + average);
		if(average >= 80) {
			System.out.println("�꽦怨�: " + average);
		} else {
			System.out.println("�떎�뙣 : " + average);
		}
	}
}

