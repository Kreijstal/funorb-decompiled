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
        kv[] discarded$2 = null;
        int incrementValue$3 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        kv var14 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                var14 = (kv) null;
                discarded$2 = fw.a((byte) 13, (kv) null, (kv) null, (kv) null);
                break L1;
              }
            }
            L2: {
              param6 -= 3;
              if (param1.field_q >= param2) {
                break L2;
              } else {
                param2 = param1.field_q;
                break L2;
              }
            }
            var7_int = 1 + param1.field_q;
            var8 = 1;
            L3: while (true) {
              if (var8 >= -1 + param1.field_p) {
                var7_int = 0;
                var8 = 0;
                L4: while (true) {
                  if (param1.field_p <= var8) {
                    break L0;
                  } else {
                    var9 = 0;
                    L5: while (true) {
                      if (var9 >= param2) {
                        var7_int = var7_int + (param1.field_q - param2);
                        var8++;
                        continue L4;
                      } else {
                        L6: {
                          var10 = 255 & param1.field_v[var7_int];
                          var11 = param5.field_v[var7_int] & 255;
                          var12 = 0;
                          var12 = var12 | ((param3 >> -989578320) * var10 & 65280) << -1902216056;
                          var12 = var12 | 65280 & var10 * ((param3 & 65280) >> 1032496520);
                          var12 = var12 | var10 * (255 & param3) >> -52028888 & 255;
                          if (0 > param1.field_v[var7_int]) {
                            break L6;
                          } else {
                            tla.a(var9 + param0, -1898743704, var12, var8 + param6, var11);
                            break L6;
                          }
                        }
                        var7_int++;
                        var9++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var9 = 1;
                L7: while (true) {
                  if (var9 >= param2) {
                    var7_int = var7_int + (-param2 + param1.field_q + 1);
                    var8++;
                    continue L3;
                  } else {
                    L8: {
                      var10 = param1.field_v[var7_int] & 255;
                      if (var10 < (param1.field_v[var7_int + param1.field_q] & 255)) {
                        var10 = param1.field_v[var7_int - -param1.field_q] & 255;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var10 >= (255 & param1.field_v[-param1.field_q + var7_int])) {
                        break L9;
                      } else {
                        var10 = 255 & param1.field_v[var7_int + -param1.field_q];
                        break L9;
                      }
                    }
                    L10: {
                      if (var10 < (param1.field_v[1 + param1.field_q + var7_int] & 255)) {
                        var10 = 255 & param1.field_v[1 + var7_int - -param1.field_q];
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var10 < (param1.field_v[-1 + (-param1.field_q + var7_int)] & 255)) {
                        var10 = param1.field_v[var7_int - (param1.field_q - -1)] & 255;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (var10 >= (255 & param1.field_v[param1.field_q + var7_int - 1])) {
                        break L12;
                      } else {
                        var10 = 255 & param1.field_v[var7_int + (param1.field_q - 1)];
                        break L12;
                      }
                    }
                    L13: {
                      if (var10 >= (255 & param1.field_v[1 + (var7_int + -param1.field_q)])) {
                        break L13;
                      } else {
                        var10 = 255 & param1.field_v[-param1.field_q + (var7_int + 1)];
                        break L13;
                      }
                    }
                    L14: {
                      if ((param1.field_v[var7_int - -1] & 255) <= var10) {
                        break L14;
                      } else {
                        var10 = param1.field_v[1 + var7_int] & 255;
                        break L14;
                      }
                    }
                    L15: {
                      if (var10 >= (255 & param1.field_v[var7_int - 1])) {
                        break L15;
                      } else {
                        var10 = 255 & param1.field_v[-1 + var7_int];
                        break L15;
                      }
                    }
                    incrementValue$3 = var7_int;
                    var7_int++;
                    param5.field_v[incrementValue$3] = var10;
                    var9++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var7);
            stackOut_39_1 = new StringBuilder().append("fw.C(").append(param0).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L16;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L16;
            }
          }
          L17: {
            stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param5 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L17;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L17;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param6 + ')');
        }
    }

    final static kv[] a(byte param0, kv param1, kv param2, kv param3) {
        kv[] var4 = null;
        RuntimeException var4_ref = null;
        kv[] var5 = null;
        kv[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var5 = new kv[9];
              var4 = var5;
              var5[3] = param2;
              var5[5] = param3;
              if (param0 <= -112) {
                break L1;
              } else {
                field_h = (pd[]) null;
                break L1;
              }
            }
            var5[4] = param1;
            stackOut_2_0 = (kv[]) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("fw.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static kv[] a(int param0, byte param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        kv[] var5 = new kv[50];
        kv[] var2 = var5;
        if (param1 != -74) {
            return (kv[]) null;
        }
        for (var3 = 0; 50 > var3; var3++) {
            var5[var3] = bs.a(qs.field_l[param0][var3], (byte) 112);
        }
        return var2;
    }

    fw(int param0, int param1) {
        this.field_k = param0;
        this.field_g = param1;
    }

    public static void a(int param0) {
        field_j = null;
        field_h = null;
        if (param0 != -8668) {
            return;
        }
        field_f = null;
        field_i = null;
    }

    static {
        field_i = new jd(1);
        field_h = new pd[50];
    }
}
