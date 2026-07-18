/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fva extends rqa {
    static int field_o;
    static boolean field_p;

    fva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int[] param2, int param3, int[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20_int = 0;
        long var20 = 0L;
        int var21 = 0;
        int var22 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var22 = VoidHunters.field_G;
        try {
          L0: {
            var7_int = param4[-2 + param4.length];
            var8 = param4[param4.length - 1];
            var9 = 0;
            L1: while (true) {
              if (~param4.length >= ~var9) {
                stackOut_33_0 = param0;
                stackIn_34_0 = stackOut_33_0;
                break L0;
              } else {
                L2: {
                  int incrementValue$10 = var9;
                  var9++;
                  var10 = param4[incrementValue$10];
                  int incrementValue$11 = var9;
                  var9++;
                  var11 = param4[incrementValue$11];
                  var12 = -var8 + var11 >> param5;
                  var13 = -var10 + var7_int >> param5;
                  if (var12 == 0) {
                    break L2;
                  } else {
                    if (var13 != 0) {
                      var18 = 0;
                      int incrementValue$12 = var18;
                      var18++;
                      var19 = param4[incrementValue$12];
                      int incrementValue$13 = var18;
                      var18++;
                      var20_int = param4[incrementValue$13];
                      var14 = var12 * (-param1 + var19 >> param5) - -((-param3 + var20_int >> param5) * var13);
                      var15 = var14;
                      L3: while (true) {
                        if (var18 >= param4.length) {
                          var18 = 0;
                          int incrementValue$14 = var18;
                          var18++;
                          var19 = param2[incrementValue$14];
                          int incrementValue$15 = var18;
                          var18++;
                          var20_int = param2[incrementValue$15];
                          var16 = var12 * (-param1 + var19 >> param5) + var13 * (var20_int + -param3 >> param5);
                          var17 = var16;
                          L4: while (true) {
                            if (~var18 <= ~param2.length) {
                              L5: {
                                if (var15 >= var16) {
                                  break L5;
                                } else {
                                  if (~var14 >= ~var17) {
                                    break L5;
                                  } else {
                                    L6: {
                                      var19 = -var16 + var15;
                                      var20_int = var14 - var17;
                                      if (Math.abs(var19) >= Math.abs(var20_int)) {
                                        var18 = var20_int;
                                        break L6;
                                      } else {
                                        var18 = var19;
                                        break L6;
                                      }
                                    }
                                    var19 = ar.a(var12, (byte) 119, var13);
                                    if (var19 > 0) {
                                      var20 = ((long)var18 << param5) / (long)var19;
                                      if (~Math.abs(var20) > ~(long)Math.abs(param0)) {
                                        param0 = (int)var20;
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                              stackOut_30_0 = 2147483647;
                              stackIn_31_0 = stackOut_30_0;
                              return stackIn_31_0;
                            } else {
                              L7: {
                                int incrementValue$16 = var18;
                                var18++;
                                var19 = param2[incrementValue$16];
                                int incrementValue$17 = var18;
                                var18++;
                                var20_int = param2[incrementValue$17];
                                var21 = (-param1 + var19 >> param5) * var12 - -((var20_int + -param3 >> param5) * var13);
                                if (~var21 > ~var17) {
                                  var17 = var21;
                                  break L7;
                                } else {
                                  if (~var21 >= ~var16) {
                                    break L7;
                                  } else {
                                    var16 = var21;
                                    continue L4;
                                  }
                                }
                              }
                              continue L4;
                            }
                          }
                        } else {
                          int incrementValue$18 = var18;
                          var18++;
                          var19 = param4[incrementValue$18];
                          int incrementValue$19 = var18;
                          var18++;
                          var20_int = param4[incrementValue$19];
                          var21 = (-param1 + var19 >> param5) * var12 + (var20_int + -param3 >> param5) * var13;
                          if (~var15 >= ~var21) {
                            if (~var14 > ~var21) {
                              var14 = var21;
                              continue L3;
                            } else {
                              continue L3;
                            }
                          } else {
                            var15 = var21;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var8 = var11;
                var7_int = var10;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var7;
            stackOut_35_1 = new StringBuilder().append("fva.B(").append(param0).append(',').append(param1).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L8;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L8;
            }
          }
          L9: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param3).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param4 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param5 + ',' + -1 + ')');
        }
        return stackIn_34_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 < -119) {
              si.a(42, 62, param0[0].a(11));
              stackOut_3_0 = new nc((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("fva.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static String a(int[] param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 != null) {
              var2 = "{";
              var3 = 0;
              L1: while (true) {
                if (param0.length <= var3) {
                  stackOut_16_0 = var2 + "}";
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L2: {
                    var2 = var2 + param0[var3];
                    if (var3 < param0.length - 1) {
                      var2 = var2 + ",";
                      var3++;
                      break L2;
                    } else {
                      var3++;
                      break L2;
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2_ref;
            stackOut_18_1 = new StringBuilder().append("fva.C(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + false + ')');
        }
        return stackIn_17_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = true;
        field_o = 22;
    }
}
