/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends hi {
    String field_hb;
    static boolean field_nb;
    static String field_jb;
    static String field_kb;
    int field_gb;
    static int[][] field_lb;
    String field_mb;
    static String field_ib;

    final static void a(int param0, gn param1, int param2, fg param3) {
        lf.field_l = param0 * nc.a(855) / 1000;
        mf.a(param1, 0);
        jk.a(param1, -64);
        aa.a(-18916, param1);
        dm.a(255);
        jd.j(param2 ^ 0);
        cf.field_q = param2 + -lf.field_l;
    }

    public static void a(boolean param0) {
        field_jb = null;
        field_kb = null;
        field_ib = null;
        field_lb = null;
        if (!param0) {
            field_nb = false;
        }
    }

    final static fn a(int param0, gn param1, gn param2, int param3, int param4) {
        Object var6 = null;
        if (qg.a(param4, param3, (byte) -27, param2)) {
          if (param0 != -17072) {
            var6 = null;
            fn discarded$2 = fi.a(25, (gn) null, (gn) null, 26, 41);
            return md.a(param0 + -7255, param1.a(param4, true, param3));
          } else {
            return md.a(param0 + -7255, param1.a(param4, true, param3));
          }
        } else {
          return null;
        }
    }

    fi() {
        super(0L, (hi) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = "members-only content";
        field_ib = "Confirm Password: ";
    }
}
