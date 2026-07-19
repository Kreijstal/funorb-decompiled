/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends w {
    static boolean field_Nb;
    static ig field_bc;
    private w field_ac;
    private StringBuilder field_Ub;
    private ha field_Qb;
    private w field_Xb;
    static int[][] field_Ob;
    private w[] field_Yb;
    long field_Tb;
    private w field_cc;
    private w field_Sb;
    static boolean field_Zb;
    private w field_Pb;
    private w field_Wb;
    static int field_Vb;
    private int field_Rb;

    public static void f(int param0) {
        field_Ob = (int[][]) null;
        if (param0 != 256) {
            return;
        }
        field_bc = null;
    }

    final static ck a(int param0, int param1, String param2, lm param3, int param4, int param5, byte param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        ck var14 = null;
        int[] var15 = null;
        ck var16 = null;
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
        int[] var31 = null;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_41_0 = 0;
        ck stackIn_44_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_30_0 = 0;
        byte stackOut_40_0 = 0;
        ck stackOut_43_0 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var27 = client.field_A ? 1 : 0;
        try {
          L0: {
            var7_int = param3.a(param2) - 1;
            L1: while (true) {
              L2: {
                if (param4 * (2 + var7_int) < 620) {
                  break L2;
                } else {
                  param4--;
                  if (var27 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var8 = param3.field_K + param3.field_R;
                var9 = param4;
                var10 = var9 / 4;
                var31 = hk.field_l;
                var12 = hk.field_j;
                var13 = hk.field_i;
                var14 = new ck(var7_int, var8);
                var14.a();
                param3.a(param2, 0, param3.field_R, 16777215, -1);
                if (0 == param5) {
                  param5 = 65793;
                  break L3;
                } else {
                  break L3;
                }
              }
              hk.a(var31, var12, var13);
              var15 = var14.field_D;
              var16 = new ck((2 + var7_int) * var9, var9 * (2 + var8));
              var16.a();
              var17 = 0;
              L4: while (true) {
                stackOut_8_0 = var8;
                stackOut_8_1 = var17;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                L5: while (true) {
                  L6: {
                    if (stackIn_9_0 <= stackIn_9_1) {
                      hk.a(var31, var12, var13);
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L6;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_19_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var27 != 0) {
                        break L6;
                      } else {
                        var18 = stackIn_11_0;
                        L7: while (true) {
                          if (var7_int <= var18) {
                            var17++;
                            continue L4;
                          } else {
                            stackOut_13_0 = var15[var17 * var7_int + var18] ^ -1;
                            stackOut_13_1 = -1;
                            stackIn_9_0 = stackOut_13_0;
                            stackIn_9_1 = stackOut_13_1;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            if (var27 != 0) {
                              continue L5;
                            } else {
                              L8: {
                                if (stackIn_14_0 == stackIn_14_1) {
                                  break L8;
                                } else {
                                  var19 = var9 * (var18 - -1);
                                  var20 = (var17 - -1) * var9;
                                  hk.e(var19, var20, var9 - var10, param5 | -16777216);
                                  hk.e(-1 + var9 + var19, var20, var9 + -var10, param5 | -16777216);
                                  hk.e(var19, var20 - -var9 - 1, -var10 + var9, param5 | -16777216);
                                  hk.e(var19 + (var9 + -1), var9 + var20 - 1, -var10 + var9, param5 | -16777216);
                                  break L8;
                                }
                              }
                              var18++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  var17 = stackIn_19_0;
                  L9: while (true) {
                    stackOut_20_0 = var17;
                    stackOut_20_1 = var8;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (stackIn_21_0 >= stackIn_21_1) {
                            break L12;
                          } else {
                            stackOut_22_0 = 0;
                            stackIn_41_0 = stackOut_22_0;
                            stackIn_23_0 = stackOut_22_0;
                            if (var27 != 0) {
                              break L11;
                            } else {
                              var18 = stackIn_23_0;
                              L13: while (true) {
                                stackOut_24_0 = var7_int;
                                stackIn_25_0 = stackOut_24_0;
                                L14: while (true) {
                                  if (stackIn_25_0 <= var18) {
                                    var17++;
                                    if (var27 == 0) {
                                      continue L9;
                                    } else {
                                      break L12;
                                    }
                                  } else {
                                    stackOut_26_0 = 0;
                                    stackOut_26_1 = var15[var18 - -(var17 * var7_int)];
                                    stackIn_21_0 = stackOut_26_0;
                                    stackIn_21_1 = stackOut_26_1;
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    if (var27 != 0) {
                                      continue L10;
                                    } else {
                                      L15: {
                                        if (stackIn_27_0 == stackIn_27_1) {
                                          break L15;
                                        } else {
                                          var19 = var9 + var18 * var9;
                                          var20 = var19 - -var9;
                                          var21 = var9 * var17 - -var9;
                                          var22 = var9 + var21;
                                          var23 = var21;
                                          L16: while (true) {
                                            if (var23 >= var22) {
                                              break L15;
                                            } else {
                                              var24 = 256 * (var23 - var9) / (var9 * var8);
                                              var25 = fl.a(param1, var24, 256, param0, 124);
                                              stackOut_30_0 = var19;
                                              stackIn_25_0 = stackOut_30_0;
                                              stackIn_31_0 = stackOut_30_0;
                                              if (var27 != 0) {
                                                continue L14;
                                              } else {
                                                var26 = stackIn_31_0;
                                                L17: while (true) {
                                                  L18: {
                                                    if (var20 <= var26) {
                                                      var23++;
                                                      break L18;
                                                    } else {
                                                      var16.field_D[var26 - -(var16.field_I * var23)] = de.b(-16777216, var25);
                                                      var26++;
                                                      if (var27 != 0) {
                                                        break L18;
                                                      } else {
                                                        continue L17;
                                                      }
                                                    }
                                                  }
                                                  continue L16;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var18++;
                                      continue L13;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_40_0 = param6;
                        stackIn_41_0 = stackOut_40_0;
                        break L11;
                      }
                      L19: {
                        if (stackIn_41_0 >= 84) {
                          break L19;
                        } else {
                          mg.f(17);
                          break L19;
                        }
                      }
                      stackOut_43_0 = (ck) (var16);
                      stackIn_44_0 = stackOut_43_0;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var7);
            stackOut_45_1 = new StringBuilder().append("mg.B(").append(param0).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L20;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L20;
            }
          }
          L21: {
            stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param3 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L21;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L21;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_44_0;
    }

    final boolean b(boolean param0) {
        if (!param0) {
          if (1 == (this.field_Rb ^ -1)) {
            if (-14 == (wh.field_c ^ -1)) {
              this.field_Rb = -1;
              return true;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, ck param1, ck param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var8 = param2.field_D;
            var3 = var8;
            var4 = param1.field_D;
            var5 = var8.length;
            var6 = param0;
            L1: while (true) {
              L2: {
                if (var6 >= var5) {
                  break L2;
                } else {
                  if (var7 != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (0 == var4[var6]) {
                        var8[var6] = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("mg.J(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    private final int a(w param0, int param1, int param2, w param3, int param4, String param5) {
        w var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var7 = new w(0L, param0, 0, param1, param2, param4, param5);
            param3.a(var7, -16834);
            param1 += 32;
            stackOut_0_0 = param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var7_ref);
            stackOut_2_1 = new StringBuilder().append("mg.M(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(boolean param0, w param1, w param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              param3 += 8;
              if (param0) {
                break L1;
              } else {
                field_Ob = (int[][]) null;
                break L1;
              }
            }
            var6_int = param1.field_J.b(param1.field_Y, param4 + -(param1.field_ub * 2), param1.field_Db);
            param1.a(param4, 0, param3, var6_int, 0);
            param2.a(param1, -16834);
            param3 = param3 + (var6_int - 0);
            stackOut_2_0 = param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var6);
            stackOut_4_1 = new StringBuilder().append("mg.C(").append(param0).append(',');
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final int c(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        ha stackIn_6_0 = null;
        ha stackIn_7_0 = null;
        ha stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        w stackIn_15_0 = null;
        w stackIn_16_0 = null;
        w stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ha stackOut_5_0 = null;
        ha stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ha stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_11_0 = null;
        w stackOut_14_0 = null;
        w stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        w stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        var4 = client.field_A ? 1 : 0;
        this.a(false, param1);
        if (param0 == 497) {
          L0: {
            if (null == this.field_Wb) {
              break L0;
            } else {
              L1: {
                this.field_Wb.field_Y = this.field_Ub.toString();
                this.field_Wb.field_vb = (this.field_mb - this.field_Wb.field_J.a(this.field_Wb.field_Y)) / 2;
                this.field_Wb.field_mb = this.field_mb + -this.field_Wb.field_vb;
                if (null == this.field_Qb) {
                  break L1;
                } else {
                  if (0 == this.field_Qb.field_ob) {
                    break L1;
                  } else {
                    L2: {
                      stackOut_5_0 = this.field_Qb;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (this.field_Qb.field_ab) {
                        stackOut_7_0 = (ha) ((Object) stackIn_7_0);
                        stackOut_7_1 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        break L2;
                      } else {
                        stackOut_6_0 = (ha) ((Object) stackIn_6_0);
                        stackOut_6_1 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        break L2;
                      }
                    }
                    stackIn_8_0.field_ab = stackIn_8_1 != 0;
                    break L1;
                  }
                }
              }
              var3 = 0;
              L3: while (true) {
                if (qb.field_u <= var3) {
                  break L0;
                } else {
                  stackOut_11_0 = this;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (var4 == 0) {
                    L4: {
                      if (((mg) (this)).field_Yb[var3] == null) {
                        break L4;
                      } else {
                        L5: {
                          stackOut_14_0 = this.field_Yb[var3];
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (-1 <= (this.field_Ub.length() ^ -1)) {
                            stackOut_16_0 = (w) ((Object) stackIn_16_0);
                            stackOut_16_1 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            break L5;
                          } else {
                            stackOut_15_0 = (w) ((Object) stackIn_15_0);
                            stackOut_15_1 = 1;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            break L5;
                          }
                        }
                        stackIn_17_0.field_Hb = stackIn_17_1 != 0;
                        if (!this.field_Yb[var3].field_Hb) {
                          break L4;
                        } else {
                          if (0 == this.field_Yb[var3].field_ob) {
                            break L4;
                          } else {
                            return var3;
                          }
                        }
                      }
                    }
                    var3++;
                    continue L3;
                  } else {
                    return ((mg) (this)).field_Rb;
                  }
                }
              }
            }
          }
          if (-1 == (this.field_ac.field_ob ^ -1)) {
            if (param1) {
              if (0 != ig.field_Yb) {
                if (0 == this.field_ob) {
                  return -1;
                } else {
                  return this.field_Rb;
                }
              } else {
                return this.field_Rb;
              }
            } else {
              return this.field_Rb;
            }
          } else {
            return -1;
          }
        } else {
          return -95;
        }
    }

    final boolean e(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 5658) {
            break L0;
          } else {
            mg.f(-70);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_Qb) {
              break L2;
            } else {
              if (!this.field_Qb.field_ab) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final String g(byte param0) {
        if (param0 != -96) {
            field_Nb = true;
        }
        return this.field_Ub.toString();
    }

    final static void b(int param0, boolean param1) {
        je.field_f = param1 ? new ak(ue.field_c, cl.field_n) : new ak(eg.field_b, in.field_o);
        ee.field_i = new w(0L, (w) null);
        ee.field_i.a(je.field_f.field_h, -16834);
        ee.field_i.a(ma.field_G, -16834);
        mn.field_e = new w((long)param0, ui.field_x);
        cl.field_C = new w(0L, (w) null);
        mn.field_e.a(ie.field_a, -16834);
        mn.field_e.a(cl.field_C, -16834);
        cl.field_C.a(gg.field_y, -16834);
        cl.field_C.a(qc.field_q, -16834);
        vb.a(param1, -2);
    }

    mg(int param0, int param1, int param2, int param3, int param4, w param5, w param6, w param7, w param8, ha param9, w param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        RuntimeException var15 = null;
        int var15_int = 0;
        w[] var15_array = null;
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
        w[] var28 = null;
        Object stackIn_6_0 = null;
        ha stackIn_6_1 = null;
        ha stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        ha stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        ha stackIn_7_1 = null;
        ha stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        ha stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        ha stackIn_8_1 = null;
        ha stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        ha stackIn_8_4 = null;
        Object stackIn_9_0 = null;
        ha stackIn_9_1 = null;
        ha stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        ha stackIn_9_4 = null;
        String stackIn_9_5 = null;
        w stackIn_15_0 = null;
        w stackIn_16_0 = null;
        w stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        ha stackOut_5_1 = null;
        ha stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        ha stackOut_5_4 = null;
        Object stackOut_6_0 = null;
        ha stackOut_6_1 = null;
        ha stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        ha stackOut_6_4 = null;
        Object stackOut_7_0 = null;
        ha stackOut_7_1 = null;
        ha stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        ha stackOut_7_4 = null;
        String stackOut_7_5 = null;
        Object stackOut_8_0 = null;
        ha stackOut_8_1 = null;
        ha stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        ha stackOut_8_4 = null;
        String stackOut_8_5 = null;
        w stackOut_14_0 = null;
        w stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        w stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var27 = client.field_A ? 1 : 0;
        this.field_Rb = -2;
        try {
          L0: {
            L1: {
              L2: {
                this.field_Tb = param12;
                this.field_cc = new w(0L, param6, ue.field_a.toUpperCase());
                this.field_cc.field_X = 1;
                this.a(this.field_cc, -16834);
                this.field_ac = new w(0L, param7);
                this.field_cc.a(this.field_ac, -16834);
                this.field_Pb = new w(0L, (w) null);
                this.a(this.field_Pb, -16834);
                if (param11 != null) {
                  break L2;
                } else {
                  this.field_Xb = new w(0L, param8, hc.field_f);
                  this.field_Xb.field_G = 11184810;
                  this.field_Xb.field_X = 1;
                  this.field_Pb.a(this.field_Xb, -16834);
                  var15_int = 226;
                  var16 = 10;
                  var17 = this.field_Xb.field_J.a(this.field_Xb.field_Y, var15_int);
                  this.field_Xb.a(var15_int, 0, var16, kf.field_O * var17, 13);
                  var16 = var16 + kf.field_O * var17;
                  this.field_Pb.a(var15_int + 13 - -13, 0, 24, 10 - -var16, 0);
                  this.field_Pb.field_lb = ea.a(2105376, -20982, 3, this.field_Pb.field_N, 8421504, 11579568);
                  var18 = 26 - -var15_int;
                  var19 = var16 + 34;
                  var20 = vh.a(param2, -18265, var18, param0);
                  var21 = o.a(param3, 0, var19, param1);
                  this.a(var18, 0, var21, var19, var20);
                  if (var27 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  this.field_Xb = new w(0L, param8, ph.field_Hb);
                  this.field_Xb.field_X = 1;
                  this.field_Xb.field_G = 11184810;
                  this.field_Pb.a(this.field_Xb, -16834);
                  this.field_Sb = new w(0L, param8, pc.field_c);
                  this.field_Sb.field_X = 1;
                  this.field_Sb.field_G = 11184810;
                  this.field_Pb.a(this.field_Sb, -16834);
                  this.field_Wb = new w(0L, param8);
                  this.field_Wb.field_G = 16764006;
                  this.field_Pb.a(this.field_Wb, -16834);
                  this.field_Wb.field_T = "|";
                  if ((d.field_b ^ -1) <= -6) {
                    break L4;
                  } else {
                    if ((te.field_p ^ -1) > -3) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  L6: {
                    stackOut_5_0 = this;
                    stackOut_5_1 = null;
                    stackOut_5_2 = null;
                    stackOut_5_3 = 0L;
                    stackOut_5_4 = (ha) (param9);
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_8_1 = stackOut_5_1;
                    stackIn_8_2 = stackOut_5_2;
                    stackIn_8_3 = stackOut_5_3;
                    stackIn_8_4 = stackOut_5_4;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    stackIn_6_4 = stackOut_5_4;
                    if (-8 >= (d.field_b ^ -1)) {
                      break L6;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (ha) ((Object) stackIn_6_4);
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      stackIn_8_3 = stackOut_6_3;
                      stackIn_8_4 = stackOut_6_4;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      stackIn_7_4 = stackOut_6_4;
                      if (-3 >= (te.field_p ^ -1)) {
                        break L6;
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = null;
                        stackOut_7_2 = null;
                        stackOut_7_3 = stackIn_7_3;
                        stackOut_7_4 = (ha) ((Object) stackIn_7_4);
                        stackOut_7_5 = rk.field_bb;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        stackIn_9_3 = stackOut_7_3;
                        stackIn_9_4 = stackOut_7_4;
                        stackIn_9_5 = stackOut_7_5;
                        break L5;
                      }
                    }
                  }
                  stackOut_8_0 = this;
                  stackOut_8_1 = null;
                  stackOut_8_2 = null;
                  stackOut_8_3 = stackIn_8_3;
                  stackOut_8_4 = (ha) ((Object) stackIn_8_4);
                  stackOut_8_5 = si.field_j;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  stackIn_9_4 = stackOut_8_4;
                  stackIn_9_5 = stackOut_8_5;
                  break L5;
                }
                ((mg) (this)).field_Qb = new ha(stackIn_9_3, stackIn_9_4, stackIn_9_5);
                this.field_Pb.a(this.field_Qb, -16834);
                break L3;
              }
              var28 = new w[3];
              var15_array = var28;
              var28[0] = new w(0L, (w) null);
              this.field_Pb.a(var28[0], -16834);
              var28[1] = new w(0L, (w) null);
              this.field_Pb.a(var28[1], -16834);
              var28[2] = new w(0L, (w) null);
              this.field_Pb.a(var28[2], -16834);
              this.field_Yb = new w[qb.field_u];
              var16 = 0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (var16 >= qb.field_u) {
                      break L9;
                    } else {
                      if (var27 != 0) {
                        break L8;
                      } else {
                        L10: {
                          if (pn.field_bb[var16] == null) {
                            break L10;
                          } else {
                            L11: {
                              this.field_Yb[var16] = new w(0L, param10, pn.field_bb[var16]);
                              this.field_Yb[var16].field_X = 0;
                              stackOut_14_0 = this.field_Yb[var16];
                              stackIn_16_0 = stackOut_14_0;
                              stackIn_15_0 = stackOut_14_0;
                              if (param11 == null) {
                                stackOut_16_0 = (w) ((Object) stackIn_16_0);
                                stackOut_16_1 = 0;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                break L11;
                              } else {
                                stackOut_15_0 = (w) ((Object) stackIn_15_0);
                                stackOut_15_1 = 1;
                                stackIn_17_0 = stackOut_15_0;
                                stackIn_17_1 = stackOut_15_1;
                                break L11;
                              }
                            }
                            stackIn_17_0.field_Hb = stackIn_17_1 != 0;
                            this.field_Pb.a(this.field_Yb[var16], -16834);
                            break L10;
                          }
                        }
                        var16++;
                        if (var27 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  this.field_Ub = new StringBuilder(12);
                  break L8;
                }
                L12: {
                  if (param11 == null) {
                    break L12;
                  } else {
                    discarded$1 = this.field_Ub.append(param11);
                    break L12;
                  }
                }
                L13: {
                  var16 = 0;
                  var17 = param6.field_J.a(cf.field_g);
                  if (var17 <= var16) {
                    break L13;
                  } else {
                    var16 = var17;
                    break L13;
                  }
                }
                L14: {
                  var17 = param6.field_J.a(ul.field_a);
                  if (var16 >= var17) {
                    break L14;
                  } else {
                    var16 = var17;
                    break L14;
                  }
                }
                L15: {
                  var17 = param6.field_J.a(k.field_d);
                  if (var17 <= var16) {
                    break L15;
                  } else {
                    var16 = var17;
                    break L15;
                  }
                }
                var17 = 0;
                L16: while (true) {
                  L17: {
                    L18: {
                      if (var17 >= qb.field_u) {
                        break L18;
                      } else {
                        if (var27 != 0) {
                          break L17;
                        } else {
                          L19: {
                            if (this.field_Yb[var17] == null) {
                              break L19;
                            } else {
                              var18 = this.field_Yb[var17].a(true);
                              if (var18 <= var16) {
                                break L19;
                              } else {
                                var16 = var18;
                                break L19;
                              }
                            }
                          }
                          var17++;
                          if (var27 == 0) {
                            continue L16;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    L20: {
                      if (-141 <= (var16 ^ -1)) {
                        break L20;
                      } else {
                        var16 = 140;
                        break L20;
                      }
                    }
                    var17 = 0;
                    break L17;
                  }
                  L21: {
                    var18 = 0;
                    var18 = 0;
                    var18 = this.a(param6, var18, var16, var28[0], 24, cf.field_g);
                    var18 = this.a(true, this.field_Yb[6], var28[0], var18, var16);
                    var18 = this.a(true, this.field_Yb[9], var28[0], var18, var16);
                    var18 = this.a(true, this.field_Yb[5], var28[0], var18, var16);
                    var18 = this.a(true, this.field_Yb[7], var28[0], var18, var16);
                    var18 = this.a(true, this.field_Yb[15], var28[0], var18, var16);
                    var18 = this.a(true, this.field_Yb[4], var28[0], var18, var16);
                    if (var18 <= var17) {
                      break L21;
                    } else {
                      var17 = var18;
                      break L21;
                    }
                  }
                  L22: {
                    var18 = 0;
                    var18 = this.a(param6, var18, var16, var28[1], 24, ul.field_a);
                    var18 = this.a(true, this.field_Yb[16], var28[1], var18, var16);
                    var18 = this.a(true, this.field_Yb[17], var28[1], var18, var16);
                    var18 = this.a(true, this.field_Yb[18], var28[1], var18, var16);
                    var18 = this.a(true, this.field_Yb[19], var28[1], var18, var16);
                    var18 = this.a(true, this.field_Yb[20], var28[1], var18, var16);
                    if (var17 >= var18) {
                      break L22;
                    } else {
                      var17 = var18;
                      break L22;
                    }
                  }
                  L23: {
                    var18 = 0;
                    var18 = this.a(param6, var18, var16, var28[2], 24, k.field_d);
                    var18 = this.a(true, this.field_Yb[13], var28[2], var18, var16);
                    var18 = this.a(true, this.field_Yb[21], var28[2], var18, var16);
                    var18 = this.a(true, this.field_Yb[11], var28[2], var18, var16);
                    if (var17 >= var18) {
                      break L23;
                    } else {
                      var17 = var18;
                      break L23;
                    }
                  }
                  L24: {
                    var19 = 3 * var16 - -26;
                    var20 = this.field_cc.a(true);
                    if (var20 <= var19) {
                      break L24;
                    } else {
                      var19 = var20;
                      break L24;
                    }
                  }
                  L25: {
                    if (this.field_Qb == null) {
                      break L25;
                    } else {
                      var20 = this.field_Qb.c(4, -4168);
                      if (var19 >= var20) {
                        break L25;
                      } else {
                        var19 = var20;
                        break L25;
                      }
                    }
                  }
                  L26: {
                    this.field_cc.a(13 - (-var19 + -13), 0, 0, 24, 0);
                    this.field_ac.a(15, 0, 5, 15, -20 + this.field_cc.field_mb);
                    var21 = 10;
                    this.field_Xb.a(var19, 0, var21, kf.field_O * 2, 13);
                    var21 = var21 + 2 * kf.field_O;
                    this.field_Sb.a(var19, 0, var21, kf.field_O * 2, 13);
                    var21 = var21 + (2 * kf.field_O + 10);
                    this.field_Wb.a(0, 0, var21, kf.field_O, 0);
                    var21 = var21 + (kf.field_O + 10);
                    if (null == this.field_Qb) {
                      break L26;
                    } else {
                      var20 = this.field_Qb.c(4, -4168);
                      this.field_Qb.a(var20, 8, var21, (var19 + -var20) / 2 + 13, 4, kf.field_O);
                      var21 = var21 + (10 + kf.field_O);
                      break L26;
                    }
                  }
                  var28[0].a(var16, 0, var21, var17, 13);
                  var28[1].a(var16, 0, var21, var17, 13 + (var16 + 13));
                  var28[2].a(var16, 0, var21, var17, 2 * var16 + 13 - -26);
                  var22 = var21;
                  this.field_Pb.a(13 - -var19 + 13, 0, 24, 10 + var17 + var22, 0);
                  this.field_Pb.field_lb = ea.a(2105376, -20982, 3, this.field_Pb.field_N, 8421504, 11579568);
                  var23 = 13 - -var19 + 13;
                  var24 = 10 + (var22 + (24 + var17));
                  var25 = vh.a(param2, -18265, var23, param0);
                  var26 = o.a(param3, 0, var24, param1);
                  this.a(var23, 0, var26, var24, var25);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var15 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) (var15);
            stackOut_53_1 = new StringBuilder().append("mg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param5 == null) {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L27;
            } else {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L27;
            }
          }
          L28: {
            stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',');
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param6 == null) {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L28;
            } else {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L28;
            }
          }
          L29: {
            stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',');
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param7 == null) {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L29;
            } else {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L29;
            }
          }
          L30: {
            stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
            stackOut_62_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param8 == null) {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L30;
            } else {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L30;
            }
          }
          L31: {
            stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param9 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L31;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L31;
            }
          }
          L32: {
            stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param10 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L32;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L32;
            }
          }
          L33: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param11 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L33;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L33;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param12 + ')');
        }
    }

    static {
        field_Nb = false;
    }
}
