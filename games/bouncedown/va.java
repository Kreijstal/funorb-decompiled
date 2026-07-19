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
        if (param0 != 2) {
          field_a = 57;
          field_g = null;
          field_d = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          return;
        }
    }

    final static boolean b(int param0) {
        if (!((pe.field_d ^ -1) != 0)) {
            if (!qb.a(1, 3)) {
                return false;
            }
            pe.field_d = jc.field_g.d((byte) -106);
            jc.field_g.field_h = 0;
        }
        if (!(param0 != (pe.field_d ^ -1))) {
            if (qb.a(2, param0 ^ 2)) {
                pe.field_d = jc.field_g.a(-1640531527);
                jc.field_g.field_h = 0;
                return qb.a(pe.field_d, 3);
            }
            return false;
        }
        return qb.a(pe.field_d, 3);
    }

    final static void a(int param0) {
        if (10 == mh.field_U) {
          j.c((byte) 41);
          mh.field_U = 11;
          tk.field_a = true;
          if (param0 == 2) {
            return;
          } else {
            va.c(50);
            return;
          }
        } else {
          if (!cg.a(param0 + -1)) {
            j.c((byte) 41);
            mh.field_U = 11;
            tk.field_a = true;
            if (param0 != 2) {
              va.c(50);
              return;
            } else {
              return;
            }
          } else {
            tk.field_a = true;
            if (param0 == 2) {
              return;
            } else {
              va.c(50);
              return;
            }
          }
        }
    }

    static {
        field_f = false;
        field_g = "Unpacking music";
        field_e = new eh(10, 2, 2, 0);
    }
}
