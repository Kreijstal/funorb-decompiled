/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk implements fe {
    private int field_c;
    static java.math.BigInteger field_a;
    private ok field_e;
    static String field_b;
    static String field_f;
    private int field_g;
    static long field_d;

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param3.field_w) {
                  break L2;
                } else {
                  if (param3.e((byte) -124)) {
                    break L2;
                  } else {
                    stackOut_3_0 = 2188450;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_5_0;
              int discarded$1 = ((hk) this).field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_B + "</u>", param1 - -param3.field_q, param4 - -param3.field_m, param3.field_F, param3.field_z, var6_int, -1, ((hk) this).field_g, ((hk) this).field_c, ((hk) this).field_e.field_C - -((hk) this).field_e.field_D);
              if (param3.e((byte) -125)) {
                L4: {
                  var7 = ((hk) this).field_e.c(param3.field_B);
                  var8 = ((hk) this).field_e.field_D + ((hk) this).field_e.field_C;
                  var9 = param1 + param3.field_q;
                  if (((hk) this).field_g == 2) {
                    var9 = var9 + (param3.field_F - var7);
                    break L4;
                  } else {
                    if (((hk) this).field_g == 1) {
                      var9 = var9 + (-var7 + param3.field_F >> 1);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var10 = param3.field_m + param4;
                  if (((hk) this).field_c == 2) {
                    var10 = var10 + (-var8 + param3.field_z);
                    break L5;
                  } else {
                    if (((hk) this).field_c != 1) {
                      break L5;
                    } else {
                      var10 = var10 + (param3.field_z - var8 >> 1);
                      break L5;
                    }
                  }
                }
                tj.a(var8, 1, var9 + -2, var10 - -2, var7 + 4);
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (param0 <= -97) {
                break L6;
              } else {
                hk.a((byte) 39);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("hk.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_a = null;
        if (param0 > -122) {
            Object var2 = null;
            hk.a((byte) -74, 14, (int[]) null, 85, (int[]) null);
        }
    }

    final static int a(int param0) {
        return wc.field_Ob;
    }

    final static void a(byte param0, int param1, int[] param2, int param3, int[] param4) {
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < param3) {
                L2: {
                  var5_int = (param3 + param1) / 2;
                  var6 = param1;
                  var7 = param4[var5_int];
                  param4[var5_int] = param4[param3];
                  param4[param3] = var7;
                  var8 = param2[var5_int];
                  param2[var5_int] = param2[param3];
                  param2[param3] = var8;
                  if (var7 != 2147483647) {
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                var9 = stackIn_6_0;
                var10 = param1;
                L3: while (true) {
                  if (var10 >= param3) {
                    param4[param3] = param4[var6];
                    param4[var6] = var7;
                    param2[param3] = param2[var6];
                    param2[var6] = var8;
                    hk.a((byte) 125, param1, param2, var6 + -1, param4);
                    hk.a((byte) -71, var6 - -1, param2, param3, param4);
                    break L1;
                  } else {
                    L4: {
                      if (-(var10 & var9) + var7 < param4[var10]) {
                        var11 = param4[var10];
                        param4[var10] = param4[var6];
                        param4[var6] = var11;
                        var12 = param2[var10];
                        param2[var10] = param2[var6];
                        int incrementValue$1 = var6;
                        var6++;
                        param2[incrementValue$1] = var12;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
                  }
                }
              } else {
                break L1;
              }
            }
            var5_int = -111 / ((param0 - 59) / 60);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("hk.D(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    public hk() {
        ((hk) this).field_e = gm.field_cb;
        ((hk) this).field_c = 1;
        ((hk) this).field_g = 1;
    }

    hk(ok param0, int param1, int param2) {
        try {
            ((hk) this).field_c = param2;
            ((hk) this).field_e = param0;
            ((hk) this).field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "hk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_b = "Names cannot contain consecutive spaces";
        field_f = "Press Esc for options";
        field_d = 0L;
    }
}
