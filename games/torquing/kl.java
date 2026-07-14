/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends lf {
    static int field_r;
    private int field_s;
    static String field_n;
    static uc field_o;
    static t field_p;
    static String field_t;
    static String field_u;
    private lf field_q;

    final static void a(byte param0, la param1) {
        t var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = new t(param1.a(-116, "", "final_frame.jpg"), (java.awt.Component) (Object) k.field_d);
        var3 = var2.field_s;
        var4 = var2.field_t;
        bp.a((byte) -56);
        cl.field_a = new t(var3, var4 * 3 / 4);
        cl.field_a.e();
        var2.b(0, 0);
        de.field_a = new t(var3, -cl.field_a.field_t + var4);
        de.field_a.e();
        if (param0 != 66) {
          field_o = null;
          var2.b(0, -cl.field_a.field_t);
          de.field_a.field_r = cl.field_a.field_t;
          r.a(126);
          return;
        } else {
          var2.b(0, -cl.field_a.field_t);
          de.field_a.field_r = cl.field_a.field_t;
          r.a(126);
          return;
        }
    }

    final int d() {
        return ((kl) this).field_q.d();
    }

    final void a(int param0) {
        if (!(param0 >= ((kl) this).field_s)) {
            ((kl) this).field_s = ((kl) this).field_s - param0;
            return;
        }
        param0 = param0 - ((kl) this).field_s;
        ((kl) this).field_q.field_h = ((kl) this).field_h;
        ((kl) this).field_s = 0;
        ((kl) this).field_q.field_e = ((kl) this).field_e;
        ((kl) this).field_h.field_e = (q) (Object) ((kl) this).field_q;
        ((kl) this).field_e.field_h = (q) (Object) ((kl) this).field_q;
        ((kl) this).field_h = null;
        ((kl) this).field_e = null;
        if (!(param0 <= 0)) {
            ((kl) this).field_q.a(param0);
        }
    }

    final lf c() {
        return null;
    }

    final lf b() {
        return null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param1 == 16011) {
          if (param2 >= kn.field_e) {
            if (qg.field_z >= param0) {
              if (param3 >= j.field_q) {
                if (qk.field_p < param4) {
                  ha.a(param2, param5, -126, param0, param3, param4);
                  return;
                } else {
                  ta.a(0, param4, param3, param5, param2, param0);
                  return;
                }
              } else {
                ha.a(param2, param5, -126, param0, param3, param4);
                return;
              }
            } else {
              ha.a(param2, param5, -126, param0, param3, param4);
              return;
            }
          } else {
            ha.a(param2, param5, -126, param0, param3, param4);
            return;
          }
        } else {
          return;
        }
    }

    final int a() {
        return 0;
    }

    public static void b(int param0) {
        if (param0 > -113) {
          field_o = null;
          field_n = null;
          field_p = null;
          field_t = null;
          field_u = null;
          field_o = null;
          return;
        } else {
          field_n = null;
          field_p = null;
          field_t = null;
          field_u = null;
          field_o = null;
          return;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        if (param2 < ((kl) this).field_s) {
          ((kl) this).field_s = ((kl) this).field_s - param2;
          return;
        } else {
          param1 = param1 + ((kl) this).field_s;
          param2 = param2 - ((kl) this).field_s;
          ((kl) this).field_q.field_h = ((kl) this).field_h;
          ((kl) this).field_q.field_e = ((kl) this).field_e;
          ((kl) this).field_s = 0;
          ((kl) this).field_h.field_e = (q) (Object) ((kl) this).field_q;
          ((kl) this).field_e.field_h = (q) (Object) ((kl) this).field_q;
          ((kl) this).field_h = null;
          ((kl) this).field_e = null;
          if (0 < param2) {
            ((kl) this).field_q.b(param0, param1, param2);
            return;
          } else {
            return;
          }
        }
    }

    kl(lf param0, int param1) {
        ((kl) this).field_q = param0;
        ((kl) this).field_s = param1;
        ((kl) this).field_m = ((kl) this).field_q.field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Reload game";
        field_t = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_u = "Highscores";
    }
}
