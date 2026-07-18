/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends dr {
    static wm field_L;
    static wk[] field_J;
    static boolean[] field_G;
    static String field_F;
    static um field_K;
    static wk field_I;
    static int field_E;
    static long field_H;
    static kl field_M;

    public static void g(int param0) {
        field_G = null;
        field_F = null;
        field_K = null;
        field_J = null;
        field_L = null;
        field_I = null;
        if (param0 != 21336) {
          return;
        } else {
          field_M = null;
          return;
        }
    }

    final static void e(byte param0) {
        String var1 = null;
        String var2 = null;
        L0: {
          if (ql.field_e == null) {
            break L0;
          } else {
            var2 = ql.field_e;
            var1 = var2;
            wr.a((byte) 68, fo.a(4800, ra.field_l, new String[1]));
            ql.field_e = null;
            break L0;
          }
        }
        if (param0 > -127) {
          oh.e((byte) 28);
          return;
        } else {
          return;
        }
    }

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -24872) {
              stackOut_3_0 = new nd((Object) (Object) il.b(256, param1[0].a(2)));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("oh.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    oh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new boolean[56];
        field_F = "Dragonhide";
    }
}
