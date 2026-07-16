/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i extends pn implements hh {
    static jp field_W;
    static String field_U;
    static vn field_T;
    static float field_V;
    static boolean[] field_X;
    private an field_Z;
    static boolean field_Y;

    private final void b(boolean param0) {
        if (!((i) this).field_H) {
            return;
        }
        if (!param0) {
            field_T = null;
            ((i) this).field_H = false;
            return;
        }
        ((i) this).field_H = false;
    }

    final static void a(bo param0, byte param1, int param2) {
        mp.field_g.a(0, (le) (Object) param0);
        ag.a(param2, true, param0);
        if (param1 != 7) {
            field_V = -1.3851797580718994f;
        }
    }

    private final an a(byte param0, sk param1, String param2) {
        an var4 = null;
        int var5 = 0;
        var4 = new an(param2, param1);
        var4.field_h = (io) (Object) new vm();
        if (param0 != 53) {
          return null;
        } else {
          var5 = -6 + ((i) this).field_n;
          ((i) this).field_n = ((i) this).field_n + 38;
          var4.a(param0 ^ -109, var5, 15, ((i) this).field_i + -14 - 16, 30);
          ((i) this).a((ga) (Object) var4, 10);
          ((i) this).a(true);
          return var4;
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        if (!(((i) this).field_Z != param2)) {
            this.b(true);
        }
        if (param1 != -6) {
            field_X = null;
            return;
        }
    }

    i(dn param0, sm param1) {
        super(param0, 200, 150);
        Object var3 = null;
        String var5 = null;
        ga var6 = null;
        String var7 = null;
        ga var8 = null;
        String var9 = null;
        ga var10 = null;
        ga var11 = null;
        var3 = null;
        if (param1 != kb.field_f) {
          if (gf.field_b != param1) {
            L0: {
              if (rc.field_h != param1) {
                break L0;
              } else {
                var3 = (Object) (Object) hc.field_c;
                ((i) this).field_n = ((i) this).field_n + 30;
                break L0;
              }
            }
            var11 = new ga((String) var3, (sk) null);
            var11.field_k = 0;
            var11.field_i = ((i) this).field_i;
            var11.field_n = 80;
            var11.field_j = 50;
            var11.field_h = (io) (Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((i) this).a(var11, 10);
            ((i) this).field_Z = this.a((byte) 53, (sk) this, re.field_c);
            return;
          } else {
            var7 = d.field_a;
            var3 = (Object) (Object) var7;
            var3 = (Object) (Object) var7;
            ((i) this).field_n = ((i) this).field_n + 10;
            if (lm.f((byte) 126)) {
              ((i) this).field_n = ((i) this).field_n + 20;
              var9 = il.field_a;
              var3 = (Object) (Object) var9;
              var3 = (Object) (Object) var9;
              var10 = new ga(var9, (sk) null);
              var10.field_k = 0;
              var10.field_i = ((i) this).field_i;
              var10.field_n = 80;
              var10.field_j = 50;
              var10.field_h = (io) (Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((i) this).a(var10, 10);
              ((i) this).field_Z = this.a((byte) 53, (sk) this, re.field_c);
              return;
            } else {
              var8 = new ga(var7, (sk) null);
              var8.field_k = 0;
              var8.field_i = ((i) this).field_i;
              var8.field_n = 80;
              var8.field_j = 50;
              var8.field_h = (io) (Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((i) this).a(var8, 10);
              ((i) this).field_Z = this.a((byte) 53, (sk) this, re.field_c);
              return;
            }
          }
        } else {
          var5 = lo.field_n;
          var6 = new ga(var5, (sk) null);
          var6.field_k = 0;
          var6.field_i = ((i) this).field_i;
          var6.field_n = 80;
          var6.field_j = 50;
          var6.field_h = (io) (Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((i) this).a(var6, 10);
          ((i) this).field_Z = this.a((byte) 53, (sk) this, re.field_c);
          return;
        }
    }

    final static boolean a(boolean param0, boolean param1) {
        try {
            IOException var2 = null;
            am var4 = null;
            am var5 = null;
            int stackIn_12_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_10_0 = 0;
            L0: {
              if (ao.field_F != null) {
                break L0;
              } else {
                ao.field_F = jm.field_B.a(2, tm.field_o, ci.field_c);
                break L0;
              }
            }
            if (ao.field_F.field_f == 0) {
              return false;
            } else {
              L1: {
                long dupTemp$2 = pd.a(-22826);
                hm.field_N = dupTemp$2;
                pi.field_i = dupTemp$2;
                if (param1) {
                  break L1;
                } else {
                  field_X = null;
                  break L1;
                }
              }
              if (1 == ao.field_F.field_f) {
                try {
                  L2: {
                    L3: {
                      sn.field_c = new gm((java.net.Socket) ao.field_F.field_d, jm.field_B);
                      var4 = fj.field_g;
                      var5 = var4;
                      dp.field_e.field_j = 0;
                      if (!param0) {
                        stackOut_11_0 = -1;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = -2;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    em.field_U = stackIn_12_0;
                    wb.field_t = stackIn_12_0;
                    e.field_P = stackIn_12_0;
                    ic.field_T = ui.field_g;
                    var5.field_j = 0;
                    uj.a(le.field_g, ba.field_b, (byte) -114, (de) (Object) dp.field_e, kg.field_k);
                    vl.a((byte) -46, -1);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ic.field_T = jc.field_l;
                  ao.field_F = null;
                  return true;
                }
                ao.field_F = null;
                return true;
              } else {
                ic.field_T = jc.field_l;
                ao.field_F = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void m(int param0) {
        if (param0 != 10) {
          i.m(34);
          field_X = null;
          field_W = null;
          field_U = null;
          field_T = null;
          return;
        } else {
          field_X = null;
          field_W = null;
          field_U = null;
          field_T = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, byte param2, wj param3) {
        Object var4 = null;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null != nc.field_p) {
            pj.a(param3, (byte) 113, param0, 1048576, param1);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 <= -110) {
            break L1;
          } else {
            i.m(11);
            break L1;
          }
        }
        if (uh.field_o == null) {
          return;
        } else {
          var4 = (Object) (Object) sh.field_d;
          synchronized (var4) {
            L2: {
              uh.field_o.a(param0, true, -1);
              if (te.field_kb != param3) {
                L3: {
                  uh.field_o.c(28013);
                  sh.field_d.d();
                  te.field_kb = param3;
                  if (te.field_kb == null) {
                    break L3;
                  } else {
                    uh.field_o.a((byte) -22, te.field_kb, param1);
                    break L3;
                  }
                }
                break L2;
              } else {
                return;
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = null;
        field_X = new boolean[64];
        field_W = new jp(1);
        field_Y = true;
    }
}
