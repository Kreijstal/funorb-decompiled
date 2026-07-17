/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static boolean[] field_a;
    static String field_b;
    static String[] field_d;
    static int field_c;

    final static kc[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
        int var9 = 0;
        kc[] var10 = null;
        kc[] var11_ref_kc__ = null;
        int var11 = 0;
        int var12 = 0;
        kc var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = Main.field_T;
        var9 = param3 + param1 + param6;
        var10 = new kc[]{new kc(var9, var9), new kc(param4, var9), new kc(var9, var9), new kc(var9, param4), new kc(64, 64), new kc(var9, param4), new kc(var9, var9), new kc(param4, var9), new kc(var9, var9)};
        var11_ref_kc__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_kc__.length) {
            var10 = var11_ref_kc__;
            var11 = 0;
            L1: while (true) {
              if (param1 <= var11) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= param1) {
                    var11 = 0;
                    L3: while (true) {
                      if (param4 <= var11) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= param4 >> 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (param3 > var12) {
                                var10[1].field_r[(var9 + (-var12 - 1)) * param4 - -var11] = param5;
                                var10[3].field_r[var9 * var11 - (var12 + (1 + -var9))] = param5;
                                var10[7].field_r[var12 * param4 - -var11] = param5;
                                var10[5].field_r[var9 * var11 + var12] = param5;
                                var12++;
                                continue L5;
                              } else {
                                var11++;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (param1 <= var12) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_r[(-1 + (var9 - var12)) * param4 + var11] = param0;
                            var10[5].field_r[-var12 - -var9 + (-1 + var11 * var9)] = param0;
                            var10[1].field_r[var11 + var12 * param4] = param7;
                            var10[3].field_r[var12 + var11 * var9] = param7;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var12 < var9) {
                        var10[0].field_r[var12 - -(var11 * var9)] = param7;
                        var10[0].field_r[var9 * var12 + var11] = param7;
                        if (var9 + -var11 > var12) {
                          var10[2].field_r[var12 + var11 * var9] = param7;
                          var10[6].field_r[var12 * var9 - -var11] = param7;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_r[(var9 - var11 - 1) * var9 + var12] = param0;
                    var10[8].field_r[(-1 + (-var11 + var9)) * var9 + var12] = param0;
                    var10[2].field_r[-1 - (-var9 - -var11 - var9 * var12)] = param0;
                    var10[8].field_r[var9 * var12 - var11 - (1 + -var9)] = param0;
                    var12++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_kc__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_r.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_r[var14] = param2;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final static qa a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        qa[] var3 = null;
        int var4 = 0;
        qa var5 = null;
        int var6 = 0;
        qa stackIn_4_0 = null;
        qa stackIn_9_0 = null;
        qa stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        qa stackOut_3_0 = null;
        qa stackOut_13_0 = null;
        qa stackOut_8_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = Main.field_T;
        try {
          L0: {
            var2 = he.a(-24949, param0, "jagex-last-login-method");
            if (var2 == null) {
              stackOut_3_0 = bf.field_c;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var3 = ff.a(-21739);
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  stackOut_13_0 = bf.field_c;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (!var5.a(true, var2)) {
                    var4++;
                    continue L1;
                  } else {
                    stackOut_8_0 = (qa) var5;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2_ref;
            stackOut_15_1 = new StringBuilder().append("ma.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + -3825 + 41);
        }
        return stackIn_14_0;
    }

    final static ac a(Throwable param0, String param1) {
        ac var2 = null;
        if (!(param0 instanceof ac)) {
            var2 = new ac(param0, param1);
        } else {
            var2 = (ac) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        }
        return var2;
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Main.field_T;
          d.field_a = null;
          ed.field_c = 0;
          tf.field_r = null;
          var2 = ak.field_O;
          ak.field_O = ej.field_kb;
          if (51 == param1) {
            dg.field_H.field_l = 2;
            break L0;
          } else {
            if (param1 != 50) {
              dg.field_H.field_l = 1;
              break L0;
            } else {
              dg.field_H.field_l = 5;
              break L0;
            }
          }
        }
        L1: {
          ej.field_kb = var2;
          dg.field_H.field_b = dg.field_H.field_b + 1;
          if (param0 > dg.field_H.field_b) {
            break L1;
          } else {
            if (51 == param1) {
              return 2;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (dg.field_H.field_b < 2) {
            break L2;
          } else {
            if (param1 != 50) {
              break L2;
            } else {
              return 5;
            }
          }
        }
        if (dg.field_H.field_b < 4) {
          return -1;
        } else {
          return 1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_c = 0;
    }
}
