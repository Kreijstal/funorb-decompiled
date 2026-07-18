/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends nm {
    static n field_k;
    static String field_i;
    static String field_j;
    static boolean[] field_m;
    StringBuilder field_l;

    final static void a(int param0, mf param1) {
        bk var2 = null;
        bk.b(param1.a(111, "headers.packvorbis", ""));
        try {
            var2 = bk.a(param1, "jagex logo2.packvorbis", "");
            oe discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ck.B(" + -2196 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          try {
            L0: {
              var4 = param0.getGraphics();
              kc.field_q.a(0, 0, -17260, var4);
              var4.dispose();
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref2;
            stackOut_4_1 = new StringBuilder().append("ck.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 0 + ',' + 14209 + ',' + 0 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_j = null;
        field_k = null;
        field_i = null;
    }

    ck() {
        this(30);
    }

    private ck(int param0) {
        ((ck) this).field_l = new StringBuilder(param0);
    }

    final static void a(byte param0) {
        wc.field_b = false;
        ga.field_i = 13;
        ab.field_E = 0;
        tb.field_eb = null;
        dj.field_d = 0;
        c.field_i = un.field_e;
        pi.field_q = 0;
        cm.field_s = false;
        kb.field_Sb = false;
        jl.field_a = 1;
        wl.field_N = false;
        rf.field_f = false;
        pp.field_a = 13;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Previous";
        field_j = "You appear to be telling someone your password - please don't!";
        field_m = new boolean[29];
        field_m[17] = true;
        field_m[5] = true;
        field_m[3] = false;
        field_m[15] = false;
        field_m[12] = true;
        field_m[14] = true;
        field_m[18] = true;
        field_m[6] = false;
        field_m[11] = false;
        field_m[13] = false;
        field_m[8] = false;
        field_m[10] = true;
        field_m[7] = false;
        field_m[9] = false;
        field_m[16] = false;
        field_m[4] = true;
        field_k = new n();
    }
}
