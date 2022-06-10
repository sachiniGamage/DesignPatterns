package com.example.designpattern.Builder;

public class Submarine {
	
	public Submarine(Builder builder) {
		// TODO Auto-generated constructor stub
		this.bun = builder.bun;
		this.cheese = builder.cheese;
		this.meat = builder.meat;
		this.onion = builder.onion;
	
	}

	private final String bun;
	private final boolean onion;
	private final String meat;
	private final String cheese;
	
	static class Builder{
		
		private String bun;
		private boolean onion;
		private String meat;
		private String cheese;
		
		public Submarine build() {
			return new Submarine(this);
		}
		
		//If the bun is must - set the parameters
		public Builder(String bun) {
			this.bun = bun;
		}
		
		public Builder onion(boolean onion) {
			this.onion = onion;
			return this;
		}
		
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
		
		public Builder cheese(String cheese) {
			this.cheese = cheese;
			return this;
		}
		
	}

	@Override
	public String toString() {
		return "Submarine [bun=" + bun + ", onion=" + onion + ", meat=" + meat + ", cheese=" + cheese + "]";
	}
	
	

}
