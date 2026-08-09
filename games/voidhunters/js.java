/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js extends rqa {
    static int field_r;
    static int field_s;
    static String[] field_p;
    static boolean field_q;
    static int field_o;

    js(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
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
                js.a(-46, -76, -106);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(111, 80));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("js.A(");

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

    public static void a(int param0) {
        if (param0 != -20626) {
            js.a(43);
            field_p = null;
            return;
        }
        field_p = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = pk.field_o - param2;
        int var4 = noa.field_q - param1;
        kc.field_b = var3;
        uia.field_b = var4;
        int var5 = -112 / ((param0 - -16) / 59);
        oq.field_H = var3;
        qs.field_a = var4;
    }

    static {
        field_r = -1;
        field_p = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_s = 50;
    }
}
