public String front3(String str) {
  if(str.length()>3){
    String newStr = str.substring(0,3);
    return newStr+newStr+newStr;
  }
  return str+str+str;
}
