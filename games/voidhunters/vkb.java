/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vkb extends rqa {
    final static int a(int param0, int param1) {
        if (param0 < 8) {
            return -114;
        }
        int var2 = 0;
        if (!(param1 <= 65535)) {
            param1 = param1 >>> 16;
            var2 = var2 | 16;
        }
        if (!(param1 <= 255)) {
            param1 = param1 >>> 8;
            var2 = var2 | 8;
        }
        if (param1 > 15) {
            var2 = var2 | 4;
            param1 = param1 >>> 4;
        }
        if (param1 > 3) {
            var2 = var2 | 2;
            param1 = param1 >>> 2;
        }
        if (param1 > 1) {
            param1 = param1 >>> 1;
            var2 = var2 | 1;
        }
        return var2;
    }

    vkb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = null;
                nc discarded$2 = ((vkb) this).a((nc[]) null, -72);
                break L1;
              }
            }
            tcb.field_q = param0[0].a(41);
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("vkb.A(");
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

    final static void a(int param0) {
        RuntimeException var1 = null;
        double var1_double = 0.0;
        int var3 = 0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        double var16_double = 0.0;
        int var17 = 0;
        int var18 = 0;
        double var18_double = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = VoidHunters.field_G;
        try {
          L0: {
            if (klb.field_o == null) {
              L1: {
                klb.field_o = new int[65536];
                if (param0 == -10693) {
                  break L1;
                } else {
                  int discarded$1 = vkb.a(43, 19);
                  break L1;
                }
              }
              var1_double = 0.7 + (-0.015 + 0.03 * Math.random());
              var3 = 0;
              L2: while (true) {
                if (var3 >= 65536) {
                  break L0;
                } else {
                  L3: {
                    var4 = 0.0078125 + (double)((64562 & var3) >> 10) / 64.0;
                    var6 = 0.0625 + (double)(7 & var3 >> 7) / 8.0;
                    var8 = (double)(var3 & 127) / 128.0;
                    var10 = var8;
                    var12 = var8;
                    var14 = var8;
                    if (var6 == 0.0) {
                      break L3;
                    } else {
                      L4: {
                        if (0.5 > var8) {
                          var16_double = var8 * (1.0 + var6);
                          break L4;
                        } else {
                          var16_double = var8 + var6 - var8 * var6;
                          break L4;
                        }
                      }
                      L5: {
                        var18_double = 2.0 * var8 - var16_double;
                        var20 = 0.3333333333333333 + var4;
                        if (1.0 < var20) {
                          var20 = var20 - 1.0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        var22 = var4;
                        var24 = var4 - 0.3333333333333333;
                        if (6.0 * var22 < 1.0) {
                          var12 = var22 * (6.0 * (-var18_double + var16_double)) + var18_double;
                          break L6;
                        } else {
                          if (var22 * 2.0 >= 1.0) {
                            if (2.0 > 3.0 * var22) {
                              var12 = (var16_double - var18_double) * (-var22 + 0.6666666666666666) * 6.0 + var18_double;
                              break L6;
                            } else {
                              var12 = var18_double;
                              break L6;
                            }
                          } else {
                            var12 = var16_double;
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (1.0 <= 6.0 * var20) {
                          if (2.0 * var20 >= 1.0) {
                            if (2.0 <= 3.0 * var20) {
                              var10 = var18_double;
                              break L7;
                            } else {
                              var10 = 6.0 * ((-var18_double + var16_double) * (-var20 + 0.6666666666666666)) + var18_double;
                              break L7;
                            }
                          } else {
                            var10 = var16_double;
                            break L7;
                          }
                        } else {
                          var10 = 6.0 * (-var18_double + var16_double) * var20 + var18_double;
                          break L7;
                        }
                      }
                      L8: {
                        if (var24 < 0.0) {
                          var24 = var24 + 1.0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (1.0 <= var24 * 6.0) {
                        if (1.0 > var24 * 2.0) {
                          var14 = var16_double;
                          break L3;
                        } else {
                          if (2.0 <= var24 * 3.0) {
                            var14 = var18_double;
                            break L3;
                          } else {
                            var14 = 6.0 * ((-var24 + 0.6666666666666666) * (var16_double - var18_double)) + var18_double;
                            break L3;
                          }
                        }
                      } else {
                        var14 = var18_double + 6.0 * (var16_double - var18_double) * var24;
                        break L3;
                      }
                    }
                  }
                  var10 = Math.pow(var10, var1_double);
                  var12 = Math.pow(var12, var1_double);
                  var14 = Math.pow(var14, var1_double);
                  var16 = (int)(256.0 * var10);
                  var17 = (int)(var12 * 256.0);
                  var18 = (int)(var14 * 256.0);
                  var19 = (var17 << 8) + ((var16 << 16) - -var18);
                  klb.field_o[var3] = var19;
                  var3++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "vkb.B(" + param0 + 41);
        }
    }

    static {
    }
}
