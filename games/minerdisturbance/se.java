/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends jc {
    static int field_N;
    static int field_M;
    static int[] field_O;
    static int field_K;
    static String field_J;
    static String field_L;

    private se(int param0, int param1, int param2, int param3, ad param4, rm param5, fe param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((se) this).field_I = param6;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "se.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(int param0) {
        if (param0 != -13673) {
          se.n(28);
          field_J = null;
          field_O = null;
          field_L = null;
          return;
        } else {
          field_J = null;
          field_O = null;
          field_L = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        ma var7 = null;
        RuntimeException var7_ref = null;
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
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5 + param5);
              var7 = j.field_d;
              if (var7 == null) {
                break L1;
              } else {
                if (((se) this).b(param1, param0, param3, param2, -88)) {
                  if (!(((se) this).field_y instanceof cd)) {
                    if (!(var7.field_y instanceof cd)) {
                      break L1;
                    } else {
                      ((cd) (Object) var7.field_y).a(param5 + 27055, (se) this, var7);
                      j.field_d = null;
                      return;
                    }
                  } else {
                    ((cd) (Object) ((se) this).field_y).a(27055, (se) this, var7);
                    j.field_d = null;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("se.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param5 + ')');
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var5_int = param0 - -param3;
              var6 = param4 + param2;
              if (param0 > eh.field_a) {
                stackOut_3_0 = param0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = eh.field_a;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (eh.field_d >= param2) {
                stackOut_6_0 = eh.field_d;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param2;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int >= eh.field_k) {
                stackOut_9_0 = eh.field_k;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var5_int;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (eh.field_e > var6) {
                stackOut_12_0 = var6;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = eh.field_e;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (eh.field_a > param0) {
                break L5;
              } else {
                if (eh.field_k <= param0) {
                  break L5;
                } else {
                  var11 = param0 + eh.field_g * var8;
                  var12 = var10 + (1 - var8) >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 = var11 + eh.field_g * 2;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              if (eh.field_d > param2) {
                break L7;
              } else {
                if (eh.field_e > var6) {
                  var11 = eh.field_g * param2 + var7;
                  var12 = var9 + (1 - var7) >> 1;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (var5_int < eh.field_a) {
                break L9;
              } else {
                if (eh.field_k <= var5_int) {
                  break L9;
                } else {
                  var11 = var5_int + (var8 - -(1 & var5_int + -param0)) * eh.field_g;
                  var12 = var10 + 1 - var8 >> 1;
                  L10: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L9;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 = var11 + 2 * eh.field_g;
                      continue L10;
                    }
                  }
                }
              }
            }
            L11: {
              if (eh.field_d > param2) {
                break L11;
              } else {
                if (eh.field_e <= var6) {
                  break L11;
                } else {
                  var11 = var6 * eh.field_g + var7 + (1 & var6 + -param2);
                  var12 = -var7 + (var9 + 1) >> 1;
                  L12: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L11;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var5, "se.A(" + param0 + ',' + 2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = 50;
        field_K = -1;
        field_J = "Ranking: Puddle Splasher";
        field_L = "Sell<br>Basic Kit";
    }
}
