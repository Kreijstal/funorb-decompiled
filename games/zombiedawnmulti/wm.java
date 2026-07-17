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

    public static void h() {
        field_P = null;
        field_S = null;
        field_Q = null;
        field_T = null;
        field_V = null;
        field_U = null;
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

    final static ul a(int param0, int param1, boolean param2, boolean param3, int param4) {
        try {
            int var6_int = 0;
            IOException var6 = null;
            Object var7 = null;
            Object var8 = null;
            cn var9 = null;
            ul stackIn_10_0 = null;
            Throwable decompiledCaughtException = null;
            ul stackOut_9_0 = null;
            try {
              L0: {
                L1: {
                  var6_int = 122 % ((-63 - param4) / 63);
                  var7 = null;
                  if (p.field_a.field_i == null) {
                    break L1;
                  } else {
                    hc.field_b = new of(p.field_a.field_i, 5200, 0);
                    p.field_a.field_i = null;
                    var7 = (Object) (Object) new bq(255, hc.field_b, new of(p.field_a.field_k, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  var8 = null;
                  if (hc.field_b == null) {
                    break L2;
                  } else {
                    L3: {
                      if (rl.field_r == null) {
                        rl.field_r = new of[p.field_a.field_t.length];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (rl.field_r[param0] != null) {
                        break L4;
                      } else {
                        rl.field_r[param0] = new of(p.field_a.field_t[param0], 12000, 0);
                        p.field_a.field_t[param0] = null;
                        break L4;
                      }
                    }
                    var8 = (Object) (Object) new bq(param0, hc.field_b, rl.field_r[param0], 2097152);
                    break L2;
                  }
                }
                var9 = tj.field_a.a(param0, (bq) var7, -15893, (bq) var8, false);
                stackOut_9_0 = new ul((ng) (Object) var9, true, 1);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var6.toString());
            }
            return stackIn_10_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int f(int param0) {
        if (param0 != 1) {
            int discarded$0 = wm.f(-92);
            return 1;
        }
        return 1;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            ra.a(param1, -89, "");
            em.a(false, param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "wm.G(" + -1 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private wm() throws Throwable {
        throw new Error();
    }

    final int a(int param0, boolean param1) {
        if (param0 >= 0) {
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
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              L1: {
                var8_int = -param5 + param1 + -((wm) this).field_M;
                var9 = ((wm) this).field_n - ((wm) this).field_M * 2;
                if (var8_int > var9) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var8_int >= 0) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * ((wm) this).field_O / var9;
                if (param2 == 1) {
                  ((wm) this).field_R.b((byte) -7, var8_int);
                  break L3;
                } else {
                  if (param2 != 2) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (((wm) this).field_R.b(1) <= var12) {
                        if (var11 >= 0) {
                          ((wm) this).field_R.a(-102, var11);
                          break L3;
                        } else {
                          return true;
                        }
                      } else {
                        L5: {
                          var13 = ((wm) this).field_R.a((byte) 105, var12) + -var8_int;
                          var13 = var13 * var13;
                          if (var13 >= var10) {
                            var12++;
                            break L5;
                          } else {
                            var10 = var13;
                            var11 = var12;
                            var12++;
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
              stackOut_21_0 = 1;
              stackIn_22_0 = stackOut_21_0;
              return stackIn_22_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var8;
            stackOut_25_1 = new StringBuilder().append("wm.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_24_0 != 0;
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
