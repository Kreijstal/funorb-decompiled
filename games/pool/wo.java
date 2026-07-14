/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo {
    static String[] field_b;
    static boolean field_c;
    private rg field_d;
    private rg field_e;
    static of field_f;
    static int field_a;
    static nl field_g;

    final rg a(byte param0) {
        rg var2 = null;
        int var3 = 0;
        var3 = -47 % ((param0 - 25) / 39);
        var2 = ((wo) this).field_d.field_q;
        if (((wo) this).field_d == var2) {
          ((wo) this).field_e = null;
          return null;
        } else {
          ((wo) this).field_e = var2.field_q;
          return var2;
        }
    }

    final int b(int param0) {
        int var4 = Pool.field_O;
        int var2 = param0;
        rg var3 = ((wo) this).field_d.field_q;
        while (((wo) this).field_d != var3) {
            var2++;
            var3 = var3.field_q;
        }
        return var2;
    }

    final void a(rg param0, boolean param1) {
        if (param1) {
          L0: {
            ((wo) this).field_e = null;
            if (param0.field_n != null) {
              param0.a(param1);
              break L0;
            } else {
              break L0;
            }
          }
          param0.field_q = ((wo) this).field_d;
          param0.field_n = ((wo) this).field_d.field_n;
          param0.field_n.field_q = param0;
          param0.field_q.field_n = param0;
          return;
        } else {
          L1: {
            if (param0.field_n != null) {
              param0.a(param1);
              break L1;
            } else {
              break L1;
            }
          }
          param0.field_q = ((wo) this).field_d;
          param0.field_n = ((wo) this).field_d.field_n;
          param0.field_n.field_q = param0;
          param0.field_q.field_n = param0;
          return;
        }
    }

    final static void a(int param0, di param1) {
        oi.field_o = pf.a("basic", (byte) 54, "display_name_changed", param1);
        aj.field_Mb = new ao(0L, em.field_J, wg.field_Rb, ge.field_m);
        cp.field_c = new ao(0L, em.field_J, ag.field_d, tp.field_f);
        ud.field_J = new vh(0L, (vh) null);
        ba.field_sb = new vh(0L, uo.field_Lb);
        ba.field_sb.field_Fb = param0;
        qk.field_e = new vh(0L, lf.field_d, jh.field_g);
        mb.field_f = new vh(0L, sd.field_Q, f.field_d);
        rc.field_b = new vh(0L, ei.field_A);
        ud.field_J.a(param0 + -103, ba.field_sb);
        ud.field_J.a(92, qk.field_e);
        ud.field_J.a(14, mb.field_f);
        ud.field_J.a(127, (vh) (Object) aj.field_Mb);
        ud.field_J.a(param0 ^ -107, rc.field_b);
        aj.field_Mb.field_Sb.field_Sb.a((byte) -87, uo.field_Lb);
        aj.field_Mb.field_Sb.field_Sb.field_cb = 1;
        vh var5 = aj.field_Mb.field_Sb.field_Sb;
        vh var6 = var5;
        var6.field_Fb = 1;
        cp.field_c.field_Sb.field_Sb.a((byte) -87, uo.field_Lb);
        vh var3 = cp.field_c.field_Sb.field_Sb;
        cp.field_c.field_Sb.field_Sb.field_cb = 1;
        var3.field_Fb = 1;
    }

    final rg a(int param0) {
        rg var2 = null;
        var2 = ((wo) this).field_d.field_q;
        if (((wo) this).field_d != var2) {
          var2.a(false);
          if (param0 != 0) {
            rg discarded$2 = ((wo) this).a((byte) -4);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    public wo() {
        ((wo) this).field_d = new rg();
        ((wo) this).field_d.field_q = ((wo) this).field_d;
        ((wo) this).field_d.field_n = ((wo) this).field_d;
    }

    final rg b(byte param0) {
        if (param0 > -66) {
            return null;
        }
        rg var2 = ((wo) this).field_e;
        if (!(var2 != ((wo) this).field_d)) {
            ((wo) this).field_e = null;
            return null;
        }
        ((wo) this).field_e = var2.field_q;
        return var2;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            return;
        }
        field_f = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Awesome shot!", "Pure skill!"};
        field_a = 5;
        field_g = new nl();
    }
}
