/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wi {
    int field_a;
    int field_l;
    static pk field_e;
    static String field_h;
    int field_d;
    static int field_b;
    int field_o;
    boolean field_i;
    boolean field_c;
    static vj field_p;
    static vc field_j;
    boolean field_k;
    static String field_m;
    int field_n;
    boolean field_g;
    static ae field_f;

    boolean a(byte param0) {
        if (param0 >= 67) {
          if (this.field_l <= ag.field_f) {
            if (this.field_a <= kc.field_b) {
              if (this.field_l + this.field_n >= ag.field_f) {
                if (this.field_d + this.field_a < kc.field_b) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void b(int param0) {
        ci var1 = null;
        if (param0 != -14277) {
          wi.a(true);
          var1 = new ci(22050, la.field_a);
          jd.field_q = hk.a(ib.field_f, "", "laura_woohoo").b().a(var1);
          return;
        } else {
          var1 = new ci(22050, la.field_a);
          jd.field_q = hk.a(ib.field_f, "", "laura_woohoo").b().a(var1);
          return;
        }
    }

    final static e a(int param0) {
        if (param0 == 17641) {
          if (tg.field_e == null) {
            tg.field_e = new e(nb.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, nb.field_c.field_H, -1, 2147483647, true);
            return tg.field_e;
          } else {
            return tg.field_e;
          }
        } else {
          wi.a(false);
          if (tg.field_e != null) {
            return tg.field_e;
          } else {
            tg.field_e = new e(nb.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, nb.field_c.field_H, -1, 2147483647, true);
            return tg.field_e;
          }
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_f = null;
        field_e = null;
        field_m = null;
        field_h = null;
        if (param0) {
            return;
        }
        field_p = null;
    }

    wi() {
        this.field_c = false;
        this.field_i = false;
        this.field_k = true;
        this.field_g = false;
    }

    static {
        field_h = "Log in";
        field_b = 0;
        field_m = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_j = new vc();
        field_f = new ae();
    }
}
