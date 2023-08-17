public String delDel(String str) {
  
  if(str.length()>=4){
    boolean isDel = str.substring(1,4).equals("del");
    if(isDel) return str.charAt(0) + str.substring(4);
  }
  
  return str;
}
