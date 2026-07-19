/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iq {
    qj[] field_c;
    static String[] field_a;
    static String field_b;

    public static void b(int param0) {
        int discarded$0 = 0;
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            discarded$0 = iq.a((byte) -59, 98, 114, 64, -128);
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        qj[] var3 = null;
        int var4 = 0;
        qj var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Kickabout.field_G;
          if (param0 == -25) {
            break L0;
          } else {
            this.field_c = (qj[]) null;
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (null == this.field_c) {
            break L1;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a((byte) -114);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1761) {
            break L0;
          } else {
            field_b = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_c) {
              break L2;
            } else {
              if (-1 <= (this.field_c.length ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = this.field_c[this.field_c.length - 1].field_d + -this.field_c[0].field_g;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final static int a(byte param0, int param1, int param2, int param3, int param4) {
        ut var5 = tb.field_q[param3 % 10];
        if (param0 >= -66) {
            return -2;
        }
        param2 = param2 - var5.field_q;
        var5.c(-var5.field_s + param2, param1, param4);
        param2 -= 3;
        if (!(param3 < 10)) {
            param2 = iq.a((byte) -109, param1, param2, param3 / 10, param4);
        }
        return param2;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int discarded$2 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param1 == -61) {
                break L1;
              } else {
                discarded$2 = this.a(75, -37, -61);
                break L1;
              }
            }
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            L2: while (true) {
              if (var8 >= var7) {
                if (-1 <= (var5_int ^ -1)) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_16_0 = (-param2 + param0 << -630965016) / var5_int;
                  stackIn_17_0 = stackOut_16_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  var9 = param3.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L3;
                  } else {
                    if (var9 == 62) {
                      var6 = 0;
                      break L3;
                    } else {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var8++;
                        continue L2;
                      }
                    }
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("iq.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_19_0;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        qj var4 = null;
        int var5 = Kickabout.field_G;
        for (var3 = param0; this.field_c.length > var3; var3++) {
            var4 = this.field_c[var3];
            if (param1 < var4.field_b.length) {
                return var3;
            }
            param1 = param1 - (var4.field_b.length + -1);
        }
        return this.field_c.length;
    }

    final int b(int param0, int param1) {
        int var4 = 0;
        qj var5 = null;
        int var6 = Kickabout.field_G;
        qj[] var7 = this.field_c;
        qj[] var3 = var7;
        for (var4 = param0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(var5.field_b.length <= param1)) {
                return var5.field_b[param1];
            }
            param1 = param1 - (var5.field_b.length - 1);
        }
        return 0;
    }

    final int a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        int var4 = 0;
        int var5 = 0;
        qj var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Kickabout.field_G;
          if (this.field_c == null) {
            break L0;
          } else {
            if (this.field_c.length == 0) {
              break L0;
            } else {
              if (this.field_c[0].field_g > param0) {
                break L0;
              } else {
                if (this.field_c[-1 + this.field_c.length].field_d < param0) {
                  return -1;
                } else {
                  if (-2 != (this.field_c.length ^ -1)) {
                    L1: {
                      var4 = 0;
                      if (param2 == 29889) {
                        break L1;
                      } else {
                        discarded$2 = this.b(19, -114);
                        break L1;
                      }
                    }
                    var5 = 0;
                    L2: while (true) {
                      if (this.field_c.length <= var5) {
                        return -1;
                      } else {
                        L3: {
                          var6 = this.field_c[var5];
                          if (var6.field_g > param0) {
                            break L3;
                          } else {
                            if (var6.field_d >= param0) {
                              var7 = var6.a((byte) 101, param1);
                              if (0 == (var7 ^ -1)) {
                                return -1;
                              } else {
                                return var4 + var7;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (var6.field_b.length + -1);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return this.field_c[0].a((byte) 101, param1);
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    static {
        field_a = new String[]{"How To Move", "Using Your Feet", "The Players", "Player Stats", "Trinkets", "What You Need To Know"};
        field_b = "Choose colours and a stylish design for your team's clothing.";
    }
}
