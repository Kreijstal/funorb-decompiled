/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends ta {
    private am[] field_t;
    private int[] field_s;
    private int[] field_q;
    static String field_r;
    private am field_u;

    final static boolean a() {
        int var1 = 0;
        return bn.field_i;
    }

    public static void b() {
        field_r = null;
    }

    final int[] a(boolean param0, la param1, int param2, double param3, boolean param4, int param5, si param6, int param7) {
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
        int[] stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_39_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var24 = Torquing.field_u;
        try {
          L0: {
            ue.field_g = param6;
            vf.field_a = param1;
            var10_int = 0;
            L1: while (true) {
              if (((wd) this).field_t.length <= var10_int) {
                L2: {
                  pe.a((byte) -122, param3);
                  re.a(param2, 0, param7);
                  var26 = new int[param7 * param2];
                  var10_array = var26;
                  if (param4) {
                    var12 = -1;
                    var11 = -1 + param7;
                    var13 = -1;
                    break L2;
                  } else {
                    var12 = param7;
                    var11 = 0;
                    var13 = 1;
                    break L2;
                  }
                }
                var14 = param5;
                var15 = 0;
                L3: while (true) {
                  if (param2 <= var15) {
                    var27 = 0;
                    var15 = var27;
                    L4: while (true) {
                      if (((wd) this).field_t.length <= var27) {
                        stackOut_39_0 = (int[]) var10_array;
                        stackIn_40_0 = stackOut_39_0;
                        break L0;
                      } else {
                        ((wd) this).field_t[var27].d((byte) -127);
                        var27++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: {
                      if (!param0) {
                        break L5;
                      } else {
                        var14 = var15;
                        break L5;
                      }
                    }
                    L6: {
                      if (((wd) this).field_u.field_p) {
                        var19_ref_int__ = ((wd) this).field_u.a((byte) 111, var15);
                        var18 = var19_ref_int__;
                        var17 = var19_ref_int__;
                        var16 = var19_ref_int__;
                        break L6;
                      } else {
                        var31 = ((wd) this).field_u.a(-29116, var15);
                        var30 = var31;
                        var29 = var30;
                        var28 = var29;
                        var25 = var28;
                        var19_ref_int____ = var25;
                        var16 = var31[0];
                        var18 = var31[2];
                        var17 = var31[1];
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
                          if (var20 >= 0) {
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
                          if (var21 >= 0) {
                            break L11;
                          } else {
                            var21 = 0;
                            break L11;
                          }
                        }
                        L12: {
                          var22 = var18[var19] >> 4;
                          if (var22 <= 255) {
                            break L12;
                          } else {
                            var22 = 255;
                            break L12;
                          }
                        }
                        L13: {
                          if (var22 < 0) {
                            var22 = 0;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          var20 = uk.field_b[var20];
                          var21 = uk.field_b[var21];
                          var22 = uk.field_b[var22];
                          var23 = var22 + ((var21 << 8) + (var20 << 16));
                          if (var23 == 0) {
                            break L14;
                          } else {
                            var23 = var23 | -16777216;
                            break L14;
                          }
                        }
                        L15: {
                          int incrementValue$1 = var14;
                          var14++;
                          var26[incrementValue$1] = var23;
                          if (param0) {
                            var14 = var14 + (-1 + param7);
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
                ((wd) this).field_t[var10_int].a(param7, param5 + 17749, param2);
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var10 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var10;
            stackOut_41_1 = new StringBuilder().append("wd.E(").append(param0).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L16;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L16;
            }
          }
          L17: {
            stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param6 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L17;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L17;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 44 + param7 + 41);
        }
        return stackIn_40_0;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        if (param5 == param3) {
          lc.a(param1, param2, -123, param7, param6, param5, param0);
          return;
        } else {
          L0: {
            if (kn.field_e > -param5 + param2) {
              wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
              break L0;
            } else {
              if (qg.field_z < param2 - -param5) {
                wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
                break L0;
              } else {
                if (j.field_q > -param3 + param7) {
                  wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
                  break L0;
                } else {
                  if (param3 + param7 > qk.field_p) {
                    wk.a(param1, param0, param6, param7, param2, param5, 0, param3);
                    break L0;
                  } else {
                    ai.a(param6, param0, param2, param5, param7, param1, -128, param3);
                    break L0;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final boolean a(int param0, la param1, si param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
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
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
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
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (po.field_u >= 0) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= ((wd) this).field_q.length) {
                    break L1;
                  } else {
                    if (!param1.a(po.field_u, ((wd) this).field_q[var4_int], (byte) -123)) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (((wd) this).field_q.length <= var4_int) {
                    break L1;
                  } else {
                    if (!param1.a(((wd) this).field_q[var4_int], false)) {
                      stackOut_6_0 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            var4_int = 0;
            L4: while (true) {
              if (((wd) this).field_s.length <= var4_int) {
                var5 = -105 % ((param0 - 2) / 37);
                stackOut_23_0 = 1;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                if (!param2.a(((wd) this).field_s[var4_int], 3)) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0 != 0;
                } else {
                  var4_int++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("wd.C(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          L6: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
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
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
        return stackIn_24_0 != 0;
    }

    wd(fj param0) {
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
        am var13 = null;
        am var14 = null;
        int[][] var15 = null;
        am var16 = null;
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
            var2_int = param0.i((byte) -101);
            var3 = 0;
            var4 = 0;
            ((wd) this).field_t = new am[var2_int];
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
              if (var2_int <= var6) {
                ((wd) this).field_q = new int[var3];
                ((wd) this).field_s = new int[var4];
                var3 = 0;
                var4 = 0;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var2_int) {
                    ((wd) this).field_u = ((wd) this).field_t[param0.i((byte) -101)];
                    int discarded$4 = param0.i((byte) -101);
                    int discarded$5 = param0.i((byte) -101);
                    var5 = null;
                    break L0;
                  } else {
                    var16 = ((wd) this).field_t[var6];
                    var8 = var16.field_m.length;
                    var9 = 0;
                    L3: while (true) {
                      if (var9 >= var8) {
                        L4: {
                          var9 = var16.e((byte) 27);
                          var10 = var16.f((byte) 57);
                          if (var9 <= 0) {
                            break L4;
                          } else {
                            int incrementValue$6 = var3;
                            var3++;
                            ((wd) this).field_q[incrementValue$6] = var9;
                            break L4;
                          }
                        }
                        L5: {
                          if (var10 <= 0) {
                            break L5;
                          } else {
                            int incrementValue$7 = var4;
                            var4++;
                            ((wd) this).field_s[incrementValue$7] = var10;
                            break L5;
                          }
                        }
                        var5[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var16.field_m[var9] = ((wd) this).field_t[var23[var6][var9]];
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L6: {
                  var13 = fn.a(-58, param0);
                  var14 = var13;
                  if (var14.e((byte) 62) < 0) {
                    break L6;
                  } else {
                    var3++;
                    break L6;
                  }
                }
                L7: {
                  if (0 > var14.f((byte) 23)) {
                    break L7;
                  } else {
                    var4++;
                    break L7;
                  }
                }
                var8 = var14.field_m.length;
                var12[var6] = new int[var8];
                var9 = 0;
                L8: while (true) {
                  if (var8 <= var9) {
                    ((wd) this).field_t[var6] = var13;
                    var6++;
                    continue L1;
                  } else {
                    var22[var6][var9] = param0.i((byte) -101);
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
            stackOut_23_1 = new StringBuilder().append("wd.<init>(");
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
          throw rb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "to over <%0> great games";
    }
}
