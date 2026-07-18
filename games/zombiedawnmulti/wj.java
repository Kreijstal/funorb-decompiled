/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends br {
    static ub field_i;
    static String field_h;
    static boolean field_n;
    static String field_j;
    static boolean[] field_l;
    static String field_k;
    uj field_m;
    static int field_g;
    static String field_f;

    final static dl a(byte param0, int param1, String param2) {
        kf var3 = null;
        RuntimeException var3_ref = null;
        kf stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_2_0 = null;
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
              if (param0 == 3) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            var3 = new kf();
            ((dl) (Object) var3).field_f = param1;
            ((dl) (Object) var3).field_b = param2;
            stackOut_2_0 = (kf) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("wj.B(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return (dl) (Object) stackIn_3_0;
    }

    public static void a() {
        field_h = null;
        field_k = null;
        field_l = null;
        field_j = null;
        field_f = null;
        field_i = null;
    }

    final static void b(boolean param0, int param1) {
        nb.field_a.a(39, 0, 0);
        if (param1 >= -109) {
            Object var3 = null;
            dl discarded$0 = wj.a((byte) 68, -37, (String) null);
        }
    }

    wj(int param0) {
        if (df.field_H) {
            ((wj) this).field_m = uj.a(ei.field_a[param0], 100, 256);
            we discarded$0 = tf.a(((wj) this).field_m, (byte) -93);
        }
        if (93 == param0) {
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "to return to the normal view.";
        field_k = "Show all lobby chat";
        field_n = false;
        field_j = "Get extra bang for your buck - or, in this case, extra zombie for your brain - with more zombies at the start of each match.";
        field_l = new boolean[64];
        field_f = "Spectate <%0>'s game";
    }
}
