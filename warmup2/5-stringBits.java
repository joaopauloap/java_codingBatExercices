public String stringBits(String str) {
  String newStr="";
  
  for(int i=0; i<str.length(); i+=2){
    newStr += str.charAt(i);  
  }
  
  return newStr;
}
