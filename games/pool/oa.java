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
        if (oj.c(96)) {
            param0 = false;
        }
        jk.a(param0, 118);
        if (ji.field_f) {
            qh.g(na.field_e.field_i.field_qb, na.field_e.field_i.field_eb, na.field_e.field_i.field_gb, na.field_e.field_i.field_Db);
            na.field_e.field_i.a((byte) -79, param0);
        }
        tl.d(-85, param0);
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
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        try {
          L0: {
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
            L1: while (true) {
              if (wf.field_d <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (wf.field_d <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (wf.field_d <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (wf.field_d <= var4) {
                            var17.field_v = -(3 * (-1 + var3)) + (-(8 * wf.field_d) + (-7 + param1.length));
                            ma.field_h = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                L6: {
                                  var17.field_v = 0;
                                  if (param0) {
                                    break L6;
                                  } else {
                                    var15 = null;
                                    oa.a(true, (byte[]) null);
                                    break L6;
                                  }
                                }
                                var4 = 0;
                                L7: while (true) {
                                  if (wf.field_d <= var4) {
                                    break L0;
                                  } else {
                                    L8: {
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
                                      if ((1 & var11) == 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var7 <= var12) {
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var7 <= var12) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    byte dupTemp$2 = var16.e((byte) 105);
                                                    var9[var12] = dupTemp$2;
                                                    var13 = dupTemp$2;
                                                    stackOut_46_0 = var10;
                                                    stackIn_48_0 = stackOut_46_0;
                                                    stackIn_47_0 = stackOut_46_0;
                                                    if (-1 == var13) {
                                                      stackOut_48_0 = stackIn_48_0;
                                                      stackOut_48_1 = 0;
                                                      stackIn_49_0 = stackOut_48_0;
                                                      stackIn_49_1 = stackOut_48_1;
                                                      break L11;
                                                    } else {
                                                      stackOut_47_0 = stackIn_47_0;
                                                      stackOut_47_1 = 1;
                                                      stackIn_49_0 = stackOut_47_0;
                                                      stackIn_49_1 = stackOut_47_1;
                                                      break L11;
                                                    }
                                                  }
                                                  var10 = stackIn_49_0 | stackIn_49_1;
                                                  var12++;
                                                  continue L10;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var8[var12] = var16.e((byte) 105);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var12 >= var5) {
                                            if (0 != (2 & var11)) {
                                              var12 = 0;
                                              L13: while (true) {
                                                if (var5 <= var12) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L14: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        byte dupTemp$3 = var16.e((byte) 105);
                                                        var9[var12 - -(var13 * var5)] = dupTemp$3;
                                                        var14 = dupTemp$3;
                                                        stackOut_34_0 = var10;
                                                        stackIn_36_0 = stackOut_34_0;
                                                        stackIn_35_0 = stackOut_34_0;
                                                        if (var14 == -1) {
                                                          stackOut_36_0 = stackIn_36_0;
                                                          stackOut_36_1 = 0;
                                                          stackIn_37_0 = stackOut_36_0;
                                                          stackIn_37_1 = stackOut_36_1;
                                                          break L15;
                                                        } else {
                                                          stackOut_35_0 = stackIn_35_0;
                                                          stackOut_35_1 = 1;
                                                          stackIn_37_0 = stackOut_35_0;
                                                          stackIn_37_1 = stackOut_35_1;
                                                          break L15;
                                                        }
                                                      }
                                                      var10 = stackIn_37_0 | stackIn_37_1;
                                                      var13++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var13 * var5 + var12] = var16.e((byte) 105);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    gg.field_d[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  ma.field_h[var4] = var16.f(99);
                                  if (0 != ma.field_h[var4]) {
                                    break L17;
                                  } else {
                                    ma.field_h[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            rc.field_f[var4] = var16.d(-1034);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        pd.field_a[var4] = var16.d(-1034);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    ih.field_d[var4] = var16.d(-1034);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                el.field_I[var4] = var16.d(-1034);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var2;
            stackOut_52_1 = new StringBuilder().append("oa.C(").append(param0).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L18;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L18;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 41);
        }
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
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
            var4_int = -1;
            var5 = param0;
            L1: while (true) {
              if (var5 >= param1) {
                var4_int = var4_int ^ param2;
                stackOut_3_0 = var4_int;
                stackIn_4_0 = stackOut_3_0;
                break L0;
              } else {
                var4_int = var4_int >>> 8 ^ fo.field_e[255 & (var4_int ^ param3[var5])];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("oa.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, pn param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                L2: {
                  if (param0 <= -30) {
                    break L2;
                  } else {
                    oa.a(-9);
                    break L2;
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (aa.field_e <= var2_int) {
                    int dupTemp$5 = param1.b(14842);
                    g.field_l[dupTemp$5] = g.field_l[dupTemp$5] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= aa.field_e) {
                        aa.field_e = var2_int;
                        pn[] fieldTemp$6 = wb.field_e;
                        int fieldTemp$7 = aa.field_e;
                        aa.field_e = aa.field_e + 1;
                        fieldTemp$6[fieldTemp$7] = param1;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (wb.field_e[var3].field_p == param1.field_p) {
                              var4 = wb.field_e[var3].b(14842);
                              if (g.field_l[var4] <= ap.field_E) {
                                break L6;
                              } else {
                                g.field_l[var4] = g.field_l[var4] - 1;
                                break L5;
                              }
                            } else {
                              break L6;
                            }
                          }
                          int incrementValue$8 = var2_int;
                          var2_int++;
                          wb.field_e[incrementValue$8] = wb.field_e[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (param1.field_p == wb.field_e[var2_int].field_p) {
                        int dupTemp$9 = wb.field_e[var2_int].b(14842);
                        g.field_l[dupTemp$9] = g.field_l[dupTemp$9] + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                g.field_l[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("oa.E(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
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
