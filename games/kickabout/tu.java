/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class tu extends ma implements hc {
    static String field_D;
    static gr field_E;
    static String field_C;

    final void a(int param0, pk param1) {
        try {
          try {
            ma.field_t = param1;
            this.a(true, -1);
            this.h((byte) 105);
            this.l(-1);
            if (param0 < 97) {
              this.a(108, false);
            }
            this.m(10);
            this.g(13);
            this.e(6);
            this.i(13);
            uc.field_A[10] = -1;
            uc.field_A[9] = -1;
            sn.field_g = new Vector();
            oa.a(false, (hc) (this));
          } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "tu.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0, int param1, int param2) {
        if (param0 != 15848) {
          tu.n((byte) 32);
        }
        ml var3 = or.field_d;
        var3.b(param1, (byte) -117);
        var3.a(param0 - 15721, 3);
        var3.a(109, 10);
        var3.g(-1207444472, param2);
    }

    private final void r(int param0) {
        if (param0 != 10) {
          field_E = (gr) null;
        }
    }

    public final boolean a(byte param0) {
        if (param0 < 63) {
          tu.n((byte) -47);
        }
        return true;
    }

    abstract void o(int param0);

    final void e(byte param0) {
        int stackIn_6_1 = 0;
        boolean stackIn_7_2 = false;
        int var2;
        int var3;
        int var4;
        ii var5;
        var4 = Kickabout.field_G;
        if (e.field_m != null &&
          e.field_m.field_b) {
          fd.h(0);
          ph.a((byte) -122);
        }
        stackIn_6_1 = 0;
        stackIn_7_2 = (e.field_m != null);
        this.c(stackIn_6_1, stackIn_7_2);
        if (nd.field_c) {
          ma.field_t.a(7312);
          nd.field_c = false;
        }
        if (uf.c(608)) {
          this.n(-93);
          if (uf.c(608)) {
            return;
          }
        }
        this.s(-113);
        if (!iu.field_h) {
          iu.a(17, id.field_v);
          if (ma.field_t.a(true)) {
            ma.field_t.b(12763);
            iu.field_h = true;
          }
        } else {
          if (!rg.field_b) {
            if (!la.a(100)) {
              if (ma.field_t.c(-27598)) {
                rg.field_b = true;
                this.o(55);
                nt.c(false);
              }
            } else {
              this.p(18861);
            }
          } else {
            this.p(18861);
          }
        }
        if (!la.a(100)) {
          while (true) {
            var5 = (ii) (ve.field_R.b((byte) 127));
            if (var5 == null) {
              break;
            }
            wp.a(4, var5, 77);
          }
        }
        if (param0 > -25) {
          this.a(120);
        }
        gw.b(5);
        vg.c(0, 0);
        if (hq.a((byte) 10)) {
          var2 = this.i((byte) -65);
          if (var2 == 0 ||
            var2 == 1) {
            this.a(var2, (byte) 120);
          }
          var3 = 0;
          if (var2 == 2) {
            var3 = 1;
          }
          if (this.m((byte) -120)) {
            var3 = 1;
          }
          if (!hq.a((byte) 10)) {
            var3 = 0;
          }
          if (var3 != 0) {
            ws.a((byte) -113);
          }
        }
    }

    public abstract void a(int param0, boolean param1);

    abstract boolean m(byte param0);

    private final void p(int param0) {
        int stackIn_28_1 = 0;
        boolean stackIn_29_2 = false;
        int stackIn_54_0 = 0;
        int stackIn_55_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        hc var6;
        int var3Lifetime1;
        var5 = Kickabout.field_G;
        var2 = 0;
        if (!n.a(false)) {
          if (ng.a(-4)) {
            if (nv.i(0)) {
              np.h(-1);
            } else {
              var3 = pg.a(-3);
              if (var3 != 2) {
                if (3 != var3) {
                  if (var3 == 4) {
                    ql.a((byte) 50, false, hh.field_b);
                    dq.field_e = true;
                  }
                } else {
                  dw.a(true, 0);
                }
              } else {
                fd.h(0);
              }
              this.a(param0 - 18886, false);
            }
          } else {
            if (up.a((byte) -3)) {
              stackIn_28_1 = param0 - 18856;
              stackIn_29_2 = (null != e.field_m);
              var3 = this.b(stackIn_28_1, stackIn_29_2);
              if (var3 != 1 &&
                var3 != 2) {
                this.a(param0 ^ -18870, false);
              } else {
                if (null != e.field_m) {
                  fd.h(0);
                }
                if (var3 != 2) {
                  this.a(param0 ^ -18870, false);
                } else {
                  js.a(param0 + 1477, so.a(-79));
                  this.a(param0 ^ -18870, false);
                }
              }
            } else {
              if (vi.c(2915)) {
                if (!nv.i(0)) {
                  var3 = df.g(-61);
                  if (var3 == 1) {
                    ql.a((byte) 50, true, dg.field_f);
                  }
                  this.a(-25, false);
                } else {
                  np.h(-1);
                }
              } else {
                if (!nv.i(0)) {
                  var2 = 1;
                  var3 = -1;
                  while (nk.$cfr$intArgs$b$c4997cb15529(-59)) {
                    if (-1 == cc.field_e) {
                      if (cc.field_e == -1 &&
                        -1 != var3) {
                        cc.field_e = var3;
                        var3 = -1;
                      }
                    } else {
                      if (ud.c(cc.field_e, param0 - 1831)) {
                        var3 = cc.field_e;
                        continue;
                      }
                    }
                    var4 = 0;
                    while (sn.field_g.size() > var4) {
                      if (((hc) (sn.field_g.elementAt(var4))).a(param0 - 7345, cc.field_e, il.field_c)) {
                        break;
                      }
                      var4++;
                    }
                  }
                } else {
                  np.h(param0 - 18862);
                }
              }
            }
          }
        } else {
          this.a(-25, false);
        }
        var3Lifetime1 = 0;
        if (param0 != 18861) {
          field_C = (String) null;
        }
        while (var3Lifetime1 < sn.field_g.size()) {
          var6 = (hc) (sn.field_g.elementAt(var3Lifetime1));
          var6.a(param0 - 18886, var2 != 0);
          stackIn_54_0 = var2;
          if (var6.a((byte) 81)) {
            stackIn_55_1 = 0;
          } else {
            stackIn_55_1 = 1;
          }
          var2 = stackIn_54_0 & stackIn_55_1;
          var3Lifetime1++;
        }
    }

    protected tu() {
    }

    abstract void a(int param0, byte param1);

    final void b(byte param0) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        java.awt.Canvas var2 = ln.l(64);
        if (uf.c(608)) {
          va.a(var2, pn.g(2368), 0);
          return;
        }
        if (!iu.field_h) {
          wr.a(var2, -14142);
          return;
        }
        if (!rg.field_b &&
          !la.a(100)) {
          ju.a(100.0f, hm.field_H, (byte) 30);
          wr.a(var2, -14142);
          return;
        }
        vg.field_Rb = true;
        for (var3 = -1 + sn.field_g.size(); var3 >= 0; var3--) {
          ((hc) (sn.field_g.elementAt(var3))).a(109);
        }
        if (param0 < 50) {
          this.a(34, 72, 'ￆ');
        }
        if (!vg.field_Rb) {
          this.r(10);
        } else {
          md.d(-27302);
          su.a(27744, 0, 0, var2);
        }
    }

    abstract boolean a(int param0, ml param1, int param2);

    final static void n(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Kickabout.field_G;
        try {
          wk.field_d = new ut[ig.field_a.length];
          gb.field_G = new ut[ig.field_a.length];
          if (param0 != -10) {
            return;
          }
          for (var1_int = 0; ig.field_a.length > var1_int; var1_int++) {
            wk.field_d[var1_int] = nm.a(16729156, ek.b((int) param0, 85), ig.field_a[var1_int]);
            gb.field_G[var1_int] = nm.a(4521796, -92, ig.field_a[var1_int]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "tu.D(" + param0 + ')');
        }
    }

    public abstract boolean a(int param0, int param1, char param2);

    final static int a(int param0, int param1, int param2) {
        if (param2 != -23146) {
          return 89;
        }
        param0 = param0 >> 8;
        param1 = param1 >> 8;
        return pc.a(param1 * param1 + param0 * param0, -524289);
    }

    public static void q(int param0) {
        field_D = null;
        field_C = null;
        if (param0 != 30907) {
          return;
        }
        field_E = null;
    }

    public abstract void a(int param0);

    private final void s(int param0) {
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        while (dr.a(-125, uc.field_A)) {
          if (this.a(so.field_b, un.field_e, 1)) {
            continue;
          }
          this.j(95);
        }
        var2 = 80 / ((param0 + 28) / 48);
    }

    static {
        field_D = "Max Price";
        field_C = "street";
    }
}
