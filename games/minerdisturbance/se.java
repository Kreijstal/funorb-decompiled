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
            throw lj.a((Throwable) (Object) runtimeException, "se.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
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
            stackOut_8_1 = new StringBuilder().append("se.LA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param5 + 41);
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
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var5_int = param0 - -param3;
              var6 = param4 + param2;
              if (param1 == 2) {
                break L1;
              } else {
                field_M = 88;
                break L1;
              }
            }
            L2: {
              if (param0 > eh.field_a) {
                stackOut_5_0 = param0;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = eh.field_a;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_6_0;
              if (eh.field_d >= param2) {
                stackOut_8_0 = eh.field_d;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = param2;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var8 = stackIn_9_0;
              if (var5_int >= eh.field_k) {
                stackOut_11_0 = eh.field_k;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = var5_int;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_12_0;
              if (eh.field_e > var6) {
                stackOut_14_0 = var6;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = eh.field_e;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (eh.field_a > param0) {
                break L6;
              } else {
                if (eh.field_k <= param0) {
                  break L6;
                } else {
                  var11 = param0 + eh.field_g * var8;
                  var12 = var10 + (1 - var8) >> 1;
                  L7: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L6;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 = var11 + eh.field_g * 2;
                      continue L7;
                    }
                  }
                }
              }
            }
            L8: {
              if (eh.field_d > param2) {
                break L8;
              } else {
                if (eh.field_e > var6) {
                  var11 = eh.field_g * param2 + var7;
                  var12 = var9 + (1 - var7) >> 1;
                  L9: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L8;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (var5_int < eh.field_a) {
                break L10;
              } else {
                if (eh.field_k <= var5_int) {
                  break L10;
                } else {
                  var11 = var5_int + (var8 - -(1 & var5_int + -param0)) * eh.field_g;
                  var12 = var10 + 1 - var8 >> 1;
                  L11: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L10;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 = var11 + 2 * eh.field_g;
                      continue L11;
                    }
                  }
                }
              }
            }
            L12: {
              if (eh.field_d > param2) {
                break L12;
              } else {
                if (eh.field_e <= var6) {
                  break L12;
                } else {
                  var11 = var6 * eh.field_g + var7 + (1 & var6 + -param2);
                  var12 = -var7 + (var9 + 1) >> 1;
                  L13: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L12;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 += 2;
                      continue L13;
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
          throw lj.a((Throwable) (Object) var5, "se.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
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
