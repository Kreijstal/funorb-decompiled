/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb {
    int field_g;
    int field_f;
    int field_e;
    int field_b;
    int field_d;
    static vh field_c;
    int field_h;
    static String field_a;

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param3 == -28361) {
              param7 = param7 - param1[2];
              param5 = param5 - param1[0];
              param8 = param8 - param1[2];
              param2 = param2 - param1[0];
              param0 = param0 - param1[1];
              param6 = param6 - param1[1];
              var9_int = param7 * param1[11] + (param1[9] * param2 + param1[10] * param6) >> 16;
              if (var9_int <= 0) {
                return;
              } else {
                var10 = param1[10] * param0 + param5 * param1[9] + param1[11] * param8 >> 16;
                if (var10 > 0) {
                  var11 = param1[3] * param2 - (-(param6 * param1[4]) + -(param1[5] * param7)) >> 7;
                  var12 = param7 * param1[8] + param6 * param1[7] + param1[6] * param2 >> 7;
                  var13 = param0 * param1[4] + param1[3] * param5 - -(param8 * param1[5]) >> 7;
                  var13 = qh.field_b - (-fb.field_q - var13 / var10);
                  var12 = var12 / var9_int + (qh.field_c + fb.field_d);
                  var11 = var11 / var9_int + qh.field_b + fb.field_q;
                  var14 = param8 * param1[8] + param1[6] * param5 + param0 * param1[7] >> 7;
                  var14 = qh.field_c - (-fb.field_d + -(var14 / var10));
                  qh.d(var11, var12, var13, var14, param4);
                  break L0;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var9;
            stackOut_9_1 = new StringBuilder().append("bb.G(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        var14 = Pool.field_O;
        try {
          L0: {
            if (param4 <= param2) {
              return;
            } else {
              if (param1 <= param2 + 1) {
                return;
              } else {
                L1: {
                  if (param2 + 5 >= param1) {
                    break L1;
                  } else {
                    if (param3 != param0) {
                      var7_int = (param3 & param0 & 1) + ((param0 >> 1) - -(param3 >> 1));
                      var8 = param2;
                      var9 = param3;
                      var10 = param0;
                      if (param5 <= -34) {
                        var11 = param2;
                        L2: while (true) {
                          if (var11 >= param1) {
                            bb.a(var9, var8, param2, param3, param4, (byte) -95, param6);
                            bb.a(param0, param1, var8, var10, param4, (byte) -99, param6);
                            break L0;
                          } else {
                            L3: {
                              var12 = ep.field_H[var11];
                              if (param6) {
                                stackOut_26_0 = kb.field_g[var12];
                                stackIn_27_0 = stackOut_26_0;
                                break L3;
                              } else {
                                stackOut_25_0 = ah.field_c[var12];
                                stackIn_27_0 = stackOut_25_0;
                                break L3;
                              }
                            }
                            var13 = stackIn_27_0;
                            if (var13 <= var7_int) {
                              L4: {
                                if (var13 <= var10) {
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              var11++;
                              continue L2;
                            } else {
                              L5: {
                                ep.field_H[var11] = ep.field_H[var8];
                                int incrementValue$2 = var8;
                                var8++;
                                ep.field_H[incrementValue$2] = var12;
                                if (var9 > var13) {
                                  var9 = var13;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              var11++;
                              continue L2;
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = param1 - 1;
                L6: while (true) {
                  if (var7_int <= param2) {
                    return;
                  } else {
                    var8 = param2;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = ep.field_H[var8];
                          var10 = ep.field_H[var8 - -1];
                          int discarded$3 = 0;
                          if (he.a(var9, param6, var10)) {
                            ep.field_H[var8] = var10;
                            ep.field_H[var8 + 1] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var7, "bb.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static double a(byte param0, int param1, long param2) {
        int var4 = 0;
        return (double)param2 / (double)65536;
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void a(byte param0) {
        if (param0 >= -43) {
            bb.a((byte) 122);
        }
        field_a = null;
        field_c = null;
    }

    final static int a(int param0, int param1, byte param2) {
        return (qh.field_b - -fb.field_q << 2) + (param1 << 11) / param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Year";
    }
}
