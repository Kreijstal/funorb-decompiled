/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends j {
    static String field_w;
    static boolean field_x;
    static String field_u;
    static String field_t;
    static String field_v;

    final int a(ln param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param0.field_x;
              if (param0.field_u) {
                var3_int = var3_int * 2 + 5;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = var3_int + param0.field_D.length;
              if (param1 <= -49) {
                break L2;
              } else {
                field_v = null;
                break L2;
              }
            }
            L3: {
              var3_int = var3_int + ((cj) this).a((byte) -64, param0);
              if (var3_int >= 1) {
                break L3;
              } else {
                var3_int = 1;
                break L3;
              }
            }
            stackOut_7_0 = var3_int;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("cj.GA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    cj(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 2);
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        ln[] var10 = null;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 0;
        var4 = mj.field_yb.j(18229);
        if (param1 == -1799) {
          L0: while (true) {
            if (var4 == null) {
              return var3;
            } else {
              if (param0 == 0) {
                return var3;
              } else {
                var5 = 0;
                var6 = var4.field_D;
                var7 = 0;
                L1: while (true) {
                  if (var7 >= var6.length) {
                    L2: {
                      var5 = var5 >> 1;
                      if (param0 >= var5) {
                        break L2;
                      } else {
                        var5 = param0;
                        break L2;
                      }
                    }
                    wb.field_b[var4.field_p] = wb.field_b[var4.field_p] + var5;
                    param0 = param0 - var5;
                    var3 = var3 + var5;
                    var4 = mj.field_yb.h(-23410);
                    continue L0;
                  } else {
                    var8 = var6[var7];
                    if (var8.field_y == ((cj) this).field_n) {
                      var9 = 0;
                      var10 = var8.field_D;
                      var11 = 0;
                      L3: while (true) {
                        L4: {
                          if (var10.length <= var11) {
                            break L4;
                          } else {
                            var12 = var10[var11];
                            if (((cj) this).field_n != var12.field_y) {
                              if (null != var12.field_y) {
                                if (!((cj) this).field_n.field_h[var12.field_y.field_x]) {
                                  var9 = 1;
                                  break L4;
                                } else {
                                  var11++;
                                  continue L3;
                                }
                              } else {
                                var11++;
                                continue L3;
                              }
                            } else {
                              var11++;
                              continue L3;
                            }
                          }
                        }
                        L5: {
                          stackOut_42_0 = var5;
                          stackIn_41_0 = stackOut_42_0;
                          stackIn_43_0 = stackOut_42_0;
                          if (var9 == 0) {
                            stackOut_41_0 = stackIn_41_0;
                            stackOut_41_1 = 1;
                            stackIn_40_0 = stackOut_41_0;
                            stackIn_40_1 = stackOut_41_1;
                            break L5;
                          } else {
                            stackOut_43_0 = stackIn_43_0;
                            stackIn_39_0 = stackOut_43_0;
                            stackOut_39_0 = stackIn_39_0;
                            stackOut_39_1 = 2;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            break L5;
                          }
                        }
                        var5 = stackIn_40_0 + stackIn_40_1;
                        var7++;
                        continue L1;
                      }
                    } else {
                      var7++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } else {
          return -61;
        }
    }

    public static void c(boolean param0) {
        field_w = null;
        field_t = null;
        field_u = null;
        if (param0) {
            Object var2 = null;
            cj.a(40, -110, (qr) null);
        }
        field_v = null;
    }

    final int d(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                cj.c(true);
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_x - -param0.field_D.length;
              if (var3_int == 0) {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = var3_int;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("cj.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == -18484) {
            break L0;
          } else {
            int discarded$1 = ((cj) this).a((byte) -16, -120);
            break L0;
          }
        }
        ((cj) this).field_k = -1;
        var2 = ((cj) this).field_g.field_r;
        var3 = 0;
        L1: while (true) {
          if (var3 >= var2) {
            return;
          } else {
            var4 = ((cj) this).field_g.field_m[var2 - 1 + -var3];
            if (((cj) this).field_n.field_x != var4) {
              if (!((cj) this).field_n.field_h[var4]) {
                if ((((cj) this).field_g.field_w & 1 << var4) == 0) {
                  var5 = 1;
                  var6 = 0;
                  L2: while (true) {
                    if (((cj) this).field_g.field_r <= var6) {
                      L3: {
                        stackOut_19_0 = ((cj) this).field_b;
                        stackOut_19_1 = var3;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (var5 == 0) {
                          stackOut_21_0 = (int[]) (Object) stackIn_21_0;
                          stackOut_21_1 = stackIn_21_1;
                          stackOut_21_2 = 4;
                          stackIn_22_0 = stackOut_21_0;
                          stackIn_22_1 = stackOut_21_1;
                          stackIn_22_2 = stackOut_21_2;
                          break L3;
                        } else {
                          stackOut_20_0 = (int[]) (Object) stackIn_20_0;
                          stackOut_20_1 = stackIn_20_1;
                          stackOut_20_2 = -3;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          stackIn_22_2 = stackOut_20_2;
                          break L3;
                        }
                      }
                      L4: {
                        stackIn_22_0[stackIn_22_1] = stackIn_22_2;
                        if (((cj) this).field_g.field_D[((cj) this).field_n.field_x] <= 2 * ((cj) this).field_g.field_D[var3]) {
                          break L4;
                        } else {
                          ((cj) this).field_b[var3] = 3;
                          var5 = 0;
                          break L4;
                        }
                      }
                      if (var5 != 0) {
                        if (-1 == ((cj) this).field_k) {
                          ((cj) this).field_k = var3;
                          var3++;
                          continue L1;
                        } else {
                          var3++;
                          continue L1;
                        }
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      L5: {
                        L6: {
                          if (var3 == var6) {
                            break L6;
                          } else {
                            if (((cj) this).field_g.field_v[var3].field_h[var6]) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if ((1 << var6 & ((cj) this).field_g.field_w) != 0) {
                          break L5;
                        } else {
                          var6++;
                          continue L2;
                        }
                      }
                      var5 = 0;
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, qr param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        fc var11 = null;
        bi var12 = null;
        String var13 = null;
        fc var14 = null;
        bi var15 = null;
        String var16 = null;
        fc var17 = null;
        bi var18 = null;
        String var19 = null;
        fc var20 = null;
        bi var21 = null;
        String var22 = null;
        fc var23 = null;
        bi var24 = null;
        String var25 = null;
        fc var26 = null;
        bi var27 = null;
        String var28 = null;
        fc var29 = null;
        bi var30 = null;
        String var31 = null;
        fc var32 = null;
        bi var33 = null;
        String var34 = null;
        fc var35 = null;
        bi var36 = null;
        String var37 = null;
        fc var38 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              tp.a((int[]) null, 0L, (String) null, (String) null, 293, (ub) null, param2, param0, -1);
              if (0 == param0) {
                var11 = hp.field_m;
                var12 = bh.field_m[0];
                var21 = var12;
                var30 = var21;
                var21 = var12;
                var13 = wi.field_a;
                var11.field_j.a(false, var12, var13, 11);
                var14 = hp.field_m;
                var15 = bh.field_m[1];
                var21 = var15;
                var30 = var21;
                var21 = var15;
                var16 = ts.field_H;
                var14.field_j.a(false, var15, var16, 12);
                var17 = hp.field_m;
                var18 = bh.field_m[2];
                var21 = var18;
                var30 = var21;
                var21 = var18;
                var19 = ah.field_O;
                var17.field_j.a(false, var18, var19, 13);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 1) {
                var20 = hp.field_m;
                var21 = bh.field_m[0];
                var30 = var21;
                var30 = var21;
                var22 = hk.field_pb;
                var20.field_j.a(false, var21, var22, 11);
                var23 = hp.field_m;
                var24 = bh.field_m[1];
                var30 = var24;
                var30 = var24;
                var25 = so.field_s;
                var23.field_j.a(false, var24, var25, 12);
                var26 = hp.field_m;
                var27 = bh.field_m[2];
                var30 = var27;
                var30 = var27;
                var28 = gn.field_A;
                var26.field_j.a(false, var27, var28, 13);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (2 == param0) {
                var29 = hp.field_m;
                var30 = bh.field_m[0];
                var31 = sj.field_d;
                var29.field_j.a(false, var30, var31, 11);
                var32 = hp.field_m;
                var33 = bh.field_m[1];
                var34 = field_w;
                var32.field_j.a(false, var33, var34, 12);
                var35 = hp.field_m;
                var36 = bh.field_m[2];
                var37 = up.field_c;
                var35.field_j.a(false, var36, var37, 13);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var38 = hp.field_m;
              if (param1 <= -107) {
                break L4;
              } else {
                field_v = null;
                break L4;
              }
            }
            var4 = param2.field_B;
            var5 = param2.field_N;
            var6 = param2.field_K;
            var7 = param2.field_mb;
            var38.field_j.b(var6, var7, 0, var4, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("cj.A(").append(param0).append(',').append(param1).append(',');
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        int var6 = 0;
        ln[] var7_ref_ln__ = null;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 < -29) {
            break L0;
          } else {
            ((cj) this).g(-98);
            break L0;
          }
        }
        var3 = 0;
        var4 = mj.field_yb.j(18229);
        L1: while (true) {
          if (var4 == null) {
            return var3;
          } else {
            var5 = var4.field_p;
            var6 = 0;
            var7_ref_ln__ = var4.field_D;
            var8 = 0;
            L2: while (true) {
              if (var7_ref_ln__.length <= var8) {
                ja.field_i[var5] = ja.field_i[var5] + var4.field_x;
                wb.field_b[var5] = var6;
                var7 = var6 + -var4.field_x;
                var4 = mj.field_yb.h(-23410);
                var3 = var3 + var7;
                continue L1;
              } else {
                var9 = var7_ref_ln__[var8];
                if (((cj) this).field_n != var9.field_y) {
                  var6++;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Show private chat from my friends and opponents";
        field_t = "Sol is unoccupied";
        field_v = "Menu";
    }
}
