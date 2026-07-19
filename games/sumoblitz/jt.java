/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jt extends pj {
    static int field_r;
    static int field_w;
    static int field_s;
    static hr field_y;
    static int field_u;
    static cp field_v;
    static wi field_t;
    static long field_x;
    int field_z;

    public static void d(byte param0) {
        field_t = null;
        if (param0 != 54) {
            jt.a(-29);
            field_v = null;
            field_y = null;
            return;
        }
        field_v = null;
        field_y = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        if ((tt.field_l ^ -1) <= -225) {
          lf.a(0, 256);
          if (Sumoblitz.field_L) {
            var1 = tt.field_l % 32;
            lf.a(0, tt.field_l + (32 - var1));
            var1 = -44 % ((param0 - 35) / 40);
            return;
          } else {
            var1 = -44 % ((param0 - 35) / 40);
            return;
          }
        } else {
          var1 = tt.field_l % 32;
          lf.a(0, tt.field_l + (32 - var1));
          var1 = -44 % ((param0 - 35) / 40);
          return;
        }
    }

    abstract Object c(byte param0);

    abstract boolean e(int param0);

    final static boolean a(byte param0) {
        int var1 = 0;
        var1 = 102 / ((param0 - -27) / 59);
        if (vv.field_b != null) {
          if (!vv.field_b.c(-1)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    jt(int param0) {
        this.field_z = param0;
    }

    static {
        field_s = 0;
    }
}
