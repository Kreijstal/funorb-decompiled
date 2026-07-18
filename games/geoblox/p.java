/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends hf {
    int field_l;
    int field_j;
    static boolean field_m;
    int field_h;
    static ue field_i;
    static int[] field_o;
    int field_g;
    int field_n;
    static int field_k;
    int field_f;

    final static void a(int[] param0, int[] param1, nf param2) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var30 = Geoblox.field_C;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param0[3] >> 2;
            var22 = param0[4] >> 2;
            var23 = param0[5] >> 2;
            var24 = param0[6] >> 2;
            var25 = param0[7] >> 2;
            var26 = param0[8] >> 2;
            var27 = param0[9] >> 2;
            var28 = param0[10] >> 2;
            var13 = var25 * param1[4] + (param1[3] * var24 + var26 * param1[5]) >> 14;
            var29 = param0[11] >> 2;
            var12 = param1[3] * var21 + var22 * param1[4] + var23 * param1[5] >> 14;
            var18 = param1[11] * var23 + (param1[10] * var22 + param1[9] * var21) >> 14;
            var15 = param1[6] * var21 - (-(param1[7] * var22) - param1[8] * var23) >> 14;
            var16 = var25 * param1[7] + (var24 * param1[6] - -(var26 * param1[8])) >> 14;
            var14 = var29 * param1[5] + param1[3] * var27 - -(param1[4] * var28) >> 14;
            var19 = param1[10] * var25 + var24 * param1[9] - -(param1[11] * var26) >> 14;
            var20 = var27 * param1[9] + var28 * param1[10] + param1[11] * var29 >> 14;
            var17 = param1[8] * var29 + param1[6] * var27 + var28 * param1[7] >> 14;
            var21 = param1[0] - param0[0];
            var22 = -param0[1] + param1[1];
            var23 = param1[2] + -param0[2];
            var9 = param0[3] * var21 - (-(var22 * param0[4]) - param0[5] * var23) >> -ok.field_g + 16;
            var10 = var23 * param0[8] + (var21 * param0[6] + var22 * param0[7]) >> 16 - ok.field_g;
            var11 = param0[11] * var23 + var21 * param0[9] - -(var22 * param0[10]) >> 16;
            var21 = mh.field_d;
            var22 = mh.field_i;
            var23 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (param2.field_o <= var23) {
                      break L4;
                    } else {
                      var24 = param2.field_O[var23];
                      var25 = param2.field_q[var23];
                      var26 = param2.field_K[var23];
                      var27 = (var24 * var12 + var25 * var15 - -(var18 * var26) >> -ok.field_g + 16) + var9;
                      var28 = var10 + (var13 * var24 + var25 * var16 + var26 * var19 >> 16 - ok.field_g);
                      var29 = var11 + (var26 * var20 + var14 * var24 + var17 * var25 >> 16);
                      stackOut_6_0 = -51;
                      stackOut_6_1 = ~var29;
                      stackIn_64_0 = stackOut_6_0;
                      stackIn_64_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var30 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_7_0 < stackIn_7_1) {
                              break L6;
                            } else {
                              L7: {
                                sh.field_x[var23] = var27 / var29 + var21;
                                dj.field_N[var23] = var22 - -(var28 / var29);
                                if (~var29 <= ~var7_int) {
                                  break L7;
                                } else {
                                  var7_int = var29;
                                  break L7;
                                }
                              }
                              L8: {
                                if (var8 < var29) {
                                  var8 = var29;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              bj.field_j[var23] = var29;
                              if (var30 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          bj.field_j[var23] = -2147483648;
                          break L5;
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L9: {
                    if (null == param2.field_L) {
                      break L9;
                    } else {
                      if (param2.field_d == null) {
                        break L9;
                      } else {
                        if (param2.field_C == null) {
                          break L9;
                        } else {
                          if (param2.field_x == null) {
                            break L9;
                          } else {
                            if (null == param2.field_a) {
                              break L9;
                            } else {
                              if (param2.field_y == null) {
                                break L9;
                              } else {
                                if (param2.field_l == null) {
                                  break L9;
                                } else {
                                  if (null == param2.field_p) {
                                    break L9;
                                  } else {
                                    if (param2.field_b == null) {
                                      break L9;
                                    } else {
                                      var23 = 0;
                                      L10: while (true) {
                                        if (~var23 <= ~param2.field_f) {
                                          break L9;
                                        } else {
                                          var24 = param2.field_L[var23];
                                          var25 = param2.field_d[var23];
                                          var26 = param2.field_C[var23];
                                          ii.field_d[var23] = (var12 * var24 - (-(var15 * var25) - var18 * var26) >> 16) + var9;
                                          pg.field_d[var23] = var10 - -(var26 * var19 + var16 * var25 + var24 * var13 >> 16);
                                          kf.field_a[var23] = (var26 * var20 + (var17 * var25 + var14 * var24) >> 16) + var11;
                                          var24 = param2.field_x[var23];
                                          var25 = param2.field_a[var23];
                                          var26 = param2.field_y[var23];
                                          qf.field_Y[var23] = (var15 * var25 + var12 * var24 + var26 * var18 >> 16) + var9;
                                          ac.field_w[var23] = var10 + (var19 * var26 + var25 * var16 + var13 * var24 >> 16);
                                          vk.field_c[var23] = (var26 * var20 + var24 * var14 + var17 * var25 >> 16) + var11;
                                          var24 = param2.field_l[var23];
                                          var25 = param2.field_p[var23];
                                          var26 = param2.field_b[var23];
                                          qe.field_c[var23] = (var25 * var15 + (var12 * var24 + var26 * var18) >> 16) + var9;
                                          ba.field_h[var23] = var10 - -(var24 * var13 + (var16 * var25 + var19 * var26) >> 16);
                                          hg.field_c[var23] = var11 + (var26 * var20 + var25 * var17 + var14 * var24 >> 16);
                                          var23++;
                                          if (var30 != 0) {
                                            break L2;
                                          } else {
                                            if (var30 == 0) {
                                              continue L10;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var9 = param1[3];
                  var10 = param1[4];
                  var11 = param1[5];
                  var12 = param1[6];
                  var13 = param1[7];
                  var14 = param1[8];
                  var15 = param1[9];
                  var16 = param1[10];
                  var17 = param1[11];
                  var18 = 0;
                  L11: while (true) {
                    L12: {
                      if (~param2.field_m >= ~var18) {
                        break L12;
                      } else {
                        stackOut_58_0 = ok.field_h.length;
                        stackOut_58_1 = var18;
                        stackIn_64_0 = stackOut_58_0;
                        stackIn_64_1 = stackOut_58_1;
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        if (var30 != 0) {
                          break L3;
                        } else {
                          if (stackIn_59_0 <= stackIn_59_1) {
                            break L12;
                          } else {
                            var19 = param2.field_M[var18];
                            var20 = param2.field_t[var18];
                            var21 = param2.field_i[var18];
                            ok.field_h[var18] = var21 * var15 + (var12 * var20 + var19 * var9) >> 16;
                            oa.field_f[var18] = var16 * var21 + (var19 * var10 - -(var20 * var13)) >> 16;
                            gi.field_b[var18] = var14 * var20 + (var11 * var19 + var17 * var21) >> 16;
                            var18++;
                            if (var30 == 0) {
                              continue L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                    stackOut_63_0 = var7_int;
                    stackOut_63_1 = 22;
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    break L3;
                  }
                }
                int discarded$1 = 0;
                i.a(stackIn_64_0, (byte) stackIn_64_1, param2, var8);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("p.B(");
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L13;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L13;
            }
          }
          L14: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L14;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L14;
            }
          }
          L15: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param2 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L15;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L15;
            }
          }
          throw t.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ',' + true + ',' + false + ',' + false + ',' + true + ')');
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -21) {
                break L1;
              } else {
                field_k = 120;
                break L1;
              }
            }
            field_o = null;
            field_i = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "p.A(" + param0 + ')');
        }
    }

    p(int param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            ((p) this).field_f = param2;
            ((p) this).field_g = param3;
            ((p) this).field_n = param5;
            ((p) this).field_j = param4;
            ((p) this).field_h = param1;
            ((p) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "p.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            L2: {
              var2 = fh.a(rh.a(param0, -48), -78);
              if (null != var2) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackOut_5_0 = (String) var2;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("p.C(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    static {
    }
}
