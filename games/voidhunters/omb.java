/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class omb extends rqa {
    static hrb field_p;
    static String field_o;
    static int field_q;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -6);
          }
          stackIn_3_0 = new nc(frb.a(31, 77));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("omb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        field_p = null;
        if (param0 != -50) {
          omb.e((byte) 80);
        }
    }

    omb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = 0;
        field_o = "Asteroid block";
    }
}
