public String everyNth(String str, int n) {
  String newStr="";
  
  for(int i=0; i<str.length(); i+=n){
    newStr+=str.charAt(i);
  }
  
  return newStr;
}
