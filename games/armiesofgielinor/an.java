/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends dr {
    static mo[] field_F;
    static int[] field_H;
    static long field_E;
    static String field_G;

    final static boolean e(byte param0) {
        if (param0 <= 84) {
            return false;
        }
        return jm.field_g;
    }

    an(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void h() {
        int discarded$0 = 1;
        int var1 = hw.a();
        int discarded$1 = 25213;
        int var2 = so.a();
        sg.field_c.a((byte) -111, var2 + (ov.field_b << 1), co.field_f - b.field_k, var1 - -(b.field_k << 1), -ov.field_b + rk.field_r);
        int discarded$2 = 15;
        pj.h();
    }

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -24872) {
                break L1;
              } else {
                var4 = null;
                nd discarded$2 = ((an) this).a(-83, (nd[]) null);
                break L1;
              }
            }
            stackOut_2_0 = new nd((Object) (Object) qu.a(param1[0].a(2), (byte) 81));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("an.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void g(int param0) {
        field_H = null;
        field_G = null;
        field_F = null;
        if (param0 != 1746174305) {
            an.g(-72);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new int[4];
        field_G = null;
    }
}
