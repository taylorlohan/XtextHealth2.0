package mylanguage.health.library;

public class People {
    float height=0;
    float weight=0;
    int age=0;
    String gender="";
    float intakeEnergy=0;
    float sport=0;
    float standardWeight=0;
    float energy=0;
    String name="";
    
    public void setName(String n) {
    	this.name=n;
    }
    public void setHeight(float h) {
    	this.height=h;
    }
    public void setWeight(float w) {
    	this.weight=w;
    }
    public void setAge(int a) {
    	this.age=a;
    }
    public void setGender(String g) {
    	this.gender=g;
    }
    public void setIntake(String type,float i) {
    	if(type=="protein") {
    		this.intakeEnergy+=(i*4);
    	}
    	else if(type=="fat") {
    		this.intakeEnergy+=(i*9);
    	}
    	else if(type=="carbohydrate") {
    		this.intakeEnergy+=(i*4);
    	}
    	
    }
    public void setSport(String type,float s) {
    	if(type=="run") {
    		this.sport+=(s*10*(this.weight));
    	}
    	else if(type=="swim") {
    		this.sport+=(s*12*(this.weight));
    	}
    	else if(type=="walk") {
    		this.sport+=(s*4*(this.weight));
    	}
    }
    public void computeStandard() {
    	float standardweight=0;
    	float energy=0;
    	if(this.gender=="Female") {
    		standardweight=this.height-100;
    		energy=standardweight*30;
    		this.standardWeight=standardweight;
    		this.energy=energy;
    	}
    	else {
    		standardweight=this.height-105;
    		energy=standardweight*30;
    		this.standardWeight=standardweight;
    		this.energy=energy;
    	}
    }
    
    public void suggestionOnEating() {
    	computeStandard();
    	if((this.intakeEnergy-this.energy)>0) {
    		System.out.println("your intake is greater than the standard nuitrition intake, you should control your diet");
    	}
    	else if((this.intakeEnergy-this.energy)<0)
    	{
    		System.out.println("your intake is smaller than the standard nuitrition intake, you should eat more");
    	}
    	else {
    		System.out.println("your intake is equal to the standard nuitrition intake, you may not worry about your diet");
    	}
    }
    
    public void suggestionOnSport() {
    	if((this.intakeEnergy-this.sport)>0) {
    		System.out.println("your intake is greater than sport, you should do more exercise");
    	}
    	else if((this.intakeEnergy-this.sport)<0)
    	{
    		System.out.println("your intake is smaller than sport, you should pay your attention more to your diet");
    	}
    	else {
    		System.out.println("your intake is equal to sport, you shouldn't worry much about your health");
    	}
    }
   
}
