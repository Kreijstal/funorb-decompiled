/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static int field_c;
    static int field_a;
    static String field_e;
    static jg field_b;
    static ne[] field_d;

    final static ha a(ki param0, int param1, d param2, java.awt.Canvas param3, int param4) {
        RuntimeException var5 = null;
        long var6 = 0L;
        on var8 = null;
        jaggl.OpenGL var9 = null;
        on stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        on stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (of.c((byte) 119)) {
              L1: {
                if (param1 == -6708) {
                  break L1;
                } else {
                  sb.a(false);
                  break L1;
                }
              }
              if (mc.b((byte) 120, "jaggl")) {
                var9 = new jaggl.OpenGL();
                var6 = var9.init(param3, 8, 8, 8, 24, 0, param4);
                if (var6 != 0L) {
                  var8 = new on(var9, param3, var6, param2, param0, param4);
                  var8.e(false);
                  stackOut_8_0 = (on) var8;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                throw new RuntimeException("");
              }
            } else {
              throw new RuntimeException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("sb.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param4 + ')');
        }
        return (ha) (Object) stackIn_9_0;
    }

    final static void a(int param0, int param1, int param2, int param3, fs param4) {
        try {
            param4.b((byte) 122, 12);
            param4.b(-42, 17);
            if (param1 <= 77) {
                Object var6 = null;
                ha discarded$0 = sb.a((ki) null, -117, (d) null, (java.awt.Canvas) null, 97);
            }
            param4.b(117, param3);
            param4.b(117, param2);
            param4.b((byte) 52, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "sb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_c = 40;
        }
        field_e = null;
        field_b = null;
        field_d = null;
    }

    final static void a(int param0, ki param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        wc[] var4 = null;
        int var5_int = 0;
        vl[] var5 = null;
        int var6 = 0;
        fs var6_ref_fs = null;
        Exception var7 = null;
        int var11 = 0;
        fs var14 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.a(0, "waves/");
            var23 = param1.a(var2_int, -25915);
            cb.field_a = new wc[41];
            var4 = new wc[41];
            var5_int = 0;
            L1: while (true) {
              if (var23.length <= var5_int) {
                var2_int = param1.a(0, "levels/");
                var24 = param1.a(var2_int, -25915);
                var5 = new vl[var24.length];
                dr.field_S = new vl[25];
                var6 = 0;
                L2: while (true) {
                  if (var24.length <= var6) {
                    ab.field_a = new te(16);
                    var6 = 0;
                    L3: while (true) {
                      if (9 <= var6) {
                        break L0;
                      } else {
                        try {
                          L4: {
                            var2_int = param1.a(0, "engineered_levels/" + (1 + var6) + "/");
                            decompiledRegionSelector0 = 0;
                            break L4;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L5: {
                            var7 = (Exception) (Object) decompiledCaughtException;
                            var6++;
                            decompiledRegionSelector0 = 1;
                            break L5;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          L6: {
                            if (var2_int == -1) {
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var6++;
                          continue L3;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L7: {
                      var14 = new fs(param1.a((byte) 98, var24[var6], var2_int));
                      var14.field_p = var14.field_p + 1;
                      int discarded$3 = 102;
                      int discarded$4 = 1;
                      var5[var6] = pi.a(var14);
                      if (25 <= var5[var6].field_e) {
                        break L7;
                      } else {
                        dr.field_S[var5[var6].field_e] = var5[var6];
                        break L7;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var6_ref_fs = new fs(param1.a((byte) 94, var23[var5_int], var2_int));
                var6_ref_fs.field_p = var6_ref_fs.field_p + 1;
                int discarded$5 = 0;
                var4[var5_int] = wr.a(true, var6_ref_fs);
                cb.field_a[var4[var5_int].field_a] = var4[var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("sb.E(").append(-9937).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        int discarded$0 = 19886;
        return se.a();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_e = "Open in popup window";
        field_c = 250;
        field_b = new jg();
    }
}
