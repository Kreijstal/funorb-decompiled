/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static eh field_e;
    static int field_b;
    static String field_g;
    static boolean field_f;
    static gk field_c;
    static tg[] field_d;
    static int field_a;

    public static void c(int param0) {
        field_e = null;
        field_c = null;
        field_g = null;
        field_d = null;
    }

    final static boolean b(int param0) {
        if (!(pe.field_d != -1)) {
            if (!qb.a(1, 3)) {
                return false;
            }
            pe.field_d = jc.field_g.d((byte) -106);
            jc.field_g.field_h = 0;
        }
        if (!(pe.field_d != -2)) {
            if (!qb.a(2, 3)) {
                return false;
            }
            pe.field_d = jc.field_g.a(-1640531527);
            jc.field_g.field_h = 0;
        }
        return qb.a(pe.field_d, 3);
    }

    final static void a(int param0) {
        if (10 != mh.field_U) {
          if (cg.a(1)) {
            tk.field_a = true;
            return;
          } else {
            j.c((byte) 41);
            mh.field_U = 11;
            tk.field_a = true;
            return;
          }
        } else {
          j.c((byte) 41);
          mh.field_U = 11;
          tk.field_a = true;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_g = "Unpacking music";
        field_e = new eh(10, 2, 2, 0);
    }
}
