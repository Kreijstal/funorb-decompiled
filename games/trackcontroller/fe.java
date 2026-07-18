/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends rh {
    int field_I;
    static String field_J;
    static int field_L;
    int field_M;
    int field_S;
    int field_R;
    static long field_N;
    static int field_Q;
    static long field_P;
    int field_K;
    int field_O;

    final static void a(bh param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            qc.field_e.b((wh) (Object) param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("fe.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 2 + ')');
        }
    }

    public static void j(int param0) {
        field_J = null;
    }

    final static void a(boolean param0, wb param1, int param2) {
        try {
            kg.a(param0, (byte) 116, param2, param1);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "fe.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
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
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var12 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -((fe) this).field_p + -param5 - (((fe) this).field_S - param2);
                var9 = -param6 - ((fe) this).field_m + (-((fe) this).field_R + param1);
                if (((fe) this).field_I * ((fe) this).field_I <= var8_int * var8_int + var9 * var9) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - md.field_a;
                    if (0.0 > var10) {
                      var10 = var10 - 3.141592653589793 / (double)((fe) this).field_M;
                      break L2;
                    } else {
                      if (var10 > 0.0) {
                        var10 = var10 + 3.141592653589793 / (double)((fe) this).field_M;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((fe) this).field_O = (int)((double)((fe) this).field_M * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (((fe) this).field_M > ((fe) this).field_O) {
                      L4: while (true) {
                        if (((fe) this).field_O >= 0) {
                          break L1;
                        } else {
                          ((fe) this).field_O = ((fe) this).field_O + ((fe) this).field_M;
                          continue L4;
                        }
                      }
                    } else {
                      ((fe) this).field_O = ((fe) this).field_O - ((fe) this).field_M;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8;
            stackOut_16_1 = new StringBuilder().append("fe.R(");
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
          throw sl.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_15_0 != 0;
    }

    private fe() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, kk param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pf var5 = null;
        int[] var6 = null;
        int var7 = 0;
        la var8 = null;
        int var9 = 0;
        la var10 = null;
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
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var8 = new la(param1.a("logo.fo3d", -1, ""));
            var10 = var8;
            var3 = var10.h(16383);
            var10.h((byte) 31);
            lg.field_d = hb.a(12, var10);
            ef.field_a = new pf[var3];
            kc.field_c = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var10.g((byte) -106);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var9 >= var3) {
                    break L0;
                  } else {
                    var5 = ef.field_a[var9];
                    var5.a(6, 1, (byte) 117, 6, 6);
                    var5.b(14702);
                    var6 = new int[]{var5.field_u + var5.field_i >> 1, var5.field_p + var5.field_n >> 1, var5.field_k + var5.field_w >> 1};
                    kc.field_c[var9] = var6;
                    var5.a(-var6[2], (byte) 123, -var6[0], -var6[1]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                ef.field_a[var4] = sf.a(var8, false);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("fe.A(").append(30344).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "This password is part of your Player Name, and would be easy to guess";
        field_L = 0;
    }
}
