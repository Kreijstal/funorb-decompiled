/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wm extends gn {
    private la field_R;
    static ul field_V;
    static String field_U;
    static String field_P;
    private int field_O;
    static int[] field_Q;
    static String field_S;
    int field_N;
    int field_M;
    static String field_T;

    public static void h(byte param0) {
        field_P = null;
        field_S = null;
        field_Q = null;
        if (param0 < 5) {
          field_T = null;
          field_T = null;
          field_V = null;
          field_U = null;
          return;
        } else {
          field_T = null;
          field_V = null;
          field_U = null;
          return;
        }
    }

    final int a(byte param0) {
        int var2 = 111 / ((param0 - -8) / 48);
        return ((wm) this).field_R.b(1);
    }

    final static ao[] b(boolean param0) {
        if (!param0) {
            ao[] discarded$0 = wm.b(false);
            return new ao[]{hd.field_r, sf.field_d, so.field_o, km.field_W, mk.field_g, ae.field_h, bq.field_i, ka.field_b, mo.field_Lb, ha.field_i, cn.field_j, hd.field_w, oa.field_a, eb.field_w};
        }
        return new ao[]{hd.field_r, sf.field_d, so.field_o, km.field_W, mk.field_g, ae.field_h, bq.field_i, ka.field_b, mo.field_Lb, ha.field_i, cn.field_j, hd.field_w, oa.field_a, eb.field_w};
    }

    final int g(byte param0) {
        if (param0 != -106) {
            return -4;
        }
        return ((wm) this).field_O;
    }

    final static ul a(int param0, int param1, boolean param2, boolean param3, int param4, boolean param5) {
        try {
            int var6_int = 0;
            IOException var6 = null;
            bq var7 = null;
            bq var8 = null;
            cn var9 = null;
            ul stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            ul stackOut_11_0 = null;
            try {
              L0: {
                var6_int = 122 % ((-63 - param4) / 63);
                var7 = null;
                if (p.field_a.field_i == null) {
                  break L0;
                } else {
                  hc.field_b = new of(p.field_a.field_i, 5200, 0);
                  p.field_a.field_i = null;
                  var7 = new bq(255, hc.field_b, new of(p.field_a.field_k, 12000, 0), 2097152);
                  break L0;
                }
              }
              L1: {
                var8 = null;
                if (hc.field_b == null) {
                  break L1;
                } else {
                  L2: {
                    if (rl.field_r == null) {
                      rl.field_r = new of[p.field_a.field_t.length];
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (rl.field_r[param0] != null) {
                      break L3;
                    } else {
                      rl.field_r[param0] = new of(p.field_a.field_t[param0], 12000, 0);
                      p.field_a.field_t[param0] = null;
                      break L3;
                    }
                  }
                  var8 = new bq(param0, hc.field_b, rl.field_r[param0], 2097152);
                  break L1;
                }
              }
              L4: {
                var9 = tj.field_a.a(param0, var7, -15893, var8, param3);
                if (!param5) {
                  break L4;
                } else {
                  var9.a(false);
                  break L4;
                }
              }
              stackOut_11_0 = new ul((ng) (Object) var9, param2, param1);
              stackIn_12_0 = stackOut_11_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_12_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final static int f(int param0) {
        if (param0 != 1) {
            int discarded$0 = wm.f(-92);
            return 1;
        }
        return 1;
    }

    final static void a(int param0, java.applet.Applet param1) {
        if (param0 != -1) {
          ul discarded$2 = wm.a(0, -46, true, false, 5, false);
          ra.a(param1, -89, "");
          em.a(false, param1);
          return;
        } else {
          ra.a(param1, -89, "");
          em.a(false, param1);
          return;
        }
    }

    private wm() throws Throwable {
        throw new Error();
    }

    final int a(int param0, boolean param1) {
        if (-1 >= (param0 ^ -1)) {
          if (param0 < ((wm) this).field_R.b(1)) {
            if (param1) {
              ((wm) this).field_M = -39;
              return ((wm) this).field_R.a((byte) 105, param0);
            } else {
              return ((wm) this).field_R.a((byte) 105, param0);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -param5 + param1 + -((wm) this).field_M;
            var9 = ((wm) this).field_n - ((wm) this).field_M * 2;
            if (var8 > var9) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var8 >= 0) {
              break L1;
            } else {
              var8 = 0;
              break L1;
            }
          }
          var8 = var8 * ((wm) this).field_O / var9;
          if (param2 != 1) {
            if (param2 == 2) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((wm) this).field_R.b(1) <= var12) {
                  if ((var11 ^ -1) > -1) {
                    return true;
                  } else {
                    ((wm) this).field_R.a(-102, var11);
                    return true;
                  }
                } else {
                  var13 = ((wm) this).field_R.a((byte) 105, var12) + -var8;
                  var13 = var13 * var13;
                  if (var13 < var10) {
                    var10 = var13;
                    var11 = var12;
                    var12++;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((wm) this).field_R.b((byte) -7, var8);
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Select any zombie!";
        field_P = "Keep them away from the other portals.";
        field_S = "To Customer Support";
        field_Q = new int[10];
        field_T = "Invalid date";
    }
}
