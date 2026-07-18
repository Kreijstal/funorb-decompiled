/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static dm field_a;

    public static void a(boolean param0) {
        try {
            field_a = null;
            if (param0) {
                field_a = null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "i.A(" + param0 + ')');
        }
    }

    final static ja a(byte param0) {
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        Object var2 = null;
        ja var3 = null;
        float var4 = 0.0f;
        int var5 = 0;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var1_float = 1.401298464324817e-45f;
              var2 = null;
              var3 = (ja) (Object) a.field_d.a(false);
              if (param0 < -127) {
                break L1;
              } else {
                i.a(false);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (null == var3) {
                  break L3;
                } else {
                  L4: {
                    var4 = (-240.0f + var3.field_v) * (-240.0f + var3.field_v) + (-320.0f + var3.field_o) * (var3.field_o - 320.0f);
                    if (var1_float < var4) {
                      var1_float = var4;
                      var2 = (Object) (Object) var3;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3 = (ja) (Object) a.field_d.b(0);
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_10_0 = var2;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "i.D(" + param0 + ')');
        }
        return (ja) (Object) stackIn_11_0;
    }

    final static void a(int param0, byte param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param2.getGraphics();
                sh.field_y.a(param3, var4, param0, 0);
                var5 = 56 % ((-32 - param1) / 59);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param2.repaint();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref2;
            stackOut_4_1 = new StringBuilder().append("i.C(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, byte param1, nf param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
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
        boolean stackIn_11_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0 = false;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_48_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var19 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var5_int = hj.a((byte) 58, (param3 + -param0) * 3);
              var6 = param0 * 3;
              var7 = var5_int + -10;
              oe.l(0);
              if (param2.field_v <= 0) {
                break L1;
              } else {
                if (null != param2.field_n) {
                  ma.a((byte) -35);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            ch.field_b = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var8 >= param2.field_f) {
                    break L4;
                  } else {
                    var9 = param2.field_r[var8];
                    var10 = param2.field_B[var8];
                    var11 = param2.field_c[var8];
                    stackOut_10_0 = param4;
                    stackIn_49_0 = stackOut_10_0 ? 1 : 0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (!stackIn_11_0) {
                            break L6;
                          } else {
                            var12 = sh.field_x[var9];
                            var13 = dj.field_N[var9];
                            var14 = sh.field_x[var10] + -var12;
                            var15 = sh.field_x[var11] - var12;
                            var16 = dj.field_N[var10] + -var13;
                            var17 = -var13 + dj.field_N[var11];
                            if (-(var16 * var15) + var14 * var17 >= 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var12 = bj.field_j[var9];
                          if (-2147483648 != var12) {
                            break L7;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          var13 = bj.field_j[var10];
                          if (-2147483648 != var13) {
                            break L8;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var14 = bj.field_j[var11];
                        if (var14 == -2147483648) {
                          break L5;
                        } else {
                          L9: {
                            var15 = var13 + (var12 - -var14 + -var6);
                            if (var7 < 0) {
                              stackOut_27_0 = var15 << -var7;
                              stackIn_28_0 = stackOut_27_0;
                              break L9;
                            } else {
                              stackOut_25_0 = var15 >> var7;
                              stackIn_28_0 = stackOut_25_0;
                              break L9;
                            }
                          }
                          var16 = -stackIn_28_0 + (-1 + ch.field_d.length);
                          var17 = ch.field_d[var16];
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var17 >> 4 == 0) {
                                  break L12;
                                } else {
                                  var16--;
                                  stackOut_30_0 = var16;
                                  stackIn_39_0 = stackOut_30_0;
                                  stackIn_31_0 = stackOut_30_0;
                                  if (var19 != 0) {
                                    break L11;
                                  } else {
                                    L13: {
                                      if (stackIn_31_0 >= 0) {
                                        break L13;
                                      } else {
                                        System.err.println("Out of range!");
                                        if (var19 == 0) {
                                          break L5;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    var17 = ch.field_d[var16];
                                    if (var19 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackOut_38_0 = (var16 << 4) + var17;
                              stackIn_39_0 = stackOut_38_0;
                              break L11;
                            }
                            L14: {
                              var18 = stackIn_39_0;
                              pj.field_i[var18] = var8;
                              ch.field_d[var16] = 1 + var17;
                              if (0 >= param2.field_v) {
                                break L14;
                              } else {
                                if (null != param2.field_n) {
                                  uh.field_x[param2.field_n[var8]] = uh.field_x[param2.field_n[var8]] + 1;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            ch.field_b = ch.field_b + 1;
                            break L5;
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_48_0 = -1;
                stackIn_49_0 = stackOut_48_0;
                break L3;
              }
              L15: {
                L16: {
                  if (stackIn_49_0 <= ~param2.field_v) {
                    break L16;
                  } else {
                    if (null != param2.field_n) {
                      var8 = 0;
                      var9 = 0;
                      L17: while (true) {
                        if (uh.field_x.length <= var9) {
                          break L16;
                        } else {
                          var10 = uh.field_x[var9];
                          uh.field_x[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L15;
                          } else {
                            if (var19 == 0) {
                              continue L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                if (param1 == 22) {
                  break L15;
                } else {
                  field_a = null;
                  break L15;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var5;
            stackOut_65_1 = new StringBuilder().append("i.B(").append(param0).append(',').append(param1).append(',');
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param2 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L18;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L18;
            }
          }
          throw t.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
