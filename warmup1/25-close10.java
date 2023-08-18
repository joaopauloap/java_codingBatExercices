public int close10(int a, int b) {
  
  int n1 = Math.abs(a-10);
  int n2 = Math.abs(b-10);
  
  if(n1==n2) return 0;
  
  return n1 < n2 ? a : b;
  
}
