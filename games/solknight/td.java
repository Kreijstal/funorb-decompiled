/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td implements j {
    static String field_i;
    static int field_l;
    private int field_m;
    private int field_p;
    private int field_f;
    private int field_j;
    static String field_n;
    private int field_q;
    static ce field_h;
    private int field_o;
    private int field_a;
    private int field_c;
    private int field_d;
    private mg field_g;
    private int field_k;
    static o[] field_e;
    private int field_b;

    final static void a(int param0) {
        boolean discarded$1 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        dj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        da var13 = null;
        jd var14 = null;
        jd var15 = null;
        int[][] var19 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_36_0 = 0;
        boolean stackIn_39_0 = false;
        int stackIn_45_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_35_0 = 0;
        boolean stackOut_29_0 = false;
        boolean stackOut_38_0 = false;
        int stackOut_44_0 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var14 = te.field_N;
            var15 = var14;
            var2 = var15.j(255);
            var3 = (dj) ((Object) sa.field_n.a((byte) 51));
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var3.field_i;
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == var2) {
                        break L3;
                      } else {
                        var3 = (dj) ((Object) sa.field_n.b(-44));
                        if (var12 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (var3 != null) {
                  stackOut_9_0 = var15.j(255);
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  je.a(false);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              L4: {
                L5: {
                  var4 = stackIn_10_0;
                  if (0 == var4) {
                    break L5;
                  } else {
                    var5 = var3.field_h;
                    cg.field_a[0] = ne.field_g;
                    var6_int = 1;
                    L6: while (true) {
                      L7: {
                        if (var4 <= var6_int) {
                          ld.c(var5, var4, 42);
                          break L7;
                        } else {
                          cg.field_a[var6_int] = var14.h(20);
                          var6_int++;
                          if (var12 != 0) {
                            break L7;
                          } else {
                            continue L6;
                          }
                        }
                      }
                      var6_int = 0;
                      L8: while (true) {
                        L9: {
                          if (var6_int >= var4) {
                            ta.b((byte) 105, var5);
                            stackOut_26_0 = 2;
                            stackIn_27_0 = stackOut_26_0;
                            break L9;
                          } else {
                            eh.a((byte) 68, var15);
                            stackOut_19_0 = var6_int;
                            stackIn_27_0 = stackOut_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            if (var12 != 0) {
                              break L9;
                            } else {
                              L10: {
                                if (stackIn_20_0 != 0) {
                                  sf.a(fh.field_a, false, var6_int, vg.field_P, nf.field_S, dk.field_i);
                                  break L10;
                                } else {
                                  sf.a(fh.field_a, false, var6_int, vg.field_P, nf.field_S, dk.field_i);
                                  if (var12 == 0) {
                                    break L10;
                                  } else {
                                    sf.a(fh.field_a, false, var6_int, vg.field_P, nf.field_S, dk.field_i);
                                    break L10;
                                  }
                                }
                              }
                              var6_int++;
                              continue L8;
                            }
                          }
                        }
                        var6 = new String[stackIn_27_0][var5];
                        var19 = new int[2][var5 * 4];
                        var8 = kg.field_c;
                        var9 = 0;
                        var10 = 0;
                        L11: while (true) {
                          L12: {
                            if (var8 <= var9) {
                              var9 = 0;
                              stackOut_35_0 = 0;
                              stackIn_36_0 = stackOut_35_0;
                              break L12;
                            } else {
                              var11 = pd.field_e[var9];
                              var6[0][var10] = cg.field_a[var11];
                              var19[0][var10 * 4] = qg.field_c[var11];
                              var19[0][var10 * 4 + 1] = eh.field_a[var11];
                              var19[0][2 + 4 * var10] = ld.field_M[var11];
                              var19[0][4 * var10 - -3] = ma.field_n[var11];
                              stackOut_29_0 = kj.a(cg.field_a[var11], (byte) -66);
                              stackIn_36_0 = stackOut_29_0 ? 1 : 0;
                              stackIn_30_0 = stackOut_29_0;
                              if (var12 != 0) {
                                break L12;
                              } else {
                                L13: {
                                  if (!stackIn_30_0) {
                                    break L13;
                                  } else {
                                    if (ld.field_M[var11] + eh.field_a[var11] + ma.field_n[var11] == 0) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L11;
                              }
                            }
                          }
                          var10 = stackIn_36_0;
                          L14: while (true) {
                            if (var9 >= var8) {
                              break L5;
                            } else {
                              var11 = pd.field_e[var9 + var5];
                              var6[1][var10] = cg.field_a[var11];
                              var19[1][4 * var10] = qg.field_c[var11];
                              var19[1][1 + 4 * var10] = eh.field_a[var11];
                              var19[1][2 + 4 * var10] = ld.field_M[var11];
                              var19[1][3 + var10 * 4] = ma.field_n[var11];
                              stackOut_38_0 = kj.a(cg.field_a[var11], (byte) -75);
                              stackIn_45_0 = stackOut_38_0 ? 1 : 0;
                              stackIn_39_0 = stackOut_38_0;
                              if (var12 != 0) {
                                break L4;
                              } else {
                                L15: {
                                  if (!stackIn_39_0) {
                                    break L15;
                                  } else {
                                    if (-1 == (ld.field_M[var11] + eh.field_a[var11] + ma.field_n[var11] ^ -1)) {
                                      var6[1][var10] = null;
                                      var10--;
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var10++;
                                var9++;
                                continue L14;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_44_0 = param0;
                stackIn_45_0 = stackOut_44_0;
                break L4;
              }
              L16: {
                if (stackIn_45_0 > -125) {
                  var13 = (da) null;
                  discarded$1 = td.a(25, (da) null);
                  var3.c(10);
                  break L16;
                } else {
                  var3.c(10);
                  break L16;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "td.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        tg var11 = null;
        rc stackIn_3_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        rc stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof tg) {
                stackOut_2_0 = (rc) (param4);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (rc) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var11 = (tg) ((Object) stackIn_3_0);
              if (var11 == null) {
                break L2;
              } else {
                param2 = param2 & var11.field_B;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              mi.b(param4.field_m + param3, param4.field_j + param1, param4.field_t, param4.field_x, this.field_f);
              if (!param2) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              var8 = this.field_c + (param3 + param4.field_m);
              var9 = param1 - (-param4.field_j - this.field_o);
              mi.d(var8, var9, this.field_k, this.field_j, 5592405);
              mi.b(var8, var9, this.field_k, this.field_j, var7);
              if (param0 > 113) {
                break L4;
              } else {
                field_e = (o[]) null;
                break L4;
              }
            }
            L5: {
              if (!var11.field_F) {
                break L5;
              } else {
                mi.e(var8, var9, this.field_k + var8, var9 + this.field_j, 1);
                mi.e(this.field_k + var8, var9, var8, this.field_j + var9, 1);
                break L5;
              }
            }
            L6: {
              if (null == this.field_g) {
                break L6;
              } else {
                var10 = this.field_k + this.field_c + this.field_p;
                discarded$1 = this.field_g.a(param4.field_i, param4.field_m + (param3 + var10), param1 + param4.field_j - -this.field_m, param4.field_t - this.field_p - var10, param4.field_x + -(this.field_p << 1320919649), this.field_q, this.field_a, this.field_b, this.field_d, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("td.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static boolean a(int param0, da param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param0 == -3) {
                break L1;
              } else {
                td.a(-37);
                break L1;
              }
            }
            stackOut_2_0 = param1.b(true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("td.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
          field_h = (ce) null;
          field_h = null;
          field_n = null;
          field_e = null;
          return;
        } else {
          field_h = null;
          field_n = null;
          field_e = null;
          return;
        }
    }

    td(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_d = 1;
        this.field_b = 1;
        try {
            this.field_c = param5;
            this.field_j = param7;
            this.field_a = param4;
            this.field_f = param9;
            this.field_k = param8;
            this.field_m = param2;
            this.field_o = param6;
            this.field_q = param3;
            this.field_p = param1;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_l = 256;
        field_n = "Names cannot contain consecutive spaces";
    }
}
