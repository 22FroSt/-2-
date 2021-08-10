import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class CommonUtil {

	private CommonUtil() {}

	public static int getRanomd() {
		Random rnd = new Random();
		do {
			int value = (rnd.nextInt(10) + 1) * 10;

			if (value >= 50) {
				return value;
			}
		} while (true);
	}

	public static Set<Position> getPosition() {
		Set<Position> position = new HashSet<>();

		Random rnd = new Random();
		int loop = rnd.nextInt(4) + 1;
		int value = rnd.nextInt(4);
		for (int i = 0; i < loop; i++) {
			switch (value) {
			case 0:
				position.add(Position.Analysis);
				break;
			case 1:
				position.add(Position.Design);
				break;
			case 2:
				position.add(Position.Implementation);
				break;
			case 3:
				position.add(Position.Test);
				break;
			}
		}
		
		return position;
	}
	
	public static Map<Position, Integer> getAbility(Set<Position> position) {
		Map<Position, Integer> ability = new HashMap<>();
		for(Position one : position) {
			ability.put(one, getRanomd());
		}
		
		return ability;
	}

}
