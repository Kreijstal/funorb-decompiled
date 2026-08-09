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
            byte[] var2 = (byte[]) null;
            oa.a(0, -103, 105, (byte[]) null);
        }
        field_d = null;
        field_a = null;
        field_f = null;
        field_g = null;
    }

    final static void a(boolean param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        byte[] var15 = null;
        ge var16 = null;
        ge var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
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
                                    var15 = (byte[]) null;
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
                                      var20 = new byte[var7];
                                      var18 = var20;
                                      var8 = var18;
                                      v.field_b[var4] = var20;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var9 = var19;
                                      wg.field_Sb[var4] = var21;
                                      var10 = 0;
                                      var11 = var17.g(-121);
                                      if (-1 == (1 & var11 ^ -1)) {
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
                                                    dupTemp$0 = var16.e((byte) 105);
                                                    var9[var12] = dupTemp$0;
                                                    var13 = dupTemp$0;
                                                    stackIn_48_0 = var10;

                                                    if (-1 == var13) {
                                                      stackIn_49_0 = stackIn_48_0;
                                                      stackIn_49_1 = 0;
                                                      break L11;
                                                    } else {
                                                      stackIn_49_0 = stackIn_48_0;
                                                      stackIn_49_1 = 1;
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
                                                        dupTemp$1 = var16.e((byte) 105);
                                                        var9[var12 - -(var13 * var5)] = dupTemp$1;
                                                        var14 = dupTemp$1;
                                                        stackIn_36_0 = var10;

                                                        if (var14 == -1) {
                                                          stackIn_37_0 = stackIn_36_0;
                                                          stackIn_37_1 = 0;
                                                          break L15;
                                                        } else {
                                                          stackIn_37_0 = stackIn_36_0;
                                                          stackIn_37_1 = 1;
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
            stackIn_54_0 = (RuntimeException) (var2);

            stackIn_54_1 = new StringBuilder().append("oa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L18;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L18;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = -1;
            var5 = param0;
            L1: while (true) {
              if (var5 >= param1) {
                var4_int = var4_int ^ param2;
                stackIn_4_0 = var4_int;
                break L0;
              } else {
                var4_int = var4_int >>> 49336520 ^ fo.field_e[255 & (var4_int ^ param3[var5])];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("oa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, pn param1) {
        int dupTemp$0 = 0;
        pn[] fieldTemp$1 = null;
        int fieldTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
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
                    dupTemp$0 = param1.b(14842);
                    g.field_l[dupTemp$0] = g.field_l[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= aa.field_e) {
                        aa.field_e = var2_int;
                        fieldTemp$1 = wb.field_e;
                        fieldTemp$2 = aa.field_e;
                        aa.field_e = aa.field_e + 1;
                        fieldTemp$1[fieldTemp$2] = param1;
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
                          incrementValue$3 = var2_int;
                          var2_int++;
                          wb.field_e[incrementValue$3] = wb.field_e[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (param1.field_p == wb.field_e[var2_int].field_p) {
                        dupTemp$4 = wb.field_e[var2_int].b(14842);
                        g.field_l[dupTemp$4] = g.field_l[dupTemp$4] + 1;
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
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("oa.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    oa(Throwable param0, String param1) {
        this.field_c = param0;
        this.field_i = param1;
    }

    static {
        field_k = 9;
        field_b = 1 << field_k;
        field_f = new long[32];
        field_d = null;
        field_j = false;
    }
}
