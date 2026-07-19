/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static ka[] field_d;
    static String[] field_c;
    static sl field_a;
    static ka[] field_b;
    static boolean[][][] field_e;
    static int[][] field_j;
    static int[] field_g;
    static int[][] field_f;
    static int[] field_h;
    static ra field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ka[] var11 = null;
        ka var12 = null;
        int var13 = 0;
        var13 = TorChallenge.field_F ? 1 : 0;
        if (lg.field_d[param0][18] < 0) {
          return;
        } else {
          var5 = ic.field_B[param0][0];
          if (0 <= var5) {
            L0: {
              var6 = ic.field_B[param0][2];
              var7 = ic.field_B[param0][3];
              var8 = ic.field_B[param0][4];
              var9 = ic.field_B[param0][5];
              var10 = -1 + -var9;
              if ((param2 ^ -1) <= -1) {
                break L0;
              } else {
                if (-1 > (param1 ^ -1)) {
                  break L0;
                } else {
                  return;
                }
              }
            }
            L1: {
              if (0 >= param2) {
                break L1;
              } else {
                if (param1 >= param4) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param3 <= -108) {
                break L2;
              } else {
                field_h = (int[]) null;
                break L2;
              }
            }
            L3: {
              L4: {
                if ((param2 ^ -1) > -1) {
                  break L4;
                } else {
                  if ((param2 ^ -1) < -1) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              if ((param1 ^ -1) >= -1) {
                break L3;
              } else {
                if (param4 <= param1) {
                  break L3;
                } else {
                  if (-1 < (param2 ^ -1)) {
                    var7 = (var7 + -var10) * param1 / param4 + var10;
                    break L3;
                  } else {
                    var7 = var7 + param1 * (var10 - var7) / param4;
                    break L3;
                  }
                }
              }
            }
            L5: {
              L6: {
                var11 = ui.field_i;
                hd.a(var11, var9, var8, (byte) 102, var7, var6);
                var12 = ph.field_o[var5];
                var7 = ic.field_B[param0][7];
                var6 = ic.field_B[param0][6];
                var10 = -ic.field_B[param0][3] + var10 - -var7;
                if (param2 < 0) {
                  break L6;
                } else {
                  if (param2 > 0) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              if (param1 <= 0) {
                break L5;
              } else {
                if (param4 > param1) {
                  if ((param2 ^ -1) <= -1) {
                    var7 = var7 + (-var7 + var10) * param1 / param4;
                    break L5;
                  } else {
                    var7 = var10 - -(param1 * (-var10 + var7) / param4);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              var12.g(var6, var7);
              if (0 == param0) {
                var6 = ic.field_B[0][8];
                var7 = ic.field_B[0][9];
                ri.field_j.g(var6, var7);
                var7 = ic.field_B[0][11];
                var6 = ic.field_B[0][10];
                ri.field_j.g(var6, var7);
                break L7;
              } else {
                break L7;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = (boolean[][][]) null;
        field_d = null;
        field_i = null;
        field_j = (int[][]) null;
        if (param0 != -5) {
            field_g = (int[]) null;
        }
        field_b = null;
        field_h = null;
        field_c = null;
        field_f = (int[][]) null;
        field_a = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void b(byte param0) {
        if (param0 != -44) {
            field_h = (int[]) null;
        }
        na.field_e = false;
        int discarded$0 = id.field_b.j(-117);
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$2 = 0;
        byte dupTemp$3 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        uf var16 = null;
        uf var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var16 = new uf(param0);
            var17 = var16;
            var17.field_q = param0.length - 2;
            vl.field_b = var17.c(false);
            ug.field_e = new int[vl.field_b];
            vd.field_c = new boolean[vl.field_b];
            gf.field_t = new byte[vl.field_b][];
            h.field_a = new byte[vl.field_b][];
            lg.field_e = new int[vl.field_b];
            pg.field_r = new int[vl.field_b];
            dd.field_t = new int[vl.field_b];
            var17.field_q = param0.length - 7 + -(8 * vl.field_b);
            ij.field_B = var17.c(false);
            le.field_g = var17.c(false);
            var3 = 1 + (255 & var17.j(-94));
            var4 = 0;
            L1: while (true) {
              if (vl.field_b <= var4) {
                var4 = param1;
                L2: while (true) {
                  if (var4 >= vl.field_b) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= vl.field_b) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= vl.field_b) {
                            var17.field_q = -(var3 * 3) - -3 + (-(8 * vl.field_b) + param0.length + -7);
                            td.field_m = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var4 >= var3) {
                                var17.field_q = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= vl.field_b) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = pg.field_r[var4];
                                      var6 = lg.field_e[var4];
                                      var7 = var6 * var5;
                                      var20 = new byte[var7];
                                      var18 = var20;
                                      var8 = var18;
                                      h.field_a[var4] = var20;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var9 = var19;
                                      gf.field_t[var4] = var21;
                                      var10 = 0;
                                      var11 = var17.j(-91);
                                      if (0 == (var11 & 1)) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var7 <= var12) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var12 >= var7) {
                                                  break L7;
                                                } else {
                                                  L10: {
                                                    dupTemp$2 = var17.d((byte) 102);
                                                    var9[var12] = dupTemp$2;
                                                    var13 = dupTemp$2;
                                                    stackOut_43_0 = var10;
                                                    stackIn_45_0 = stackOut_43_0;
                                                    stackIn_44_0 = stackOut_43_0;
                                                    if (0 == (var13 ^ -1)) {
                                                      stackOut_45_0 = stackIn_45_0;
                                                      stackOut_45_1 = 0;
                                                      stackIn_46_0 = stackOut_45_0;
                                                      stackIn_46_1 = stackOut_45_1;
                                                      break L10;
                                                    } else {
                                                      stackOut_44_0 = stackIn_44_0;
                                                      stackOut_44_1 = 1;
                                                      stackIn_46_0 = stackOut_44_0;
                                                      stackIn_46_1 = stackOut_44_1;
                                                      break L10;
                                                    }
                                                  }
                                                  var10 = stackIn_46_0 | stackIn_46_1;
                                                  var12++;
                                                  continue L9;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.d((byte) 90);
                                            var12++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L11: while (true) {
                                          if (var12 >= var5) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L12: while (true) {
                                                if (var12 >= var5) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L13: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L12;
                                                    } else {
                                                      L14: {
                                                        dupTemp$3 = var17.d((byte) 98);
                                                        var9[var12 + var13 * var5] = dupTemp$3;
                                                        var14 = dupTemp$3;
                                                        stackOut_32_0 = var10;
                                                        stackIn_34_0 = stackOut_32_0;
                                                        stackIn_33_0 = stackOut_32_0;
                                                        if ((var14 ^ -1) == 0) {
                                                          stackOut_34_0 = stackIn_34_0;
                                                          stackOut_34_1 = 0;
                                                          stackIn_35_0 = stackOut_34_0;
                                                          stackIn_35_1 = stackOut_34_1;
                                                          break L14;
                                                        } else {
                                                          stackOut_33_0 = stackIn_33_0;
                                                          stackOut_33_1 = 1;
                                                          stackIn_35_0 = stackOut_33_0;
                                                          stackIn_35_1 = stackOut_33_1;
                                                          break L14;
                                                        }
                                                      }
                                                      var10 = stackIn_35_0 | stackIn_35_1;
                                                      var13++;
                                                      continue L13;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L15: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L11;
                                              } else {
                                                var8[var12 - -(var13 * var5)] = var17.d((byte) 114);
                                                var13++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    vd.field_c[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  td.field_m[var4] = var17.g(0);
                                  if (0 != td.field_m[var4]) {
                                    break L16;
                                  } else {
                                    td.field_m[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            lg.field_e[var4] = var17.c(false);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        pg.field_r[var4] = var17.c(false);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    dd.field_t[var4] = var17.c(false);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ug.field_e[var4] = var16.c(false);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var2);
            stackOut_49_1 = new StringBuilder().append("ba.E(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L17;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L17;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param1 + ')');
        }
    }

    final static void c(byte param0) {
        t.field_b.i(param0 + 8389890);
        if (oa.field_k == null) {
            oa.field_k = new pe(t.field_b, jh.field_a);
        }
        t.field_b.a((byte) 53, (ee) (oa.field_k));
        if (param0 != 15) {
            ba.a(-4, 102, 101, -116, -9);
        }
    }

    static {
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_e = new boolean[][][]{new boolean[][]{new boolean[]{false, true, false}, new boolean[]{true, false}, new boolean[]{true, false}, new boolean[]{true, true, true, true, true, true}, new boolean[]{true, false}, new boolean[]{false}, new boolean[]{true, true, true, true, true, true}}, new boolean[][]{new boolean[]{true, false}, new boolean[]{true, false, true, false}, new boolean[]{false, true, true, true, false, false}, new boolean[]{false, true, true, false, true, false}, new boolean[]{false, true, true, false, false}, new boolean[]{true, true, false, true, false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, true, false}, new boolean[]{false, true}, new boolean[]{false, true, true, false}, new boolean[]{false, true, true, true, true, true}, new boolean[]{false, true, true}, new boolean[]{false}, new boolean[]{true, true, true, true, true, true}}};
        field_g = new int[]{1, 2, 3, 4, 5, 6, 7, 22, 23, 24};
        field_h = new int[8192];
        field_f = new int[2][2];
    }
}
