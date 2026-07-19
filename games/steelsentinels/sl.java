/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static String field_q;
    static String field_f;
    static int field_i;
    static String[] field_j;
    cm field_d;
    static ul field_b;
    String field_e;
    String field_g;
    static String field_o;
    static String field_c;
    static java.awt.Canvas field_n;
    String field_h;
    int field_a;
    static String field_l;
    static wk field_p;
    static long field_m;
    static gh[] field_k;

    final static void a(wk[] param0, int param1, int param2, int param3, int param4, byte param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if ((param1 ^ -1) < -1) {
                  L2: {
                    var6_int = param0[0].field_z;
                    var7 = param0[2].field_z;
                    var8 = param0[1].field_z;
                    param0[0].d(param3, param2, param4);
                    param0[2].d(param1 + param3 + -var7, param2, param4);
                    pb.b(aj.field_v);
                    pb.h(var6_int + param3, param2, -var7 + param3 - -param1, param2 - -param0[1].field_B);
                    var9 = param3 - -var6_int;
                    var10 = -var7 + (param3 + param1);
                    if (param5 <= -64) {
                      break L2;
                    } else {
                      field_j = (String[]) null;
                      break L2;
                    }
                  }
                  param3 = var9;
                  L3: while (true) {
                    if (var10 <= param3) {
                      pb.a(aj.field_v);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param0[1].d(param3, param2, param4);
                      param3 = param3 + var8;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("sl.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(nk param0, int[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = param0.i(-126);
              if (param2 == -7) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (var6 >= var4) {
                L3: {
                  if (var5 != 0) {
                    var3_int += 15;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3_int += 2;
                stackOut_24_0 = var3_int;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              } else {
                L4: {
                  if ((param1[var6] ^ -1) == -6) {
                    var3_int++;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-7 != (param1[var6] ^ -1)) {
                    break L5;
                  } else {
                    var3_int += 2;
                    break L5;
                  }
                }
                L6: {
                  if (7 == param1[var6]) {
                    var3_int += 3;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (8 != param1[var6]) {
                    break L7;
                  } else {
                    var3_int += 4;
                    break L7;
                  }
                }
                L8: {
                  if (9 != param1[var6]) {
                    break L8;
                  } else {
                    var3_int += 5;
                    break L8;
                  }
                }
                L9: {
                  if ((param1[var6] ^ -1) == -35) {
                    var5 = 1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("sl.D(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
        return stackIn_25_0;
    }

    final static wk[] a(int param0, int param1) {
        if (param1 != 2) {
            field_n = (java.awt.Canvas) null;
        }
        wk[] var3 = new wk[9];
        wk[] var2 = var3;
        var3[4] = bd.a(param0, 64, 248);
        return var2;
    }

    public static void a(int param0) {
        field_b = null;
        field_n = null;
        field_c = null;
        field_l = null;
        field_o = null;
        int var1 = 1 / ((param0 - -20) / 52);
        field_f = null;
        field_q = null;
        field_k = null;
        field_j = null;
        field_p = null;
    }

    final static void a(byte param0) {
        if (param0 != 3) {
            sl.a((byte) -108);
        }
    }

    private sl() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "CLEAR DRONES";
        field_q = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_o = "Spectate <%0>'s game";
        field_j = new String[]{"Tech value: <%0>", "Jump boost", "Thrust boost", "Energy capacity: <%0> TJ", "Shields: <%0> GJ", "Energy generation: <%0> GJ/s", "Energy generation: UNKNOWN", "Health: <%0> kPm", "Tech value: <%0>", "Jump: <%0>%", "Thrust: <%0>%", "Jump & thrust boosts"};
        field_l = "Waiting for extra data";
        field_c = "Retry";
        field_b = new ul();
    }
}
