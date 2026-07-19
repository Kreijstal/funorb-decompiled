/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static oa field_j;
    String field_b;
    int field_f;
    static int field_h;
    String field_m;
    int field_d;
    String field_a;
    int field_g;
    boolean field_l;
    boolean field_e;
    String field_i;
    static int field_c;
    String field_k;

    public static void a(int param0) {
        field_j = null;
        if (param0 != -2) {
            field_h = 12;
        }
    }

    lg(int param0) {
        int var2 = 0;
        this.field_b = "";
        this.field_l = false;
        this.field_f = 0;
        this.field_e = false;
        this.field_m = "";
        this.field_a = "";
        this.field_i = "";
        this.field_k = "";
        this.field_m = kh.field_H[param0];
        this.field_b = pf.field_e[param0];
        this.field_k = bd.field_f[param0];
        this.field_a = jg.field_jb[param0];
        var2 = param0;
        if (-1 == (var2 ^ -1)) {
          this.field_l = true;
          this.field_i = ah.field_C;
          this.field_g = 5;
          return;
        } else {
          if ((var2 ^ -1) == -2) {
            this.field_l = true;
            this.field_g = 50;
            this.field_e = true;
            this.field_i = qe.field_j;
            this.field_f = 15;
            return;
          } else {
            if ((var2 ^ -1) == -3) {
              this.field_f = 20;
              this.field_i = th.field_e;
              this.field_g = 100;
              this.field_e = true;
              return;
            } else {
              L0: {
                if (var2 != 3) {
                  break L0;
                } else {
                  this.field_i = uj.field_e;
                  this.field_g = 100;
                  this.field_e = true;
                  this.field_d = 50;
                  this.field_f = 25;
                  break L0;
                }
              }
              return;
            }
          }
        }
    }

    static {
        field_j = new oa();
    }
}
