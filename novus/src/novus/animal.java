package novus;

public class animal {
	
	String sound;
	String animal;
	
	public String animalSound() {
		return sound;
	}
	
	public static void main (String args[]) {
		cat c = new cat("cat");
		System.out.println(c.animalSound());
		
		dog d = new dog("dog");
		System.out.println(d.animalSound());
		
		zebra z = new zebra("zebra");
		System.out.println(z.animalSound());
	}
}

class cat extends animal {
	public cat(String animal) {
		this.sound = "meow";
	}
}

class dog extends animal {
	public dog (String animal) {
		this.sound = "woof";
	}
}
	
class zebra extends animal {
	public zebra (String animal) {
		this.sound = "oink";
	}
}

