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
    		this.sport+=(s*10*(this.weight));//运动公式不清楚
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
    
    public void suggestionOnEating() {//也可以比较标准体重
    	computeStandard();
    	if((this.intakeEnergy-this.energy)>0) {
    		System.out.println("intake is greater than standard");
    	}
    	else if((this.intakeEnergy-this.energy)<0)
    	{
    		System.out.println("intake is smaller than standard");
    	}
    	else {
    		System.out.println("intake is equal to standard");
    	}
    }
    
    public void suggestionOnSport() {
    	if((this.intakeEnergy-this.sport)>0) {
    		System.out.println("intake is greater than sport");
    	}
    	else if((this.intakeEnergy-this.sport)<0)
    	{
    		System.out.println("intake is smaller than sport");
    	}
    	else {
    		System.out.println("intake is equal to sport");
    	}
    }
   
}
