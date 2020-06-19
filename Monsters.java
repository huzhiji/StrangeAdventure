package me.emilelu.StrangeAdventure;

abstract public class Monsters {
	String name;
	int hp;
}

class Caixukun extends Monsters {
	static String name = "蔡徐坤";
	static int hp = 5;
}

class DYGG extends Monsters {
	static String name = "冬泳怪鸽";
	static int hp = 233;
}

class guolaoShi extends Monsters {
	static String name = "迷人的郭老师";
	static int hp = 666;
}

class Boss extends Monsters {
	static String name = "影 流 之 主";
	static int hp = 2147483647;
}