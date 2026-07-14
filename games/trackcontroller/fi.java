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
        if (param0 <= 114) {
          field_o = true;
          return ue.a(0, param1, (byte) 57, param1.length);
        } else {
          return ue.a(0, param1, (byte) 57, param1.length);
        }
    }

    final static aa[] e(int param0) {
        if (param0 != 0) {
          fi.d(93);
          return new aa[]{hl.field_C, mj.field_e, ia.field_a, cb.field_b, dj.field_b, qe.field_n, sl.field_e, gb.field_n, cb.field_d, gi.field_q, ui.field_m, uj.field_a, kb.field_e, oj.field_a};
        } else {
          return new aa[]{hl.field_C, mj.field_e, ia.field_a, cb.field_b, dj.field_b, qe.field_n, sl.field_e, gb.field_n, cb.field_d, gi.field_q, ui.field_m, uj.field_a, kb.field_e, oj.field_a};
        }
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
