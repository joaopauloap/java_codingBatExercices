public String missingChar(String str, int n) {
  StringBuilder build = new StringBuilder(str);
  if((str!=null && !str.isEmpty()) && (n>=0 && n<=str.length())){
    build.deleteCharAt(n);
  }
  return(build.toString());
}
