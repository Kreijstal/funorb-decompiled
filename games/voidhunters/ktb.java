/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ktb extends rqa {
    static int field_q;
    static int field_r;
    static int field_p;
    static String field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -73);
          }
          stackIn_3_0 = new nc(frb.a(181, 75));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ktb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        int var1 = -57 % ((param0 + 17) / 55);
        field_o = null;
    }

    ktb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = 1;
        field_r = 53;
        field_o = "Build an awesome ship and test it out";
    }
}
