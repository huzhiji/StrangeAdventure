package me.emilelu.StrangeAdventure;

abstract public class Player {
	static String name = "狗蛋";
	static int normalAttack = 2;
	static int hp = 10;
}

class evolvedPlayer extends Player implements GodMode {
	static String protagonistAura() {
		return "你拥有了主角光环！";
	}

	static int normalAttack = Boss.hp;
	static String hp = "???";
}