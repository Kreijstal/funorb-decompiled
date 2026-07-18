/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    int field_a;
    static fj field_c;
    static String field_e;
    static int field_d;
    static ia field_b;

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (vd.field_c == null) {
                  break L2;
                } else {
                  if (!vd.field_c.e(17)) {
                    break L2;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L1;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "jb.A(" + 110 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static void a(double[] param0, boolean param1, double[] param2, double param3, double param4, int param5) {
        RuntimeException var8 = null;
        double[] var8_array = null;
        double[] var9 = null;
        Object var10 = null;
        int var11_int = 0;
        double var11 = 0.0;
        int var12_int = 0;
        double var12 = 0.0;
        double[] var12_ref_double__ = null;
        int var14 = 0;
        double[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        double stackIn_56_0 = 0.0;
        double stackIn_66_0 = 0.0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_47_0 = 0;
        double stackOut_55_0 = 0.0;
        double stackOut_65_0 = 0.0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var17 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param5 == 25152) {
                break L1;
              } else {
                jb.a((double[]) null, true, (double[]) null, -0.33512462018887446, -0.5906299405943304, -46);
                break L1;
              }
            }
            var8_array = param2;
            var9 = param2;
            param2[2] = 0.0;
            var8_array[0] = 0.0;
            var9[1] = 0.0;
            var10 = null;
            L2: while (true) {
              L3: {
                if (null != var10) {
                  break L3;
                } else {
                  L4: {
                    var10 = (Object) (Object) ll.a(mg.field_a, vf.field_e, (byte) 123);
                    if (null == var10) {
                      break L4;
                    } else {
                      var11_int = 0;
                      var12_int = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (~var12_int <= ~ia.field_i) {
                              break L7;
                            } else {
                              stackOut_9_0 = (((double[]) var10)[var12_int] < -(1.5 * vf.field_e[var12_int]) + 5.0 / param4 ? -1 : (((double[]) var10)[var12_int] == -(1.5 * vf.field_e[var12_int]) + 5.0 / param4 ? 0 : 1));
                              stackIn_16_0 = stackOut_9_0;
                              stackIn_10_0 = stackOut_9_0;
                              if (var17 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  if (stackIn_10_0 <= 0) {
                                    break L8;
                                  } else {
                                    var11_int = 1;
                                    break L8;
                                  }
                                }
                                var12_int++;
                                if (var17 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          stackOut_15_0 = var11_int;
                          stackIn_16_0 = stackOut_15_0;
                          break L6;
                        }
                        L9: {
                          if (stackIn_16_0 != 0) {
                            break L9;
                          } else {
                            if (((double[]) var10)[8] > 5.0 + bd.field_y * 1.1) {
                              break L9;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var10 = null;
                        break L4;
                      }
                    }
                  }
                  if (null == var10) {
                    L10: {
                      if (vf.field_e[8] != 0.0) {
                        vf.field_e[8] = 0.0;
                        var11_int = 0;
                        L11: while (true) {
                          L12: {
                            if (var11_int >= 8) {
                              break L12;
                            } else {
                              var12_ref_double__ = mg.field_a[var11_int];
                              mg.field_a[8][var11_int] = 0.0;
                              var12_ref_double__[8] = 0.0;
                              var11_int++;
                              if (var17 != 0) {
                                continue L2;
                              } else {
                                if (var17 == 0) {
                                  continue L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          if (var17 == 0) {
                            continue L2;
                          } else {
                            break L10;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    var11_int = -1;
                    var12 = Double.NEGATIVE_INFINITY;
                    var14 = 0;
                    L13: while (true) {
                      L14: {
                        L15: {
                          if (~var14 <= ~ia.field_i) {
                            break L15;
                          } else {
                            stackOut_36_0 = (0.0 < vf.field_e[var14] ? -1 : (0.0 == vf.field_e[var14] ? 0 : 1));
                            stackIn_48_0 = stackOut_36_0;
                            stackIn_37_0 = stackOut_36_0;
                            if (var17 != 0) {
                              break L14;
                            } else {
                              L16: {
                                if (stackIn_37_0 == 0) {
                                  break L16;
                                } else {
                                  if (vf.field_e[var14] > var12) {
                                    var11_int = var14;
                                    var12 = vf.field_e[var14];
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              var14++;
                              if (var17 == 0) {
                                continue L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        vf.field_e[var11_int] = 0.0;
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        break L14;
                      }
                      var14 = stackIn_48_0;
                      L17: while (true) {
                        L18: {
                          if (8 <= var14) {
                            break L18;
                          } else {
                            var15 = mg.field_a[var14];
                            mg.field_a[var11_int][var14] = 0.0;
                            var16 = var11_int;
                            var15[var16] = 0.0;
                            var14++;
                            if (var17 != 0) {
                              continue L2;
                            } else {
                              if (var17 == 0) {
                                continue L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        if (var17 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  } else {
                    continue L2;
                  }
                }
              }
              var11_int = 0;
              L19: while (true) {
                L20: {
                  L21: {
                    if (~ia.field_i >= ~var11_int) {
                      break L21;
                    } else {
                      var12 = ((double[]) var10)[var11_int];
                      stackOut_55_0 = 1e-7;
                      stackIn_66_0 = stackOut_55_0;
                      stackIn_56_0 = stackOut_55_0;
                      if (var17 != 0) {
                        break L20;
                      } else {
                        L22: {
                          if (stackIn_56_0 < var12) {
                            param2[1] = param2[1] + bn.field_f[var11_int][7] * var12;
                            if (param1) {
                              break L22;
                            } else {
                              param2[0] = param2[0] + bn.field_f[var11_int][6] * var12;
                              param2[2] = param2[2] + bn.field_f[var11_int][8] * var12;
                              break L22;
                            }
                          } else {
                            break L22;
                          }
                        }
                        var11_int++;
                        if (var17 == 0) {
                          continue L19;
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                  stackOut_65_0 = ((double[]) var10)[8];
                  stackIn_66_0 = stackOut_65_0;
                  break L20;
                }
                L23: {
                  var11 = stackIn_66_0;
                  if (var11 <= 1e-7) {
                    break L23;
                  } else {
                    L24: {
                      if (param1) {
                        break L24;
                      } else {
                        param2[2] = param2[2] + var11 * ia.field_d;
                        param2[0] = param2[0] + var11 * tf.field_c;
                        break L24;
                      }
                    }
                    param2[1] = param2[1] + mc.field_m * var11;
                    break L23;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var8 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var8;
            stackOut_74_1 = new StringBuilder().append("jb.C(");
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L25;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L25;
            }
          }
          L26: {
            stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',');
            stackIn_81_0 = stackOut_78_0;
            stackIn_81_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L26;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L26;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_e = null;
            field_b = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "jb.B(" + -124 + ')');
        }
    }

    final static t[] a(int param0, la param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        t[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        t[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param1.a(-1, param3);
              if (param0 == 0) {
                break L1;
              } else {
                t[] discarded$2 = jb.a(-44, (la) null, (String) null, (String) null);
                break L1;
              }
            }
            var5 = param1.a(param2, -110, var4_int);
            stackOut_3_0 = gk.a(105, var4_int, param1, var5);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("jb.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new fj(256);
        field_d = -1;
    }
}
