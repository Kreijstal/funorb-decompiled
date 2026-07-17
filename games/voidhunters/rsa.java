/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rsa extends rqa {
    static llb field_o;

    final static int[] a(ml param0, int param1) {
        ij var2 = null;
        RuntimeException var2_ref = null;
        hua var3 = null;
        int[] var4 = null;
        int var5 = 0;
        hua var6 = null;
        int var7 = 0;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2 = new ij();
              ct.a(param0, 83, var2);
              var3 = (hua) (Object) var2.c((byte) -103);
              if (var3.field_d == -1) {
                break L1;
              } else {
                var2.b(-10258, (ksa) (Object) var3);
                break L1;
              }
            }
            L2: {
              var4 = new int[var2.c(3)];
              var5 = 0;
              if (param1 < -109) {
                break L2;
              } else {
                field_o = null;
                break L2;
              }
            }
            var6 = (hua) (Object) var2.d(0);
            L3: while (true) {
              if (var6 == null) {
                stackOut_8_0 = (int[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                int incrementValue$2 = var5;
                var5++;
                var4[incrementValue$2] = var6.field_d;
                var6 = (hua) (Object) var2.a((byte) 55);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2_ref;
            stackOut_10_1 = new StringBuilder().append("rsa.C(");
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    public static void a(int param0) {
        field_o = null;
    }

    rsa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              sva.field_m = param0[0].a(72);
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("rsa.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            var6_int = -param3 + param4;
            var7 = param1 - param5;
            if (param2 == ~var7) {
              L1: {
                if (0 == var6_int) {
                  break L1;
                } else {
                  sk.a(-115, param3, param5, param4, param0);
                  break L1;
                }
              }
              return;
            } else {
              if (var6_int != 0) {
                L2: {
                  if (0 <= var7) {
                    break L2;
                  } else {
                    var7 = -var7;
                    break L2;
                  }
                }
                L3: {
                  if (var6_int >= 0) {
                    break L3;
                  } else {
                    var6_int = -var6_int;
                    break L3;
                  }
                }
                L4: {
                  if (var7 >= var6_int) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L4;
                  }
                }
                L5: {
                  var8 = stackIn_15_0;
                  if (var8 == 0) {
                    break L5;
                  } else {
                    var9 = param5;
                    param5 = param3;
                    var10 = param1;
                    param3 = var9;
                    param1 = param4;
                    param4 = var10;
                    break L5;
                  }
                }
                L6: {
                  if (~param1 <= ~param5) {
                    break L6;
                  } else {
                    var9 = param5;
                    param5 = param1;
                    var10 = param3;
                    param1 = var9;
                    param3 = param4;
                    param4 = var10;
                    break L6;
                  }
                }
                L7: {
                  var9 = param3;
                  var10 = -param5 + param1;
                  var11 = -param3 + param4;
                  var12 = -(var10 >> 1);
                  if (param3 >= param4) {
                    stackOut_21_0 = -1;
                    stackIn_22_0 = stackOut_21_0;
                    break L7;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L7;
                  }
                }
                L8: {
                  var13 = stackIn_22_0;
                  if (var11 < 0) {
                    var11 = -var11;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var8 == 0) {
                    var16 = param5;
                    var14 = var16;
                    if (~param1 > ~var16) {
                      break L9;
                    } else {
                      L10: {
                        var12 = var12 + var11;
                        rba.field_b[var9][var16] = param0;
                        if (var12 <= 0) {
                          var16++;
                          break L10;
                        } else {
                          var12 = var12 - var10;
                          var9 = var9 + var13;
                          break L10;
                        }
                      }
                      var16++;
                      var16++;
                      break L9;
                    }
                  } else {
                    var14 = param5;
                    L11: while (true) {
                      if (~param1 > ~var14) {
                        break L9;
                      } else {
                        rba.field_b[var14][var9] = param0;
                        var12 = var12 + var11;
                        if (var12 <= 0) {
                          var14++;
                          var14++;
                          continue L11;
                        } else {
                          var9 = var9 + var13;
                          var12 = var12 - var10;
                          var14++;
                          var14++;
                          continue L11;
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                bpa.a(param0, param3, (byte) -25, param5, param1);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var6, "rsa.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
    }
}
