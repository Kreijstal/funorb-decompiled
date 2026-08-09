/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rsa extends rqa {
    static llb field_o;

    final static int[] a(ml param0, int param1) {
        int incrementValue$1 = 0;
        ij var2 = null;
        RuntimeException var2_ref = null;
        hua var3 = null;
        int[] var4 = null;
        int var5 = 0;
        hua var6 = null;
        int var7 = 0;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2 = new ij();
              ct.a(param0, 83, var2);
              var3 = (hua) ((Object) var2.c((byte) -103));
              if (0 == (var3.field_d ^ -1)) {
                break L1;
              } else {
                var2.b(-10258, var3);
                break L1;
              }
            }
            L2: {
              var4 = new int[var2.c(3)];
              var5 = 0;
              if (param1 < -109) {
                break L2;
              } else {
                field_o = (llb) null;
                break L2;
              }
            }
            var6 = (hua) ((Object) var2.d(0));
            L3: while (true) {
              if (var6 == null) {
                stackIn_9_0 = (int[]) (var4);
                break L0;
              } else {
                incrementValue$1 = var5;
                var5++;
                var4[incrementValue$1] = var6.field_d;
                var6 = (hua) ((Object) var2.a((byte) 55));
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2_ref);

            stackIn_12_1 = new StringBuilder().append("rsa.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -1) {
            field_o = (llb) null;
        }
    }

    rsa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              sva.field_m = param0[0].a(72);
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (llb) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("rsa.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        var15 = VoidHunters.field_G;
        try {
          L0: {
            var6_int = -param3 + param4;
            var7 = param1 - param5;
            if (param2 == (var7 ^ -1)) {
              L1: {
                if (0 == var6_int) {
                  break L1;
                } else {
                  sk.a(-115, param3, param5, param4, param0);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (-1 != (var6_int ^ -1)) {
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
                    stackIn_15_0 = 0;
                    break L4;
                  } else {
                    stackIn_15_0 = 1;
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
                  if (param1 >= param5) {
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
                  var12 = -(var10 >> 1136328801);
                  if (param3 >= param4) {
                    stackIn_22_0 = -1;
                    break L7;
                  } else {
                    stackIn_22_0 = 1;
                    break L7;
                  }
                }
                L8: {
                  var13 = stackIn_22_0;
                  if ((var11 ^ -1) > -1) {
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
                    L10: while (true) {
                      if (param1 < var16) {
                        break L9;
                      } else {
                        L11: {
                          var12 = var12 + var11;
                          rba.field_b[var9][var16] = param0;
                          if ((var12 ^ -1) >= -1) {
                            break L11;
                          } else {
                            var12 = var12 - var10;
                            var9 = var9 + var13;
                            break L11;
                          }
                        }
                        var16++;
                        continue L10;
                      }
                    }
                  } else {
                    var14 = param5;
                    L12: while (true) {
                      if (param1 < var14) {
                        break L9;
                      } else {
                        L13: {
                          rba.field_b[var14][var9] = param0;
                          var12 = var12 + var11;
                          if ((var12 ^ -1) >= -1) {
                            break L13;
                          } else {
                            var9 = var9 + var13;
                            var12 = var12 - var10;
                            break L13;
                          }
                        }
                        var14++;
                        continue L12;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                bpa.a(param0, param3, (byte) -25, param5, param1);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var6), "rsa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
    }
}
