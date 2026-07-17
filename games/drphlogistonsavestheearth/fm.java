/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm implements cg {
    private int field_g;
    private int field_m;
    private int field_f;
    private int field_d;
    static String field_c;
    private rf field_k;
    private int field_h;
    static int[] field_e;
    static boolean field_l;
    static String field_i;
    static String field_b;
    static long field_j;
    private int field_a;

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        tl var12 = null;
        vg stackIn_6_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        vg stackOut_5_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 94) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              if (param2 instanceof tl) {
                stackOut_5_0 = (vg) param2;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = null;
                stackIn_6_0 = (vg) (Object) stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var12 = (tl) (Object) stackIn_6_0;
              if (var12 == null) {
                break L3;
              } else {
                break L3;
              }
            }
            wj.f(param2.field_o + param4, param2.field_m + param3, param2.field_w, param2.field_k, ((fm) this).field_m);
            var7 = -(var12.field_L * 2) + param2.field_w;
            var8 = var12.field_L + (param4 - -param2.field_o);
            var9 = var12.field_K + (param2.field_m + param3);
            wj.g(var8, var9, var7 + var8, var9, ((fm) this).field_f);
            var10 = var12.h(-26) - 1;
            L4: while (true) {
              if (var10 < 0) {
                L5: {
                  if (((fm) this).field_k == null) {
                    break L5;
                  } else {
                    ((fm) this).field_k.b(var12.field_p, var8 - -(var7 / 2), var12.field_K + ((fm) this).field_k.field_E + var9, ((fm) this).field_a, ((fm) this).field_g);
                    break L5;
                  }
                }
                break L0;
              } else {
                wj.b(var7 * var12.a(var10, (byte) 4) / var12.i(-110) + var8, var9, ((fm) this).field_h, ((fm) this).field_d);
                var10--;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("fm.J(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        b var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        lh var15 = null;
        int[][] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var15 = dh.field_N;
            var2 = var15.l(31760);
            var3 = (b) (Object) u.field_f.h(-11151);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_j) {
                    var3 = (b) (Object) u.field_f.e(0);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  var4 = var15.l(31760);
                  if (var4 != 0) {
                    gd.field_d[0] = oa.field_d;
                    var5 = var3.field_n;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        mg.a(var4, 83, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            mk.a(-91, var5);
                            var6 = new String[2][var5];
                            var19 = new int[2][4 * var5];
                            var8 = gg.field_b;
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
                                      var11 = bj.field_a[var13 + var5];
                                      var6[1][var14] = gd.field_d[var11];
                                      var19[1][4 * var14] = rc.field_i[var11];
                                      var19[1][1 + var14 * 4] = fi.field_h[var11];
                                      var19[1][var14 * 4 + 2] = kk.field_a[var11];
                                      var19[1][3 + var14 * 4] = qj.field_d[var11];
                                      if (ta.a(6, gd.field_d[var11])) {
                                        if (0 == qj.field_d[var11] + kk.field_a[var11] + fi.field_h[var11]) {
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
                                  var11 = bj.field_a[var9];
                                  var6[0][var10] = gd.field_d[var11];
                                  var19[0][4 * var10] = rc.field_i[var11];
                                  var19[0][var10 * 4 - -1] = fi.field_h[var11];
                                  var19[0][4 * var10 - -2] = kk.field_a[var11];
                                  var19[0][var10 * 4 + 3] = qj.field_d[var11];
                                  if (!ta.a(6, gd.field_d[var11])) {
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              qg.a((od) (Object) var15, (byte) 104);
                              if (var6_int != 0) {
                                ai.a(ah.field_K, (byte) -62, j.field_e, var6_int, d.field_b, oh.field_d);
                                break L10;
                              } else {
                                ai.a(ah.field_K, (byte) -128, j.field_e, var6_int, d.field_b, oh.field_d);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        gd.field_d[var6_int] = var15.b((byte) -101);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var5 = -48;
                var3.a(-16175);
                break L0;
              } else {
                eg.a((byte) 126);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "fm.A(" + 124 + 41);
        }
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = 0;
        field_i = null;
        field_e = null;
        field_b = null;
    }

    fm(rf param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((fm) this).field_k = param0;
            ((fm) this).field_m = param4;
            ((fm) this).field_d = param6;
            ((fm) this).field_f = param3;
            ((fm) this).field_a = param1;
            ((fm) this).field_h = param5;
            ((fm) this).field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "fm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Move ship";
        field_i = "Your email address is used to identify this account";
        field_b = "Visit the Account Management section on the main site to view.";
        field_l = false;
    }
}
