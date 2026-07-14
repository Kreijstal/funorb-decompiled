/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends nb implements ag, jk {
    static int field_D;
    bb field_F;
    private cl field_E;
    private kf field_B;
    private kf field_G;
    static String field_C;

    public final void a(String param0, byte param1) {
        cl var3 = ((r) this).field_E;
        String var4 = param0;
        ((rl) (Object) var3).a(var4, -1, false);
        if (param1 < 103) {
            r.h(89);
        }
    }

    private final int a(String param0, String param1, w param2, int param3, int param4, int param5) {
        if (param3 != 11271) {
            ((r) this).field_F = null;
        }
        return this.a(param1, 35, 93, param5, param0, param4, param2);
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        if (param2 != 215535458) {
            Object var7 = null;
            ((r) this).a((String) null, (byte) 106);
        }
        if (((r) this).field_B != param4) {
            // if_acmpne L58
            this.g(126);
        } else {
            dc.c(255);
        }
    }

    public final void a(byte param0) {
        if (param0 != -12) {
            return;
        }
        ((ol) (Object) ((r) this).field_E.a((byte) 94)).e(param0 + 95);
    }

    public static void h(int param0) {
        if (param0 != -100) {
            return;
        }
        field_C = null;
    }

    final void a(byte param0, w param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((r) this).field_G.field_D = this.d((byte) -89);
    }

    private final int a(String param0, int param1, int param2, int param3, String param4, int param5, w param6) {
        jf var11 = new jf(20, param3, param5 + 120, 25, param6, false, 120, 3, ql.field_Q, 16777215, param0);
        ((r) this).b((byte) 73, (w) (Object) var11);
        li var9 = new li(((nd) (Object) param6).a((byte) 6), param4, 126, param3 + var11.field_v, 25 + param5, param1);
        int var10 = -12 / ((21 - param2) / 47);
        var9.field_r = (vd) this;
        ((r) this).b((byte) -93, (w) (Object) var9);
        return var9.field_v + var11.field_v;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) ol.field_l);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) ol.field_l);
        vg.field_b = -1;
        if (param1 != 20) {
            Object var3 = null;
            r.a((df) null, -73);
        }
    }

    private final boolean a(int param0, nd param1) {
        ma var3 = param1.a((byte) 118);
        if (!(var3 != null)) {
            return true;
        }
        sc var4 = var3.b((byte) 126);
        if (param0 != 4293) {
            return true;
        }
        return var4 == rh.field_p ? true : false;
    }

    final static void a(df param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        var2 = param1;
        L0: while (true) {
          if (-4 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= pj.field_H) {
                ok.field_G[param0.a(-1)] = ok.field_G[param0.a(-1)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (pj.field_H <= var3) {
                    pj.field_H = var2;
                    pj.field_H = pj.field_H + 1;
                    tf.field_d[pj.field_H] = param0;
                    return;
                  } else {
                    L3: {
                      if (param0.field_g != tf.field_d[var3].field_g) {
                        break L3;
                      } else {
                        var4 = tf.field_d[var3].a(-1);
                        if (ok.field_G[var4] <= si.field_s) {
                          break L3;
                        } else {
                          ok.field_G[var4] = ok.field_G[var4] - 1;
                          var3++;
                          continue L2;
                        }
                      }
                    }
                    var2++;
                    tf.field_d[var2] = tf.field_d[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (tf.field_d[var2].field_g == param0.field_g) {
                  ok.field_G[tf.field_d[var2].a(-1)] = ok.field_G[tf.field_d[var2].a(-1)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            ok.field_G[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public r() {
        super(0, 0, 496, 0, (rd) null);
        ((r) this).field_E = new cl("", (vd) null, 12);
        ik var1 = new ik(cl.field_T, 0, 0, 0, 0, 16777215, -1, 3, 0, ql.field_Q.field_E, -1, 2147483647, true);
        w var2 = new w(oh.field_c, (rd) (Object) var1, (vd) null);
        ((r) this).field_G = new kf(va.field_l, (vd) null);
        ((r) this).field_B = new kf(he.field_a, (vd) null);
        ((r) this).field_E.field_q = cl.field_Q;
        ((r) this).field_E.a((ma) (Object) new ol((rl) (Object) ((r) this).field_E), (byte) 23);
        ((r) this).field_G.field_D = false;
        ((r) this).field_G.field_i = (rd) (Object) new v();
        ((r) this).field_B.field_i = (rd) (Object) new uj();
        ((r) this).field_E.field_i = (rd) (Object) new id(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 270, true, var3, 20);
        var3 += 50;
        ((r) this).b((byte) 106, var2);
        var3 = var3 + (5 + this.a(nk.field_C, hc.field_kb, (w) (Object) ((r) this).field_E, 11271, 170, var3));
        ((r) this).field_G.a(40, var5, true, var3, 496 - var5 >> -8195999);
        ((r) this).field_B.a(40, 60, true, 15 + var3, var4 + 3);
        ((r) this).field_B.field_r = (vd) this;
        ((r) this).field_G.field_r = (vd) this;
        ((r) this).b((byte) -97, (w) (Object) ((r) this).field_G);
        ((r) this).b((byte) -67, (w) (Object) ((r) this).field_B);
        ((r) this).field_F = new bb((ag) this);
        ((r) this).field_F.a(150, ((r) this).field_j - ((r) this).field_E.field_t + (-((r) this).field_E.field_j + -60), true, 20, ((r) this).field_E.field_j + ((r) this).field_E.field_t + 60);
        ((r) this).b((byte) 53, (w) (Object) ((r) this).field_F);
        ((r) this).a(55 + (var3 + var4), 496, true, 0, 0);
    }

    private final boolean d(byte param0) {
        int var2 = -82 % ((param0 - 48) / 58);
        if (!this.a(4293, (nd) (Object) ((r) this).field_E)) {
            return false;
        }
        return true;
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        if (super.a(param0, param1, param2, (byte) -105)) {
            return true;
        }
        if (!((param1 ^ -1) != -99)) {
            return ((r) this).a(0, param2);
        }
        int var5 = 3 % ((-13 - param3) / 55);
        if ((param1 ^ -1) != -100) {
            return false;
        }
        return ((r) this).c((byte) 119, param2);
    }

    private final void g(int param0) {
        if (!(this.d((byte) 114))) {
            return;
        }
        if (param0 < 108) {
            ((r) this).field_F = null;
        }
        rb.a((byte) 112, ((r) this).field_E.field_u);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Type your password again to make sure it's correct";
    }
}
