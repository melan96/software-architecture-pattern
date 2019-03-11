package gof_patterns.builder_pattern;

public class Main {

	
	public static void main(String[] args) {
		Query query1 = new QueryBuilder().setSELECT("name").setFROM("student").build();
		System.out.println(query1.toString()); // A valid query will be constructed
		Query query2 = new QueryBuilder().setSELECT("name").setFROM("student").setWHERE("name = 'Name1'").build();
		System.out.println(query2.toString()); // A valid query will be constructed
		Query query3 = new QueryBuilder().setSELECT("name").setWHERE("name = 'Name1'").build();
		System.out.println(query3.toString()); // Will throw an exception
	}
}
