/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static mg[] field_b;
    static String field_a;

    final static void a(byte param0) {
        int var1 = 0;
        if (param0 == 99) {
          if (c.field_a < 224) {
            var1 = c.field_a % 32;
            bm.d(32 + c.field_a - var1, 0);
            return;
          } else {
            bm.d(256, 0);
            return;
          }
        } else {
          ib.a((byte) -63);
          if (c.field_a < 224) {
            var1 = c.field_a % 32;
            bm.d(32 + c.field_a - var1, 0);
            return;
          } else {
            bm.d(256, 0);
            return;
          }
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var1 = ve.field_t * ve.field_t;
        var2 = var1 + -(db.field_D * db.field_D);
        var3 = vf.field_c - -((p.field_h - vf.field_c) * var2 / var1);
        we.field_c.a(oh.field_f, 120, 640, (byte) -85, var3);
        ql.a((byte) 118, 5, 640, qi.field_d, 0, p.field_h + -24, dl.field_b);
        if (param0 >= -3) {
          ib.a(94);
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 >= -30) {
            field_a = (String) null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_a = "This password contains your email address, and would be easy to guess";
    }
}
