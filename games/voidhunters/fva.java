/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fva extends rqa {
    static int field_o;
    static boolean field_p;

    fva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int[] param2, int param3, int[] param4, int param5, int param6) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
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
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var22 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var7_int = param4[-2 + param4.length];
              var8 = param4[param4.length - 1];
              if (param6 == -1) {
                break L1;
              } else {
                field_o = -71;
                break L1;
              }
            }
            var9 = 0;
            L2: while (true) {
              if (param4.length <= var9) {
                stackOut_34_0 = param0;
                stackIn_35_0 = stackOut_34_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  incrementValue$10 = var9;
                  var9++;
                  var10 = param4[incrementValue$10];
                  incrementValue$11 = var9;
                  var9++;
                  var11 = param4[incrementValue$11];
                  var12 = -var8 + var11 >> param5;
                  var13 = -var10 + var7_int >> param5;
                  if (var12 == 0) {
                    break L3;
                  } else {
                    if (-1 != (var13 ^ -1)) {
                      var18 = 0;
                      incrementValue$12 = var18;
                      var18++;
                      var19 = param4[incrementValue$12];
                      incrementValue$13 = var18;
                      var18++;
                      var20_int = param4[incrementValue$13];
                      var14 = var12 * (-param1 + var19 >> param5) - -((-param3 + var20_int >> param5) * var13);
                      var15 = var14;
                      L4: while (true) {
                        if (var18 >= param4.length) {
                          var18 = 0;
                          incrementValue$14 = var18;
                          var18++;
                          var19 = param2[incrementValue$14];
                          incrementValue$15 = var18;
                          var18++;
                          var20_int = param2[incrementValue$15];
                          var16 = var12 * (-param1 + var19 >> param5) + var13 * (var20_int + -param3 >> param5);
                          var17 = var16;
                          L5: while (true) {
                            if (var18 >= param2.length) {
                              L6: {
                                if (var15 >= var16) {
                                  break L6;
                                } else {
                                  if (var14 <= var17) {
                                    break L6;
                                  } else {
                                    L7: {
                                      var19 = -var16 + var15;
                                      var20_int = var14 - var17;
                                      if (Math.abs(var19) >= Math.abs(var20_int)) {
                                        var18 = var20_int;
                                        break L7;
                                      } else {
                                        var18 = var19;
                                        break L7;
                                      }
                                    }
                                    var19 = ar.a(var12, (byte) 119, var13);
                                    if (-1 > (var19 ^ -1)) {
                                      var20 = ((long)var18 << param5) / (long)var19;
                                      if ((Math.abs(var20) ^ -1L) > ((long)Math.abs(param0) ^ -1L)) {
                                        param0 = (int)var20;
                                        break L3;
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                              stackOut_31_0 = 2147483647;
                              stackIn_32_0 = stackOut_31_0;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              incrementValue$16 = var18;
                              var18++;
                              var19 = param2[incrementValue$16];
                              incrementValue$17 = var18;
                              var18++;
                              var20_int = param2[incrementValue$17];
                              var21 = (-param1 + var19 >> param5) * var12 - -((var20_int + -param3 >> param5) * var13);
                              if (var21 < var17) {
                                var17 = var21;
                                continue L5;
                              } else {
                                if (var21 <= var16) {
                                  continue L5;
                                } else {
                                  var16 = var21;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          incrementValue$18 = var18;
                          var18++;
                          var19 = param4[incrementValue$18];
                          incrementValue$19 = var18;
                          var18++;
                          var20_int = param4[incrementValue$19];
                          var21 = (-param1 + var19 >> param5) * var12 + (var20_int + -param3 >> param5) * var13;
                          if (var15 <= var21) {
                            if (var14 < var21) {
                              var14 = var21;
                              continue L4;
                            } else {
                              continue L4;
                            }
                          } else {
                            var15 = var21;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                var8 = var11;
                var7_int = var10;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var7);
            stackOut_36_1 = new StringBuilder().append("fva.B(").append(param0).append(',').append(param1).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          L9: {
            stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param3).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param4 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L9;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_32_0;
        } else {
          return stackIn_35_0;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        nc stackOut_1_0 = null;
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
              stackOut_3_0 = new nc("void");
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("fva.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static String a(int[] param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 != null) {
              var2 = "{";
              var3 = 0;
              L1: while (true) {
                if (param0.length <= var3) {
                  if (!param1) {
                    stackOut_14_0 = var2 + "}";
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackOut_12_0 = (String) null;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  L2: {
                    var2 = var2 + param0[var3];
                    if (var3 < param0.length - 1) {
                      var2 = var2 + ",";
                      break L2;
                    } else {
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
            stackOut_16_0 = (RuntimeException) (var2_ref);
            stackOut_16_1 = new StringBuilder().append("fva.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_15_0;
        }
    }

    static {
        field_p = true;
        field_o = 22;
    }
}
