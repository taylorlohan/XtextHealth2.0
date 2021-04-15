package mylanguage.health.library;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
    JFrame frameEat=new JFrame("Your nutrition advice");
    JFrame frameSport=new JFrame("Your exercise advice");
    JPanel panelEat = new JPanel();
    JLabel labelEat = new JLabel("");
    JPanel panelSport = new JPanel();
    JLabel labelSport = new JLabel("");

    
    
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
    		this.sport+=(s*8*(this.weight));
    	}
    	else if(type=="swim") {
    		this.sport+=(s*12*(this.weight));
    	}
    	else if(type=="walk") {
    		this.sport+=(s*5.35*(this.weight));
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
    	panelEat.add(labelEat);
	    frameEat.add(panelEat);
	    frameEat.setVisible(true);
		frameEat.setBounds(600, 300, 500, 400);
        frameEat.setSize(600,200);
        frameEat.setLocation(600, 200);
        frameEat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	if((this.intakeEnergy-this.energy)>0) {
            labelEat.setText("your intake today is greater than the standard daily nuitrition intake, you should control your diet");
    	}
    	else if((this.intakeEnergy-this.energy)<0)
    	{
    		labelEat.setText("your intake today is smaller than the standard daily nuitrition intake, you should eat more");
    	}
    	else {
    		labelEat.setText("your intake today is equal to the standard daily nuitrition intake, you may not worry about your diet");
    	}
    }
    
    public void suggestionOnSport() {
    	panelSport.add(labelSport);
	    frameSport.add(panelSport);
	    frameSport.setVisible(true);
		frameSport.setBounds(600, 300, 500, 400);
        frameSport.setSize(600,200);
        frameSport.setLocation(600, 300);
        frameSport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	if((this.intakeEnergy-this.sport)>0) {
    		labelSport.setText("your intake is greater than sport today, you should do more exercise");
    	}
    	else if((this.intakeEnergy-this.sport)<0)
    	{
    		labelSport.setText("your intake is smaller than sport today, you should pay more attention to your diet");
    	}
    	else {
    		labelSport.setText("your intake is equal to sport today, you shouldn't worry much about your health");
    	}
    }
   
}
