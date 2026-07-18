/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends ng {
    int field_S;
    int field_P;
    int field_V;
    static int field_X;
    static String field_T;
    static String field_R;
    static int field_Y;
    int field_O;
    int field_Q;
    int field_W;
    static int field_U;

    final static void a(ej param0, int param1, boolean param2, int param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        Object var6 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (la.field_d != null) {
                ac.a(false, param3, param0, param2, 1048576);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (la.field_a != null) {
                var4 = (Object) (Object) bh.field_o;
                synchronized (var4) {
                  L3: {
                    la.field_a.a(param1 + 298, param3, -1);
                    if (tg.field_t == param0) {
                      return;
                    } else {
                      L4: {
                        la.field_a.b((byte) 31);
                        bh.field_o.g();
                        tg.field_t = param0;
                        if (tg.field_t != null) {
                          la.field_a.a(-8126, tg.field_t, param2);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      break L3;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            L5: {
              if (param1 == -3560) {
                break L5;
              } else {
                var6 = null;
                uc.a((ej) null, 88, true, 73);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4_ref;
            stackOut_20_1 = new StringBuilder().append("uc.C(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_R = null;
        field_T = null;
    }

    final static ja[] a(int param0, uj param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        ja[] var4 = null;
        int var5 = 0;
        ja var6 = null;
        int var7 = 0;
        mi var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        ja[] stackIn_3_0 = null;
        ja[] stackIn_10_0 = null;
        ja[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja[] stackOut_9_0 = null;
        ja[] stackOut_14_0 = null;
        ja[] stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param1.a((byte) -81)) {
              var8 = param1.a(5);
              L1: while (true) {
                if (var8.field_d != 0) {
                  if (2 == var8.field_d) {
                    stackOut_9_0 = new ja[]{};
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var12 = (int[]) var8.field_g;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new ja[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_14_0 = (ja[]) var4;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        var6 = new ja();
                        var4[var5] = var6;
                        var6.field_h = var3[var5 << 2];
                        var6.field_d = var3[1 + (var5 << 2)];
                        var6.field_i = var3[(var5 << 2) + 2];
                        var6.field_c = var3[(var5 << 2) + 3];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  c.a(46, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new ja[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("uc.D(").append(-76).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              L1: {
                var8_int = -param4 - (((uc) this).field_m - -((uc) this).field_S - param1);
                var9 = -((uc) this).field_W + -param3 + (-((uc) this).field_i + param0);
                if (var8_int * var8_int + var9 * var9 >= ((uc) this).field_V * ((uc) this).field_V) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - gb.field_a;
                    if (0.0 > var10) {
                      var10 = var10 - 3.141592653589793 / (double)((uc) this).field_Q;
                      break L2;
                    } else {
                      if (var10 <= 0.0) {
                        break L2;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)((uc) this).field_Q;
                        break L2;
                      }
                    }
                  }
                  ((uc) this).field_P = (int)(var10 * (double)((uc) this).field_Q / 6.283185307179586);
                  L3: while (true) {
                    if (((uc) this).field_Q > ((uc) this).field_P) {
                      L4: while (true) {
                        if (((uc) this).field_P >= 0) {
                          break L1;
                        } else {
                          ((uc) this).field_P = ((uc) this).field_P + ((uc) this).field_Q;
                          continue L4;
                        }
                      }
                    } else {
                      ((uc) this).field_P = ((uc) this).field_P - ((uc) this).field_Q;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8;
            stackOut_16_1 = new StringBuilder().append("uc.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param6 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        fe var12 = null;
        L0: {
          var10 = qk.a(1, param1, param2, param5, 120, param3, param7, param6);
          var11 = bj.a(param6, false, param3, param2, param1);
          if (0 == var10) {
            break L0;
          } else {
            if (var11 >= 0) {
              L1: {
                if (!hc.field_Q) {
                  hc.field_Q = true;
                  var12 = ia.field_i[1][dg.field_T[4]][0];
                  var12.field_l = var12.field_k.length;
                  ki.field_d = nc.a(var12, 100, var10, var11);
                  ki.field_d.e(-1);
                  ki.field_d.e(0, var12.field_k.length);
                  e discarded$2 = we.a(ki.field_d, 6222);
                  nj.field_g = var10;
                  lh.field_s = param0;
                  ub.field_n = 25;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        sd.a(127);
    }

    private uc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = -1;
        field_T = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_R = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
