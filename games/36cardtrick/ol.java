/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends jc implements qh {
    static int field_W;
    private hl field_Y;
    static int field_X;

    final static wb[] a(int param0, qk param1, int param2, int param3) {
        if (param3 != 505437496) {
            field_W = 25;
        }
        if (!tc.a(param0, param2, param3 ^ 505429695, param1)) {
            return null;
        }
        return hc.a(param3 + -502094224);
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6 = -98 / ((-62 - param1) / 32);
        if (((ol) this).field_Y == param3) {
            this.r(0);
        }
    }

    private final hl a(String param0, int param1, pl param2) {
        hl var4 = new hl(param0, param2);
        if (param1 != -29995) {
            Object var6 = null;
            wb[] discarded$0 = ol.a(76, (qk) null, 39, 118);
        }
        var4.field_v = (ci) (Object) new ki();
        int var5 = -6 + ((ol) this).field_q;
        ((ol) this).field_q = ((ol) this).field_q + 38;
        var4.a(30, var5, -14 + ((ol) this).field_h - 16, 15, true);
        ((ol) this).b((lk) (Object) var4, (byte) 118);
        ((ol) this).g(26947);
        return var4;
    }

    ol(j param0, ml param1) {
        super(param0, 200, 150);
        Object var3 = null;
        lk var4 = null;
        L0: {
          var3 = null;
          if (param1 == rc.field_l) {
            var3 = (Object) (Object) ll.field_a;
            break L0;
          } else {
            if (param1 == tk.field_b) {
              var3 = (Object) (Object) fe.field_d;
              ((ol) this).field_q = ((ol) this).field_q + 10;
              if (!kb.a(false)) {
                break L0;
              } else {
                ((ol) this).field_q = ((ol) this).field_q + 20;
                var3 = (Object) (Object) fj.field_f;
                break L0;
              }
            } else {
              if (uk.field_d != param1) {
                break L0;
              } else {
                var3 = (Object) (Object) ij.field_b;
                ((ol) this).field_q = ((ol) this).field_q + 30;
                break L0;
              }
            }
          }
        }
        var4 = new lk((String) var3, (pl) null);
        var4.field_o = 0;
        var4.field_q = 80;
        var4.field_i = 50;
        var4.field_h = ((ol) this).field_h;
        var4.field_v = (ci) (Object) new ek(me.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((ol) this).b(var4, (byte) 118);
        ((ol) this).field_Y = this.a(gh.field_i, -29995, (pl) this);
    }

    private final void r(int param0) {
        if (param0 != 0) {
            return;
        }
        if (!(((ol) this).field_E)) {
            return;
        }
        ((ol) this).field_E = false;
    }

    final static kc[] s(int param0) {
        kc[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var19 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = Main.field_T;
        var1 = new kc[cf.field_c];
        var2 = 0;
        L0: while (true) {
          if (var2 >= cf.field_c) {
            L1: {
              rh.d(79);
              if (param0 < -84) {
                break L1;
              } else {
                kc[] discarded$1 = ol.s(-125);
                break L1;
              }
            }
            return var1;
          } else {
            var3 = na.field_q[var2] * hb.field_a[var2];
            var24 = rd.field_k[var2];
            if (!hl.field_y[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var3) {
                  var1[var2] = new kc(p.field_l, gk.field_a, kb.field_c[var2], ml.field_b[var2], na.field_q[var2], hb.field_a[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = jf.field_i[bc.a((int) var24[var6], 255)];
                  var6++;
                  continue L2;
                }
              }
            } else {
              var23 = vd.field_r[var2];
              var19 = var23;
              var15 = var19;
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L3: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (kc) (Object) new si(p.field_l, gk.field_a, kb.field_c[var2], ml.field_b[var2], na.field_q[var2], hb.field_a[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = fj.a(bc.a(255, (int) var23[var7]) << 505437496, jf.field_i[bc.a((int) var24[var7], 255)]);
                  var7++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = 0;
    }
}
