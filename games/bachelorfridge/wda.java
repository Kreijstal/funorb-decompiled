/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wda {
    static long field_a;
    byte field_d;
    static int[][] field_c;
    static int[] field_b;
    int field_e;
    static String field_g;
    it field_f;

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        ne var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pf var15 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            var15 = ig.field_m;
            var2 = var15.b(16711935);
            var3 = (ne) (Object) rg.field_f.b((byte) 90);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_o) {
                    var3 = (ne) (Object) rg.field_f.c(0);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                vc.a((byte) -113);
                return;
              } else {
                L3: {
                  var4 = var15.b(16711935);
                  if (var4 == 0) {
                    break L3;
                  } else {
                    vs.field_a[0] = cha.field_l;
                    var5 = var3.field_i;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        iw.a(var5, -10410, var4);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            it.a(8766, var5);
                            String[][] dupTemp$3 = new String[2][var5];
                            var3.field_k = dupTemp$3;
                            var6 = dupTemp$3;
                            int[][] dupTemp$4 = new int[2][var5 * 4];
                            var3.field_g = dupTemp$4;
                            var7 = dupTemp$4;
                            var8 = ut.field_l;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var13 >= var8) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = fn.field_k[var5 + var13];
                                      var6[1][var14] = vs.field_a[var11];
                                      var7[1][4 * var14] = gk.field_a[var11];
                                      var7[1][4 * var14 - -1] = mba.field_a[var11];
                                      var7[1][4 * var14 - -2] = sc.field_o[var11];
                                      var7[1][4 * var14 - -3] = uda.field_X[var11];
                                      if (wb.a((byte) 52, vs.field_a[var11])) {
                                        if (sc.field_o[var11] + (mba.field_a[var11] - -uda.field_X[var11]) == 0) {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var13++;
                                    var14++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = fn.field_k[var9];
                                  var6[0][var10] = vs.field_a[var11];
                                  var7[0][4 * var10] = gk.field_a[var11];
                                  var7[0][1 + var10 * 4] = mba.field_a[var11];
                                  var7[0][2 + var10 * 4] = sc.field_o[var11];
                                  var7[0][3 + var10 * 4] = uda.field_X[var11];
                                  if (!wb.a((byte) 52, vs.field_a[var11])) {
                                    break L9;
                                  } else {
                                    if (0 != sc.field_o[var11] + mba.field_a[var11] + uda.field_X[var11]) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              int discarded$5 = 2064384;
                              ml.a((lu) (Object) var15);
                              if (var6_int == 0) {
                                var3.field_h = al.field_a;
                                var3.field_f = gk.field_b;
                                var3.field_l = fe.field_k;
                                var3.field_j = kka.field_g;
                                im.a(var6_int, kka.field_g, al.field_a, false, fe.field_k, gk.field_b);
                                break L10;
                              } else {
                                im.a(var6_int, kka.field_g, al.field_a, false, fe.field_k, gk.field_b);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        vs.field_a[var6_int] = var15.g(80);
                        var6_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var3.field_p = true;
                var3.a(false);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "wda.C(" + 116 + 41);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_b = null;
    }

    final boolean a(boolean param0, it param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (((wda) this).field_f == null) {
                  break L1;
                } else {
                  if (!((wda) this).field_f.field_a) {
                    break L1;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0 != 0;
                  }
                }
              }
              ((wda) this).field_f = param1;
              ((wda) this).field_f.a((byte) -83);
              if (!param0) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                field_g = null;
                return true;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("wda.B(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    wda(byte param0, int param1) {
        ((wda) this).field_d = param0;
        ((wda) this).field_e = param1;
    }

    wda(lu param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              ((wda) this).field_d = param0.b(true);
              ((wda) this).field_e = param0.b(16711935);
              if (param0.b(true) == -1) {
                break L1;
              } else {
                param0.field_g = param0.field_g - 1;
                ((wda) this).field_f = new it(param0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("wda.<init>(");
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
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Wait...";
        field_b = new int[24];
    }
}
