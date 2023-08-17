public String frontBack(String str) {
  StringBuilder build = new StringBuilder(str);

  if(!str.isEmpty()){
    char first = str.charAt(0);
    char last = str.charAt(str.length()-1);
    
    build.setCharAt(0,last);
    build.setCharAt(str.length()-1,first);
  }
  
  return build.toString();
}


// public String frontBack(String str) {

//   if(str.length()>1){
//     char first = str.charAt(0);
//     char last = str.charAt(str.length()-1);
//     return last + str.substring(1,str.length()-1) + first;
//   }

//   return str;
// }
