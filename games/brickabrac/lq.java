/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static jp field_d;
    static String field_c;
    static int[] field_b;
    private tk field_g;
    private tk field_f;
    static String field_e;
    static String field_a;

    final static void d(int param0) {
        tn.field_m = null;
        int var1 = -1 / ((42 - param0) / 59);
    }

    final void a(tk param0, boolean param1) {
        Object var4 = null;
        L0: {
          if (param0.field_n != null) {
            param0.d(3);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          var4 = null;
          tp discarded$1 = lq.a(-17, 78, 86, (mf) null);
          param0.field_s = ((lq) this).field_g;
          param0.field_n = ((lq) this).field_g.field_n;
          param0.field_n.field_s = param0;
          param0.field_s.field_n = param0;
          return;
        } else {
          param0.field_s = ((lq) this).field_g;
          param0.field_n = ((lq) this).field_g.field_n;
          param0.field_n.field_s = param0;
          param0.field_s.field_n = param0;
          return;
        }
    }

    final tk a(int param0) {
        tk var2 = null;
        if (param0 == 25609) {
          var2 = ((lq) this).field_g.field_s;
          if (((lq) this).field_g == var2) {
            return null;
          } else {
            var2.d(param0 ^ 25610);
            return var2;
          }
        } else {
          ((lq) this).field_g = null;
          var2 = ((lq) this).field_g.field_s;
          if (((lq) this).field_g == var2) {
            return null;
          } else {
            var2.d(param0 ^ 25610);
            return var2;
          }
        }
    }

    final tk e(int param0) {
        tk var2 = null;
        Object var3 = null;
        var2 = ((lq) this).field_f;
        if (var2 != ((lq) this).field_g) {
          ((lq) this).field_f = var2.field_s;
          if (param0 != -8394) {
            var3 = null;
            ((lq) this).a((tk) null, true);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((lq) this).field_f = null;
          return null;
        }
    }

    final tk a(boolean param0) {
        if (!param0) {
            return null;
        }
        tk var2 = ((lq) this).field_g.field_s;
        if (!(((lq) this).field_g != var2)) {
            ((lq) this).field_f = null;
            return null;
        }
        ((lq) this).field_f = var2.field_s;
        return var2;
    }

    final int c(int param0) {
        int var2 = 0;
        tk var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = ((lq) this).field_g.field_s;
        if (param0 == -25906) {
          L0: while (true) {
            if (((lq) this).field_g == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_s;
              continue L0;
            }
          }
        } else {
          return 88;
        }
    }

    final static th[] b(int param0) {
        if (param0 != 0) {
          field_e = null;
          return new th[]{un.field_b, nm.field_c, ro.field_r, an.field_i, o.field_h, c.field_m, wi.field_i, ba.field_B, pa.field_k, hj.field_Sb, sl.field_B, si.field_o, kq.field_i, lk.field_o};
        } else {
          return new th[]{un.field_b, nm.field_c, ro.field_r, an.field_i, o.field_h, c.field_m, wi.field_i, ba.field_B, pa.field_k, hj.field_Sb, sl.field_B, si.field_o, kq.field_i, lk.field_o};
        }
    }

    public static void b(boolean param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (!param0) {
          lq.b(false);
          field_e = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(mf param0, mf param1, byte param2, mf param3, mf param4) {
        kc.field_j = param1;
        ta.field_g = param3;
        ic.field_a = param0;
        ag.field_G = param4;
        gf.field_e = new wp(ag.field_G, ta.field_g);
        if (param2 == -38) {
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static tp a(int param0, int param1, int param2, mf param3) {
        if (!ln.a(-105, param2, param3, param1)) {
            return null;
        }
        if (param0 != 0) {
            lq.d(-20);
            return ud.c(false);
        }
        return ud.c(false);
    }

    public lq() {
        ((lq) this).field_g = new tk();
        ((lq) this).field_g.field_s = ((lq) this).field_g;
        ((lq) this).field_g.field_n = ((lq) this).field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Go!";
        field_a = "Invite players";
    }
}
