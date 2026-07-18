/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fw extends bw {
    int field_k;
    static ee field_f;
    int field_g;
    static jd field_i;
    static vr field_j;
    static long field_l;
    static pd[] field_h;

    final static void a(int param0, kv param1, int param2, int param3, boolean param4, kv param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param6 -= 3;
              if (param1.field_q >= param2) {
                break L1;
              } else {
                param2 = param1.field_q;
                break L1;
              }
            }
            var7_int = 1 + param1.field_q;
            var8 = 1;
            L2: while (true) {
              if (var8 >= -1 + param1.field_p) {
                var7_int = 0;
                var8 = 0;
                L3: while (true) {
                  if (param1.field_p <= var8) {
                    break L0;
                  } else {
                    var9 = 0;
                    L4: while (true) {
                      if (var9 >= param2) {
                        var7_int = var7_int + (param1.field_q - param2);
                        var8++;
                        continue L3;
                      } else {
                        L5: {
                          var10 = 255 & param1.field_v[var7_int];
                          var11 = param5.field_v[var7_int] & 255;
                          var12 = 0;
                          var12 = var12 | ((param3 >> 16) * var10 & 65280) << 8;
                          var12 = var12 | 65280 & var10 * ((param3 & 65280) >> 8);
                          var12 = var12 | var10 * (255 & param3) >> 8 & 255;
                          if (0 > param1.field_v[var7_int]) {
                            break L5;
                          } else {
                            tla.a(var9 + param0, -1898743704, var12, var8 + param6, var11);
                            break L5;
                          }
                        }
                        var7_int++;
                        var9++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var9 = 1;
                L6: while (true) {
                  if (var9 >= param2) {
                    var7_int = var7_int + (-param2 + param1.field_q + 1);
                    var8++;
                    continue L2;
                  } else {
                    L7: {
                      var10 = param1.field_v[var7_int] & 255;
                      if (var10 < (param1.field_v[var7_int + param1.field_q] & 255)) {
                        var10 = param1.field_v[var7_int - -param1.field_q] & 255;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var10 >= (255 & param1.field_v[-param1.field_q + var7_int])) {
                        break L8;
                      } else {
                        var10 = 255 & param1.field_v[var7_int + -param1.field_q];
                        break L8;
                      }
                    }
                    L9: {
                      if (var10 < (param1.field_v[1 + param1.field_q + var7_int] & 255)) {
                        var10 = 255 & param1.field_v[1 + var7_int - -param1.field_q];
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var10 < (param1.field_v[-1 + (-param1.field_q + var7_int)] & 255)) {
                        var10 = param1.field_v[var7_int - (param1.field_q - -1)] & 255;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var10 >= (255 & param1.field_v[param1.field_q + var7_int - 1])) {
                        break L11;
                      } else {
                        var10 = 255 & param1.field_v[var7_int + (param1.field_q - 1)];
                        break L11;
                      }
                    }
                    L12: {
                      if (var10 >= (255 & param1.field_v[1 + (var7_int + -param1.field_q)])) {
                        break L12;
                      } else {
                        var10 = 255 & param1.field_v[-param1.field_q + (var7_int + 1)];
                        break L12;
                      }
                    }
                    L13: {
                      if ((param1.field_v[var7_int - -1] & 255) <= var10) {
                        break L13;
                      } else {
                        var10 = param1.field_v[1 + var7_int] & 255;
                        break L13;
                      }
                    }
                    L14: {
                      if (var10 >= (255 & param1.field_v[var7_int - 1])) {
                        break L14;
                      } else {
                        var10 = 255 & param1.field_v[-1 + var7_int];
                        break L14;
                      }
                    }
                    int incrementValue$1 = var7_int;
                    var7_int++;
                    param5.field_v[incrementValue$1] = var10;
                    var9++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var7;
            stackOut_37_1 = new StringBuilder().append("fw.C(").append(param0).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L15;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L15;
            }
          }
          L16: {
            stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',').append(param2).append(',').append(param3).append(',').append(true).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param5 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L16;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L16;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + param6 + ')');
        }
    }

    final static kv[] a(byte param0, kv param1, kv param2, kv param3) {
        kv[] var4 = null;
        RuntimeException var4_ref = null;
        kv[] var5 = null;
        kv[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var5 = new kv[9];
            var4 = var5;
            var5[3] = param2;
            var5[5] = param3;
            var5[4] = param1;
            stackOut_0_0 = (kv[]) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("fw.A(").append(-122).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final static kv[] a(int param0, byte param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        kv[] var5 = new kv[50];
        kv[] var2 = var5;
        for (var3 = 0; 50 > var3; var3++) {
            var5[var3] = bs.a(qs.field_l[param0][var3], (byte) 112);
        }
        return var2;
    }

    fw(int param0, int param1) {
        ((fw) this).field_k = param0;
        ((fw) this).field_g = param1;
    }

    public static void a() {
        field_j = null;
        field_h = null;
        field_f = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new jd(1);
        field_h = new pd[50];
    }
}
