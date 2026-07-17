/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends eo {
    private k field_v;
    static int[] field_u;
    static int field_n;
    static String field_p;
    static eaa field_r;
    private int[] field_o;
    static char[] field_s;
    static int[] field_w;
    private k[] field_y;
    private int[] field_q;
    static boolean field_x;
    static int field_t;

    public static void e(int param0) {
        if (param0 != -29639) {
            field_t = -81;
        }
        field_p = null;
        field_u = null;
        field_w = null;
        field_r = null;
        field_s = null;
    }

    final boolean a(q param0, vr param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (sp.field_l < 0) {
                var4_int = 0;
                L2: while (true) {
                  if (((on) this).field_o.length <= var4_int) {
                    break L1;
                  } else {
                    if (!param1.a(0, ((on) this).field_o[var4_int])) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    } else {
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= ((on) this).field_o.length) {
                    break L1;
                  } else {
                    if (param1.a(-122, ((on) this).field_o[var4_int], sp.field_l)) {
                      var4_int++;
                      continue L3;
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0 != 0;
                    }
                  }
                }
              }
            }
            var4_int = 0;
            L4: while (true) {
              if (var4_int >= ((on) this).field_q.length) {
                L5: {
                  if (param2 <= -44) {
                    break L5;
                  } else {
                    on.e(-105);
                    break L5;
                  }
                }
                stackOut_23_0 = 1;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                if (param0.c((byte) -98, ((on) this).field_q[var4_int])) {
                  var4_int++;
                  continue L4;
                } else {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("on.C(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          L7: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param2 + 41);
        }
        return stackIn_24_0 != 0;
    }

    on(lu param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var12 = null;
        k var13 = null;
        k var14 = null;
        int[][] var15 = null;
        k var16 = null;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        int[][] var23 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var2_int = param0.b(16711935);
            var3 = 0;
            var4 = 0;
            ((on) this).field_y = new k[var2_int];
            var22 = new int[var2_int][];
            var20 = var22;
            var18 = var20;
            var15 = var18;
            var12 = var15;
            var23 = var12;
            var21 = var23;
            var19 = var21;
            var17 = var19;
            var5 = var17;
            var6 = 0;
            L1: while (true) {
              if (~var6 <= ~var2_int) {
                ((on) this).field_o = new int[var3];
                ((on) this).field_q = new int[var4];
                var3 = 0;
                var4 = 0;
                var6 = 0;
                L2: while (true) {
                  if (~var6 <= ~var2_int) {
                    ((on) this).field_v = ((on) this).field_y[param0.b(16711935)];
                    int discarded$4 = param0.b(16711935);
                    int discarded$5 = param0.b(16711935);
                    var5 = null;
                    break L0;
                  } else {
                    var16 = ((on) this).field_y[var6];
                    var8 = var16.field_g.length;
                    var9 = 0;
                    L3: while (true) {
                      if (var8 <= var9) {
                        L4: {
                          var9 = var16.a(-2359);
                          var10 = var16.c((byte) 47);
                          if (var9 <= 0) {
                            break L4;
                          } else {
                            int incrementValue$6 = var3;
                            var3++;
                            ((on) this).field_o[incrementValue$6] = var9;
                            break L4;
                          }
                        }
                        L5: {
                          if (var10 <= 0) {
                            break L5;
                          } else {
                            int incrementValue$7 = var4;
                            var4++;
                            ((on) this).field_q[incrementValue$7] = var10;
                            break L5;
                          }
                        }
                        var5[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var16.field_g[var9] = ((on) this).field_y[var23[var6][var9]];
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L6: {
                  var13 = wb.b(param0, 94);
                  var14 = var13;
                  if (var14.a(-2359) < 0) {
                    break L6;
                  } else {
                    var3++;
                    break L6;
                  }
                }
                L7: {
                  if (var14.c((byte) 78) < 0) {
                    break L7;
                  } else {
                    var4++;
                    break L7;
                  }
                }
                var8 = var14.field_g.length;
                var12[var6] = new int[var8];
                var9 = 0;
                L8: while (true) {
                  if (var9 >= var8) {
                    ((on) this).field_y[var6] = var13;
                    var6++;
                    continue L1;
                  } else {
                    var22[var6][var9] = param0.b(16711935);
                    var9++;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("on.<init>(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final int[] a(double param0, boolean param1, q param2, int param3, int param4, vr param5, boolean param6, int param7) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19_ref_int__ = null;
        int[][] var19_ref_int____ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int[][] var28 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int[][] var31 = null;
        Object stackIn_9_0 = null;
        int[] stackIn_46_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_45_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var24 = BachelorFridge.field_y;
        try {
          L0: {
            da.field_c = param2;
            l.field_r = param5;
            var10_int = 0;
            L1: while (true) {
              if (~var10_int <= ~((on) this).field_y.length) {
                L2: {
                  vd.a(param0, 81);
                  jp.a(-117, param3, param4);
                  var26 = new int[param4 * param3];
                  var10_array = var26;
                  if (!param6) {
                    var13 = 1;
                    var12 = param3;
                    var11 = 0;
                    break L2;
                  } else {
                    var11 = -1 + param3;
                    var13 = -1;
                    var12 = -1;
                    break L2;
                  }
                }
                var14 = 0;
                if (param7 == -1) {
                  var15 = 0;
                  L3: while (true) {
                    if (~param4 >= ~var15) {
                      var27 = 0;
                      var15 = var27;
                      L4: while (true) {
                        if (var27 >= ((on) this).field_y.length) {
                          stackOut_45_0 = (int[]) var10_array;
                          stackIn_46_0 = stackOut_45_0;
                          break L0;
                        } else {
                          ((on) this).field_y[var27].b(-256);
                          var27++;
                          continue L4;
                        }
                      }
                    } else {
                      L5: {
                        if (param1) {
                          var14 = var15;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (((on) this).field_v.field_f) {
                          var19_ref_int__ = ((on) this).field_v.a(var15, 0);
                          var17 = var19_ref_int__;
                          var16 = var19_ref_int__;
                          var18 = var19_ref_int__;
                          break L6;
                        } else {
                          var31 = ((on) this).field_v.a(false, var15);
                          var30 = var31;
                          var29 = var30;
                          var28 = var29;
                          var25 = var28;
                          var19_ref_int____ = var25;
                          var17 = var31[1];
                          var16 = var31[0];
                          var18 = var31[2];
                          break L6;
                        }
                      }
                      var19 = var11;
                      L7: while (true) {
                        if (var12 == var19) {
                          var15++;
                          continue L3;
                        } else {
                          L8: {
                            var20 = var16[var19] >> 4;
                            if (var20 <= 255) {
                              break L8;
                            } else {
                              var20 = 255;
                              break L8;
                            }
                          }
                          L9: {
                            if (0 <= var20) {
                              break L9;
                            } else {
                              var20 = 0;
                              break L9;
                            }
                          }
                          L10: {
                            var21 = var17[var19] >> 4;
                            if (var21 <= 255) {
                              break L10;
                            } else {
                              var21 = 255;
                              break L10;
                            }
                          }
                          L11: {
                            if (var21 < 0) {
                              var21 = 0;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L12: {
                            var22 = var18[var19] >> 4;
                            if (var22 > 255) {
                              var22 = 255;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            var21 = jna.field_f[var21];
                            if (var22 >= 0) {
                              break L13;
                            } else {
                              var22 = 0;
                              break L13;
                            }
                          }
                          L14: {
                            var20 = jna.field_f[var20];
                            var22 = jna.field_f[var22];
                            var23 = (var20 << 16) - -(var21 << 8) - -var22;
                            if (var23 != 0) {
                              var23 = var23 | -16777216;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            int incrementValue$1 = var14;
                            var14++;
                            var26[incrementValue$1] = var23;
                            if (param1) {
                              var14 = var14 + (-1 + param3);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          var19 = var19 + var13;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (int[]) (Object) stackIn_9_0;
                }
              } else {
                ((on) this).field_y[var10_int].a(param4, (byte) -93, param3);
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var10 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var10;
            stackOut_47_1 = new StringBuilder().append("on.B(").append(param0).append(44).append(param1).append(44);
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L16;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L16;
            }
          }
          L17: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param5 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 44 + param6 + 44 + param7 + 41);
        }
        return stackIn_46_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_u = new int[]{3, 5, 1, 3, 1, 1, 1, 1, 2, 1, 1, 1, 3, 5, 2, 1, 1, 1, 5, 1, 2, 2, 1, 1, 1, 5, 3, 3, 2, 2, 10, 5, 3, 5, 3, 5, 5, 3, 10, 5, 5, 5, 3, 5, 3, 3, 2, 5, 3, 1};
        field_s = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
        field_w = new int[8192];
        field_p = "Buying or selling an account";
        field_r = new eaa();
    }
}
