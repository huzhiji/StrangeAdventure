package me.emilelu.StrangeAdventure;

abstract public class Weapons {
	String name;
	String description;
}

class gfsStick extends Weapons {
	static String name = "爷爷的拐杖";
	static String description = "可以击飞敌人 1~3 米，并造成 1~5 点伤害。";
}

class miHotel extends Weapons {
	static String name = "㊙Hotel";
	static String description = "一个外观酷似猕猴桃的武器？可以使方圆 ?? 米内产生爆炸，并对敌人造成 ?? 点伤害。";
}