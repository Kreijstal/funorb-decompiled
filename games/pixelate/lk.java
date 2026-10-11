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
        this.field_m = this.field_m + 1;
        this.field_p = this.field_p + 2;
        if (f.field_f.length <= this.field_m) {
          this.field_m = this.field_m - f.field_f.length;
          if (f.field_f.length <= this.field_p) {
            this.field_p = this.field_p - f.field_f.length;
            return;
          }
          return;
        }
        if (f.field_f.length > this.field_p) {
          return;
        }
        this.field_p = this.field_p - f.field_f.length;
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
        t.g(0, 0, 640, 480, f.field_f[this.field_m], f.field_f[this.field_p]);
        if (param0) {
          return;
        }
        int var2 = this.field_m;
        if (var2 > 512) {
          var2 = 0;
          return;
        }
        if (var2 <= 256) {
          return;
        }
        var2 = 512 - var2;
    }

    static {
    }
}
