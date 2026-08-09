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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
                stackIn_37_0 = param0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  incrementValue$0 = var9;
                  var9++;
                  var10 = param4[incrementValue$0];
                  incrementValue$1 = var9;
                  var9++;
                  var11 = param4[incrementValue$1];
                  var12 = -var8 + var11 >> param5;
                  var13 = -var10 + var7_int >> param5;
                  if (var12 == 0) {
                    break L3;
                  } else {
                    if (-1 != (var13 ^ -1)) {
                      var18 = 0;
                      incrementValue$2 = var18;
                      var18++;
                      var19 = param4[incrementValue$2];
                      incrementValue$3 = var18;
                      var18++;
                      var20_int = param4[incrementValue$3];
                      var14 = var12 * (-param1 + var19 >> param5) - -((-param3 + var20_int >> param5) * var13);
                      var15 = var14;
                      L4: while (true) {
                        if (var18 >= param4.length) {
                          var18 = 0;
                          incrementValue$4 = var18;
                          var18++;
                          var19 = param2[incrementValue$4];
                          incrementValue$5 = var18;
                          var18++;
                          var20_int = param2[incrementValue$5];
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
                              stackIn_34_0 = 2147483647;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              incrementValue$6 = var18;
                              var18++;
                              var19 = param2[incrementValue$6];
                              incrementValue$7 = var18;
                              var18++;
                              var20_int = param2[incrementValue$7];
                              var21 = (-param1 + var19 >> param5) * var12 - -((var20_int + -param3 >> param5) * var13);
                              if ((var21 ^ -1) > (var17 ^ -1)) {
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
                          incrementValue$8 = var18;
                          var18++;
                          var19 = param4[incrementValue$8];
                          incrementValue$9 = var18;
                          var18++;
                          var20_int = param4[incrementValue$9];
                          var21 = (-param1 + var19 >> param5) * var12 + (var20_int + -param3 >> param5) * var13;
                          if ((var15 ^ -1) >= (var21 ^ -1)) {
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
            stackIn_40_0 = (RuntimeException) (var7);

            stackIn_40_1 = new StringBuilder().append("fva.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L8;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L9;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_41_0), stackIn_44_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_34_0;
        } else {
          return stackIn_37_0;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              si.a(42, 62, param0[0].a(11));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("fva.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        int var3 = 0;
        int var4 = 0;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 != null) {
              var2 = "{";
              var3 = 0;
              L1: while (true) {
                if (param0.length <= var3) {
                  if (!param1) {
                    stackIn_15_0 = var2 + "}";
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackIn_13_0 = (String) null;
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
            stackIn_18_0 = (RuntimeException) (var2_ref);

            stackIn_18_1 = new StringBuilder().append("fva.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
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
