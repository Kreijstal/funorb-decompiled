/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class gm implements lv {
    static tu field_f;
    static String field_b;
    static String[] field_a;
    private jd[] field_c;
    static String field_e;
    static int field_d;
    static int[][] field_h;
    static int field_i;
    static String field_g;

    final static d a(byte[] param0) {
        d var2 = null;
        RuntimeException var2_ref = null;
        d stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        d stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new d(param0, j.field_e, iq.field_g, qm.field_K, c.field_e, qv.field_j, vj.field_j);
              rj.d((byte) 107);
              stackOut_3_0 = (d) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("gm.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 126 + ')');
        }
        return stackIn_4_0;
    }

    final static int f() {
        return (va.field_D << 2) + (ol.field_B << 4) - -cd.field_c;
    }

    public final boolean b(int param0) {
        int var3 = 0;
        jd var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        jd[] var6 = ((gm) this).field_c;
        jd[] var2 = var6;
        for (var3 = param0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (!(var4.field_G)) {
                return false;
            }
        }
        return true;
    }

    gm(int param0, jd[] param1) {
        try {
            ((gm) this).field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "gm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        String stackOut_22_0 = null;
        String stackOut_26_0 = null;
        String stackOut_18_0 = null;
        String stackOut_15_0 = null;
        String stackOut_12_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (param0 == 3) {
              stackOut_2_0 = vf.field_e;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (6 != param0) {
                if (param0 == 7) {
                  stackOut_9_0 = qm.field_H;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (8 != param0) {
                    if (9 != param0) {
                      if (param0 != 10) {
                        if (11 == param0) {
                          stackOut_22_0 = qt.field_b;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          if (param0 == 14) {
                            stackOut_26_0 = fo.a(4800, ra.field_i, new String[1]);
                            stackIn_27_0 = stackOut_26_0;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      } else {
                        stackOut_18_0 = wh.field_h;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    } else {
                      stackOut_15_0 = ke.field_d;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = cd.field_b;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              } else {
                stackOut_5_0 = mo.field_l;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("gm.E(").append(param0).append(',').append(6).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L1;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
        return stackIn_27_0;
    }

    public static void e() {
        field_a = null;
        field_b = null;
        field_h = null;
        field_e = null;
        field_f = null;
        field_g = null;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        wj var4 = null;
        aj var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        bv var27 = null;
        long[][] var31 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var27 = mg.field_e;
              if (param0 == 9) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            L2: {
              var2 = var27.k(0);
              if (0 != var2) {
                if (var2 == 1) {
                  var3 = var27.e((byte) -104);
                  var4_ref = (aj) (Object) oj.field_r.e((byte) 99);
                  L3: while (true) {
                    L4: {
                      if (var4_ref == null) {
                        break L4;
                      } else {
                        if (var4_ref.field_s != var3) {
                          var4_ref = (aj) (Object) oj.field_r.a((byte) 123);
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var4_ref != null) {
                      var4_ref.d(param0 ^ -103);
                      break L2;
                    } else {
                      dj.a((byte) -126);
                      return;
                    }
                  }
                } else {
                  int discarded$6 = 0;
                  af.a((Throwable) null, 76, "HS1: " + cm.b());
                  dj.a((byte) -127);
                  break L2;
                }
              } else {
                var3 = var27.e((byte) -104);
                var4 = (wj) (Object) lf.field_c.e((byte) 100);
                L5: while (true) {
                  L6: {
                    if (var4 == null) {
                      break L6;
                    } else {
                      if (var4.field_r == var3) {
                        break L6;
                      } else {
                        var4 = (wj) (Object) lf.field_c.a((byte) 123);
                        continue L5;
                      }
                    }
                  }
                  if (var4 == null) {
                    dj.a((byte) -126);
                    return;
                  } else {
                    L7: {
                      var5 = var27.k(param0 + -9);
                      if (0 == var5) {
                        break L7;
                      } else {
                        var6 = var4.field_k;
                        th.field_b[0].field_d = false;
                        var7 = var4.field_p;
                        th.field_b[0].field_f = mv.field_d;
                        th.field_b[0].field_c = null;
                        var8_int = 1;
                        L8: while (true) {
                          if (var8_int >= var5) {
                            String[][] dupTemp$7 = new String[3][var6];
                            var4.field_s = dupTemp$7;
                            var8 = dupTemp$7;
                            var9 = new String[3][var6];
                            var31 = new long[3][var6];
                            int[][] dupTemp$8 = new int[3][var7 * var6];
                            var4.field_m = dupTemp$8;
                            var11 = dupTemp$8;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.k(0);
                            if (var18 <= 0) {
                              break L7;
                            } else {
                              var19 = 0;
                              L9: while (true) {
                                if (var19 >= var18) {
                                  break L7;
                                } else {
                                  L10: {
                                    var20 = var27.k(0);
                                    var21 = th.field_b[var20].field_f;
                                    var22 = var27.j((byte) -2);
                                    var24 = var27.field_q;
                                    if (var19 < var6) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = th.field_b[var20].field_c;
                                      var31[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L11: while (true) {
                                        if (var7 <= var25) {
                                          break L10;
                                        } else {
                                          int incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var27.i(1);
                                          var25++;
                                          continue L11;
                                        }
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                  L12: {
                                    if (var21 == null) {
                                      break L12;
                                    } else {
                                      if (gt.a(var21, (byte) 125)) {
                                        var8[1][var13] = mv.field_d;
                                        var9[1][var13] = null;
                                        var31[1][var13] = var22;
                                        var13++;
                                        var27.field_q = var24;
                                        var25 = 0;
                                        L13: while (true) {
                                          if (var7 <= var25) {
                                            break L12;
                                          } else {
                                            int incrementValue$10 = var16;
                                            var16++;
                                            var11[1][incrementValue$10] = var27.i(kf.b(param0, 8));
                                            var25++;
                                            continue L13;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var6 <= var14) {
                                      break L14;
                                    } else {
                                      if (th.field_b[var20].field_d) {
                                        break L14;
                                      } else {
                                        th.field_b[var20].field_d = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = th.field_b[var20].field_c;
                                        var31[2][var14] = var22;
                                        var14++;
                                        var27.field_q = var24;
                                        var25 = 0;
                                        L15: while (true) {
                                          if (var7 <= var25) {
                                            break L14;
                                          } else {
                                            int incrementValue$11 = var17;
                                            var17++;
                                            var11[2][incrementValue$11] = var27.i(param0 + -8);
                                            var25++;
                                            continue L15;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L9;
                                }
                              }
                            }
                          } else {
                            L16: {
                              th.field_b[var8_int].field_f = var27.g(param0 ^ 8);
                              th.field_b[var8_int].field_d = false;
                              if (var27.k(0) == 1) {
                                th.field_b[var8_int].field_c = var27.g(1);
                                break L16;
                              } else {
                                th.field_b[var8_int].field_c = null;
                                break L16;
                              }
                            }
                            var8_int++;
                            continue L8;
                          }
                        }
                      }
                    }
                    var4.field_o = true;
                    var4.d(86);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "gm.D(" + param0 + ')');
        }
    }

    public final String a(int param0) {
        if (param0 > -122) {
            return null;
        }
        return "Win: Leader Escort";
    }

    public final boolean c(int param0) {
        if (param0 >= -121) {
            gm.d(68);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[255];
        field_d = 1;
        field_b = "Loads more Achievements in Rated games.";
        field_e = "No";
        field_g = "Accept";
        field_h = new int[][]{new int[16], new int[16], new int[16], new int[16], new int[16], new int[16], new int[16], new int[16]};
    }
}
