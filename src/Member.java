

import java.util.Map;
import java.util.Set;
public class Member {

	private final String name;
	private final Map<Position, Integer> ability;
	
	public Member(String name) {
		this.name = name;
		Set<Position> position = CommonUtil.getPosition();
		ability = CommonUtil.getAbility(position);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isValidPosition(Position position) {
		return ability.containsKey(position);
	}
	
	public int getValue(Position position) {
		return ability.get(position);
	}
}
