public boolean stringE(String str) {
  int count=0;
  for(int n=0; n<str.length(); n++){
    if(str.charAt(n)=='e') count++;
  }
  return (count>=1 && count<=3);
}
