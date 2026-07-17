/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends oh {
    int[] field_i;
    int field_r;
    int field_o;
    static int field_n;
    static gq field_p;
    int field_l;
    int field_h;
    int field_j;
    int field_k;
    static String[] field_q;
    static String field_m;

    final void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((cl) this).field_r = param6;
              ((cl) this).field_i = param2;
              ((cl) this).field_j = param7;
              ((cl) this).field_h = param4;
              ((cl) this).field_k = param3;
              ((cl) this).field_o = param0;
              ((cl) this).field_l = param1;
              if (param5 == 5) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cl.A(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var9_int = 0;
            L1: while (true) {
              if (var9_int >= param4) {
                L2: {
                  gf.f(param8 + param0, param7, -param8 + param3, 16777215);
                  gf.f(param0, param4 + (param7 + -1), 1 + -param8 + param3, 16777215);
                  if (param2 == -22466) {
                    break L2;
                  } else {
                    cl.a(73, -126, -112, 94, -98, 98, 92, 119, -99);
                    break L2;
                  }
                }
                var9_int = 1;
                L3: while (true) {
                  if (var9_int >= -1 + param4) {
                    break L0;
                  } else {
                    L4: {
                      var10 = param7 - -var9_int;
                      var11 = (var9_int + -1) * 256 / (param4 + -2);
                      if (var9_int >= 2) {
                        stackOut_16_0 = ui.a(param6, param1, param2 + 22363, var11);
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = param5;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var12 = stackIn_17_0;
                      var13 = param8 + -var9_int;
                      if (var13 < 0) {
                        var13 = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      var14 = -param8 + (param4 + param3 - var9_int);
                      if (var14 > param3) {
                        var14 = param3;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var15 = var14 + -var13;
                    var13 = var13 + param0;
                    var14 = var14 + param0;
                    gf.a(var13, var10, 16777215);
                    gf.f(1 + var13, var10, var15 + -4, var12);
                    gf.f(-4 + var14, var10, 3, param5);
                    gf.a(var14 + -1, var10, 16777215);
                    var9_int++;
                    continue L3;
                  }
                }
              } else {
                L7: {
                  var10 = var9_int + param7;
                  var11 = param8 + -var9_int;
                  if (var11 < 0) {
                    var11 = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var12 = -var9_int + (param3 + param4) - param8;
                  if (param3 < var12) {
                    var12 = param3;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var13 = var12 + -var11;
                var11 = var11 + param0;
                var12 = var12 + param0;
                gf.f(5 + var11, 5 + var10, var13, 0, 128);
                var9_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var9, "cl.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_q = null;
        if (param0 != 16777215) {
            cl.a(-104);
        }
        field_m = null;
    }

    cl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_p = new gq(6, 0, 4, 2);
        field_m = "Objective";
    }
}
