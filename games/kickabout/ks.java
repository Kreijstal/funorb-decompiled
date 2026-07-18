/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ks {
    static String field_b;
    static String field_f;
    private byte[] field_a;
    private int[] field_c;
    static int field_e;
    static String field_g;
    private int[] field_d;

    public static void a() {
        field_g = null;
        field_b = null;
        field_f = null;
    }

    ks(byte[] param0) {
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
            ((ks) this).field_a = param0;
            ((ks) this).field_d = new int[var2_int];
            ((ks) this).field_c = new int[8];
            var19 = new int[33];
            var18 = var19;
            var17 = var18;
            var16 = var17;
            var3 = var16;
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var2_int) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (0 == var6) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << 32 - var6;
                      var8 = var19[var6];
                      ((ks) this).field_d[var5] = var8;
                      if ((var8 & var7) != 0) {
                        var9 = var3[-1 + var6];
                        break L3;
                      } else {
                        var9 = var7 | var8;
                        var10 = -1 + var6;
                        L4: while (true) {
                          if (var10 < 1) {
                            break L3;
                          } else {
                            var11 = var19[var10];
                            if (var8 != var11) {
                              break L3;
                            } else {
                              var12 = 1 << 32 + -var10;
                              if ((var11 & var12) == 0) {
                                var3[var10] = hf.a(var11, var12);
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
                    var10 = var6 - -1;
                    L5: while (true) {
                      if (var10 > 32) {
                        var10 = 0;
                        var11 = 0;
                        L6: while (true) {
                          if (var6 <= var11) {
                            L7: {
                              if (var10 < var4) {
                                break L7;
                              } else {
                                var4 = var10 + 1;
                                break L7;
                              }
                            }
                            ((ks) this).field_c[var10] = ~var5;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if ((var8 & var12) == 0) {
                                var10++;
                                break L8;
                              } else {
                                L9: {
                                  if (0 != ((ks) this).field_c[var10]) {
                                    break L9;
                                  } else {
                                    ((ks) this).field_c[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = ((ks) this).field_c[var10];
                                break L8;
                              }
                            }
                            L10: {
                              if (((ks) this).field_c.length > var10) {
                                break L10;
                              } else {
                                var13 = new int[2 * ((ks) this).field_c.length];
                                var14 = 0;
                                L11: while (true) {
                                  if (((ks) this).field_c.length <= var14) {
                                    ((ks) this).field_c = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = ((ks) this).field_c[var14];
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
                          if (var19[var10] != var8) {
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
            stackOut_36_1 = new StringBuilder().append("ks.<init>(");
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
          throw nb.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_67_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            if (param2 != 0) {
              L1: {
                var7_int = 0;
                param2 = param2 + param4;
                if (!param5) {
                  break L1;
                } else {
                  ((ks) this).field_a = null;
                  break L1;
                }
              }
              var8 = param0;
              L2: while (true) {
                L3: {
                  var9 = param3[var8];
                  if (var9 < 0) {
                    var7_int = ((ks) this).field_c[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((ks) this).field_c[var7_int];
                    if (((ks) this).field_c[var7_int] < 0) {
                      int incrementValue$7 = param4;
                      param4++;
                      param1[incrementValue$7] = (byte)(~var10);
                      if (param2 > param4) {
                        var7_int = 0;
                        break L5;
                      } else {
                        break L4;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((var9 & 64) != 0) {
                      var7_int = ((ks) this).field_c[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((ks) this).field_c[var7_int];
                    if (((ks) this).field_c[var7_int] < 0) {
                      int incrementValue$8 = param4;
                      param4++;
                      param1[incrementValue$8] = (byte)var10;
                      if (param2 > param4) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (-1 == (32 & var9)) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = ((ks) this).field_c[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((ks) this).field_c[var7_int];
                    if (((ks) this).field_c[var7_int] < 0) {
                      int incrementValue$9 = param4;
                      param4++;
                      param1[incrementValue$9] = (byte)(~var10);
                      if (param2 <= param4) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var9 & 16) != 0) {
                      var7_int = ((ks) this).field_c[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((ks) this).field_c[var7_int];
                    if (((ks) this).field_c[var7_int] < 0) {
                      int incrementValue$10 = param4;
                      param4++;
                      param1[incrementValue$10] = (byte)var10;
                      if (param4 >= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-1 == (8 & var9)) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = ((ks) this).field_c[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((ks) this).field_c[var7_int];
                    if (0 <= ((ks) this).field_c[var7_int]) {
                      break L13;
                    } else {
                      int incrementValue$11 = param4;
                      param4++;
                      param1[incrementValue$11] = (byte)(~var10);
                      if (param2 > param4) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (0 == (var9 & 4)) {
                      var7_int++;
                      break L14;
                    } else {
                      var7_int = ((ks) this).field_c[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((ks) this).field_c[var7_int];
                    if (((ks) this).field_c[var7_int] < 0) {
                      int incrementValue$12 = param4;
                      param4++;
                      param1[incrementValue$12] = (byte)(~var10);
                      if (param2 > param4) {
                        var7_int = 0;
                        break L15;
                      } else {
                        return var8 + 1 - param0;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (0 != (var9 & 2)) {
                      var7_int = ((ks) this).field_c[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((ks) this).field_c[var7_int];
                    if (((ks) this).field_c[var7_int] >= 0) {
                      break L17;
                    } else {
                      int incrementValue$13 = param4;
                      param4++;
                      param1[incrementValue$13] = (byte)(~var10);
                      if (param4 >= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if ((1 & var9) != 0) {
                      var7_int = ((ks) this).field_c[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((ks) this).field_c[var7_int];
                    if (((ks) this).field_c[var7_int] >= 0) {
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_67_0 = var8 + 1 - param0;
                stackIn_68_0 = stackOut_67_0;
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
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("ks.B(").append(param0).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L20;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L20;
            }
          }
          L21: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param2).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param3 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L21;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L21;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_68_0;
    }

    final static short a(int param0, int param1, int param2, int param3) {
        int var4 = -3 / ((param2 - 23) / 41);
        return (short)(param0 | (param1 << 10 | param3 << 7));
    }

    final int a(int param0, int param1, int param2, byte[] param3, byte[] param4, int param5) {
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
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var15 = Kickabout.field_G;
        try {
          L0: {
            var7_int = 0;
            var8 = param2 << 3;
            param1 = param1 + param5;
            L1: while (true) {
              if (param1 <= param5) {
                if (param0 == -1) {
                  stackOut_24_0 = -param2 + (var8 + 7 >> 3);
                  stackIn_25_0 = stackOut_24_0;
                  break L0;
                } else {
                  stackOut_22_0 = -15;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0;
                }
              } else {
                var9 = param4[param5] & 255;
                var10 = ((ks) this).field_d[var9];
                var11 = ((ks) this).field_a[var9];
                if (var11 != 0) {
                  L2: {
                    var12 = var8 >> 3;
                    var13 = var8 & 7;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = (var13 - (-var11 + 1) >> 3) + var12;
                    var8 = var8 + var11;
                    var13 += 24;
                    int dupTemp$1 = hf.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$1;
                    param3[var12] = (byte)dupTemp$1;
                    if (var14 <= var12) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  param5++;
                  continue L1;
                } else {
                  throw new RuntimeException("" + var9);
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var7;
            stackOut_26_1 = new StringBuilder().append("ks.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L3;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L3;
            }
          }
          L4: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L4;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param5 + ')');
        }
        return stackIn_25_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "+";
        field_f = "(next round starts in <%0> seconds)";
    }
}
