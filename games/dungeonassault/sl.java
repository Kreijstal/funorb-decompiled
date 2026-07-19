/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static int field_d;
    static cn[] field_c;
    static String field_a;
    static rh field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 < 103) {
            field_c = (cn[]) null;
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            ne.field_c = ah.a(gh.field_c, 200, "", "roman20", uc.field_I);
            la.field_b = ah.a(gh.field_c, 200, "", "roman12", uc.field_I);
            f.field_a = oh.a(uc.field_I, "basic", 11091, "unachieved");
            int var2_int = -24 % ((param0 - -15) / 54);
            lb.field_o = oh.a(uc.field_I, "basic", 11091, "orbcoin");
            nj.a(gh.field_c, uc.field_I, -6332);
            cp.a(0, param1, (byte) -36, 0, qk.field_b, 16777215);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "sl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        boolean discarded$2 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 15000) {
          L0: {
            discarded$2 = sl.b(126);
            rm.field_P = true;
            ab.field_a = kd.c(-2456) - -15000L;
            if (11 != kh.field_n) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            rm.field_P = true;
            ab.field_a = kd.c(-2456) - -15000L;
            if (11 != kh.field_n) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_a = "Logging in...";
    }
}
