/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static String field_a;
    static vd field_e;
    static String field_d;
    static String[][] field_b;
    static ea[] field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var16 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param5 == 255) {
              param1--;
              L1: while (true) {
                if (param1 < 0) {
                  break L0;
                } else {
                  var17 = param6;
                  var10_array = var17;
                  var11 = param3;
                  var12 = param8;
                  var13 = param7;
                  var14 = param0;
                  var15 = var17[var11] >> 1 & 8355711;
                  var10_array[var11] = var15 + (c.a(16711680, var12 >> 1) + (c.a(65280, var13 >> 9) - -c.a(var14 >> 17, 255)));
                  param3++;
                  param0 = param0 + param4;
                  param8 = param8 + param2;
                  param7 = param7 + param9;
                  param1--;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var10;
            stackOut_8_1 = new StringBuilder().append("nj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (null != w.field_W) {
              try {
                L0: {
                  w.field_W.a((byte) 115, 0L);
                  w.field_W.a(kj.field_a.field_u, 24, kj.field_a.field_o, true);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                if (param0 != 89) {
                  return;
                } else {
                  kj.field_a.field_o = kj.field_a.field_o + 24;
                  return;
                }
              }
              if (param0 != 89) {
                return;
              } else {
                kj.field_a.field_o = kj.field_a.field_o + 24;
                return;
              }
            } else {
              if (param0 != 89) {
                return;
              } else {
                kj.field_a.field_o = kj.field_a.field_o + 24;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        if (param0) {
          L0: {
            var1 = 255 * (640 + ui.field_L) / 640;
            if (0 > var1) {
              var1 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          if (!lb.field_q) {
            if (!el.field_c) {
              L1: {
                ai.a(bj.field_e.field_f, 0, mf.field_c.field_D, 0, 307200);
                mf.field_c.g();
                eh.a(4, 4, 0, 0, 640, 480);
                mf.field_c.g(0, 0, 50);
                bj.field_e.a((byte) -45);
                lb.field_q = true;
                if (!el.field_c) {
                  break L1;
                } else {
                  L2: {
                    if (var1 >= 255) {
                      var1 = 255;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var1 = 255 + (-255 + var1);
                  break L1;
                }
              }
              if (var1 >= 255) {
                mf.field_c.g(0, 0);
                return;
              } else {
                if (tb.field_e) {
                  mf.field_c.f(0, 0, var1);
                  return;
                } else {
                  if (el.field_c) {
                    mf.field_c.f(0, 0, var1);
                    return;
                  } else {
                    if (oj.field_J > 11) {
                      mf.field_c.f(0, 0, var1);
                      return;
                    } else {
                      mf.field_c.g(0, 0);
                      return;
                    }
                  }
                }
              }
            } else {
              L3: {
                if (!el.field_c) {
                  break L3;
                } else {
                  L4: {
                    if (var1 >= 255) {
                      var1 = 255;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var1 = 255 + (-255 + var1);
                  break L3;
                }
              }
              if (var1 >= 255) {
                mf.field_c.g(0, 0);
                return;
              } else {
                if (tb.field_e) {
                  mf.field_c.f(0, 0, var1);
                  return;
                } else {
                  if (el.field_c) {
                    mf.field_c.f(0, 0, var1);
                    return;
                  } else {
                    if (oj.field_J > 11) {
                      mf.field_c.f(0, 0, var1);
                      return;
                    } else {
                      mf.field_c.g(0, 0);
                      return;
                    }
                  }
                }
              }
            }
          } else {
            L5: {
              if (!el.field_c) {
                break L5;
              } else {
                L6: {
                  if (var1 >= 255) {
                    var1 = 255;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var1 = 255 + (-255 + var1);
                break L5;
              }
            }
            if (var1 >= 255) {
              mf.field_c.g(0, 0);
              return;
            } else {
              if (tb.field_e) {
                mf.field_c.f(0, 0, var1);
                return;
              } else {
                if (el.field_c) {
                  mf.field_c.f(0, 0, var1);
                  return;
                } else {
                  if (oj.field_J > 11) {
                    mf.field_c.f(0, 0, var1);
                    return;
                  } else {
                    mf.field_c.g(0, 0);
                    return;
                  }
                }
              }
            }
          }
        } else {
          L7: {
            field_a = null;
            var1 = 255 * (640 + ui.field_L) / 640;
            if (0 > var1) {
              var1 = 0;
              break L7;
            } else {
              break L7;
            }
          }
          if (!lb.field_q) {
            if (!el.field_c) {
              L8: {
                ai.a(bj.field_e.field_f, 0, mf.field_c.field_D, 0, 307200);
                mf.field_c.g();
                eh.a(4, 4, 0, 0, 640, 480);
                mf.field_c.g(0, 0, 50);
                bj.field_e.a((byte) -45);
                lb.field_q = true;
                if (!el.field_c) {
                  break L8;
                } else {
                  L9: {
                    if (var1 >= 255) {
                      var1 = 255;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var1 = 255 + (-255 + var1);
                  break L8;
                }
              }
              if (var1 >= 255) {
                mf.field_c.g(0, 0);
                return;
              } else {
                if (tb.field_e) {
                  mf.field_c.f(0, 0, var1);
                  return;
                } else {
                  if (el.field_c) {
                    mf.field_c.f(0, 0, var1);
                    return;
                  } else {
                    if (oj.field_J > 11) {
                      mf.field_c.f(0, 0, var1);
                      return;
                    } else {
                      mf.field_c.g(0, 0);
                      return;
                    }
                  }
                }
              }
            } else {
              L10: {
                if (!el.field_c) {
                  break L10;
                } else {
                  L11: {
                    if (var1 >= 255) {
                      var1 = 255;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var1 = 255 + (-255 + var1);
                  break L10;
                }
              }
              L12: {
                if (var1 >= 255) {
                  mf.field_c.g(0, 0);
                  break L12;
                } else {
                  if (tb.field_e) {
                    mf.field_c.f(0, 0, var1);
                    break L12;
                  } else {
                    if (el.field_c) {
                      mf.field_c.f(0, 0, var1);
                      break L12;
                    } else {
                      if (oj.field_J > 11) {
                        mf.field_c.f(0, 0, var1);
                        break L12;
                      } else {
                        mf.field_c.g(0, 0);
                        break L12;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L13: {
              if (!el.field_c) {
                break L13;
              } else {
                L14: {
                  if (var1 >= 255) {
                    var1 = 255;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var1 = 255 + (-255 + var1);
                break L13;
              }
            }
            L15: {
              if (var1 >= 255) {
                mf.field_c.g(0, 0);
                break L15;
              } else {
                if (tb.field_e) {
                  mf.field_c.f(0, 0, var1);
                  break L15;
                } else {
                  if (el.field_c) {
                    mf.field_c.f(0, 0, var1);
                    break L15;
                  } else {
                    if (oj.field_J > 11) {
                      mf.field_c.f(0, 0, var1);
                      break L15;
                    } else {
                      mf.field_c.g(0, 0);
                      break L15;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    public static void a() {
        field_d = null;
        int var1 = -25;
        field_c = null;
        field_e = null;
        field_a = null;
        field_b = null;
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param1 >= 104) {
                break L1;
              } else {
                nj.a((byte) -21);
                break L1;
              }
            }
            var2_int = param0.charAt(0);
            var3 = 1;
            L2: while (true) {
              if (param0.length() <= var3) {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (param0.charAt(var3) != var2_int) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("nj.D(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[][]{null, new String[1]};
        field_d = "Please wait...";
    }
}
