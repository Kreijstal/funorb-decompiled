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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_9_0 = (on) (var8);
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
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("sb.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ',' + param4 + ')');
        }
        return (ha) ((Object) stackIn_9_0);
    }

    final static void a(int param0, int param1, int param2, int param3, fs param4) {
        try {
            param4.b((byte) 122, 12);
            param4.b(-42, 17);
            if (param1 <= 77) {
                java.awt.Canvas var6 = (java.awt.Canvas) null;
                sb.a((ki) null, -117, (d) null, (java.awt.Canvas) null, 97);
            }
            param4.b(117, param3);
            param4.b(117, param2);
            param4.b((byte) 52, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "sb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        wc[] var4 = null;
        int var5_int = 0;
        vl[] var5 = null;
        int var6 = 0;
        fs var6_ref_fs = null;
        Exception var7 = null;
        wc[] var7_array = null;
        wc[] var8 = null;
        int var9 = 0;
        fs var10 = null;
        int var11 = 0;
        fs var14 = null;
        wc[] var16 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.a(param0 + 9937, "waves/");
            var23 = param1.a(var2_int, -25915);
            cb.field_a = new wc[41];
            var4 = new wc[41];
            var5_int = 0;
            L1: while (true) {
              if (var23.length <= var5_int) {
                var2_int = param1.a(param0 ^ param0, "levels/");
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
                            decompiledRegionSelector0 = 1;
                            break L5;
                          }
                        }
                        L6: {
                          if (decompiledRegionSelector0 == 0) {
                            if ((var2_int ^ -1) != 0) {
                              var25 = param1.a(var2_int, -25915);
                              var16 = new wc[var25.length];
                              var7_array = var16;
                              var8 = new wc[var25.length];
                              var9 = 0;
                              L7: while (true) {
                                if (var9 >= var25.length) {
                                  ab.field_a.a(new om(var8), param0 ^ 9936, (long)sp.field_x[var6]);
                                  break L6;
                                } else {
                                  var10 = new fs(param1.a((byte) 106, var25[var9], var2_int));
                                  var10.field_p = var10.field_p + 1;
                                  var7_array[var9] = wr.a(true, var10, false);
                                  var8[var16[var9].field_a] = var16[var9];
                                  var9++;
                                  continue L7;
                                }
                              }
                            } else {
                              var6++;
                              continue L3;
                            }
                          } else {
                            break L6;
                          }
                        }
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    L8: {
                      var14 = new fs(param1.a((byte) 98, var24[var6], var2_int));
                      var14.field_p = var14.field_p + 1;
                      var5[var6] = pi.a(var14, true, 102);
                      if (25 <= var5[var6].field_e) {
                        break L8;
                      } else {
                        dr.field_S[var5[var6].field_e] = var5[var6];
                        break L8;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var6_ref_fs = new fs(param1.a((byte) 94, var23[var5_int], var2_int));
                var6_ref_fs.field_p = var6_ref_fs.field_p + 1;
                var4[var5_int] = wr.a(true, var6_ref_fs, false);
                cb.field_a[var4[var5_int].field_a] = var4[var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("sb.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    final static int a(boolean param0, int param1, int param2, byte param3) {
        if (param3 <= 46) {
            return 59;
        }
        return se.a(19886);
    }

    static {
        field_a = 0;
        field_e = "Open in popup window";
        field_c = 250;
        field_b = new jg();
    }
}
