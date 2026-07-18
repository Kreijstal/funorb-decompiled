/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static int field_a;
    static String field_b;

    final static void a(re param0, int param1) {
        pk var3 = fj.field_q;
        var3.a(param1, (byte) -77);
        var3.d((byte) 123, param0.field_k);
        try {
            var3.d((byte) -49, param0.field_g);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ik.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + 107 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              vb.c(param0, param2, param3 - -1, 10000536);
              vb.c(param0, param2 + param1, param3 + 1, 12105912);
              var5_int = 1;
              if (vb.field_i > param2 + var5_int) {
                var5_int = -param2 + vb.field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = param1;
              if (vb.field_d >= var6 + param2) {
                break L2;
              } else {
                var6 = -param2 + vb.field_d;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = 152 - -(48 * var7 / param1);
                var9 = var8 << 8 | var8 << 16 | var8;
                vb.field_c[param0 + vb.field_f * (var7 + param2)] = var9;
                vb.field_c[param3 + (param2 + var7) * vb.field_f + param0] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var5, "ik.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + -1540604944 + ')');
        }
    }

    public static void a() {
        field_b = null;
    }

    final static boolean a(ja param0, ja param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5_int = 0;
        ja var5 = null;
        int var6_int = 0;
        ja var6 = null;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (~var3_int <= ~param1.field_L) {
                L2: {
                  L3: {
                    var3_int = 0;
                    var4 = 0;
                    int fieldTemp$2 = param1.field_L;
                    param1.field_L = param1.field_L + 1;
                    param1.field_n[fieldTemp$2] = param0;
                    int fieldTemp$3 = param0.field_L;
                    param0.field_L = param0.field_L + 1;
                    param0.field_n[fieldTemp$3] = param1;
                    if (param1.field_z != 0) {
                      break L3;
                    } else {
                      if (param0.field_z == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var5_int = 0;
                    var6_int = 0;
                    if (param1.field_z != 1) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  }
                  L5: {
                    stackOut_14_0 = stackIn_14_0;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (param0.field_z != 1) {
                      stackOut_16_0 = stackIn_16_0;
                      stackOut_16_1 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      break L5;
                    } else {
                      stackOut_15_0 = stackIn_15_0;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L5;
                    }
                  }
                  L6: {
                    if ((stackIn_17_0 ^ stackIn_17_1) != 0) {
                      L7: {
                        if (param1.field_z != 1) {
                          break L7;
                        } else {
                          if (param0.field_z == 0) {
                            param1.a(320, param1.field_C, param0.field_M, 0);
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (param1.field_z != 0) {
                          break L8;
                        } else {
                          if (param0.field_z == 1) {
                            var5_int = 1;
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (param0.field_z != 2) {
                          break L9;
                        } else {
                          if (param1.field_z != 1) {
                            break L9;
                          } else {
                            var3_int = 1;
                            var4 = 1;
                            var6_int = 1;
                            param1.a(320, param1.field_C, param0.field_M, 0);
                            break L6;
                          }
                        }
                      }
                      if (1 != param0.field_z) {
                        break L6;
                      } else {
                        if (param1.field_z != 2) {
                          break L6;
                        } else {
                          param1.a(320, param0.field_C, param1.field_M, 0);
                          var5_int = 1;
                          var3_int = 1;
                          break L6;
                        }
                      }
                    } else {
                      L10: {
                        if (2 == param1.field_z) {
                          break L10;
                        } else {
                          if (param0.field_z == 2) {
                            break L10;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L11: {
                        if (param1.field_z != 2) {
                          break L11;
                        } else {
                          if (2 != param0.field_z) {
                            param1.a(320, param0.field_C, param1.field_M, param0.field_z);
                            var3_int = 1;
                            break L6;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (param0.field_z != 2) {
                        break L6;
                      } else {
                        if (2 != param1.field_z) {
                          var4 = 1;
                          var6_int = 1;
                          var3_int = 1;
                          param0.a(320, param1.field_C, param0.field_M, param1.field_z);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L12: {
                    L13: {
                      if (var5_int != 0) {
                        break L13;
                      } else {
                        if (var6_int != 0) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    bh.a(var6_int != 0, param1, 1, param0, var5_int != 0);
                    break L12;
                  }
                  L14: {
                    if (param1.field_z != 1) {
                      break L14;
                    } else {
                      if (param0.field_z != 1) {
                        break L14;
                      } else {
                        if (param0.field_C == param1.field_C) {
                          param1.field_N = param1.field_N + 1;
                          param0.field_N = param0.field_N + 1;
                          break L2;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  if (param1.field_z != 2) {
                    break L2;
                  } else {
                    if (param0.field_z != 2) {
                      break L2;
                    } else {
                      if (param0.field_M != param1.field_M) {
                        break L2;
                      } else {
                        param1.field_m = param1.field_m + 1;
                        param0.field_m = param0.field_m + 1;
                        break L2;
                      }
                    }
                  }
                }
                L15: {
                  if (param1.field_z != 0) {
                    break L15;
                  } else {
                    if (param0.field_z == 0) {
                      L16: {
                        if (param1.field_C != param0.field_C) {
                          break L16;
                        } else {
                          param1.field_N = param1.field_N + 1;
                          param0.field_N = param0.field_N + 1;
                          break L16;
                        }
                      }
                      if (param0.field_M == param1.field_M) {
                        param1.field_m = param1.field_m + 1;
                        param0.field_m = param0.field_m + 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                L17: {
                  if (var3_int != 0) {
                    var5_int = 0;
                    L18: while (true) {
                      if (param1.field_L <= var5_int) {
                        var5 = param1;
                        param1.field_N = 0;
                        var6 = param1;
                        var6.field_m = 0;
                        var5.field_L = 0;
                        param1.field_K = ji.field_r;
                        param1.field_B = true;
                        break L17;
                      } else {
                        param1.field_n[var5_int].a(param1, 0);
                        var5_int++;
                        continue L18;
                      }
                    }
                  } else {
                    break L17;
                  }
                }
                L19: {
                  if (var4 != 0) {
                    var5_int = 0;
                    L20: while (true) {
                      if (~param0.field_L >= ~var5_int) {
                        var5 = param0;
                        param0.field_N = 0;
                        var6 = param0;
                        var5.field_L = 0;
                        param0.field_t = false;
                        param0.field_B = true;
                        param0.field_K = ji.field_r;
                        var6.field_m = 0;
                        break L19;
                      } else {
                        param0.field_n[var5_int].a(param0, 0);
                        var5_int++;
                        continue L20;
                      }
                    }
                  } else {
                    break L19;
                  }
                }
                stackOut_76_0 = var3_int;
                stackIn_77_0 = stackOut_76_0;
                break L0;
              } else {
                if (param1.field_n[var3_int] == param0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var3 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var3;
            stackOut_78_1 = new StringBuilder().append("ik.D(");
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L21;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L21;
            }
          }
          L22: {
            stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',');
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param1 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L22;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L22;
            }
          }
          throw t.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + ',' + false + ')');
        }
        return stackIn_77_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Waiting for fonts";
    }
}
