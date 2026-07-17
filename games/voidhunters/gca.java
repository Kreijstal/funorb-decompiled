/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gca extends rqa {
    static char[] field_q;
    static String field_o;
    static String field_p;
    static lkb field_r;

    gca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
              stackOut_3_0 = new nc((Object) (Object) frb.a(202, 84));
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
            stackOut_5_1 = new StringBuilder().append("gca.A(");
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static sg a(pe param0, byte param1, int param2, sg param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        sg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sg[] var13 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var13 = param0.d(1000);
              var5 = 2147483647;
              if (param3.q((byte) 113) >= 0) {
                break L1;
              } else {
                var5 = cab.field_p;
                break L1;
              }
            }
            var6 = null;
            var7 = 0;
            L2: while (true) {
              if (var13.length <= var7) {
                L3: {
                  if (param1 == 63) {
                    break L3;
                  } else {
                    field_o = null;
                    break L3;
                  }
                }
                stackOut_25_0 = var6;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                L4: {
                  var8 = var13[var7];
                  if (var8 == null) {
                    var7++;
                    break L4;
                  } else {
                    if (param3 == var8) {
                      var7++;
                      break L4;
                    } else {
                      L5: {
                        if (var8.q((byte) 71) != param3.q((byte) 84)) {
                          break L5;
                        } else {
                          if (var8.q((byte) 86) != sja.field_c) {
                            break L4;
                          } else {
                            if (var8.o((byte) -117) == param2) {
                              break L4;
                            } else {
                              if (null == var8.k((byte) -108)) {
                                break L5;
                              } else {
                                if (var8.k((byte) -108).a((byte) 66) != param2) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      L6: {
                        if (!param3.g(false)) {
                          break L6;
                        } else {
                          if (!param0.a((anb) (Object) var8, 119)) {
                            break L6;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var9 = var8.field_d + -param3.field_d;
                      var10 = var8.field_e - param3.field_e;
                      var11 = ar.a(var9, (byte) 107, var10);
                      if (var5 > var11) {
                        var5 = var11;
                        var6 = (Object) (Object) var8;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("gca.C(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          L8: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
        return (sg) (Object) stackIn_26_0;
    }

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        field_q = null;
        field_r = null;
    }

    final static int[] a(byte param0, int[] param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        Object stackIn_14_0 = null;
        int[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_21_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = 0;
            var3_int = 0;
            L1: while (true) {
              if (param1.length <= var3_int) {
                var12 = new int[-(var2_int * 2) + (param1.length + param1.length)];
                var11 = var12;
                var10 = var11;
                var9 = var10;
                var3 = var9;
                var4 = 0;
                L2: while (true) {
                  if (param1.length <= var4) {
                    var4 = param1.length;
                    if (param0 >= 63) {
                      L3: {
                        var5 = -2 + param1.length;
                        if (var5 < 0) {
                          break L3;
                        } else {
                          L4: {
                            var6 = param1[var5];
                            var7 = param1[1 + var5];
                            if (var7 != 0) {
                              var12[var4] = var6;
                              var3[var4 - -1] = -var7;
                              var4 += 2;
                              break L4;
                            } else {
                              var5 -= 2;
                              break L4;
                            }
                          }
                          var5 -= 2;
                          var5 -= 2;
                          break L3;
                        }
                      }
                      stackOut_21_0 = (int[]) var3;
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    } else {
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      return (int[]) (Object) stackIn_14_0;
                    }
                  } else {
                    var3[var4] = param1[var4];
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L5: {
                  var4 = param1[var3_int - -1];
                  if (var4 != 0) {
                    var3_int += 2;
                    break L5;
                  } else {
                    var2_int++;
                    var3_int += 2;
                    break L5;
                  }
                }
                var3_int += 2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("gca.B(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_22_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new char[128];
        field_o = "Power plant";
        field_p = "Honour";
        field_r = new lkb();
    }
}
