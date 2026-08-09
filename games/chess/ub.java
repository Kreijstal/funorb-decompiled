/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ub {
    static volatile int field_b;
    fj[] field_a;
    static km[][] field_d;
    static int field_e;
    static String field_c;

    final int a(byte param0, int param1) {
        int var4 = 0;
        fj var5 = null;
        int var6 = Chess.field_G;
        int var3 = -75 % ((param0 - 15) / 43);
        for (var4 = 0; this.field_a.length > var4; var4++) {
            var5 = this.field_a[var4];
            if (var5.field_i.length > param1) {
                return var4;
            }
            param1 = param1 - (var5.field_i.length - 1);
        }
        return this.field_a.length;
    }

    final int c(byte param0) {
        int var2;
        fj[] var3;
        int var4;
        fj var5;
        int var7;
        int var6;
        L0: {
          var7 = Chess.field_G;
          var2 = -1;
          if (param0 == -24) {
            break L0;
          } else {
            this.a(87, -122);
            break L0;
          }
        }
        L1: {
          if (null == this.field_a) {
            break L1;
          } else {
            var3 = this.field_a;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(false);
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

    final int a(byte param0) {
        int stackIn_6_0 = 0;
        if (param0 == 34) {
          L0: {
            L1: {
              if (this.field_a == null) {
                break L1;
              } else {
                if (-1 <= (this.field_a.length ^ -1)) {
                  break L1;
                } else {
                  stackIn_6_0 = -this.field_a[0].field_d + this.field_a[-1 + this.field_a.length].field_e;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return -28;
        }
    }

    final int a(int param0, boolean param1, String param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param1) {
                break L1;
              } else {
                field_e = 17;
                break L1;
              }
            }
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L2: while (true) {
              if (var8 >= var7) {
                if (0 < var5_int) {
                  stackIn_20_0 = (param3 + -param0 << -429191896) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackIn_22_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L3: {
                  var9 = param2.charAt(var8);
                  if ((var9 ^ -1) != -61) {
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
                  } else {
                    var6 = 1;
                    break L3;
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
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("ub.L(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          return stackIn_22_0;
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 21549) {
          L0: {
            L1: {
              if (null == lj.field_a) {
                break L1;
              } else {
                if (tb.field_f != ik.field_e) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        fj var5 = null;
        int var6 = Chess.field_G;
        if (param0 != -5940) {
            field_b = 126;
        }
        fj[] var7 = this.field_a;
        fj[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(var5.field_i.length <= param1)) {
                return var5.field_i[param1];
            }
            param1 = param1 - (-1 + var5.field_i.length);
        }
        return 0;
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = -92 / ((-17 - param0) / 43);
        field_d = (km[][]) null;
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        fj var6;
        int var7;
        int var8;
        L0: {
          var8 = Chess.field_G;
          if (this.field_a == null) {
            break L0;
          } else {
            if (-1 == (this.field_a.length ^ -1)) {
              break L0;
            } else {
              if (param0 < this.field_a[0].field_d) {
                break L0;
              } else {
                if (this.field_a[this.field_a.length + -1].field_e < param0) {
                  return -1;
                } else {
                  if (this.field_a.length != 1) {
                    L1: {
                      if (param1 > 3) {
                        break L1;
                      } else {
                        ub.b((byte) 76);
                        break L1;
                      }
                    }
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= this.field_a.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = this.field_a[var5];
                          if (param0 < var6.field_d) {
                            break L3;
                          } else {
                            if (var6.field_e >= param0) {
                              var7 = var6.a(param2, -1);
                              if (var7 == -1) {
                                return -1;
                              } else {
                                return var7 + var4;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_i.length);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return this.field_a[0].a(param2, -1);
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    static {
        field_b = 0;
        field_d = new km[2][7];
        field_c = "Accept <%0> into this game";
    }
}
