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
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$25 = null;
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        StringBuilder discarded$30 = null;
        StringBuilder discarded$31 = null;
        StringBuilder discarded$32 = null;
        StringBuilder discarded$33 = null;
        StringBuilder discarded$34 = null;
        StringBuilder discarded$35 = null;
        StringBuilder discarded$36 = null;
        StringBuilder discarded$37 = null;
        StringBuilder discarded$38 = null;
        String var2;
        int var3;
        int var4;
        String var5;
        StringBuilder var7;
        String var6;
        var4 = Kickabout.field_G;
        var7 = new StringBuilder(" (Delta: ");
        if (0 != this.field_i) {
          if (-2 != (this.field_i ^ -1)) {
            if (2 != this.field_i) {
              if (this.field_i != 3) {
                if (4 != this.field_i) {
                  if (5 != this.field_i) {
                    if (this.field_i != 6) {
                      if (7 != this.field_i) {
                        if ((this.field_i ^ -1) != -9) {
                          if (9 != this.field_i) {
                            discarded$18 = var7.append(")");
                            return var7.toString();
                          } else {
                            var2 = "[";
                            var5 = var2;
                            var2 = var5;
                            var5 = var2;
                            var2 = var5;
                            var3 = 0;
                            L0: while (true) {
                              if (this.field_g.length <= var3) {
                                var6 = var2 + "]";
                                discarded$19 = var7.append("Changed Render Order to " + var6);
                                discarded$20 = var7.append(")");
                                return var7.toString();
                              } else {
                                var5 = var2 + Integer.toString(this.field_g[var3]);
                                var2 = var5;
                                var2 = var5;
                                var2 = var5;
                                if (var3 != this.field_g.length - 1) {
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
                          discarded$21 = var7.append("Selected Stadium Surface " + this.field_g[0] + ", Tier " + this.field_g[1]);
                          discarded$22 = var7.append(")");
                          return var7.toString();
                        }
                      } else {
                        discarded$23 = var7.append("Bought Stadium Surface " + this.field_g[0] + ", Tier " + this.field_g[1]);
                        discarded$24 = var7.append(")");
                        return var7.toString();
                      }
                    } else {
                      discarded$25 = var7.append("Selected Secondary Colour " + this.field_g[0]);
                      discarded$26 = var7.append(")");
                      return var7.toString();
                    }
                  } else {
                    discarded$27 = var7.append("Selected Primary Colour " + this.field_g[0]);
                    discarded$28 = var7.append(")");
                    return var7.toString();
                  }
                } else {
                  discarded$29 = var7.append("Selected Kit " + this.field_g[0]);
                  discarded$30 = var7.append(")");
                  return var7.toString();
                }
              } else {
                L1: {
                  var2 = "POW";
                  if (1 != this.field_g[1]) {
                    break L1;
                  } else {
                    var2 = "SPD";
                    break L1;
                  }
                }
                L2: {
                  if (2 == this.field_g[1]) {
                    var2 = "TCK";
                    break L2;
                  } else {
                    break L2;
                  }
                }
                discarded$31 = var7.append("Levelled up player " + this.field_g[0] + ", stat: " + var2);
                discarded$32 = var7.append(")");
                return var7.toString();
              }
            } else {
              discarded$33 = var7.append("Bought a trinket for player " + this.field_g[0] + ", slot " + this.field_g[1] + ", trinket id" + this.field_g[2]);
              discarded$34 = var7.append(")");
              return var7.toString();
            }
          } else {
            discarded$35 = var7.append("Sold Player " + this.field_g[0]);
            discarded$36 = var7.append(")");
            return var7.toString();
          }
        } else {
          discarded$37 = var7.append("Bought Player from shop " + (this.field_g[0] - 1) + ", index " + this.field_g[1]);
          discarded$38 = var7.append(")");
          return var7.toString();
        }
    }

    final void a(int param0, iw param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            param1.a(123, param0);
            param1.a(113, this.field_i);
            var3_int = 0;
            L1: while (true) {
              if (this.field_g.length <= var3_int) {
                break L0;
              } else {
                param1.a(param0 ^ 125, this.field_g[var3_int]);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("hn.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        int var7_int = 0;
        try {
            var7_int = un.field_d.a(param6) - -15;
            pt.a(10, -22914, 0, 480, 0);
            on.a(param3 - var7_int, param4 - 17, var7_int + 20, 21, param0, 65793, 128);
            ta.e(123);
            pt.a(param3, -22914, 0, 480, 0);
            on.a(-var7_int + param3, param4 - 17, 20 + var7_int, 21, 8, param1, param2);
            ta.e(param0 + 113);
            un.field_d.c(param6, param3, param4, param5, -1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "hn.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(hn param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (param0.field_i == this.field_i) {
              if (this.field_g.length != param0.field_g.length) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3_int = 0;
                L1: while (true) {
                  if (this.field_g.length <= var3_int) {
                    L2: {
                      if (param1 >= 109) {
                        break L2;
                      } else {
                        this.field_g = (int[]) null;
                        break L2;
                      }
                    }
                    stackIn_18_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (this.field_g[var3_int] == param0.field_g[var3_int]) {
                      var3_int++;
                      continue L1;
                    } else {
                      return false;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("hn.C(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final static String a(String param0, String param1, int param2, sj param3) {
        RuntimeException var4 = null;
        sj var5 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param3.d(-55)) {
              stackIn_3_0 = (String) (param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 <= -9) {
                  break L1;
                } else {
                  var5 = (sj) null;
                  hn.a((String) null, (String) null, 74, (sj) null);
                  break L1;
                }
              }
              stackIn_7_0 = param0 + " - " + param3.e(-8185) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("hn.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_f = null;
        field_h = null;
        if (param0 < 113) {
            field_e = (String) null;
        }
    }

    hn(int param0, int[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_g = param1;
            this.field_i = param0;
            if (qk.field_E[this.field_i] == this.field_g.length) {
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hn.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_h = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_e = "Quit";
    }
}
