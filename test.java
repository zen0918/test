class Format {
static Calendar c = new GregorianCalendar(1995, GregorianCalendar.MAY, 23);
public static void main(String[] args) {
System.out.printf(args[0]
+ " did not match! HINT: It was issued on %1$terd of some month",
c);
}
}
