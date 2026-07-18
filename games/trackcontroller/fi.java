/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends fc {
    int field_q;
    static boolean field_o;
    fi field_j;
    int field_m;
    static String field_t;
    static boolean field_i;
    static String field_l;
    int field_k;
    static long field_p;
    int field_r;
    int field_n;
    static String[] field_s;

    public static void d(int param0) {
        field_t = null;
        field_l = null;
        if (param0 != -5654) {
            return;
        }
        field_s = null;
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = ue.a(0, param1, (byte) 57, param1.length);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("fi.C(").append(116).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static aa[] e(int param0) {
        return new aa[]{hl.field_C, mj.field_e, ia.field_a, cb.field_b, dj.field_b, qe.field_n, sl.field_e, gb.field_n, cb.field_d, gi.field_q, ui.field_m, uj.field_a, kb.field_e, oj.field_a};
    }

    fi(int param0, int param1, int param2, int param3, int param4) {
        ((fi) this).field_k = param3;
        ((fi) this).field_m = param4;
        ((fi) this).field_n = param1;
        ((fi) this).field_q = param0;
        ((fi) this).field_r = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = true;
        field_i = false;
        field_s = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
