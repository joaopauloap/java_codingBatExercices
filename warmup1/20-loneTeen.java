public boolean loneTeen(int a, int b) {
  if(a==b) return false;
  if((a>=13 && a<=19) ^ (b>=13 && b<=19)) return true;
  return false;
}