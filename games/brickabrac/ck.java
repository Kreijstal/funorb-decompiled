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
        if (param0 != -2196) {
          return;
        } else {
          var2 = bk.a(param1, "jagex logo2.packvorbis", "");
          oe discarded$2 = var2.c();
          return;
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            if (param2 != 14209) {
                ck.a(53);
            }
            var4 = param0.getGraphics();
            kc.field_q.a(param3, param1, -17260, var4);
            var4.dispose();
        } catch (Exception exception) {
            param0.repaint();
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_j = null;
        if (param0 != 30850) {
          field_j = null;
          field_k = null;
          field_i = null;
          return;
        } else {
          field_k = null;
          field_i = null;
          return;
        }
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
        if (param0 <= 27) {
          return;
        } else {
          wl.field_N = false;
          rf.field_f = false;
          pp.field_a = 13;
          return;
        }
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
