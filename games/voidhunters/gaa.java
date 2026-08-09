/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gaa extends rqa {
    static int field_o;
    static int field_p;

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
                this.a((nc[]) null, 10);
                break L1;
              }
            }
            stackIn_3_0 = new nc(sn.field_Y);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gaa.A(");

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

    final static void a(int param0, int param1, int param2, boolean param3) {
        if (param1 != 11343) {
          gaa.a(72, 8, 14, true);
          lfa.a((byte) 34, param3);
          ha.a(param3, param0, param2, 5);
          return;
        } else {
          lfa.a((byte) 34, param3);
          ha.a(param3, param0, param2, 5);
          return;
        }
    }

    gaa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = 10;
    }
}
