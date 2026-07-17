/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static String field_f;
    private cn field_c;
    static int[] field_b;
    static String field_d;
    private cn field_e;
    static String[] field_a;

    final cn d(int param0) {
        if (param0 > -96) {
            wb.a(79);
        }
        cn var2 = ((wb) this).field_e;
        if (!(var2 != ((wb) this).field_c)) {
            ((wb) this).field_e = null;
            return null;
        }
        ((wb) this).field_e = var2.field_x;
        return var2;
    }

    final void a(byte param0) {
        cn var2 = null;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        L0: while (true) {
          var2 = ((wb) this).field_c.field_x;
          if (((wb) this).field_c != var2) {
            var2.f((byte) -62);
            continue L0;
          } else {
            L1: {
              ((wb) this).field_e = null;
              if (param0 == 112) {
                break L1;
              } else {
                ((wb) this).a((byte) 101);
                break L1;
              }
            }
            return;
          }
        }
    }

    final int c(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        cn var3 = ((wb) this).field_c.field_x;
        while (((wb) this).field_c != var3) {
            var3 = var3.field_x;
            var2++;
        }
        if (param0 != -7432) {
            int discarded$0 = ((wb) this).c(107);
        }
        return var2;
    }

    final static int[][] a(ln[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ln[] var5_ref_ln__ = null;
        int var6 = 0;
        ln var7_ref_ln = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[][] var10 = null;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_28_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            var13 = new int[var2_int][var2_int];
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var3 = var10;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                var4 = 0;
                L2: while (true) {
                  if (var2_int <= var4) {
                    stackOut_28_0 = (int[][]) var3;
                    stackIn_29_0 = stackOut_28_0;
                    break L0;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var2_int) {
                        var4++;
                        continue L2;
                      } else {
                        var9 = 0;
                        var6 = var9;
                        L4: while (true) {
                          if (var9 >= var2_int) {
                            var5++;
                            continue L3;
                          } else {
                            L5: {
                              if (-1 == var13[var5][var4]) {
                                break L5;
                              } else {
                                if (-1 != var13[var4][var9]) {
                                  L6: {
                                    var7 = var13[var4][var9] + var13[var5][var4];
                                    if (var13[var5][var9] == -1) {
                                      break L6;
                                    } else {
                                      if (var7 >= var13[var5][var9]) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var13[var5][var9] = var7;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var9++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = 0;
                L7: while (true) {
                  if (var5 >= var2_int) {
                    var13[var4][var4] = 0;
                    var5_ref_ln__ = param0[var4].field_D;
                    var6 = 0;
                    L8: while (true) {
                      if (var5_ref_ln__.length <= var6) {
                        var4++;
                        continue L1;
                      } else {
                        L9: {
                          var7_ref_ln = var5_ref_ln__[var6];
                          if (var7_ref_ln.field_R != param0[var4].field_R) {
                            break L9;
                          } else {
                            var13[var4][var7_ref_ln.field_p] = 1;
                            break L9;
                          }
                        }
                        var6++;
                        continue L8;
                      }
                    }
                  } else {
                    var13[var4][var5] = -1;
                    var5++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("wb.C(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + 0 + 41);
        }
        return stackIn_29_0;
    }

    final void a(byte param0, cn param1) {
        if (param0 != 9) {
            return;
        }
        try {
            if (!(null == param1.field_u)) {
                param1.f((byte) -62);
            }
            param1.field_x = ((wb) this).field_c;
            param1.field_u = ((wb) this).field_c.field_u;
            param1.field_u.field_x = param1;
            param1.field_x.field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "wb.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 >= -72) {
            field_a = null;
        }
    }

    public wb() {
        ((wb) this).field_c = new cn();
        ((wb) this).field_c.field_u = ((wb) this).field_c;
        ((wb) this).field_c.field_x = ((wb) this).field_c;
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 79) {
            break L0;
          } else {
            wb.a(25);
            break L0;
          }
        }
        L1: {
          L2: {
            if (gm.field_i < 10) {
              break L2;
            } else {
              if (ma.field_p < 13) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final cn e(int param0) {
        cn var2 = ((wb) this).field_c.field_x;
        if (!(((wb) this).field_c != var2)) {
            ((wb) this).field_e = null;
            return null;
        }
        if (param0 != -31364) {
            field_d = null;
        }
        ((wb) this).field_e = var2.field_x;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You cannot add yourself!";
        field_d = "Error connecting to server. Please try using a different server.";
        field_a = new String[255];
    }
}
