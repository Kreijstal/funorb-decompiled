/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ep {
    static String field_d;
    static int[] field_c;
    static ak field_a;
    static jl field_b;

    final static int[] a(int[] param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        Object stackIn_17_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_58_0 = null;
        int[] stackIn_60_0 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_59_0 = null;
        Object stackOut_57_0 = null;
        Object stackOut_43_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_16_0 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = param0.length;
                if (null == qj.field_a) {
                  break L2;
                } else {
                  if (2 * var2_int > qj.field_a.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              qj.field_a = new int[var2_int * 2];
              bj.field_b = new int[var2_int * 2];
              break L1;
            }
            ef.field_g = 0;
            var5 = param0[-2 + var2_int];
            var6 = param0[-1 + var2_int];
            var7_int = 0;
            L3: while (true) {
              if (var2_int <= var7_int) {
                if (param1 != ~ef.field_g) {
                  var7 = bj.field_b;
                  bj.field_b = qj.field_a;
                  qj.field_a = var7;
                  var2_int = ef.field_g;
                  ef.field_g = 0;
                  var5 = bj.field_b[-2 + var2_int];
                  var6 = bj.field_b[-1 + var2_int];
                  var8_int = 0;
                  L4: while (true) {
                    if (var2_int <= var8_int) {
                      if (ef.field_g != 0) {
                        var7 = bj.field_b;
                        bj.field_b = qj.field_a;
                        qj.field_a = var7;
                        var2_int = ef.field_g;
                        ef.field_g = 0;
                        var5 = bj.field_b[var2_int + -2];
                        var6 = bj.field_b[var2_int - 1];
                        var8_int = 0;
                        L5: while (true) {
                          if (var2_int <= var8_int) {
                            if (ef.field_g != 0) {
                              var7 = bj.field_b;
                              bj.field_b = qj.field_a;
                              var2_int = ef.field_g;
                              qj.field_a = var7;
                              ef.field_g = 0;
                              var6 = bj.field_b[-1 + var2_int];
                              var5 = bj.field_b[var2_int - 2];
                              var8_int = 0;
                              L6: while (true) {
                                if (var2_int <= var8_int) {
                                  if (ef.field_g != 0) {
                                    var17 = new int[ef.field_g];
                                    var16 = var17;
                                    var15 = var16;
                                    var14 = var15;
                                    var8 = var14;
                                    qb.a(qj.field_a, 0, var17, 0, ef.field_g);
                                    stackOut_59_0 = (int[]) var8;
                                    stackIn_60_0 = stackOut_59_0;
                                    break L0;
                                  } else {
                                    stackOut_57_0 = null;
                                    stackIn_58_0 = stackOut_57_0;
                                    return (int[]) (Object) stackIn_58_0;
                                  }
                                } else {
                                  var3 = var5;
                                  var4 = var6;
                                  var6 = bj.field_b[1 + var8_int];
                                  var5 = bj.field_b[var8_int];
                                  if (var6 >= t.field_a) {
                                    L7: {
                                      if (t.field_a <= var4) {
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    var8_int += 2;
                                    continue L6;
                                  } else {
                                    L8: {
                                      if (t.field_a <= var4) {
                                        var9 = var5;
                                        var10 = var6;
                                        var11 = var3;
                                        var12 = var4;
                                        int fieldTemp$22 = ef.field_g;
                                        ef.field_g = ef.field_g + 1;
                                        qj.field_a[fieldTemp$22] = (-var10 + t.field_a) * (var11 + -var9) / (-var10 + var12) + var9;
                                        int fieldTemp$23 = ef.field_g;
                                        ef.field_g = ef.field_g + 1;
                                        qj.field_a[fieldTemp$23] = t.field_a;
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    int fieldTemp$24 = ef.field_g;
                                    ef.field_g = ef.field_g + 1;
                                    qj.field_a[fieldTemp$24] = var5;
                                    int fieldTemp$25 = ef.field_g;
                                    ef.field_g = ef.field_g + 1;
                                    qj.field_a[fieldTemp$25] = var6;
                                    var8_int += 2;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              stackOut_43_0 = null;
                              stackIn_44_0 = stackOut_43_0;
                              return (int[]) (Object) stackIn_44_0;
                            }
                          } else {
                            L9: {
                              var4 = var6;
                              var3 = var5;
                              var6 = bj.field_b[var8_int - -1];
                              var5 = bj.field_b[var8_int];
                              if (t.field_f > var6) {
                                if (var4 >= t.field_f) {
                                  var9 = var3;
                                  var10 = var4;
                                  var11 = var5;
                                  var12 = var6;
                                  int fieldTemp$26 = ef.field_g;
                                  ef.field_g = ef.field_g + 1;
                                  qj.field_a[fieldTemp$26] = var9 - -((t.field_f + -var10) * (var11 - var9) / (var12 + -var10));
                                  int fieldTemp$27 = ef.field_g;
                                  ef.field_g = ef.field_g + 1;
                                  qj.field_a[fieldTemp$27] = t.field_f;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              } else {
                                L10: {
                                  if (var4 >= t.field_f) {
                                    break L10;
                                  } else {
                                    var9 = var5;
                                    var10 = var6;
                                    var11 = var3;
                                    var12 = var4;
                                    int fieldTemp$28 = ef.field_g;
                                    ef.field_g = ef.field_g + 1;
                                    qj.field_a[fieldTemp$28] = var9 - -((-var9 + var11) * (t.field_f - var10) / (var12 + -var10));
                                    int fieldTemp$29 = ef.field_g;
                                    ef.field_g = ef.field_g + 1;
                                    qj.field_a[fieldTemp$29] = t.field_f;
                                    break L10;
                                  }
                                }
                                int fieldTemp$30 = ef.field_g;
                                ef.field_g = ef.field_g + 1;
                                qj.field_a[fieldTemp$30] = var5;
                                int fieldTemp$31 = ef.field_g;
                                ef.field_g = ef.field_g + 1;
                                qj.field_a[fieldTemp$31] = var6;
                                break L9;
                              }
                            }
                            var8_int += 2;
                            continue L5;
                          }
                        }
                      } else {
                        stackOut_30_0 = null;
                        stackIn_31_0 = stackOut_30_0;
                        return (int[]) (Object) stackIn_31_0;
                      }
                    } else {
                      L11: {
                        var4 = var6;
                        var3 = var5;
                        var6 = bj.field_b[var8_int - -1];
                        var5 = bj.field_b[var8_int];
                        if (var5 >= t.field_h) {
                          if (var3 < t.field_h) {
                            var9 = var3;
                            var10 = var4;
                            var11 = var5;
                            var12 = var6;
                            int fieldTemp$32 = ef.field_g;
                            ef.field_g = ef.field_g + 1;
                            qj.field_a[fieldTemp$32] = t.field_h;
                            int fieldTemp$33 = ef.field_g;
                            ef.field_g = ef.field_g + 1;
                            qj.field_a[fieldTemp$33] = (t.field_h + -var9) * (var12 - var10) / (var11 + -var9) + var10;
                            break L11;
                          } else {
                            break L11;
                          }
                        } else {
                          L12: {
                            if (var3 >= t.field_h) {
                              var9 = var5;
                              var10 = var6;
                              var11 = var3;
                              var12 = var4;
                              int fieldTemp$34 = ef.field_g;
                              ef.field_g = ef.field_g + 1;
                              qj.field_a[fieldTemp$34] = t.field_h;
                              int fieldTemp$35 = ef.field_g;
                              ef.field_g = ef.field_g + 1;
                              qj.field_a[fieldTemp$35] = var10 + (t.field_h + -var9) * (-var10 + var12) / (var11 + -var9);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          int fieldTemp$36 = ef.field_g;
                          ef.field_g = ef.field_g + 1;
                          qj.field_a[fieldTemp$36] = var5;
                          int fieldTemp$37 = ef.field_g;
                          ef.field_g = ef.field_g + 1;
                          qj.field_a[fieldTemp$37] = var6;
                          break L11;
                        }
                      }
                      var8_int += 2;
                      continue L4;
                    }
                  }
                } else {
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  return (int[]) (Object) stackIn_17_0;
                }
              } else {
                L13: {
                  var4 = var6;
                  var3 = var5;
                  var5 = param0[var7_int];
                  var6 = param0[var7_int + 1];
                  if (var5 >= t.field_e) {
                    L14: {
                      if (t.field_e <= var3) {
                        break L14;
                      } else {
                        var8_int = var5;
                        var9 = var6;
                        var10 = var3;
                        var11 = var4;
                        int fieldTemp$38 = ef.field_g;
                        ef.field_g = ef.field_g + 1;
                        qj.field_a[fieldTemp$38] = t.field_e;
                        int fieldTemp$39 = ef.field_g;
                        ef.field_g = ef.field_g + 1;
                        qj.field_a[fieldTemp$39] = (t.field_e - var8_int) * (-var9 + var11) / (var10 + -var8_int) + var9;
                        break L14;
                      }
                    }
                    int fieldTemp$40 = ef.field_g;
                    ef.field_g = ef.field_g + 1;
                    qj.field_a[fieldTemp$40] = var5;
                    int fieldTemp$41 = ef.field_g;
                    ef.field_g = ef.field_g + 1;
                    qj.field_a[fieldTemp$41] = var6;
                    break L13;
                  } else {
                    if (var3 >= t.field_e) {
                      var8_int = var3;
                      var9 = var4;
                      var10 = var5;
                      var11 = var6;
                      int fieldTemp$42 = ef.field_g;
                      ef.field_g = ef.field_g + 1;
                      qj.field_a[fieldTemp$42] = t.field_e;
                      int fieldTemp$43 = ef.field_g;
                      ef.field_g = ef.field_g + 1;
                      qj.field_a[fieldTemp$43] = (-var9 + var11) * (-var8_int + t.field_e) / (var10 + -var8_int) + var9;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                var7_int += 2;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var2 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var2;
            stackOut_61_1 = new StringBuilder().append("ep.D(");
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L15;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L15;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 44 + param1 + 41);
        }
        return stackIn_60_0;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 34) {
                break L1;
              } else {
                var3 = null;
                boolean discarded$2 = ep.a((byte) 64, (String) null);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length() < cl.field_a) {
                  break L2;
                } else {
                  if (param1.length() <= gd.field_l) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("ep.A(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (pm.field_h == null) {
                break L1;
              } else {
                pm.field_h.b((byte) 119);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "ep.C(" + -26721 + 41);
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != -2) {
            Object var2 = null;
            int[] discarded$0 = ep.a((int[]) null, -67);
        }
    }

    final static boolean a(int param0) {
        return wp.a(-8798) && (8 & pa.field_b) == 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Tiles Dropped: ";
    }
}
