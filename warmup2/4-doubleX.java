boolean doubleX(String str) {
  int len=str.length()-1;
  for(int i=0; i < len; i++){
    if(str.charAt(i)=='x') return (str.charAt(i+1)=='x');
  }
  return false;
}


// boolean doubleX(String str) {
//   int i = str.indexOf("x");
//   if (i == -1) return false; // no "x" at all

//   // Is char at i+1 also an "x"?
//   if (i+1 >= str.length()) return false; // check i+1 in bounds?
//   return str.substring(i+1, i+2).equals("x");
  
//   // Another approach -- .startsWith() simplifies the logic
//   // String x = str.substring(i);
//   // return x.startsWith("xx");
// }