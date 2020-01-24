
public class Main {
	public static void PeopleGreeting(People p) {
		System.out.format("%s\' greeting is %s%n",p.name,p.greetring());
	}

	public static void main(String[] args) {
		People p;
		p=new Thai("Boonma");
		PeopleGreeting(p);
		//System.out.format("%s\' greeting is %s%n",p.name,p.greetring());
		p=new English("John");
		PeopleGreeting(p);
		//System.out.format("%s\' greeting is %s%n",p.name,p.greetring());
		PeopleGreeting(new Thai("Mali"));
		PeopleGreeting(new English("Willy"));
		
		People [] peoples;
		peoples = new People[3];
		peoples[0] = new Thai("Manee");
		peoples[1] = new Thai("Meejai");
		peoples[2] = new English("Tony");
		for(People e:peoples)
			PeopleGreeting(e);
	}

}
