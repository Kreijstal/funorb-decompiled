/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends gn {
    static java.math.BigInteger field_h;
    int field_i;
    int[] field_g;
    static String field_e;
    static ut field_f;

    public final String toString() {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        StringBuilder var7 = null;
        var4 = Kickabout.field_G;
        var7 = new StringBuilder(" (Delta: ");
        if (0 != ((hn) this).field_i) {
          if (((hn) this).field_i != 1) {
            if (2 != ((hn) this).field_i) {
              if (((hn) this).field_i != 3) {
                if (4 != ((hn) this).field_i) {
                  if (5 != ((hn) this).field_i) {
                    if (((hn) this).field_i != 6) {
                      if (7 != ((hn) this).field_i) {
                        if (((hn) this).field_i != 8) {
                          if (9 != ((hn) this).field_i) {
                            StringBuilder discarded$39 = var7.append(")");
                            return var7.toString();
                          } else {
                            var2 = "[";
                            var5 = var2;
                            var2 = var5;
                            var3 = 0;
                            L0: while (true) {
                              if (((hn) this).field_g.length <= var3) {
                                var6 = var2 + "]";
                                StringBuilder discarded$40 = var7.append("Changed Render Order to " + var6);
                                StringBuilder discarded$41 = var7.append(")");
                                return var7.toString();
                              } else {
                                var5 = var2 + Integer.toString(((hn) this).field_g[var3]);
                                var2 = var5;
                                var2 = var5;
                                if (var3 != ((hn) this).field_g.length - 1) {
                                  var2 = var5 + ",";
                                  var3++;
                                  continue L0;
                                } else {
                                  var3++;
                                  continue L0;
                                }
                              }
                            }
                          }
                        } else {
                          StringBuilder discarded$42 = var7.append("Selected Stadium Surface " + ((hn) this).field_g[0] + ", Tier " + ((hn) this).field_g[1]);
                          StringBuilder discarded$43 = var7.append(")");
                          return var7.toString();
                        }
                      } else {
                        StringBuilder discarded$44 = var7.append("Bought Stadium Surface " + ((hn) this).field_g[0] + ", Tier " + ((hn) this).field_g[1]);
                        StringBuilder discarded$45 = var7.append(")");
                        return var7.toString();
                      }
                    } else {
                      StringBuilder discarded$46 = var7.append("Selected Secondary Colour " + ((hn) this).field_g[0]);
                      StringBuilder discarded$47 = var7.append(")");
                      return var7.toString();
                    }
                  } else {
                    StringBuilder discarded$48 = var7.append("Selected Primary Colour " + ((hn) this).field_g[0]);
                    StringBuilder discarded$49 = var7.append(")");
                    return var7.toString();
                  }
                } else {
                  StringBuilder discarded$50 = var7.append("Selected Kit " + ((hn) this).field_g[0]);
                  StringBuilder discarded$51 = var7.append(")");
                  return var7.toString();
                }
              } else {
                L1: {
                  var2 = "POW";
                  if (1 != ((hn) this).field_g[1]) {
                    break L1;
                  } else {
                    var2 = "SPD";
                    break L1;
                  }
                }
                L2: {
                  if (2 == ((hn) this).field_g[1]) {
                    var2 = "TCK";
                    break L2;
                  } else {
                    break L2;
                  }
                }
                StringBuilder discarded$52 = var7.append("Levelled up player " + ((hn) this).field_g[0] + ", stat: " + var2);
                StringBuilder discarded$53 = var7.append(")");
                return var7.toString();
              }
            } else {
              StringBuilder discarded$54 = var7.append("Bought a trinket for player " + ((hn) this).field_g[0] + ", slot " + ((hn) this).field_g[1] + ", trinket id" + ((hn) this).field_g[2]);
              StringBuilder discarded$55 = var7.append(")");
              return var7.toString();
            }
          } else {
            StringBuilder discarded$56 = var7.append("Sold Player " + ((hn) this).field_g[0]);
            StringBuilder discarded$57 = var7.append(")");
            return var7.toString();
          }
        } else {
          StringBuilder discarded$58 = var7.append("Bought Player from shop " + (((hn) this).field_g[0] - 1) + ", index " + ((hn) this).field_g[1]);
          StringBuilder discarded$59 = var7.append(")");
          return var7.toString();
        }
    }

    final void a(int param0, iw param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = Kickabout.field_G;
        try {
          L0: {
            param1.a(123, param0);
            param1.a(113, ((hn) this).field_i);
            var3_int = 0;
            L1: while (true) {
              if (((hn) this).field_g.length <= var3_int) {
                break L0;
              } else {
                param1.a(param0 ^ 125, ((hn) this).field_g[var3_int]);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("hn.D(").append(param0).append(',');
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
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        int var7_int = 0;
        try {
            var7_int = un.field_d.a(param6) - -15;
            pt.a(10, -22914, 0, 480, 0);
            on.a(param3 - var7_int, param4 - 17, var7_int + 20, 21, 8, 65793, 128);
            ta.e(123);
            pt.a(param3, -22914, 0, 480, 0);
            on.a(-var7_int + param3, param4 - 17, 20 + var7_int, 21, 8, param1, param2);
            ta.e(121);
            un.field_d.c(param6, param3, param4, param5, -1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "hn.E(" + 8 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(hn param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (param0.field_i == ((hn) this).field_i) {
              if (((hn) this).field_g.length != param0.field_g.length) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var3_int = 0;
                L1: while (true) {
                  if (((hn) this).field_g.length <= var3_int) {
                    if (param1 >= 109) {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      break L0;
                    } else {
                      ((hn) this).field_g = null;
                      return true;
                    }
                  } else {
                    if (((hn) this).field_g[var3_int] == param0.field_g[var3_int]) {
                      var3_int++;
                      continue L1;
                    } else {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("hn.C(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final static String a(String param0, String param1, int param2, sj param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!param3.d(-55)) {
              stackOut_2_0 = (String) param1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param2 <= -9) {
                  break L1;
                } else {
                  var5 = null;
                  String discarded$2 = hn.a((String) null, (String) null, 74, (sj) null);
                  break L1;
                }
              }
              stackOut_6_0 = param0 + " - " + param3.e(-8185) + "%";
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("hn.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_e = null;
        field_f = null;
        field_h = null;
    }

    hn(int param0, int[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            ((hn) this).field_g = param1;
            ((hn) this).field_i = param0;
            if (qk.field_E[((hn) this).field_i] == ((hn) this).field_g.length) {
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("hn.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_e = "Quit";
    }
}
