/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends ug implements el {
    private rg field_hb;
    static e field_lb;
    static dk field_ob;
    static nf[] field_mb;
    static String field_ib;
    static int field_jb;
    static String field_nb;
    static int field_kb;

    final static void a(int param0, boolean param1) {
        if (param0 <= -29) {
          if (kc.field_o) {
            bg.field_a = bk.a(320, true, param1, oj.field_B);
            return;
          } else {
            if (bj.field_m) {
              ji.field_e = qh.a(param1, (byte) 108);
              return;
            } else {
              L0: {
                da.field_e.b(param1, (byte) -115);
                if (!ej.field_b) {
                  ej.field_b = true;
                  he.field_d.a((bl) (Object) h.field_R);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
          }
        } else {
          field_ob = null;
          if (kc.field_o) {
            bg.field_a = bk.a(320, true, param1, oj.field_B);
            return;
          } else {
            if (bj.field_m) {
              ji.field_e = qh.a(param1, (byte) 108);
              return;
            } else {
              L1: {
                da.field_e.b(param1, (byte) -115);
                if (!ej.field_b) {
                  ej.field_b = true;
                  he.field_d.a((bl) (Object) h.field_R);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          }
        }
    }

    final static void n(int param0) {
        int var2 = Confined.field_J ? 1 : 0;
        if (param0 != 15102) {
            return;
        }
        if (!(hm.f((byte) 6))) {
            if (null == dn.field_d) {
                return;
            }
            if (dn.field_d.field_f) {
                qh.c(4);
                ie.field_b.c((fj) (Object) new ei(ie.field_b, wl.field_f), param0 + -15102);
                return;
            }
            return;
        }
        boolean discarded$8 = ie.field_b.a(true, true, pe.field_m, qe.field_Q);
        ie.field_b.i((byte) 52);
        while (nm.e((byte) -96)) {
            boolean discarded$9 = ie.field_b.a((byte) 101, ad.field_h, gk.field_r);
        }
    }

    final static void h(byte param0) {
        he.field_f = -1;
        vf.field_o = null;
        sa.field_R = false;
        if (param0 > -93) {
            return;
        }
        hm.field_qb = 0;
        nm.field_I = -1;
    }

    private ei(sh param0, ci param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        fj var6 = null;
        Object var7 = null;
        fj var8 = null;
        String var9 = null;
        fj var10 = null;
        fj var11 = null;
        var7 = null;
        if (kd.field_t != param1) {
          if (wl.field_f == param1) {
            L0: {
              var3 = sf.field_s;
              ((ei) this).field_z = ((ei) this).field_z + 10;
              if (!kj.a((byte) -14)) {
                break L0;
              } else {
                var3 = v.field_Cb;
                ((ei) this).field_z = ((ei) this).field_z + 20;
                break L0;
              }
            }
            var11 = new fj(var3, (uk) null);
            var11.field_F = ((ei) this).field_F;
            var11.field_z = 80;
            var11.field_q = 0;
            var11.field_m = 50;
            var11.field_n = (fe) (Object) new vf(fa.field_Q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((ei) this).b(var11, 10);
            ((ei) this).field_hb = this.a((uk) this, s.field_J, -27167);
          } else {
            if (fj.field_x == param1) {
              var9 = ql.field_A;
              var3 = var9;
              var3 = var9;
              ((ei) this).field_z = ((ei) this).field_z + 30;
              var10 = new fj(var9, (uk) null);
              var10.field_F = ((ei) this).field_F;
              var10.field_z = 80;
              var10.field_q = 0;
              var10.field_m = 50;
              var10.field_n = (fe) (Object) new vf(fa.field_Q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ei) this).b(var10, 10);
              ((ei) this).field_hb = this.a((uk) this, s.field_J, -27167);
            } else {
              var8 = new fj((String) var7, (uk) null);
              var8.field_F = ((ei) this).field_F;
              var8.field_z = 80;
              var8.field_q = 0;
              var8.field_m = 50;
              var8.field_n = (fe) (Object) new vf(fa.field_Q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ei) this).b(var8, 10);
              ((ei) this).field_hb = this.a((uk) this, s.field_J, -27167);
            }
          }
        } else {
          var5 = gh.field_d;
          var6 = new fj(var5, (uk) null);
          var6.field_F = ((ei) this).field_F;
          var6.field_z = 80;
          var6.field_q = 0;
          var6.field_m = 50;
          var6.field_n = (fe) (Object) new vf(fa.field_Q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((ei) this).b(var6, 10);
          ((ei) this).field_hb = this.a((uk) this, s.field_J, -27167);
        }
    }

    private final rg a(uk param0, String param1, int param2) {
        rg var4 = null;
        int var5 = 0;
        Object var6 = null;
        var4 = new rg(param1, param0);
        var4.field_n = (fe) (Object) new je();
        if (param2 != -27167) {
          var6 = null;
          rg discarded$1 = this.a((uk) null, (String) null, 101);
          var5 = ((ei) this).field_z + -6;
          ((ei) this).field_z = ((ei) this).field_z + 38;
          var4.a(param2 ^ 27234, -16 + ((ei) this).field_F - 14, var5, 30, 15);
          ((ei) this).b((fj) (Object) var4, 10);
          ((ei) this).d(param2 ^ -27171);
          return var4;
        } else {
          var5 = ((ei) this).field_z + -6;
          ((ei) this).field_z = ((ei) this).field_z + 38;
          var4.a(param2 ^ 27234, -16 + ((ei) this).field_F - 14, var5, 30, 15);
          ((ei) this).b((fj) (Object) var4, 10);
          ((ei) this).d(param2 ^ -27171);
          return var4;
        }
    }

    public static void i(byte param0) {
        field_ob = null;
        field_nb = null;
        int var1 = -69 / ((param0 - 9) / 60);
        field_lb = null;
        field_ib = null;
        field_mb = null;
    }

    final static bm o(int param0) {
        bm var1 = null;
        var1 = new bm(kb.field_a, em.field_e, jl.field_p[0], ij.field_r[0], rg.field_I[0], sd.field_f[0], rj.field_f[0], an.field_p);
        ql.a(false);
        if (param0 < 20) {
          field_jb = 35;
          return var1;
        } else {
          return var1;
        }
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        if (param0 > 68) {
          if (((ei) this).field_hb == param3) {
            this.c(true);
            return;
          } else {
            return;
          }
        } else {
          ((ei) this).field_hb = null;
          if (((ei) this).field_hb != param3) {
            return;
          } else {
            this.c(true);
            return;
          }
        }
    }

    private final void c(boolean param0) {
        if (!(((ei) this).field_H)) {
            return;
        }
        ((ei) this).field_H = false;
        if (!param0) {
            field_jb = 117;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = new e(13, 0, 1, 0);
        field_jb = 0;
        field_ib = "Orb coins: ";
        field_kb = 0;
        field_nb = "Reload game";
    }
}
