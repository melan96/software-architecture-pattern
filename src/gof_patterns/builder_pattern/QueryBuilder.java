package gof_patterns.builder_pattern;

public class QueryBuilder {
	//instances
	private String SELECT;
	private String FROM;
	private String WHERE;
	private String ODER_BY;
	
	
	public QueryBuilder setSELECT(String sELECT) {
		SELECT = sELECT;
		return this;
	}
	public QueryBuilder setFROM(String fROM) {
		FROM = fROM;
		return this;
	}
	public QueryBuilder setWHERE(String wHERE) {
		WHERE = wHERE;
		return this;
	}
	public QueryBuilder setODER_BY(String oDER_BY) {
		ODER_BY = oDER_BY;
		return this;
	}
	
	public Query build() {
		
		try {
			if((this.SELECT==null && this.FROM==null)) {
				throw new Exception("SELECT and FROM fields Must Require ");
			}else if((this.SELECT==null)) {
				throw new Exception("SELECT field Must Require ");
			}else if((this.FROM==null)) {
				throw new Exception("FROM field Must Require ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new Query(this.SELECT,this.FROM,this.WHERE,this.ODER_BY);
	}
	
	
	
	
}
