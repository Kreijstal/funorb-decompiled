/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static long field_a;
    static int[] field_c;
    static int[] field_e;
    boolean field_b;
    String field_f;
    String field_d;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            field_e = (int[]) null;
        }
        field_c = null;
    }

    final static boolean a(byte param0) {
        int var1;
        int stackIn_5_0 = 0;
        L0: {
          L1: {
            var1 = 126 % ((param0 - 47) / 33);
            if (ta.field_g < 10) {
              break L1;
            } else {
              if (qg.field_d) {
                break L1;
              } else {
                if (bd.c(false)) {
                  break L1;
                } else {
                  stackIn_5_0 = 1;
                  break L0;
                }
              }
            }
          }
          stackIn_5_0 = 0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var11_int = -param0 + 256;
            if (param7 == -61498200) {
              var12 = -param3;
              L1: while (true) {
                if (-1 >= (var12 ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var13 = -param5;
                  L2: while (true) {
                    if (-1 >= (var13 ^ -1)) {
                      param10 = param10 + param2;
                      param6 = param6 + param4;
                      var12++;
                      continue L1;
                    } else {
                      L3: {
                        incrementValue$0 = param6;
                        param6++;
                        param9 = param1[incrementValue$0];
                        if (param9 == 0) {
                          param10++;
                          break L3;
                        } else {
                          L4: {
                            var14 = (param9 & 16725506) >> 1501906544;
                            var15 = 255 & param9 >> -2107625976;
                            var16 = 255 & param9;
                            var17 = param8[param10];
                            var18 = 255 & var17 >> 458465488;
                            var19 = 15 & var17 >> 598648072;
                            var20 = 255 & var17;
                            if (var14 > var15) {
                              if (var16 < var14) {
                                stackIn_15_0 = var14;
                                break L4;
                              } else {
                                stackIn_15_0 = var16;
                                break L4;
                              }
                            } else {
                              if (var15 <= var16) {
                                stackIn_15_0 = var16;
                                break L4;
                              } else {
                                stackIn_15_0 = var15;
                                break L4;
                              }
                            }
                          }
                          L5: {
                            var21 = stackIn_15_0;
                            if (var18 > var19) {
                              if (var18 > var20) {
                                stackIn_22_0 = var18;
                                break L5;
                              } else {
                                stackIn_22_0 = var20;
                                break L5;
                              }
                            } else {
                              if (var19 <= var20) {
                                stackIn_22_0 = var20;
                                break L5;
                              } else {
                                stackIn_22_0 = var19;
                                break L5;
                              }
                            }
                          }
                          L6: {
                            var22 = stackIn_22_0;
                            if (var21 > var22) {
                              param9 = var22 * var15 / var21 << -61498200 | var14 * var22 / var21 << -1522203792 | var16 * var22 / var21;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          incrementValue$1 = param10;
                          param10++;
                          param8[incrementValue$1] = tb.a(vg.a(16711935, param0 * vg.a(param9, 16711935) - -(var11_int * vg.a(var17, 16711935)) >> 108273096), vg.a(param0 * vg.a(65280, param9) - -(var11_int * vg.a(var17, 65280)), 16711696) >> 1114217448);
                          break L3;
                        }
                      }
                      var13++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var11);

            stackIn_32_1 = new StringBuilder().append("d.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_c = new int[256];
            var1 = 0;
            L0: while (true) {
              if (var1 >= 256) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if ((var2 ^ -1) <= -9) {
                    field_c[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((var0 & 1 ^ -1) != -2) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = -306674912 ^ var0 >>> -301986207;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
