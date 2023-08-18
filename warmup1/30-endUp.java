public String endUp(String str) {
  int len = str.length();
  if(len>3) return str.substring(0,len-3) + str.substring(len-3).toUpperCase();
  return str.toUpperCase();
}
