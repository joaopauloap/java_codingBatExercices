public String startOz(String str) {
  String c1="",c2="";
    c1 = str.length()>=1 && str.charAt(0)=='o'?"o":"";
    c2 = str.length()>=2 && str.charAt(1)=='z'?"z":"";
  return c1+c2;
}
