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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param1 > 0) {
                  var6_int = param0[0].field_z;
                  var7 = param0[2].field_z;
                  var8 = param0[1].field_z;
                  param0[0].d(param3, param2, param4);
                  param0[2].d(param1 + param3 + -var7, param2, param4);
                  pb.b(aj.field_v);
                  pb.h(var6_int + param3, param2, -var7 + param3 - -param1, param2 - -param0[1].field_B);
                  var9 = param3 - -var6_int;
                  var10 = -var7 + (param3 + param1);
                  param3 = var9;
                  L2: while (true) {
                    if (var10 <= param3) {
                      pb.a(aj.field_v);
                      break L0;
                    } else {
                      param0[1].d(param3, param2, param4);
                      param3 = param3 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("sl.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + -119 + ')');
        }
    }

    final static int a(nk param0, int[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = param0.i(-126);
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var4) {
                L2: {
                  if (var5 != 0) {
                    var3_int += 15;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var3_int += 2;
                stackOut_22_0 = var3_int;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L3: {
                  if (param1[var6] == -6) {
                    var3_int++;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-7 != param1[var6]) {
                    break L4;
                  } else {
                    var3_int += 2;
                    break L4;
                  }
                }
                L5: {
                  if (7 == param1[var6]) {
                    var3_int += 3;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (8 != param1[var6]) {
                    break L6;
                  } else {
                    var3_int += 4;
                    break L6;
                  }
                }
                L7: {
                  if (9 != param1[var6]) {
                    break L7;
                  } else {
                    var3_int += 5;
                    break L7;
                  }
                }
                L8: {
                  if (param1[var6] == 34) {
                    var5 = 1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("sl.D(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + -7 + ')');
        }
        return stackIn_23_0;
    }

    final static wk[] a(int param0, int param1) {
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
        int var1 = -1;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "CLEAR DRONES";
        field_q = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_o = "Spectate <%0>'s game";
        field_j = new String[]{"Tech value: <%0>", "Jump boost", "Thrust boost", "Energy capacity: <%0> TJ", "Shields: <%0> GJ", "Energy generation: <%0> GJ/s", "Energy generation: UNKNOWN", "Health: <%0> kPm", "Tech value: <%0>", "Jump: <%0>%", "Thrust: <%0>%", "Jump & thrust boosts"};
        field_l = "Waiting for extra data";
        field_c = "Retry";
        field_b = new ul();
    }
}
