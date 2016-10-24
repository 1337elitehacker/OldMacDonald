class NamedCow extends Cow
{ private String myName;
  public NamedCow (String type,String sound ,String cowName){
  	myName = cowName;
  }
public NamedCow(){
	myName = "Elise";

}
public String  getName(){
	return myName;
}
	
}