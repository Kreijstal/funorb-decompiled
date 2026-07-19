/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static String field_b;
    static cj field_a;
    static String[] field_d;
    static int field_c;

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            ep.e();
            na.field_K = new int[260];
            eq.field_g = 11;
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (256 <= var1_int) {
                    break L3;
                  } else {
                    var2 = 15.0;
                    na.field_K[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                    var1_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var1_int = 256;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (na.field_K.length <= var1_int) {
                      break L6;
                    } else {
                      na.field_K[var1_int] = 255;
                      var1_int++;
                      if (var4 != 0) {
                        break L5;
                      } else {
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (!param0) {
                    break L5;
                  } else {
                    field_d = (String[]) null;
                    return;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "pg.A(" + param0 + ')');
        }
    }

    final static gm a(int param0, byte param1, int param2, int param3) {
        ma discarded$2 = null;
        String var5 = null;
        if (param1 >= -65) {
          var5 = (String) null;
          discarded$2 = pg.a((String) null, (byte) -66);
          return (gm) ((Object) new hg(param0, param3, param2));
        } else {
          return (gm) ((Object) new hg(param0, param3, param2));
        }
    }

    final static ma a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ma stackIn_3_0 = null;
        ma stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_12_0 = null;
        ma stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (param1 < -85) {
              var3 = 0;
              L1: while (true) {
                L2: {
                  if (var2_int <= var3) {
                    break L2;
                  } else {
                    var4 = param0.charAt(var3);
                    if (var4 >= 48) {
                      if (var4 <= 57) {
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  }
                }
                stackOut_12_0 = so.field_t;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (ma) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("pg.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_13_0;
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0) {
            return;
        }
        gm discarded$0 = pg.a(77, (byte) -46, -11, 35);
    }

    static {
        field_d = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
