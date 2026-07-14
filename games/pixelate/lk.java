/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends jj {
    static int field_n;
    private int field_p;
    private int field_m;
    static hh[] field_o;

    final void c(int param0) {
        super.c(param0);
        ((lk) this).field_m = ((lk) this).field_m + 1;
        ((lk) this).field_p = ((lk) this).field_p + 2;
        if (f.field_f.length > ((lk) this).field_m) {
          if (f.field_f.length <= ((lk) this).field_p) {
            ((lk) this).field_p = ((lk) this).field_p - f.field_f.length;
            return;
          } else {
            return;
          }
        } else {
          ((lk) this).field_m = ((lk) this).field_m - f.field_f.length;
          if (f.field_f.length > ((lk) this).field_p) {
            return;
          } else {
            ((lk) this).field_p = ((lk) this).field_p - f.field_f.length;
            return;
          }
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
            lk.d(35);
            field_o = null;
            return;
        }
        field_o = null;
    }

    lk(String param0, tf[] param1) {
        super(param0, param1);
    }

    final void a(boolean param0) {
        int var2 = 0;
        t.g(0, 0, 640, 480, f.field_f[((lk) this).field_m], f.field_f[((lk) this).field_p]);
        if (!param0) {
          var2 = ((lk) this).field_m;
          if (var2 <= 512) {
            if ((var2 ^ -1) < -257) {
              var2 = 512 - var2;
              return;
            } else {
              return;
            }
          } else {
            var2 = 0;
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
