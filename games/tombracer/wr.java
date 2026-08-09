/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends ela {
    static String[] field_o;

    final bfa a(bfa[] param0, int param1) {
        RuntimeException var3 = null;
        bfa[] var4 = null;
        bfa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var4 = (bfa[]) null;
                this.a((bfa[]) null, -90);
                break L1;
              }
            }
            stackIn_3_0 = new bfa(joa.a(param0[1].a(false), (byte) 77, (String) (param0[0].field_d)));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wr.A(");

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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    wr(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(byte param0) {
        int var1 = -38 / ((-34 - param0) / 34);
        field_o = null;
    }

    static {
    }
}
