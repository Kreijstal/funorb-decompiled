/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vd extends td implements jg, m, a {
    private lf field_I;
    private rh field_H;
    private rh field_C;
    static nk field_G;
    private lf field_F;
    private ed field_O;
    nd field_N;
    private lf field_E;
    private lf field_L;
    private lf field_M;
    private el field_D;
    private lf field_J;
    static int field_K;

    private final String c(boolean param0) {
        if (!param0) {
            Object var3 = null;
            int discarded$0 = this.a((String) null, -55, (String) null, (al) null, 12, 28, 112);
        }
        return "</col></u>";
    }

    private final boolean l(int param0) {
        if (!this.j(-21109)) {
            return false;
        }
        int var2 = -1;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((vd) this).field_L.field_s);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 != -27163) {
            Object var4 = null;
            int discarded$0 = this.a((byte) 51, 67, (al) null, -67, (String) null);
        }
        return wf.a((byte) 29, ((vd) this).field_F.field_s, ((vd) this).field_J.field_s, ((vd) this).field_M.field_s, (vd) this, ((vd) this).field_O.field_G, var2);
    }

    public vd() {
        super(0, 0, 496, 0, (t) null);
        ((vd) this).field_F = new lf("", (tg) null, 12);
        ((vd) this).field_M = new lf("", (tg) null, 100);
        ((vd) this).field_I = new lf("", (tg) null, 100);
        ((vd) this).field_J = new lf("", (tg) null, 20);
        ((vd) this).field_E = new lf("", (tg) null, 20);
        ((vd) this).field_L = new lf("", (tg) null, 3);
        int var1 = 1;
        ((vd) this).field_O = new ed("", (tg) null, var1 != 0);
        ((vd) this).field_C = new rh(dh.field_i, (tg) null);
        ((vd) this).field_H = new rh(al.field_v, (tg) null);
        ((vd) this).field_F.field_n = ak.field_c;
        ((vd) this).field_M.field_n = og.field_nb;
        ((vd) this).field_I.field_n = qh.field_c;
        ((vd) this).field_J.field_n = jd.field_f;
        ((vd) this).field_E.field_n = hb.field_d;
        ((vd) this).field_L.field_n = ti.field_p;
        ((vd) this).field_O.field_n = pl.field_d;
        ((vd) this).field_F.a(1, (eh) (Object) new af((lb) (Object) ((vd) this).field_F));
        ((vd) this).field_M.a(1, (eh) (Object) new l((lb) (Object) ((vd) this).field_M));
        ((vd) this).field_I.a(1, (eh) (Object) new hd((lb) (Object) ((vd) this).field_I, (lb) (Object) ((vd) this).field_M));
        ((vd) this).field_J.a(1, (eh) (Object) new ui((lb) (Object) ((vd) this).field_J, (lb) (Object) ((vd) this).field_F, (lb) (Object) ((vd) this).field_M));
        ((vd) this).field_E.a(1, (eh) (Object) new ni((lb) (Object) ((vd) this).field_E, (lb) (Object) ((vd) this).field_J));
        ((vd) this).field_L.a(1, (eh) (Object) new nc((lb) (Object) ((vd) this).field_L));
        ((vd) this).field_C.field_B = false;
        ((vd) this).field_C.field_y = (t) (Object) new dc();
        ((vd) this).field_H.field_y = (t) (Object) new ne();
        ((vd) this).field_F.field_y = (t) (Object) new dd(10000536);
        dd dupTemp$0 = new dd(10000536);
        ((vd) this).field_I.field_y = (t) (Object) dupTemp$0;
        ((vd) this).field_M.field_y = (t) (Object) dupTemp$0;
        ((vd) this).field_L.field_y = (t) (Object) new dd(10000536);
        ((vd) this).field_O.field_y = (t) (Object) new ma();
        ql dupTemp$1 = new ql(10000536);
        ((vd) this).field_E.field_y = (t) (Object) dupTemp$1;
        ((vd) this).field_J.field_y = (t) (Object) dupTemp$1;
        String var2 = dh.a((byte) -56, new String[2], oi.field_d);
        int var3 = 20;
        var3 = var3 + this.a(170, we.field_b, 5, var3, (al) (Object) ((vd) this).field_M);
        var3 = var3 + (this.a("", 20, kl.field_b, (al) (Object) ((vd) this).field_I, 170, -1, var3) - -5);
        var3 = var3 + this.a(170, rf.field_d, 5, var3, (al) (Object) ((vd) this).field_J);
        var3 = var3 + (this.a(var3, ti.field_r, 127, 170, bj.field_c, (al) (Object) ((vd) this).field_E) - -5);
        var3 = var3 + (this.a(var3, pb.field_b, 127, 170, rg.field_a, (al) (Object) ((vd) this).field_F) - -5);
        var3 = var3 + this.a((byte) -128, 170, (al) (Object) ((vd) this).field_L, var3, di.field_j);
        sa var4 = new sa(46, var3, -90 + ((vd) this).field_x, 25, (al) (Object) ((vd) this).field_O, true, -120 + ((vd) this).field_x, 5, fk.field_a, 11579568, lj.field_c);
        ((vd) this).a(false, (al) (Object) var4);
        var3 = var3 + var4.field_u;
        ic var5 = new ic(gk.field_c, 0, 0, 0, 0, 16777215, -1, 0, 0, gk.field_c.field_G, -1, 2147483647, true);
        ((vd) this).field_D = new el(var2, (t) (Object) var5);
        ((vd) this).field_D.field_n = "";
        ((vd) this).field_D.a((byte) -85, bb.field_a, 0);
        ((vd) this).field_D.a((byte) 58, bb.field_a, 1);
        ((vd) this).field_D.field_l = (tg) this;
        ((vd) this).field_D.a(var3, (byte) -44, ((vd) this).field_x + -90, 46);
        var3 = var3 + (15 + ((vd) this).field_D.field_u);
        ((vd) this).a(false, (al) (Object) ((vd) this).field_D);
        int var6 = 4;
        int var7 = 200;
        ((vd) this).field_C.a(40, -3050, var3, var7, -var7 + 496 >> -806725215);
        ((vd) this).field_H.a(40, -3050, 15 + var3, 60, 3 + var6);
        ((vd) this).field_H.field_l = (tg) this;
        ((vd) this).field_C.field_l = (tg) this;
        ((vd) this).a(false, (al) (Object) ((vd) this).field_C);
        ((vd) this).a(false, (al) (Object) ((vd) this).field_H);
        ((vd) this).field_N = new nd((a) this);
        ((vd) this).field_N.a(150, -3050, 20 + ((vd) this).field_F.field_m, -60 + (-((vd) this).field_F.field_p + ((vd) this).field_x + -((vd) this).field_F.field_x), ((vd) this).field_F.field_x + (((vd) this).field_F.field_p - -60));
        ((vd) this).a(false, (al) (Object) ((vd) this).field_N);
        ((vd) this).a(var6 + (var3 + 55), -3050, 0, 496, 0);
    }

    final static void b(int param0, int param1, int param2) {
        if (uh.field_b[param1] == null) {
            uh.field_b[param1] = bh.a(va.field_d[param1], 100, nd.field_G[param1]);
        }
        if (!uh.field_b[param1].b(10000536)) {
            uh.field_b[param1].e(0);
            uh.field_b[param1].f(param0);
            li discarded$0 = bd.a(-31085, uh.field_b[param1]);
        }
        if (param2 != 23636) {
            vd.b(-95, 71, -86);
        }
    }

    public final void a(byte param0) {
        ((af) (Object) ((vd) this).field_F.a((byte) -123)).a(false);
        if (param0 < 117) {
            Object var3 = null;
            int discarded$0 = this.a(-92, (String) null, -91, 17, (String) null, (al) null);
        }
    }

    private final int a(String param0, int param1, String param2, al param3, int param4, int param5, int param6) {
        sa var10 = new sa(20, param6, param4 + 120, 25, param3, false, 120, 3, gk.field_c, 16777215, param2);
        ((vd) this).a(false, (al) (Object) var10);
        mi var9 = new mi(((wk) (Object) param3).a((byte) -124), param0, 126, var10.field_u + param6, param4 - -50, param1);
        var9.field_l = (tg) this;
        if (param5 != -1) {
            boolean discarded$0 = this.l(-5);
        }
        ((vd) this).a(false, (al) (Object) var9);
        return var10.field_u - -var9.field_u;
    }

    private final boolean a(wk param0, byte param1) {
        if (param1 != 73) {
            Object var5 = null;
            boolean discarded$0 = this.a((wk) null, (byte) 109);
        }
        eh var3 = param0.a((byte) -84);
        if (var3 == null) {
            return true;
        }
        ud var4 = var3.a((byte) 106);
        if (var4 == ef.field_b) {
            return false;
        }
        if (!(lh.field_x != var4)) {
            return false;
        }
        if (var4 != c.field_a) {
            return true;
        }
        return false;
    }

    private final int a(int param0, String param1, int param2, int param3, al param4) {
        if (param2 != 5) {
            Object var7 = null;
            int discarded$0 = this.a((String) null, -19, (String) null, (al) null, 97, 110, -67);
        }
        sa var6 = new sa(20, param3, param0 + 120, 25, param4, false, 120, 3, gk.field_c, 16777215, param1);
        ((vd) this).a(false, (al) (Object) var6);
        return var6.field_u;
    }

    private final String m(int param0) {
        if (param0 != -9700) {
            Object var3 = null;
            ((vd) this).a((rh) null, -78, 87, -1, -54);
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void b(boolean param0) {
        if (param0) {
            field_K = -56;
        }
        field_G = null;
    }

    final static void k(int param0) {
        int var2 = TrackController.field_F ? 1 : 0;
        if (!(pb.a((byte) -88))) {
            if (null != og.field_rb) {
                if (!(!og.field_rb.field_b)) {
                    oj.a(-93);
                    mg.field_b.d((byte) -84, (al) (Object) new w(mg.field_b, te.field_b));
                }
            }
            return;
        }
        boolean discarded$8 = mg.field_b.a(w.field_T, true, false, bl.field_b);
        mg.field_b.b(true);
        while (mh.e(127)) {
            boolean discarded$9 = mg.field_b.a(md.field_d, 3931, kg.field_d);
        }
        if (param0 < 87) {
            field_K = -76;
        }
    }

    private final boolean j(int param0) {
        if (param0 != -21109) {
            return true;
        }
        if (this.a((wk) (Object) ((vd) this).field_F, (byte) 73)) {
            if (this.a((wk) (Object) ((vd) this).field_M, (byte) 73)) {
                if (this.a((wk) (Object) ((vd) this).field_I, (byte) 73)) {
                    if (this.a((wk) (Object) ((vd) this).field_J, (byte) 73)) {
                        if (this.a((wk) (Object) ((vd) this).field_E, (byte) 73)) {
                            if (this.a((wk) (Object) ((vd) this).field_L, (byte) 73)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        if (!(!super.a((byte) -99, param1, param2, param3))) {
            return true;
        }
        if ((param3 ^ -1) == -99) {
            return ((vd) this).a(param2, -49);
        }
        int var5 = -1 % ((17 - param0) / 51);
        if ((param3 ^ -1) == -100) {
            return ((vd) this).a(param2, true);
        }
        return false;
    }

    private final int a(byte param0, int param1, al param2, int param3, String param4) {
        sa var9 = new sa(20, param3, param1 + 120, 25, param2, false, 120, 3, gk.field_c, 16777215, param4);
        ((vd) this).a(false, (al) (Object) var9);
        int var8 = 121 % ((param0 - -14) / 57);
        ua var7 = new ua(((wk) (Object) param2).a((byte) -70));
        ((vd) this).a(false, (al) (Object) var7);
        var7.a(15, -3050, (var9.field_u + -15 >> 2043275905) + var9.field_m, 15, var9.field_x + var9.field_p - -3);
        return var9.field_u;
    }

    public final void a(el param0, int param1, int param2, int param3) {
        int var6 = 0;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          if (param3 == 1) {
            break L0;
          } else {
            ((vd) this).field_O = null;
            break L0;
          }
        }
        L1: {
          if (-1 == (param1 ^ -1)) {
            ue.a("terms.ws", false);
            break L1;
          } else {
            if (param1 != 1) {
              if (2 == param1) {
                ue.a("conduct.ws", false);
                break L1;
              } else {
                break L1;
              }
            } else {
              ue.a("privacy.ws", false);
              break L1;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, al param3) {
        super.a(param0, param1, param2, param3);
        ((vd) this).field_C.field_B = this.j(-21109);
    }

    private final int a(int param0, String param1, int param2, int param3, String param4, al param5) {
        if (param2 < 122) {
            return 14;
        }
        return this.a(param4, 35, param1, param5, param3, -1, param0);
    }

    final static void a(be param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var5 = TrackController.field_F ? 1 : 0;
              var6 = new byte[24];
              var2 = var6;
              if (null != pl.field_b) {
                try {
                  L1: {
                    pl.field_b.a(0L, true);
                    pl.field_b.a(-116, var6);
                    var3_int = 0;
                    L2: while (true) {
                      L3: {
                        if (24 <= var3_int) {
                          break L3;
                        } else {
                          if (0 == var2[var3_int]) {
                            var3_int++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (-25 < (var3_int ^ -1)) {
                        break L1;
                      } else {
                        throw new IOException();
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    var4 = 0;
                    L5: while (true) {
                      if (var4 >= 24) {
                        break L4;
                      } else {
                        var2[var4] = (byte)-1;
                        var4++;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                break L0;
              }
            }
            L6: {
              if (param1 == -69) {
                break L6;
              } else {
                field_K = -119;
                break L6;
              }
            }
            param0.a(24, 109, 0, var2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(boolean param0, String param1) {
        lf var3 = ((vd) this).field_F;
        String var4 = param1;
        ((lb) (Object) var3).a(false, var4, 126);
        if (!param0) {
            Object var5 = null;
            int discarded$0 = this.a(33, (String) null, 34, -109, (al) null);
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        if (param0 == ((vd) this).field_H) {
            hl.m(-1217366687);
        } else {
            if (param0 == ((vd) this).field_C) {
                boolean discarded$0 = this.l(-27163);
            }
        }
        if (param4 != -27322) {
            ((vd) this).field_E = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = -1;
    }
}
