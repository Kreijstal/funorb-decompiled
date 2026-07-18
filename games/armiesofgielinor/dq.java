/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String field_j;
    static String field_d;
    static String field_f;
    static String field_g;
    private int[] field_h;
    static int field_c;
    private byte[] field_a;
    static wk[] field_i;
    static ru[] field_e;
    private int[] field_b;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = 0;
          var3 = param1;
          var4 = param1;
          if (1 == var4) {
            var3 = 2;
            break L0;
          } else {
            if (var4 != 2) {
              if (var4 != 3) {
                if (var4 == 4) {
                  var3 = 3;
                  break L0;
                } else {
                  var3 = param1;
                  break L0;
                }
              } else {
                var3 = 4;
                break L0;
              }
            } else {
              var3 = 1;
              break L0;
            }
          }
        }
        return var3;
    }

    public static void a() {
        field_j = null;
        field_e = null;
        field_f = null;
        field_g = null;
        field_i = null;
        field_d = null;
    }

    final static void a(int param0, int param1, String param2, boolean param3, byte param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (!param3) {
                gq.b(bc.field_j[3][0], param0, param5, param1);
                int discarded$4 = 42;
                int discarded$5 = 1;
                fe.c(jc.a(param2), (uh.field_e[3][0] >> 1) - -param0, 20 + (uh.field_e[3][1] >> 1) + param5, 2);
                break L1;
              } else {
                no.field_P.field_y = qn.field_l;
                no.field_P.field_B = qn.field_d;
                no.field_P.field_v = qn.field_g;
                ku.field_J.b();
                qn.b();
                gq.b(bc.field_j[3][0], 0, 0, param1);
                int discarded$6 = 42;
                int discarded$7 = 1;
                fe.c(jc.a(param2), uh.field_e[3][0] >> 1, 20 + (uh.field_e[3][1] >> 1), 2);
                no.field_P.b();
                ku.field_J.h(param0, param5);
                break L1;
              }
            }
            var6_int = 67 % ((param4 - 48) / 53);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("dq.A(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_1_0 = 0;
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
            if (param0 > 7) {
              int discarded$2 = 0;
              stackOut_3_0 = ob.a(10, true, param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -59;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("dq.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, byte param5) {
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
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            var8 = param4 << 3;
            param2 = param2 + param0;
            if (param5 >= 24) {
              L1: while (true) {
                if (param0 >= param2) {
                  stackOut_14_0 = (var8 - -7 >> 3) - param4;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  var9 = param1[param0] & 255;
                  var10 = ((dq) this).field_h[var9];
                  var11 = ((dq) this).field_a[var9];
                  if (0 == var11) {
                    throw new RuntimeException("" + var9);
                  } else {
                    var12 = var8 >> 3;
                    var13 = var8 & 7;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = var12 + (var11 + (var13 + -1) >> 3);
                    var8 = var8 + var11;
                    var13 += 24;
                    int dupTemp$1 = oe.c(var7_int, var10 >>> var13);
                    var7_int = dupTemp$1;
                    param3[var12] = (byte)dupTemp$1;
                    if (var12 < var14) {
                      L2: {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param3[var12] = (byte)(var10 >>> var13);
                        if (var12 >= var14) {
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      param0++;
                      continue L1;
                    } else {
                      param0++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = -2;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var7;
            stackOut_16_1 = new StringBuilder().append("dq.C(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          L4: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_15_0;
    }

    dq(byte[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            ((dq) this).field_a = param0;
            ((dq) this).field_h = new int[var2_int];
            var19 = new int[33];
            var18 = var19;
            var17 = var18;
            var16 = var17;
            var3 = var16;
            ((dq) this).field_b = new int[8];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (var6 == 0) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << -var6 + 32;
                      var8 = var19[var6];
                      ((dq) this).field_h[var5] = var8;
                      if ((var8 & var7) != 0) {
                        var9 = var3[var6 - 1];
                        break L3;
                      } else {
                        var9 = var8 | var7;
                        var10 = var6 - 1;
                        L4: while (true) {
                          if (var10 < 1) {
                            break L3;
                          } else {
                            var11 = var19[var10];
                            if (var8 != var11) {
                              break L3;
                            } else {
                              var12 = 1 << -var10 + 32;
                              if ((var11 & var12) == 0) {
                                var3[var10] = oe.c(var11, var12);
                                var10--;
                                continue L4;
                              } else {
                                var3[var10] = var3[-1 + var10];
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                    var19[var6] = var9;
                    var10 = 1 + var6;
                    L5: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L6: while (true) {
                          if (var11 >= var6) {
                            L7: {
                              if (var4 > var10) {
                                break L7;
                              } else {
                                var4 = 1 + var10;
                                break L7;
                              }
                            }
                            ((dq) this).field_b[var10] = ~var5;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if ((var8 & var12) != 0) {
                                L9: {
                                  if (0 != ((dq) this).field_b[var10]) {
                                    break L9;
                                  } else {
                                    ((dq) this).field_b[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = ((dq) this).field_b[var10];
                                break L8;
                              } else {
                                var10++;
                                break L8;
                              }
                            }
                            L10: {
                              if (var10 < ((dq) this).field_b.length) {
                                break L10;
                              } else {
                                var13 = new int[((dq) this).field_b.length * 2];
                                var14 = 0;
                                L11: while (true) {
                                  if (var14 >= ((dq) this).field_b.length) {
                                    ((dq) this).field_b = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = ((dq) this).field_b[var14];
                                    var14++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var12 = var12 >>> 1;
                            var11++;
                            continue L6;
                          }
                        }
                      } else {
                        L12: {
                          if (var8 != var19[var10]) {
                            break L12;
                          } else {
                            var19[var10] = var9;
                            break L12;
                          }
                        }
                        var10++;
                        continue L5;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var2;
            stackOut_36_1 = new StringBuilder().append("dq.<init>(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L13;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
    }

    final int a(byte[] param0, int param1, boolean param2, int param3, int param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_65_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              L1: {
                if (!param2) {
                  break L1;
                } else {
                  ((dq) this).field_a = null;
                  break L1;
                }
              }
              param3 = param3 + param4;
              var7_int = 0;
              var8 = param1;
              L2: while (true) {
                L3: {
                  var9 = param0[var8];
                  if (0 > var9) {
                    var7_int = ((dq) this).field_b[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((dq) this).field_b[var7_int];
                    if (((dq) this).field_b[var7_int] >= 0) {
                      break L5;
                    } else {
                      int incrementValue$8 = param4;
                      param4++;
                      param5[incrementValue$8] = (byte)(~var10);
                      if (param3 > param4) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if ((var9 & 64) != 0) {
                      var7_int = ((dq) this).field_b[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((dq) this).field_b[var7_int];
                    if (((dq) this).field_b[var7_int] >= 0) {
                      break L7;
                    } else {
                      int incrementValue$9 = param4;
                      param4++;
                      param5[incrementValue$9] = (byte)(~var10);
                      if (param4 < param3) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if ((32 & var9) == 0) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = ((dq) this).field_b[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((dq) this).field_b[var7_int];
                    if (((dq) this).field_b[var7_int] >= 0) {
                      break L9;
                    } else {
                      int incrementValue$10 = param4;
                      param4++;
                      param5[incrementValue$10] = (byte)(~var10);
                      if (param3 > param4) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if ((var9 & 16) == 0) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = ((dq) this).field_b[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((dq) this).field_b[var7_int];
                    if (((dq) this).field_b[var7_int] < 0) {
                      int incrementValue$11 = param4;
                      param4++;
                      param5[incrementValue$11] = (byte)var10;
                      if (param3 > param4) {
                        var7_int = 0;
                        break L11;
                      } else {
                        break L4;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-1 != (8 & var9)) {
                      var7_int = ((dq) this).field_b[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((dq) this).field_b[var7_int];
                    if (((dq) this).field_b[var7_int] >= 0) {
                      break L13;
                    } else {
                      int incrementValue$12 = param4;
                      param4++;
                      param5[incrementValue$12] = (byte)var10;
                      if (param4 < param3) {
                        var7_int = 0;
                        break L13;
                      } else {
                        return 1 + (var8 - param1);
                      }
                    }
                  }
                  L14: {
                    if (-1 == (var9 & 4)) {
                      var7_int++;
                      break L14;
                    } else {
                      var7_int = ((dq) this).field_b[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((dq) this).field_b[var7_int];
                    if (((dq) this).field_b[var7_int] < 0) {
                      int incrementValue$13 = param4;
                      param4++;
                      param5[incrementValue$13] = (byte)var10;
                      if (param4 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (-1 != (2 & var9)) {
                      var7_int = ((dq) this).field_b[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((dq) this).field_b[var7_int];
                    if (0 > ((dq) this).field_b[var7_int]) {
                      int incrementValue$14 = param4;
                      param4++;
                      param5[incrementValue$14] = (byte)(~var10);
                      if (param4 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (0 == (var9 & 1)) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = ((dq) this).field_b[var7_int];
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((dq) this).field_b[var7_int];
                    if (((dq) this).field_b[var7_int] < 0) {
                      int incrementValue$15 = param4;
                      param4++;
                      param5[incrementValue$15] = (byte)(~var10);
                      if (param4 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_65_0 = 1 + (var8 - param1);
                stackIn_66_0 = stackOut_65_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("dq.F(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L20;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L20;
            }
          }
          L21: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param5 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L21;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L21;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ')');
        }
        return stackIn_66_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_d = "Useful items to carry with you. Each unit can only hold one accessory at a time. Equipping a unit with a new accessory will cause whatever accessory that unit is currently holding to be discarded.";
        field_f = "Breaking real-world laws";
        field_j = "Ranged weapons will improve the effectiveness of ranged attacks.";
        field_g = "Click to Scroll";
    }
}
