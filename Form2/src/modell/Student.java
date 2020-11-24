package modell;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;


@Entity
@Table
@NamedQueries(@NamedQuery(name="Student.getAll", query = "Select e from Student e"))

public class Student {
	
	@Id
	@Column
	String id;
	@Column
    String name;
	@Column
	String averScore;
	
	
	    public Student() {}

	     public Student(String name, String averScore) {
	            
		        this.averScore = averScore;
		        this.name = name;
		       
		    }

	    public Student(String id,String name, String averScore) {
            this.id = id;
	        this.averScore = averScore;
	        this.name = name;
	       
	    }
	    
	   

	    

		public String getId(){
	        return id;
	       }
	    public void setId(String id){
	    	 this.id = id;
	       }

	    public String getName(){
	        return name;
	    }
	    
	    public void setName(String name){
	    	this.name = name;
	       }
	    public String getaverScore(){
	        return averScore;
	    }
	    public void setaverScore(String averScore){
	    	this.averScore = averScore;
	       }}
	    
