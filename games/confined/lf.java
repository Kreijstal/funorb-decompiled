/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lf extends mf {
    private ul field_l;
    static mn field_k;
    static int[] field_m;
    static nf field_j;
    static String field_h;
    static bi field_i;

    final static void a(int param0, int param1, bj param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        hb var8 = null;
        hb var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = vh.field_a;
              var9 = var8;
              var9.b(true, param0);
              var9.field_n = var9.field_n + 1;
              var4 = var9.field_n;
              var9.f(96, 1);
              var9.c(param2.field_p, 8);
              var9.c(param2.field_r, 8);
              var9.c(param2.field_x, 8);
              var9.d(-97, param2.field_n);
              var9.d(-101, param2.field_u);
              var9.d(-108, param2.field_o);
              var9.d(-83, param2.field_t);
              var9.f(107, param2.field_s.length);
              if (param1 >= 35) {
                break L1;
              } else {
                var7 = null;
                lf.a(-61, -11, (bj) null);
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if (param2.field_s.length <= var5) {
                int discarded$1 = var9.e(26199, var4);
                var9.a(25859, -var4 + var9.field_n);
                break L0;
              } else {
                var8.d(-91, param2.field_s[var5]);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("lf.L(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final String a(String param0, boolean param1) {
        dm var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (!(((lf) this).field_l instanceof j)) {
                break L1;
              } else {
                var3 = ((j) (Object) ((lf) this).field_l).a((byte) -9);
                if (var3 != null) {
                  L2: {
                    if (var3.a(-3621) != nn.field_q) {
                      break L2;
                    } else {
                      if (param0.equals((Object) (Object) ((lf) this).field_l.field_B)) {
                        break L2;
                      } else {
                        stackOut_5_0 = lm.field_d;
                        stackIn_6_0 = stackOut_5_0;
                        return stackIn_6_0;
                      }
                    }
                  }
                  stackOut_7_0 = var3.a((byte) 68);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param1) {
                break L3;
              } else {
                lf.e(71);
                break L3;
              }
            }
            if (!param0.equals((Object) (Object) ((lf) this).field_l.field_B)) {
              stackOut_13_0 = lm.field_d;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("lf.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    lf(ul param0, ul param1) {
        super(param0);
        try {
            ((lf) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "lf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fi a(byte param0, String param1) {
        dm var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        fi stackIn_8_0 = null;
        fi stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        fi stackOut_7_0 = null;
        fi stackOut_11_0 = null;
        fi stackOut_10_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param0 <= -44) {
              L1: {
                if (((lf) this).field_l instanceof j) {
                  var3 = ((j) (Object) ((lf) this).field_l).a((byte) -9);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (var3.a(-3621) == nn.field_q) {
                      break L1;
                    } else {
                      stackOut_7_0 = fb.field_e;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1.equals((Object) (Object) ((lf) this).field_l.field_B)) {
                  stackOut_11_0 = nn.field_q;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = fb.field_e;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fi) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("lf.C(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final static void c(byte param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) tf.field_p;
            synchronized (var1) {
              L1: {
                L2: {
                  ic.field_b = lh.field_b;
                  cg.field_d = cg.field_d + 1;
                  if (0 <= ab.field_a) {
                    L3: while (true) {
                      if (mi.field_g == ab.field_a) {
                        break L2;
                      } else {
                        var2 = on.field_f[mi.field_g];
                        mi.field_g = 1 + mi.field_g & 127;
                        if (0 <= var2) {
                          mc.field_e[var2] = true;
                          continue L3;
                        } else {
                          mc.field_e[~var2] = false;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 112) {
                        ab.field_a = mi.field_g;
                        break L2;
                      } else {
                        mc.field_e[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                L5: {
                  if (param0 == -84) {
                    break L5;
                  } else {
                    field_i = null;
                    break L5;
                  }
                }
                lh.field_b = oe.field_W;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1_ref, "lf.B(" + param0 + ')');
        }
    }

    public static void e(int param0) {
        field_h = null;
        field_j = null;
        field_i = null;
        if (param0 < 15) {
            lf.c((byte) 83);
        }
        field_m = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[]{5, 18, 39, 52};
        field_k = new mn();
        field_h = "Special energy weapons";
    }
}
