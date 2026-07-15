/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tf extends kf implements rl, vn, fi {
    df field_db;
    static w field_gb;
    private og field_fb;
    private og field_T;
    private og field_eb;
    static Random field_cb;
    private og field_hb;
    private ek field_X;
    private dl field_W;
    private ek field_V;
    static String field_Z;
    static String field_ab;
    private og field_S;
    private og field_Y;
    private qi field_U;
    static boolean field_bb;

    public tf() {
        super(0, 0, 496, 0, (gl) null);
        ((tf) this).field_fb = new og("", (kg) null, 12);
        ((tf) this).field_Y = new og("", (kg) null, 100);
        ((tf) this).field_eb = new og("", (kg) null, 100);
        ((tf) this).field_hb = new og("", (kg) null, 20);
        ((tf) this).field_S = new og("", (kg) null, 20);
        ((tf) this).field_T = new og("", (kg) null, 3);
        int var1 = 1;
        ((tf) this).field_W = new dl("", (kg) null, var1 != 0);
        ((tf) this).field_X = new ek(se.field_Q, (kg) null);
        ((tf) this).field_V = new ek(ec.field_q, (kg) null);
        ((tf) this).field_fb.field_B = ea.field_C;
        ((tf) this).field_Y.field_B = ad.field_t;
        ((tf) this).field_eb.field_B = aa.field_a;
        ((tf) this).field_hb.field_B = wd.field_b;
        ((tf) this).field_S.field_B = ua.field_C;
        ((tf) this).field_T.field_B = fb.field_a;
        ((tf) this).field_W.field_B = al.field_j;
        ((tf) this).field_fb.a((nb) (Object) new jm((rk) (Object) ((tf) this).field_fb), -5362);
        ((tf) this).field_Y.a((nb) (Object) new ii((rk) (Object) ((tf) this).field_Y), -5362);
        ((tf) this).field_eb.a((nb) (Object) new tl((rk) (Object) ((tf) this).field_eb, (rk) (Object) ((tf) this).field_Y), -5362);
        ((tf) this).field_hb.a((nb) (Object) new te((rk) (Object) ((tf) this).field_hb, (rk) (Object) ((tf) this).field_fb, (rk) (Object) ((tf) this).field_Y), -5362);
        ((tf) this).field_S.a((nb) (Object) new re((rk) (Object) ((tf) this).field_S, (rk) (Object) ((tf) this).field_hb), -5362);
        ((tf) this).field_T.a((nb) (Object) new kd((rk) (Object) ((tf) this).field_T), -5362);
        ((tf) this).field_X.field_I = false;
        ((tf) this).field_X.field_p = (gl) (Object) new fk();
        ((tf) this).field_V.field_p = (gl) (Object) new on();
        ((tf) this).field_fb.field_p = (gl) (Object) new di(10000536);
        di dupTemp$0 = new di(10000536);
        ((tf) this).field_eb.field_p = (gl) (Object) dupTemp$0;
        ((tf) this).field_Y.field_p = (gl) (Object) dupTemp$0;
        ((tf) this).field_T.field_p = (gl) (Object) new di(10000536);
        ((tf) this).field_W.field_p = (gl) (Object) new tg();
        gm dupTemp$1 = new gm(10000536);
        ((tf) this).field_S.field_p = (gl) (Object) dupTemp$1;
        ((tf) this).field_hb.field_p = (gl) (Object) dupTemp$1;
        String var2 = cm.a((byte) 102, me.field_G, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(9828, (ce) (Object) ((tf) this).field_Y, var3, eg.field_c, 170);
        var3 = var3 + (5 + this.a((ce) (Object) ((tf) this).field_eb, oc.field_d, 20, (byte) -44, 170, var3, ""));
        var3 = var3 + this.a(9828, (ce) (Object) ((tf) this).field_hb, var3, ch.field_d, 170);
        var3 = var3 + (this.a(125, (ce) (Object) ((tf) this).field_S, var3, sl.field_e, ga.field_c, 170) + 5);
        var3 = var3 + (5 + this.a(114, (ce) (Object) ((tf) this).field_fb, var3, rg.field_e, ij.field_b, 170));
        var3 = var3 + this.a(qe.field_e, (byte) -107, (ce) (Object) ((tf) this).field_T, 170, var3);
        de var4 = new de(46, var3, -90 + ((tf) this).field_t, 25, (ce) (Object) ((tf) this).field_W, true, -120 + ((tf) this).field_t, 5, bj.field_f, 11579568, h.field_a);
        ((tf) this).b((ce) (Object) var4, (byte) -55);
        var3 = var3 + var4.field_y;
        a var5 = new a(hh.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, hh.field_e.field_R, -1, 2147483647, true);
        ((tf) this).field_U = new qi(var2, (gl) (Object) var5);
        ((tf) this).field_U.field_B = "";
        ((tf) this).field_U.a(rb.field_i, 0, 1);
        ((tf) this).field_U.a(rb.field_i, 1, 1);
        ((tf) this).field_U.field_v = (kg) this;
        ((tf) this).field_U.c(-114, 46, var3, -90 + ((tf) this).field_t);
        var3 = var3 + (15 + ((tf) this).field_U.field_y);
        ((tf) this).b((ce) (Object) ((tf) this).field_U, (byte) -55);
        int var6 = 4;
        int var7 = 200;
        ((tf) this).field_X.b(40, var7, -var7 + 496 >> 1635535617, var3, -16555);
        ((tf) this).field_V.b(40, 60, 3 + var6, var3 + 15, -16555);
        ((tf) this).field_V.field_v = (kg) this;
        ((tf) this).field_X.field_v = (kg) this;
        ((tf) this).b((ce) (Object) ((tf) this).field_X, (byte) -55);
        ((tf) this).b((ce) (Object) ((tf) this).field_V, (byte) -55);
        ((tf) this).field_db = new df((fi) this);
        ((tf) this).field_db.b(150, -60 + -((tf) this).field_fb.field_t + (((tf) this).field_t + -((tf) this).field_fb.field_u), ((tf) this).field_fb.field_u + ((tf) this).field_fb.field_t + 60, ((tf) this).field_fb.field_D - -20, -16555);
        ((tf) this).b((ce) (Object) ((tf) this).field_db, (byte) -55);
        ((tf) this).b(55 + var3 - -var6, 496, 0, 0, -16555);
    }

    private final boolean f(byte param0) {
        if (!(this.i(94))) {
            return false;
        }
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((tf) this).field_T.field_E);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 != -35) {
            tf.b(-18, false, -28, 107);
        }
        return nk.a(((tf) this).field_hb.field_E, (byte) 123, (tf) this, ((tf) this).field_W.field_H, var2, ((tf) this).field_fb.field_E, ((tf) this).field_Y.field_E);
    }

    final static boolean a(byte param0, int[] param1) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        if (param0 < 2) {
            return false;
        }
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            if (!(-1 == (param1[var2] ^ -1))) {
                return true;
            }
        }
        return false;
    }

    final static void a(byte param0, boolean param1) {
        ll.a(-1, param1);
        hm.a(-1, param1);
        int var2 = 36 / ((-24 - param0) / 53);
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        if (param0 != 67) {
            return;
        }
        if (((tf) this).field_V == param2) {
            t.k((byte) -73);
        } else {
            if (param2 == ((tf) this).field_X) {
                boolean discarded$0 = this.f((byte) -35);
            }
        }
    }

    final void a(ce param0, int param1, int param2, int param3) {
        super.a(param0, 75, param2, param3);
        ((tf) this).field_X.field_I = this.i(-113);
        if (param1 <= 38) {
            Object var6 = null;
            boolean discarded$0 = ((tf) this).a(-32, 53, (ce) null, '[');
        }
    }

    final static void i(byte param0) {
        if (null != w.field_H) {
            if (!(w.field_H.field_l == null)) {
                w.field_H.field_l.field_ab = false;
            }
        }
        ki.field_w = null;
        w.field_H = null;
        if (param0 >= -55) {
            tf.a((byte) -5, false);
        }
    }

    public final void a(int param0) {
        if (param0 != 25) {
            return;
        }
        ((jm) (Object) ((tf) this).field_fb.a(-96)).a(true);
    }

    private final int a(int param0, ce param1, int param2, String param3, String param4, int param5) {
        if (param0 <= 99) {
            field_cb = null;
        }
        return this.a(param1, param4, 35, (byte) -44, param5, param2, param3);
    }

    private final int a(ce param0, String param1, int param2, byte param3, int param4, int param5, String param6) {
        de var10 = new de(20, param5, 120 + param4, 25, param0, false, 120, 3, hh.field_e, 16777215, param1);
        ((tf) this).b((ce) (Object) var10, (byte) -55);
        pa var9 = new pa(((jl) (Object) param0).a(-122), param6, 126, param5 + var10.field_y, param4 + 50, param2);
        var9.field_v = (kg) this;
        ((tf) this).b((ce) (Object) var9, (byte) -55);
        if (param3 != -44) {
            field_bb = false;
        }
        return var10.field_y - -var9.field_y;
    }

    public static void b(boolean param0) {
        if (!param0) {
            tf.a((byte) 125, true);
        }
        field_ab = null;
        field_Z = null;
        field_gb = null;
        field_cb = null;
    }

    private final boolean a(jl param0, int param1) {
        nb var3 = param0.a(-101);
        if (!(var3 != null)) {
            return true;
        }
        int var5 = -62 % ((param1 - 73) / 51);
        tb var4 = var3.a(20350);
        if (!(vm.field_u != var4)) {
            return false;
        }
        if (le.field_o == var4) {
            return false;
        }
        if (ki.field_t != var4) {
            return true;
        }
        return false;
    }

    private final String h(byte param0) {
        if (param0 != 29) {
            tf.b(118, false, -20, 75);
        }
        return "</col></u>";
    }

    private final String g(byte param0) {
        int var2 = 85 / ((param0 - -4) / 60);
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean i(int param0) {
        int var2 = 0;
        L0: {
          if (!this.a((jl) (Object) ((tf) this).field_fb, 127)) {
            break L0;
          } else {
            if (!this.a((jl) (Object) ((tf) this).field_Y, -111)) {
              break L0;
            } else {
              if (!this.a((jl) (Object) ((tf) this).field_eb, 124)) {
                break L0;
              } else {
                if (!this.a((jl) (Object) ((tf) this).field_hb, 126)) {
                  break L0;
                } else {
                  if (!this.a((jl) (Object) ((tf) this).field_S, -94)) {
                    break L0;
                  } else {
                    if (this.a((jl) (Object) ((tf) this).field_T, 124)) {
                      var2 = 37 % ((16 - param0) / 54);
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5 = -45 % ((-22 - param0) / 49);
        if (!(!super.a(-84, param1, param2, param3))) {
            return true;
        }
        if (-99 == (param1 ^ -1)) {
            return ((tf) this).a(param2, (byte) -115);
        }
        if (99 != param1) {
            return false;
        }
        return ((tf) this).a(32, param2);
    }

    final static ji a(int param0, int param1, boolean param2, boolean param3, int param4) {
        if (param1 < 73) {
            field_Z = null;
        }
        return kc.a(param3, param0, param4, false, false, param2);
    }

    public final void a(qi param0, int param1, int param2, int param3) {
        int var6 = 0;
        L0: {
          var6 = client.field_A ? 1 : 0;
          if (0 == param3) {
            jg.a(true, "terms.ws");
            break L0;
          } else {
            if (1 == param3) {
              jg.a(true, "privacy.ws");
              break L0;
            } else {
              if (2 != param3) {
                break L0;
              } else {
                jg.a(true, "conduct.ws");
                break L0;
              }
            }
          }
        }
        L1: {
          if (param2 < -87) {
            break L1;
          } else {
            ((tf) this).field_fb = null;
            break L1;
          }
        }
    }

    public final void a(String param0, int param1) {
        og var3 = ((tf) this).field_fb;
        if (param1 != -28464) {
            Object var5 = null;
            int discarded$0 = this.a((String) null, (byte) 117, (ce) null, -76, -79);
        }
        String var4 = param0;
        ((rk) (Object) var3).a(var4, (byte) 114, false);
    }

    final static void b(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        w var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        hl var9 = null;
        L0: {
          var7 = client.field_A ? 1 : 0;
          if (bl.field_T < dl.field_M) {
            bl.field_T = bl.field_T + 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (le.field_m.field_i == ac.field_B) {
            break L1;
          } else {
            qc.field_Y = qc.field_Y + (le.field_m.field_i - ac.field_B);
            ac.field_B = le.field_m.field_i;
            break L1;
          }
        }
        if (bl.field_T > 0) {
          L2: {
            on.b((byte) -100);
            ea.field_D.a(false, param1);
            if (bc.field_E != null) {
              if (wc.field_n) {
                boolean discarded$1 = bc.field_E.a(ea.field_D.field_pb, param1, ea.field_D.field_E, 29166);
                break L2;
              } else {
                bc.field_E = null;
                break L2;
              }
            } else {
              break L2;
            }
          }
          var4 = param2;
          L3: while (true) {
            if (var4 >= 5) {
              L4: {
                if (qb.field_p.field_ob == 0) {
                  break L4;
                } else {
                  pd.field_f = new mg(qb.field_p.field_E, qb.field_p.field_pb, qb.field_p.field_mb, qb.field_p.field_N, param0, ui.field_x, tg.field_h, ib.field_nb, ua.field_H, al.field_h, df.field_ab, (String) null, 0L);
                  break L4;
                }
              }
              L5: {
                var9 = wj.a((byte) 55, kf.field_O, param3, nk.field_b);
                if (var9 == null) {
                  break L5;
                } else {
                  cb.a(var9, false);
                  break L5;
                }
              }
              L6: {
                var8 = sf.c(-36);
                if (var8 == null) {
                  break L6;
                } else {
                  sl.field_g = var8;
                  break L6;
                }
              }
              return;
            } else {
              var5 = dh.field_c[var4];
              if (var5 != null) {
                L7: {
                  if (var5.field_ob == 0) {
                    break L7;
                  } else {
                    cg.a(1, var5, var4);
                    break L7;
                  }
                }
                var6 = rf.a(0, var4);
                si.field_b[var4].field_I = ef.field_O[var6];
                le.field_D[var4].field_Y = sg.field_a[var6];
                var4++;
                continue L3;
              } else {
                var4++;
                continue L3;
              }
            }
          }
        } else {
          return;
        }
    }

    private final int a(String param0, byte param1, ce param2, int param3, int param4) {
        de var8 = new de(20, param4, 120 - -param3, 25, param2, false, 120, 3, hh.field_e, 16777215, param0);
        ((tf) this).b((ce) (Object) var8, (byte) -55);
        g var7 = new g(((jl) (Object) param2).a(-126));
        ((tf) this).b((ce) (Object) var7, (byte) -55);
        if (param1 != -107) {
            ((tf) this).field_db = null;
        }
        var7.b(15, 15, var8.field_t + (var8.field_u + 3), var8.field_D - -(-15 + var8.field_y >> 778367041), -16555);
        return var8.field_y;
    }

    private final int a(int param0, ce param1, int param2, String param3, int param4) {
        de var6 = new de(20, param2, param4 + 120, 25, param1, false, 120, 3, hh.field_e, 16777215, param3);
        ((tf) this).b((ce) (Object) var6, (byte) -55);
        if (param0 != 9828) {
            Object var7 = null;
            int discarded$0 = this.a((ce) null, (String) null, -93, (byte) 120, -33, 113, (String) null);
        }
        return var6.field_y;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = "Status";
        field_Z = "Click";
        field_cb = new Random();
    }
}
