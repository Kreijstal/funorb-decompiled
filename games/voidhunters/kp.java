/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp extends rqa {
    static String field_o;

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
              if (param1 < -119) {
                break L1;
              } else {
                kp.a(9);
                break L1;
              }
            }
            stackOut_2_0 = new nc(frb.a(228, 95));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("kp.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        kla var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var1_int = 0;
              var2 = -1;
              if (param0 <= -19) {
                break L1;
              } else {
                kp.e(-126);
                break L1;
              }
            }
            var3 = -1;
            var4 = -1;
            var5 = feb.a(og.field_r, true);
            var6 = 0;
            L2: while (true) {
              if (dma.field_j <= var6) {
                L3: {
                  if (0 != (var2 ^ -1)) {
                    var6 = dma.field_j;
                    nr.a(var5, var3, var6, 2, var4, var2);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                var7 = -1;
                var8 = -1;
                var9 = 0;
                L4: while (true) {
                  if (var9 >= dma.field_g) {
                    L5: {
                      if (-1 != var7) {
                        L6: {
                          if (var2 == -1) {
                            break L6;
                          } else {
                            L7: {
                              if ((Math.abs(var2 - var7) ^ -1) <= -9) {
                                break L7;
                              } else {
                                if (8 <= Math.abs(-var8 + var3)) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            nr.a(var5, var3, var6, 2, var4, var2);
                            var2 = -1;
                            var3 = -1;
                            if ((var7 ^ -1) != 0) {
                              var3 = var8;
                              var2 = var7;
                              var4 = var6;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L8: {
                          if ((var2 ^ -1) == 0) {
                            var4 = var6;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var2 = var7;
                        var3 = var8;
                        break L5;
                      } else {
                        if (0 != (var2 ^ -1)) {
                          var3 = -1;
                          var2 = -1;
                          break L5;
                        } else {
                          var6++;
                          continue L2;
                        }
                      }
                    }
                    var6++;
                    continue L2;
                  } else {
                    L9: {
                      if (-1 != (dma.field_i[var1_int] ^ -1)) {
                        var8 = var9;
                        if ((var7 ^ -1) == 0) {
                          var7 = var9;
                          break L9;
                        } else {
                          var1_int++;
                          var9++;
                          continue L4;
                        }
                      } else {
                        break L9;
                      }
                    }
                    var1_int++;
                    var9++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "kp.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 <= 22) {
            field_o = (String) null;
        }
        field_o = null;
    }

    kp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "Private";
    }
}
