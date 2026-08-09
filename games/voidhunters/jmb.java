/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jmb extends rqa {
    static String field_s;
    static int field_p;
    static int[] field_q;
    static int[] field_r;
    static String field_o;

    jmb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        if (!param0) {
          jmb.b(true);
          field_q = null;
          field_r = null;
          field_s = null;
          field_o = null;
          return;
        } else {
          field_q = null;
          field_r = null;
          field_s = null;
          field_o = null;
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, -55);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(83, 123));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jmb.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_p = 37;
        field_s = "Log in";
        field_r = new int[]{2, 21, 4, 3, 23, 11};
        field_o = "Loading music";
    }
}
