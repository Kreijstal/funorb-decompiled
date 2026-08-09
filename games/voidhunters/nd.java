/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends rqa {
    static int field_r;
    static String field_q;
    static dja field_s;
    static int field_p;
    static String field_o;

    public static void b(boolean param0) {
        field_q = null;
        field_s = null;
        if (param0) {
            nd.b(false);
            field_o = null;
            return;
        }
        field_o = null;
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
              si.a(26, 62, param0[0].a(30));
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, -61);
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("nd.A(");

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

    nd(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = "Pause Menu";
        field_p = 48;
        field_s = (dja) ((Object) new uk());
        field_o = "Please select options in the following rows:  ";
    }
}
