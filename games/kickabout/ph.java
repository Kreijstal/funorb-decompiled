/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static ut field_b;
    static hd field_f;
    static String field_c;
    static String field_d;
    static int field_a;
    static kg[][] field_e;

    final static boolean a(boolean param0) {
        if (!param0) {
            field_c = (String) null;
            return !kb.field_C ? true : false;
        }
        return !kb.field_C ? true : false;
    }

    final static void b(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = uc.h((byte) -118);
        var2 = qo.e((byte) 18);
        if (!param0) {
          field_c = (String) null;
          oi.field_g.a(nb.field_k + -is.field_d, var2 + (jm.field_e << 1114366657), hm.field_I + -jm.field_e, var1 - -(is.field_d << -2061819135), 3);
          na.k(0);
          return;
        } else {
          oi.field_g.a(nb.field_k + -is.field_d, var2 + (jm.field_e << 1114366657), hm.field_I + -jm.field_e, var1 - -(is.field_d << -2061819135), 3);
          na.k(0);
          return;
        }
    }

    final static void a(int param0) {
        if (null == cb.field_d) {
          if (null == pg.field_d) {
            if (param0 != 4) {
              field_a = -35;
              return;
            } else {
              return;
            }
          } else {
            pg.field_d.c();
            if (param0 != 4) {
              field_a = -35;
              return;
            } else {
              return;
            }
          }
        } else {
          cb.field_d.c();
          if (null != pg.field_d) {
            pg.field_d.c();
            if (param0 == 4) {
              return;
            } else {
              field_a = -35;
              return;
            }
          } else {
            if (param0 != 4) {
              field_a = -35;
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void b(int param0) {
        field_e = (kg[][]) null;
        field_f = null;
        field_b = null;
        field_c = null;
        if (param0 != 1114366657) {
          ph.b(-52);
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final static void a(byte param0) {
        if (!ng.a(-4)) {
            return;
        }
        ba.a(false, 6, 4);
        int var1 = -31 / ((param0 - 88) / 33);
    }

    static {
        field_c = "Create";
        field_d = "Playing";
        field_a = 0;
        field_b = new ut(50, 20);
    }
}
