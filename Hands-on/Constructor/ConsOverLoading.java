package corejava;

class ConsOverLoading {
	int StudentId;
	String name;
	ConsOverLoading(int id, String name) {
		this.StudentId = id;
		this.name = name;
	}
	
	ConsOverLoading(int Id){
		this.StudentId=Id;
	}
	
	public static void main(String[] args) {
		ConsOverLoading col = new ConsOverLoading(181421);
		System.out.println("Id: "+col.StudentId);
		
		ConsOverLoading col2 = new ConsOverLoading(181421,"Ghadge Rohan Dilip ");
		System.out.println("Id:"+col2.StudentId+"\t"+"Name: "+col2.name);
		
	}

}