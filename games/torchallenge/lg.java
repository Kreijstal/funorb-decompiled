/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lg {
    static int field_f;
    static int[][] field_d;
    qi[] field_a;
    static int[] field_e;
    static int field_c;
    static String field_b;

    final static void a(uj param0, byte param1, java.awt.Frame param2) {
        mi var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a(-3816, param2);
              L2: while (true) {
                if (var3.field_d != 0) {
                  if (1 == var3.field_d) {
                    L3: {
                      if (param1 > 48) {
                        break L3;
                      } else {
                        var5 = null;
                        break L3;
                      }
                    }
                    param2.setVisible(false);
                    param2.dispose();
                    break L0;
                  } else {
                    c.a(-108, 100L);
                    continue L1;
                  }
                } else {
                  c.a(-112, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("lg.G(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static int b(byte param0, int param1) {
        int[] var2 = null;
        int[] var3 = null;
        if (param0 == 84) {
          L0: {
            var3 = bj.field_d;
            var2 = var3;
            if (var3[4] == param1) {
              break L0;
            } else {
              if (var3[3] == param1) {
                break L0;
              } else {
                if (var3[2] != param1) {
                  if (param1 != var3[1]) {
                    if (var3[0] != param1) {
                      return -1;
                    } else {
                      return 2;
                    }
                  } else {
                    return 4;
                  }
                } else {
                  return 0;
                }
              }
            }
          }
          return 0;
        } else {
          return -106;
        }
    }

    final int a(String param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param0.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                L2: {
                  if (param2 == 19) {
                    break L2;
                  } else {
                    field_b = null;
                    break L2;
                  }
                }
                if (0 < var5_int) {
                  stackOut_15_0 = (-param3 + param1 << 8) / var5_int;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  return 0;
                }
              } else {
                L3: {
                  var9 = param0.charAt(var8);
                  if (60 != var9) {
                    if (var9 == 62) {
                      var6 = 0;
                      break L3;
                    } else {
                      L4: {
                        if (var6 != 0) {
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var8++;
                      continue L1;
                    }
                  } else {
                    var6 = 1;
                    break L3;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("lg.E(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_16_0;
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -63) {
          L0: {
            L1: {
              if (null == ((lg) this).field_a) {
                break L1;
              } else {
                if (((lg) this).field_a.length > 0) {
                  stackOut_6_0 = ((lg) this).field_a[((lg) this).field_a.length - 1].field_e + -((lg) this).field_a[0].field_d;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return 126;
        }
    }

    final static long a(CharSequence param0, int param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_22_0 = 0L;
        long stackOut_2_0 = 0L;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == -1) {
              var2_long = 0L;
              var4 = param0.length();
              var5 = 0;
              L1: while (true) {
                L2: {
                  if (var4 <= var5) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var2_long = var2_long * 37L;
                        var6 = param0.charAt(var5);
                        if (var6 < 65) {
                          break L4;
                        } else {
                          if (var6 <= 90) {
                            var2_long = var2_long + (long)(-64 - -var6);
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var6 < 97) {
                          break L5;
                        } else {
                          if (var6 > 122) {
                            break L5;
                          } else {
                            var2_long = var2_long + (long)(-96 + var6);
                            break L3;
                          }
                        }
                      }
                      if (var6 < 48) {
                        break L3;
                      } else {
                        if (var6 > 57) {
                          break L3;
                        } else {
                          var2_long = var2_long + (long)(var6 - 21);
                          break L3;
                        }
                      }
                    }
                    if (var2_long < 177917621779460413L) {
                      var5++;
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L6: while (true) {
                  L7: {
                    if (var2_long % 37L != 0L) {
                      break L7;
                    } else {
                      if (var2_long == 0L) {
                        break L7;
                      } else {
                        var2_long = var2_long / 37L;
                        continue L6;
                      }
                    }
                  }
                  stackOut_22_0 = var2_long;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 44L;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("lg.B(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 41);
        }
        return stackIn_23_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != -27840) {
            Object var2 = null;
            lg.a(true, (byte) -97, (ej) null);
        }
    }

    final int b(byte param0) {
        int var2 = 0;
        qi[] var3 = null;
        int var4 = 0;
        qi var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        if (param0 == 57) {
          L0: {
            var2 = -1;
            if (null == ((lg) this).field_a) {
              break L0;
            } else {
              var3 = ((lg) this).field_a;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.b((byte) 104);
                    if (var2 < var6) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
          return var2;
        } else {
          return 9;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        qi var5 = null;
        int var6 = TorChallenge.field_F ? 1 : 0;
        qi[] var7 = ((lg) this).field_a;
        qi[] var3 = var7;
        if (param0 >= -103) {
            lg.a(-125);
        }
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_g.length > param1) {
                return var5.field_g[param1];
            }
            param1 = param1 - (var5.field_g.length + -1);
        }
        return 0;
    }

    final static void a(boolean param0, byte param1, ej param2) {
        try {
            if (param1 != -79) {
                field_e = null;
            }
            uc.a(param2, param1 + -3481, param0, 256);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "lg.I(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(byte param0, int param1) {
        qi var4 = null;
        int var5 = TorChallenge.field_F ? 1 : 0;
        int var3 = 0;
        if (param0 != 7) {
            ((lg) this).field_a = null;
        }
        while (((lg) this).field_a.length > var3) {
            var4 = ((lg) this).field_a[var3];
            if (!(var4.field_g.length <= param1)) {
                return var3;
            }
            param1 = param1 - (var4.field_g.length - 1);
            var3++;
        }
        return ((lg) this).field_a.length;
    }

    final static hb a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        hb[] var3 = null;
        int var4 = 0;
        hb var5 = null;
        int var6 = 0;
        hb stackIn_3_0 = null;
        hb stackIn_9_0 = null;
        hb stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb stackOut_13_0 = null;
        hb stackOut_8_0 = null;
        hb stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2 = g.a("jagex-last-login-method", (byte) 75, param0);
            if (var2 != null) {
              var3 = dg.j(1);
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  stackOut_13_0 = ki.field_b;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, 0)) {
                    stackOut_8_0 = (hb) var5;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = ki.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2_ref;
            stackOut_15_1 = new StringBuilder().append("lg.D(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 126 + 41);
        }
        return stackIn_14_0;
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        qi var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TorChallenge.field_F ? 1 : 0;
          if (((lg) this).field_a == null) {
            break L0;
          } else {
            if (((lg) this).field_a.length == 0) {
              break L0;
            } else {
              if (param2 < ((lg) this).field_a[0].field_d) {
                break L0;
              } else {
                if (param2 <= ((lg) this).field_a[-1 + ((lg) this).field_a.length].field_e) {
                  if (((lg) this).field_a.length == 1) {
                    return ((lg) this).field_a[0].a(0, param0);
                  } else {
                    var4 = 0;
                    var5 = 0;
                    L1: while (true) {
                      if (((lg) this).field_a.length <= var5) {
                        L2: {
                          if (param1 == -77) {
                            break L2;
                          } else {
                            field_b = null;
                            break L2;
                          }
                        }
                        return -1;
                      } else {
                        L3: {
                          var6 = ((lg) this).field_a[var5];
                          if (var6.field_d > param2) {
                            break L3;
                          } else {
                            if (var6.field_e < param2) {
                              break L3;
                            } else {
                              var7 = var6.a(0, param0);
                              if (-1 == var7) {
                                return -1;
                              } else {
                                return var7 + var4;
                              }
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_g.length);
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[][]{new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[21], new int[20], new int[21]};
        field_c = 500;
    }
}
