/*
 * Decompiled by CFR-JS 0.4.0.
 */
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

    final static d a(byte[] param0, int param1) {
        d var2 = null;
        RuntimeException var2_ref = null;
        d stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 >= 71) {
                  break L1;
                } else {
                  field_f = (tu) null;
                  break L1;
                }
              }
              var2 = new d(param0, j.field_e, iq.field_g, qm.field_K, c.field_e, qv.field_j, vj.field_j);
              rj.d((byte) 107);
              stackIn_6_0 = (d) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("gm.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final static int f(int param0) {
        if (param0 != 3) {
            field_i = -52;
        }
        return (va.field_D << 1609583458) + (ol.field_B << -459892476) - -cd.field_c;
    }

    public final boolean b(int param0) {
        int var3 = 0;
        jd var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        jd[] var6 = this.field_c;
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
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "gm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 3) {
              stackIn_3_0 = vf.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != param0) {
                if (-8 == (param0 ^ -1)) {
                  stackIn_10_0 = qm.field_H;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (8 != param0) {
                    if (9 != param0) {
                      if (-11 != (param0 ^ -1)) {
                        if (11 == param0) {
                          stackIn_23_0 = qt.field_b;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if ((param0 ^ -1) == -15) {
                            stackIn_27_0 = fo.a(param1 ^ 4806, ra.field_i, new String[]{param2});
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      } else {
                        stackIn_19_0 = wh.field_h;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_16_0 = ke.field_d;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = cd.field_b;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = mo.field_l;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("gm.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L1;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      return stackIn_27_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void e(int param0) {
        field_a = null;
        field_b = null;
        field_h = (int[][]) null;
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != 25931) {
            gm.f(-9);
        }
    }

    final static void d(int param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        aj var4 = null;
        wj var4_ref = null;
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
        var26 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var27 = mg.field_e;
              if (param0 == 9) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            L2: {
              var2 = var27.k(0);
              if (0 != var2) {
                if ((var2 ^ -1) == -2) {
                  var3 = var27.e((byte) -104);
                  var27.j((byte) -2);
                  var4 = (aj) ((Object) oj.field_r.e((byte) 99));
                  L3: while (true) {
                    L4: {
                      if (var4 == null) {
                        break L4;
                      } else {
                        if (var4.field_s != var3) {
                          var4 = (aj) ((Object) oj.field_r.a((byte) 123));
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var4 != null) {
                      var4.d(param0 ^ -103);
                      break L2;
                    } else {
                      dj.a((byte) -126);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  af.a((Throwable) null, 76, "HS1: " + cm.b(false));
                  dj.a((byte) -127);
                  break L2;
                }
              } else {
                var3 = var27.e((byte) -104);
                var4_ref = (wj) ((Object) lf.field_c.e((byte) 100));
                L5: while (true) {
                  L6: {
                    if (var4_ref == null) {
                      break L6;
                    } else {
                      if (var4_ref.field_r == var3) {
                        break L6;
                      } else {
                        var4_ref = (wj) ((Object) lf.field_c.a((byte) 123));
                        continue L5;
                      }
                    }
                  }
                  if (var4_ref == null) {
                    dj.a((byte) -126);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L7: {
                      var5 = var27.k(param0 + -9);
                      if (0 == var5) {
                        break L7;
                      } else {
                        var6 = var4_ref.field_k;
                        th.field_b[0].field_d = false;
                        var7 = var4_ref.field_p;
                        th.field_b[0].field_f = mv.field_d;
                        th.field_b[0].field_c = null;
                        var8_int = 1;
                        L8: while (true) {
                          if (var8_int >= var5) {
                            dupTemp$0 = new String[3][var6];
                            var4_ref.field_s = dupTemp$0;
                            var8 = dupTemp$0;
                            var9 = new String[3][var6];
                            var31 = new long[3][var6];
                            dupTemp$1 = new int[3][var7 * var6];
                            var4_ref.field_m = dupTemp$1;
                            var11 = dupTemp$1;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.k(0);
                            if (-1 <= (var18 ^ -1)) {
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
                                          incrementValue$2 = var15;
                                          var15++;
                                          var11[0][incrementValue$2] = var27.i(1);
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
                                            incrementValue$3 = var16;
                                            var16++;
                                            var11[1][incrementValue$3] = var27.i(kf.b(param0, 8));
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
                                            incrementValue$4 = var17;
                                            var17++;
                                            var11[2][incrementValue$4] = var27.i(param0 + -8);
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
                    var4_ref.field_o = true;
                    var4_ref.d(86);
                    break L2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "gm.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final String a(int param0) {
        if (param0 > -122) {
            return (String) null;
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
        field_a = new String[255];
        field_d = 1;
        field_b = "Loads more Achievements in Rated games.";
        field_e = "No";
        field_g = "Accept";
        field_h = new int[][]{new int[]{3, 2, -1, 6, 9, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 3, -1, 3, -1, 3, -1, 3, 3, 3, 3, 3, -1, 3, 3, -1}, new int[]{3, 3, -1, 3, 3, 3, -1, 3, 3, 3, 3, 3, -1, 3, 3, -1}};
    }
}
