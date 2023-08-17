public String front22(String str) {
  if(str.length()>=2){
   String twoCh = str.substring(0,2);
    return twoCh + str + twoCh;
  }
  return str+str+str;
}


// public String front22(String str) {
//   // First figure the number of chars to take
//   int take = 2;
//   if (take > str.length()) {
//     take = str.length();
//   }
  
//   String front = str.substring(0, take);
//   return front + str + front;
// }