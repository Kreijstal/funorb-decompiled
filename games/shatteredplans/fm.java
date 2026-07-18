/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static int field_f;
    private int[] field_a;
    static bi[] field_d;
    static bi field_e;
    static bi field_b;
    static int[] field_c;
    private byte[] field_h;
    private int[] field_g;

    final static void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (es.field_m > 0) {
            L1: {
              if (null == bh.field_p) {
                bj.field_K = si.a(640, fa.field_W, 0, (byte) 98, 0, 480);
                break L1;
              } else {
                bj.field_K = bh.field_p.a(0);
                int discarded$29 = 2;
                int discarded$30 = -15469;
                vr.a();
                break L1;
              }
            }
            if (null == bj.field_K) {
              var2 = 3;
              break L0;
            } else {
              int discarded$31 = 0;
              re.a((java.awt.Canvas) (Object) bj.field_K);
              var2 = 2;
              break L0;
            }
          } else {
            int discarded$32 = 1;
            if (w.d()) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          }
        }
        L2: {
          if (null != bh.field_p) {
            break L2;
          } else {
            if (!cp.field_u) {
              break L2;
            } else {
              gm.a(param0, 125, var2);
              break L2;
            }
          }
        }
    }

    final int a(byte[] param0, byte[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (0 != param2) {
              L1: {
                if (param3 == 7) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              var7_int = 0;
              param2 = param2 + param5;
              var8 = param4;
              L2: while (true) {
                L3: {
                  var9 = param1[var8];
                  if (var9 < 0) {
                    var7_int = ((fm) this).field_g[var7_int];
                    break L3;
                  } else {
                    var7_int++;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((fm) this).field_g[var7_int];
                    if (0 <= ((fm) this).field_g[var7_int]) {
                      break L5;
                    } else {
                      int incrementValue$7 = param5;
                      param5++;
                      param0[incrementValue$7] = (byte)var10;
                      if (param5 >= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (-1 != (64 & var9)) {
                      var7_int = ((fm) this).field_g[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((fm) this).field_g[var7_int];
                    if (((fm) this).field_g[var7_int] >= 0) {
                      break L7;
                    } else {
                      int incrementValue$8 = param5;
                      param5++;
                      param0[incrementValue$8] = (byte)var10;
                      if (param2 > param5) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if (-1 == (32 & var9)) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = ((fm) this).field_g[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((fm) this).field_g[var7_int];
                    if (((fm) this).field_g[var7_int] < 0) {
                      int incrementValue$9 = param5;
                      param5++;
                      param0[incrementValue$9] = (byte)(~var10);
                      if (param2 > param5) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (0 != (var9 & 16)) {
                      var7_int = ((fm) this).field_g[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((fm) this).field_g[var7_int];
                    if (((fm) this).field_g[var7_int] < 0) {
                      int incrementValue$10 = param5;
                      param5++;
                      param0[incrementValue$10] = (byte)(~var10);
                      if (param5 < param2) {
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
                    if ((var9 & 8) != 0) {
                      var7_int = ((fm) this).field_g[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((fm) this).field_g[var7_int];
                    if (((fm) this).field_g[var7_int] < 0) {
                      int incrementValue$11 = param5;
                      param5++;
                      param0[incrementValue$11] = (byte)var10;
                      if (param5 < param2) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-1 != (4 & var9)) {
                      var7_int = ((fm) this).field_g[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((fm) this).field_g[var7_int];
                    if (((fm) this).field_g[var7_int] >= 0) {
                      break L15;
                    } else {
                      int incrementValue$12 = param5;
                      param5++;
                      param0[incrementValue$12] = (byte)var10;
                      if (param2 > param5) {
                        var7_int = 0;
                        break L15;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L16: {
                    if (-1 != (2 & var9)) {
                      var7_int = ((fm) this).field_g[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((fm) this).field_g[var7_int];
                    if (((fm) this).field_g[var7_int] < 0) {
                      int incrementValue$13 = param5;
                      param5++;
                      param0[incrementValue$13] = (byte)(~var10);
                      if (param2 > param5) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return 1 + var8 + -param4;
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
                      var7_int = ((fm) this).field_g[var7_int];
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((fm) this).field_g[var7_int];
                    if (0 <= ((fm) this).field_g[var7_int]) {
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_68_0 = 1 + var8 + -param4;
                stackIn_69_0 = stackOut_68_0;
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
            stackOut_70_0 = (RuntimeException) var7;
            stackOut_70_1 = new StringBuilder().append("fm.A(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L20;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L20;
            }
          }
          L21: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param1 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L21;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L21;
            }
          }
          throw r.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
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
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            var8 = param1 << 3;
            param5 = param5 + param4;
            L1: while (true) {
              if (param4 >= param5) {
                if (param2 == -6309) {
                  stackOut_25_0 = (var8 - -7 >> 3) + -param1;
                  stackIn_26_0 = stackOut_25_0;
                  break L0;
                } else {
                  stackOut_23_0 = 112;
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0;
                }
              } else {
                var9 = param0[param4] & 255;
                var10 = ((fm) this).field_a[var9];
                var11 = ((fm) this).field_h[var9];
                if (var11 != 0) {
                  L2: {
                    var12 = var8 >> 3;
                    var13 = 7 & var8;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = var12 + (-1 + (var11 + var13) >> 3);
                    var8 = var8 + var11;
                    var13 += 24;
                    int dupTemp$1 = ee.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$1;
                    param3[var12] = (byte)dupTemp$1;
                    if (var12 >= var14) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  param4++;
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
            stackOut_27_0 = (RuntimeException) var7;
            stackOut_27_1 = new StringBuilder().append("fm.D(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L3;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L3;
            }
          }
          L4: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L4;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_26_0;
    }

    public static void a() {
        field_c = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    fm(byte[] param0) {
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
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            ((fm) this).field_a = new int[var2_int];
            ((fm) this).field_h = param0;
            ((fm) this).field_g = new int[8];
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
                  if (var6 == 0) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << 32 - var6;
                      var8 = var19[var6];
                      ((fm) this).field_a[var5] = var8;
                      if ((var8 & var7) == 0) {
                        var9 = var8 | var7;
                        var10 = -1 + var6;
                        L4: while (true) {
                          if (var10 < 1) {
                            break L3;
                          } else {
                            var11 = var19[var10];
                            if (var8 != var11) {
                              break L3;
                            } else {
                              var12 = 1 << -var10 + 32;
                              if (0 == (var11 & var12)) {
                                var3[var10] = ee.a(var12, var11);
                                var10--;
                                continue L4;
                              } else {
                                var3[var10] = var3[var10 + -1];
                                break L3;
                              }
                            }
                          }
                        }
                      } else {
                        var9 = var3[var6 + -1];
                        break L3;
                      }
                    }
                    var19[var6] = var9;
                    var10 = var6 + 1;
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
                                var4 = 1 + var10;
                                break L7;
                              }
                            }
                            ((fm) this).field_g[var10] = ~var5;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if (0 != (var12 & var8)) {
                                L9: {
                                  if (((fm) this).field_g[var10] != 0) {
                                    break L9;
                                  } else {
                                    ((fm) this).field_g[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = ((fm) this).field_g[var10];
                                break L8;
                              } else {
                                var10++;
                                break L8;
                              }
                            }
                            L10: {
                              if (var10 < ((fm) this).field_g.length) {
                                break L10;
                              } else {
                                var13 = new int[((fm) this).field_g.length * 2];
                                var14 = 0;
                                L11: while (true) {
                                  if (((fm) this).field_g.length <= var14) {
                                    ((fm) this).field_g = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = ((fm) this).field_g[var14];
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
            stackOut_35_0 = (RuntimeException) var2;
            stackOut_35_1 = new StringBuilder().append("fm.<init>(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L13;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L13;
            }
          }
          throw r.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
