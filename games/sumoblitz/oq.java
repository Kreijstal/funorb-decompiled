/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq extends pj {
    int[] field_u;
    static String field_r;
    private int[][] field_t;
    private int[] field_s;
    private String[] field_v;

    final void a(fs param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.e(-31302);
              if (0 != var3_int) {
                int discarded$4 = 111;
                this.a(param0, var3_int);
                continue L1;
              } else {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    oq.a(-64);
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("oq.G(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final static wb[] a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        int var9 = 0;
        wb[] var10 = null;
        wb[] var11_ref_wb__ = null;
        int var11 = 0;
        int var12 = 0;
        wb var13_ref_wb = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var15 = Sumoblitz.field_L ? 1 : 0;
        var9 = param2 + (param3 + param4);
        var10 = new wb[]{new wb(var9, var9), new wb(param8, var9), new wb(var9, var9), new wb(var9, param8), new wb(64, 64), new wb(var9, param8), new wb(var9, var9), new wb(param8, var9), new wb(var9, var9)};
        var11_ref_wb__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_wb__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= param3) {
                var11 = 0;
                L2: while (true) {
                  if (param3 <= var11) {
                    var11 = -16 / ((30 - param6) / 43);
                    var12 = 0;
                    L3: while (true) {
                      if (var12 >= param8) {
                        var12 = 0;
                        L4: while (true) {
                          if (var12 >= param8 >> 1) {
                            return var10;
                          } else {
                            var16 = 0;
                            var13 = var16;
                            L5: while (true) {
                              if (var16 >= param4) {
                                var12++;
                                continue L4;
                              } else {
                                var10[1].field_C[var12 + (-1 + -var16 + var9) * param8] = param1;
                                var10[3].field_C[var9 * var12 - (var16 + 1) - -var9] = param1;
                                var10[7].field_C[var12 + param8 * var16] = param1;
                                var10[5].field_C[var9 * var12 - -var16] = param1;
                                var16++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var13 = 0;
                        L6: while (true) {
                          if (param3 <= var13) {
                            var12++;
                            continue L3;
                          } else {
                            var10[7].field_C[var12 + param8 * (-1 + (-var13 + var9))] = param7;
                            var10[5].field_C[var9 - 1 + -var13 + var9 * var12] = param7;
                            var10[1].field_C[var12 + var13 * param8] = param5;
                            var10[3].field_C[var13 + var12 * var9] = param5;
                            var13++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L2;
                      } else {
                        var10[0].field_C[var12 - -(var11 * var9)] = param5;
                        var10[0].field_C[var11 + var12 * var9] = param5;
                        if (var9 + -var11 > var12) {
                          var10[2].field_C[var12 + var9 * var11] = param5;
                          var10[6].field_C[var11 + var9 * var12] = param5;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 > var12) {
                    var10[6].field_C[var12 + (-1 + (var9 + -var11)) * var9] = param7;
                    var10[8].field_C[var12 + var9 * (-1 + (var9 - var11))] = param7;
                    var10[2].field_C[-1 - -var9 + -var11 + var12 * var9] = param7;
                    var10[8].field_C[-var11 + (var9 - 1) + var12 * var9] = param7;
                    var12++;
                    continue L8;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13_ref_wb = var11_ref_wb__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13_ref_wb.field_C.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13_ref_wb.field_C[var14] = param0;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final String f(int param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        var6 = var6;
        if (((oq) this).field_v == null) {
            return "";
        }
        StringBuilder discarded$0 = var6.append(((oq) this).field_v[0]);
        int var3 = 1;
        if (param0 != 1118) {
            String discarded$1 = ((oq) this).f(26);
        }
        while (((oq) this).field_v.length > var3) {
            StringBuilder discarded$2 = var6.append("...");
            StringBuilder discarded$3 = var6.append(((oq) this).field_v[var3]);
            var3++;
        }
        return var6.toString();
    }

    public static void g() {
        field_r = null;
    }

    private final void a(fs param0, int param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ts var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != param1) {
                if (param1 == 2) {
                  var4_int = param0.e(-31302);
                  ((oq) this).field_u = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      ((oq) this).field_u[var5] = param0.a(255);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (param1 != 3) {
                    if (4 != param1) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param0.e(-31302);
                    ((oq) this).field_s = new int[var4_int];
                    ((oq) this).field_t = new int[var4_int][];
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L4: {
                          var6 = param0.a(255);
                          var7 = ij.a(10341, var6);
                          if (var7 == null) {
                            break L4;
                          } else {
                            ((oq) this).field_s[var5] = var6;
                            ((oq) this).field_t[var5] = new int[var7.field_f];
                            var8 = 0;
                            L5: while (true) {
                              if (var8 >= var7.field_f) {
                                break L4;
                              } else {
                                ((oq) this).field_t[var5][var8] = param0.a(255);
                                var8++;
                                continue L5;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                int discarded$1 = -27224;
                ((oq) this).field_v = cn.a('<', param0.d(-1));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("oq.B(");
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
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + 111 + 41);
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (!(null == ((oq) this).field_u)) {
            for (var2 = 0; var2 < ((oq) this).field_u.length; var2++) {
                ((oq) this).field_u[var2] = ic.a(((oq) this).field_u[var2], 32768);
            }
        }
        if (param0 > -102) {
            ((oq) this).field_s = null;
        }
    }

    oq() {
    }

    final static void a(int param0) {
        mn.b((byte) -116);
        if (param0 != -24233) {
            wb[] discarded$0 = oq.a(99, -71, 95, 31, -80, 103, (byte) 57, 84, 30);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Player names can be up to 12 letters, numbers and underscores";
    }
}
