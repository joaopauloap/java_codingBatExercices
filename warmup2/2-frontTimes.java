public String frontTimes(String str, int n) {
  String newStr="";
  String front = str.length() > 3 ? str.substring(0,3) : str;
  
  for(int i=0; i<n; i++){
    newStr+=front;
  }
  
  return newStr;
}
