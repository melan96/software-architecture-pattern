package gof_patterns.builder_pattern;

public class Query {

	//instances
	private String SELECT;
	private String FROM;
	private String WHERE;
	private String ODER_BY;
	
	public Query(String sELECT, String fROM, String wHERE, String oDER_BY) {
		super();
		SELECT = sELECT;
		FROM = fROM;
		WHERE = wHERE;
		ODER_BY = oDER_BY;
	}
	
	public String toString() {
		
		    String returnendText= "SELECT "+this.SELECT+" FROM "+this.FROM+"";
		    
		    if(this.WHERE!=null) {
		    	returnendText.concat(" WHERE = "+this.WHERE+" ");
		    	return returnendText;
		    }
		    else if(this.ODER_BY!=null) {
		    	returnendText.concat(" ORDER_BY "+this.ODER_BY+" ");
		    	return returnendText;
		    }else if(this.SELECT!=null && this.ODER_BY!=null) {
		    	returnendText.concat(" WHERE =  "+this.WHERE+" ORDER_BY  "+this.ODER_BY+" ");
		    	return returnendText;
		    }
		    
		return returnendText;
	}
	
	
	
	
}
