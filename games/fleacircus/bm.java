/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends gj implements da {
    private bb[] field_F;
    private bd field_L;
    private String field_H;
    static int field_K;
    static String field_N;
    private fa field_G;
    static int field_M;
    private int[] field_I;
    private int field_J;

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 248) {
              var6_int = 0;
              L1: while (true) {
                L2: {
                  if (var6_int >= ((bm) this).field_J) {
                    break L2;
                  } else {
                    if (((bm) this).field_F[var6_int] != param4) {
                      var6_int++;
                      continue L1;
                    } else {
                      var7 = ((bm) this).field_I[var6_int];
                      if (var7 != -1) {
                        cg.a((byte) -105, ((bm) this).field_I[var6_int]);
                        break L2;
                      } else {
                        ((bm) this).field_L.n(-22645);
                        break L2;
                      }
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("bm.JA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        if (((bm) this).field_J >= param1) {
            return;
        }
        bb[] var7 = new bb[param1];
        bb[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = param0; ((bm) this).field_J > var5; var5++) {
            var7[var5] = ((bm) this).field_F[var5];
            var4[var5] = ((bm) this).field_I[var5];
        }
        ((bm) this).field_F = var3;
        ((bm) this).field_I = var4;
        ((bm) this).field_J = param1;
    }

    public static void c(boolean param0) {
        if (param0) {
            field_N = null;
        }
        field_N = null;
    }

    final bb a(kd param0, boolean param1, String param2) {
        bb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        bb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        bb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new bb(param2, param0);
              var4.field_p = (ch) (Object) new ri();
              if (param1) {
                break L1;
              } else {
                ((bm) this).field_G = null;
                break L1;
              }
            }
            var5 = ((bm) this).field_j - 2;
            ((bm) this).a(0, ((bm) this).field_u, 0, ((bm) this).field_j + 34, 80);
            var4.a(7, ((bm) this).field_u - 14, var5, 30, 80);
            ((bm) this).a((qa) (Object) var4, (byte) -32);
            stackOut_2_0 = (bb) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("bm.GA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final static ll a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = fleas.field_A ? 1 : 0;
        ll var5 = (ll) (Object) jj.field_S.c((byte) 47);
        while (var5 != null) {
            if (!(var5.field_k != 40)) {
                return var5;
            }
            var5 = (ll) (Object) jj.field_S.b((byte) -105);
        }
        var5 = new ll();
        var5.field_k = 40;
        var5.field_t = param2;
        var5.field_q = param3;
        jj.field_S.a(param0, (lh) (Object) var5);
        ak.a(-14722, var5, param1);
        return var5;
    }

    final static int f(byte param0) {
        if (param0 <= 8) {
            bm.c(true);
        }
        return (int)(1000000000L / na.field_f);
    }

    final static void e(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= qi.field_f) {
                break L0;
              } else {
                L2: {
                  var3 = rk.field_u[var1_int];
                  var4 = kk.field_a[var1_int];
                  var2 = -1 + var3;
                  var8 = 16 * var4 + 16;
                  var7 = 16 * var3 + 20;
                  var6 = var4 * 16;
                  if (fl.field_c[var3][var4] == 14) {
                    break L2;
                  } else {
                    if (fl.field_c[var3][var4] != 28) {
                      me.field_i[var1_int] = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = var3 * 16;
                L3: while (true) {
                  if (!qg.a(fl.field_c[var2][var4], -48)) {
                    var2 = var3 - -1;
                    L4: while (true) {
                      if (!qg.a(fl.field_c[var2][var4], -117)) {
                        oa.field_m[var1_int] = var5;
                        uh.field_n[var1_int] = var6;
                        lc.field_v[var1_int] = var7;
                        ca.field_G[var1_int] = var8;
                        var1_int++;
                        continue L1;
                      } else {
                        var2++;
                        var7 += 16;
                        continue L4;
                      }
                    }
                  } else {
                    var5 -= 16;
                    var2--;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "bm.EA(" + 31 + 41);
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = ((bm) this).field_J;
            this.a(param1 ^ param1, 1 + var4_int);
            ((bm) this).field_F[var4_int] = ((bm) this).a((kd) this, true, param0);
            ((bm) this).field_I[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "bm.FA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    bm(bd param0, fa param1, String param2) {
        super(0, 0, 288, 0, (ch) null);
        int var4_int = 0;
        ((bm) this).field_J = 0;
        try {
            ((bm) this).field_G = param1;
            ((bm) this).field_H = param2;
            ((bm) this).field_L = param0;
            var4_int = null == ((bm) this).field_H ? 0 : ((bm) this).field_G.b(((bm) this).field_H, 260, ((bm) this).field_G.field_H);
            ((bm) this).a(0, 288, 0, var4_int + 22, 80);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "bm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        super.b(param0, param1, param2, param3);
        int discarded$0 = ((bm) this).field_G.a(((bm) this).field_H, 14 + param1 + ((bm) this).field_y, param0 + (((bm) this).field_z + 10), -28 + ((bm) this).field_u, ((bm) this).field_j, 16777215, -1, 0, 0, ((bm) this).field_G.field_H);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "To server list";
    }
}
