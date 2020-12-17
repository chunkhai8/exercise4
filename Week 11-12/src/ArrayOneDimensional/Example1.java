package ArrayOneDimensional;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Welcome to our zombie killer program!");
		
		String backpack[] = {"Shotgun", "Assault rifle", "Sniper"};
		String zombies[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};
		int numberzombiesHATE[] = {4,90, 70, 123, 12, 4, 561, 7};
		int numberzombiesNOThate[];
		numberzombiesNOThate = new int[5];
		numberzombiesNOThate[0] = 1;
		numberzombiesNOThate[1] = 10;
		numberzombiesNOThate[2] = 100;
		numberzombiesNOThate[3] = 1000;
		numberzombiesNOThate[4] = 10000;
		
		System.out.println("Backpack items");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);

		System.out.println("There are the zombies");
		System.out.println(zombies[0]);
		System.out.println(zombies[1]);
		System.out.println(zombies[2]);
		
		
		System.out.println(numberzombiesHATE[2]);
		System.out.println(numberzombiesNOThate[0]);
		System.out.println(numberzombiesNOThate[4]);
		
		
	}

}
