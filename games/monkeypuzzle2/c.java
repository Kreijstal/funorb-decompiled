/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    private uj field_c;
    private ca[] field_g;
    private java.math.BigInteger field_d;
    private gk field_f;
    static c field_h;
    private wl field_e;
    static String field_j;
    private java.math.BigInteger field_i;
    static int field_b;
    private ob field_a;

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        gk var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null == ((c) this).field_f) {
          L0: {
            if (null != ((c) this).field_a) {
              break L0;
            } else {
              if (!((c) this).field_e.d(20)) {
                ((c) this).field_a = ((c) this).field_e.a(255, 255, 122, true, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!((c) this).field_a.field_j) {
            var10 = new gk(((c) this).field_a.e(100));
            var10.field_h = 5;
            var3 = var10.a((byte) 114);
            var10.field_h = var10.field_h + var3 * 72;
            if (param0 <= -49) {
              L1: {
                L2: {
                  var16 = new byte[-var10.field_h + var10.field_g.length];
                  var14 = var16;
                  var13 = var14;
                  var11 = var13;
                  var4 = var11;
                  var10.a(var4, var16.length, -111, 0);
                  if (null == ((c) this).field_d) {
                    break L2;
                  } else {
                    if (null == ((c) this).field_i) {
                      break L2;
                    } else {
                      var12 = new java.math.BigInteger(var16);
                      var7_ref_java_math_BigInteger = var12.modPow(((c) this).field_d, ((c) this).field_i);
                      var5 = var7_ref_java_math_BigInteger.toByteArray();
                      break L1;
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if (var5.length != 65) {
                throw new RuntimeException();
              } else {
                var17 = ie.a(-51, var10.field_g, -5 + var10.field_h + -var16.length, 5);
                var7 = 0;
                L3: while (true) {
                  if (var7 >= 64) {
                    ((c) this).field_f = var10;
                    ((c) this).field_g = new ca[var3];
                    return true;
                  } else {
                    if (var17[var7] != var5[var7 + 1]) {
                      throw new RuntimeException();
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((c) this).field_g != null) {
          var2 = 0;
          if (param0) {
            L0: while (true) {
              if (var2 >= ((c) this).field_g.length) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (var4 >= ((c) this).field_g.length) {
                    return;
                  } else {
                    if (((c) this).field_g[var4] != null) {
                      ((c) this).field_g[var4].c(16311);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (null != ((c) this).field_g[var2]) {
                  ((c) this).field_g[var2].b(-1);
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static le[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8) {
        int var9 = 0;
        le[] var10 = null;
        le[] var11_ref_le__ = null;
        int var11 = 0;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = MonkeyPuzzle2.field_F ? 1 : 0;
          var9 = param3 + (param7 + 1);
          var10 = new le[]{new le(var9, var9), new le(param1, var9), new le(var9, var9), new le(var9, param1), new le(64, 64), new le(var9, param1), new le(var9, var9), new le(param1, var9), new le(var9, var9)};
          var11_ref_le__ = var10;
          if (param8) {
            break L0;
          } else {
            le[] discarded$1 = c.a(-50, -14, 118, -7, 1, -75, 1, 23, false);
            break L0;
          }
        }
        var12 = 0;
        L1: while (true) {
          if (var11_ref_le__.length <= var12) {
            var11 = 0;
            L2: while (true) {
              if (param7 <= var11) {
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param7) {
                    var11 = 0;
                    L4: while (true) {
                      if (param1 <= var11) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param1 >> 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 < 1) {
                                var10[1].field_s[param1 * (var9 + -var12 - 1) + var11] = param0;
                                var10[3].field_s[var9 * var11 - var12 - (1 + -var9)] = param0;
                                var10[7].field_s[var11 + var12 * param1] = param0;
                                var10[5].field_s[var9 * var11 - -var12] = param0;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (var12 >= param7) {
                            var11++;
                            continue L4;
                          } else {
                            var10[7].field_s[param1 * (-1 + var9 + -var12) + var11] = param2;
                            var10[5].field_s[var9 * var11 + (var9 + -1 + -var12)] = param2;
                            var10[1].field_s[param1 * var12 - -var11] = param4;
                            var10[3].field_s[var11 * var9 + var12] = param4;
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var9 > var12) {
                        var10[0].field_s[var9 * var11 + var12] = param4;
                        var10[0].field_s[var9 * var12 + var11] = param4;
                        if (var12 < -var11 + var9) {
                          var10[2].field_s[var9 * var11 + var12] = param4;
                          var10[6].field_s[var11 + var9 * var12] = param4;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L2;
                  } else {
                    var10[6].field_s[var12 + var9 * (-var11 + var9 + -1)] = param2;
                    var10[8].field_s[var12 + (-var11 + var9 - 1) * var9] = param2;
                    var10[2].field_s[var12 * var9 + -var11 + (var9 - 1)] = param2;
                    var10[8].field_s[var9 * var12 - (var11 + (1 + -var9))] = param2;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_le__[var12];
            var14 = 0;
            L10: while (true) {
              if (var14 >= var13.field_s.length) {
                var12++;
                continue L1;
              } else {
                var13.field_s[var14] = param5;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    c(wl param0, uj param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void a() {
        field_j = null;
        field_h = null;
    }

    final ca a(int param0, gf param1, int param2, gf param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        ca var9 = null;
        Object var10 = null;
        byte[] var14 = null;
        ca stackIn_9_0 = null;
        ca stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ca stackOut_8_0 = null;
        ca stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (null != ((c) this).field_f) {
              L1: {
                if (0 > param2) {
                  break L1;
                } else {
                  if (((c) this).field_g.length <= param2) {
                    break L1;
                  } else {
                    if (((c) this).field_g[param2] != null) {
                      stackOut_8_0 = ((c) this).field_g[param2];
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    } else {
                      L2: {
                        ((c) this).field_f.field_h = param2 * 72 + 6;
                        var6_int = ((c) this).field_f.e(126);
                        var7 = ((c) this).field_f.e(-61);
                        if (param0 == -24559) {
                          break L2;
                        } else {
                          var10 = null;
                          ca discarded$1 = ((c) this).a(-126, (gf) null, 30, (gf) null, false);
                          break L2;
                        }
                      }
                      var14 = new byte[64];
                      ((c) this).field_f.a(var14, 64, -86, 0);
                      var9 = new ca(param2, param3, param1, ((c) this).field_e, ((c) this).field_c, var6_int, var14, var7, param4);
                      ((c) this).field_g[param2] = var9;
                      stackOut_12_0 = (ca) var9;
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("c.C(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param4 + ')');
        }
        return stackIn_13_0;
    }

    private c(wl param0, uj param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
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
        try {
          L0: {
            L1: {
              ((c) this).field_e = param0;
              ((c) this).field_i = param3;
              ((c) this).field_d = param2;
              ((c) this).field_c = param1;
              if (((c) this).field_e.d(20)) {
                break L1;
              } else {
                ((c) this).field_a = ((c) this).field_e.a(255, 255, 105, true, (byte) 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("c.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw la.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Creating your account";
    }
}
