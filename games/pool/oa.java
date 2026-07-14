/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends RuntimeException {
    private static int field_k;
    static int field_b;
    static id field_a;
    static int field_e;
    static String field_d;
    static int field_h;
    static int[] field_g;
    String field_i;
    Throwable field_c;
    static long[] field_f;
    static boolean field_j;

    final static void a(boolean param0, byte param1) {
        if (param1 != 80) {
            return;
        }
        if (oj.c(param1 ^ 48)) {
            param0 = false;
        }
        jk.a(param0, 118);
        if (ji.field_f) {
            qh.g(na.field_e.field_i.field_qb, na.field_e.field_i.field_eb, na.field_e.field_i.field_gb, na.field_e.field_i.field_Db);
            na.field_e.field_i.a((byte) -79, param0);
        }
        tl.d(param1 ^ -5, param0);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            int discarded$0 = oa.a(0, -103, 105, (byte[]) null);
        }
        field_d = null;
        field_a = null;
        field_f = null;
        field_g = null;
    }

    final static void a(boolean param0, byte[] param1) {
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
        Object var15 = null;
        ge var16 = null;
        ge var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        var16 = new ge(param1);
        var17 = var16;
        var17.field_v = -2 + param1.length;
        wf.field_d = var17.d(-1034);
        wg.field_Sb = new byte[wf.field_d][];
        rc.field_f = new int[wf.field_d];
        v.field_b = new byte[wf.field_d][];
        pd.field_a = new int[wf.field_d];
        el.field_I = new int[wf.field_d];
        ih.field_d = new int[wf.field_d];
        gg.field_d = new boolean[wf.field_d];
        var17.field_v = param1.length - 7 + -(wf.field_d * 8);
        vd.field_c = var17.d(-1034);
        tq.field_r = var17.d(-1034);
        var3 = (var17.g(-97) & 255) - -1;
        var4 = 0;
        L0: while (true) {
          if (wf.field_d <= var4) {
            var4 = 0;
            L1: while (true) {
              if (wf.field_d <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (wf.field_d <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (wf.field_d <= var4) {
                        var17.field_v = -(3 * (-1 + var3)) + (-(8 * wf.field_d) + (-7 + param1.length));
                        ma.field_h = new int[var3];
                        var4 = 1;
                        L4: while (true) {
                          if (var3 <= var4) {
                            L5: {
                              var17.field_v = 0;
                              if (param0) {
                                break L5;
                              } else {
                                var15 = null;
                                oa.a(true, (byte[]) null);
                                break L5;
                              }
                            }
                            var4 = 0;
                            L6: while (true) {
                              if (wf.field_d <= var4) {
                                return;
                              } else {
                                L7: {
                                  var5 = pd.field_a[var4];
                                  var6 = rc.field_f[var4];
                                  var7 = var6 * var5;
                                  var24 = new byte[var7];
                                  var22 = var24;
                                  var20 = var22;
                                  var18 = var20;
                                  var8 = var18;
                                  v.field_b[var4] = var24;
                                  var25 = new byte[var7];
                                  var23 = var25;
                                  var21 = var23;
                                  var19 = var21;
                                  var9 = var19;
                                  wg.field_Sb[var4] = var25;
                                  var10 = 0;
                                  var11 = var17.g(-121);
                                  if (-1 == (1 & var11 ^ -1)) {
                                    var12 = 0;
                                    L8: while (true) {
                                      if (var7 <= var12) {
                                        if ((var11 & 2) != 0) {
                                          var12 = 0;
                                          L9: while (true) {
                                            if (var7 <= var12) {
                                              break L7;
                                            } else {
                                              L10: {
                                                var9[var12] = var16.e((byte) 105);
                                                var13 = var16.e((byte) 105);
                                                stackOut_47_0 = var10;
                                                stackIn_49_0 = stackOut_47_0;
                                                stackIn_48_0 = stackOut_47_0;
                                                if (-1 == var13) {
                                                  stackOut_49_0 = stackIn_49_0;
                                                  stackOut_49_1 = 0;
                                                  stackIn_50_0 = stackOut_49_0;
                                                  stackIn_50_1 = stackOut_49_1;
                                                  break L10;
                                                } else {
                                                  stackOut_48_0 = stackIn_48_0;
                                                  stackOut_48_1 = 1;
                                                  stackIn_50_0 = stackOut_48_0;
                                                  stackIn_50_1 = stackOut_48_1;
                                                  break L10;
                                                }
                                              }
                                              var10 = stackIn_50_0 | stackIn_50_1;
                                              var12++;
                                              continue L9;
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      } else {
                                        var8[var12] = var16.e((byte) 105);
                                        var12++;
                                        continue L8;
                                      }
                                    }
                                  } else {
                                    var12 = 0;
                                    L11: while (true) {
                                      if (var12 >= var5) {
                                        if (0 != (2 & var11)) {
                                          var12 = 0;
                                          L12: while (true) {
                                            if (var5 <= var12) {
                                              break L7;
                                            } else {
                                              var13 = 0;
                                              L13: while (true) {
                                                if (var6 <= var13) {
                                                  var12++;
                                                  continue L12;
                                                } else {
                                                  L14: {
                                                    var9[var12 - -(var13 * var5)] = var16.e((byte) 105);
                                                    var14 = var16.e((byte) 105);
                                                    stackOut_35_0 = var10;
                                                    stackIn_37_0 = stackOut_35_0;
                                                    stackIn_36_0 = stackOut_35_0;
                                                    if (var14 == -1) {
                                                      stackOut_37_0 = stackIn_37_0;
                                                      stackOut_37_1 = 0;
                                                      stackIn_38_0 = stackOut_37_0;
                                                      stackIn_38_1 = stackOut_37_1;
                                                      break L14;
                                                    } else {
                                                      stackOut_36_0 = stackIn_36_0;
                                                      stackOut_36_1 = 1;
                                                      stackIn_38_0 = stackOut_36_0;
                                                      stackIn_38_1 = stackOut_36_1;
                                                      break L14;
                                                    }
                                                  }
                                                  var10 = stackIn_38_0 | stackIn_38_1;
                                                  var13++;
                                                  continue L13;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      } else {
                                        var13 = 0;
                                        L15: while (true) {
                                          if (var13 >= var6) {
                                            var12++;
                                            continue L11;
                                          } else {
                                            var8[var13 * var5 + var12] = var16.e((byte) 105);
                                            var13++;
                                            continue L15;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                gg.field_d[var4] = var10 != 0;
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            ma.field_h[var4] = var16.f(99);
                            if (0 == ma.field_h[var4]) {
                              ma.field_h[var4] = 1;
                              var4++;
                              continue L4;
                            } else {
                              var4++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        rc.field_f[var4] = var16.d(-1034);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    pd.field_a[var4] = var16.d(-1034);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ih.field_d[var4] = var16.d(-1034);
                var4++;
                continue L1;
              }
            }
          } else {
            el.field_I[var4] = var16.d(-1034);
            var4++;
            continue L0;
          }
        }
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var4 = -1;
        for (var5 = param0; var5 < param1; var5++) {
            var4 = var4 >>> 49336520 ^ fo.field_e[255 & (var4 ^ param3[var5])];
        }
        var4 = var4 ^ param2;
        return var4;
    }

    final static void a(int param0, pn param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3) {
            L1: {
              if (param0 <= -30) {
                break L1;
              } else {
                oa.a(-9);
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (aa.field_e <= var2) {
                g.field_l[param1.b(14842)] = g.field_l[param1.b(14842)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (var3 >= aa.field_e) {
                    aa.field_e = var2;
                    aa.field_e = aa.field_e + 1;
                    wb.field_e[aa.field_e] = param1;
                    return;
                  } else {
                    L4: {
                      if (wb.field_e[var3].field_p == param1.field_p) {
                        var4 = wb.field_e[var3].b(14842);
                        if (g.field_l[var4] <= ap.field_E) {
                          break L4;
                        } else {
                          g.field_l[var4] = g.field_l[var4] - 1;
                          var3++;
                          continue L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    wb.field_e[var2] = wb.field_e[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (param1.field_p == wb.field_e[var2].field_p) {
                  g.field_l[wb.field_e[var2].b(14842)] = g.field_l[wb.field_e[var2].b(14842)] + 1;
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            g.field_l[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    oa(Throwable param0, String param1) {
        ((oa) this).field_c = param0;
        ((oa) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 9;
        field_b = 1 << field_k;
        field_f = new long[32];
        field_d = null;
        field_j = false;
    }
}
