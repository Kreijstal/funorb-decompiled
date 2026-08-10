/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ne {
    static rh field_a;
    pi[] field_c;
    static int[] field_b;
    static fh field_d;

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = param2;
            L1: while (true) {
              if (var7 <= var8) {
                if (0 >= var5_int) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_17_0 = (param3 + -param0 << 1573935784) / var5_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  var9 = param1.charAt(var8);
                  if ((var9 ^ -1) != -61) {
                    if (var9 != 62) {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var6 = 0;
                      break L2;
                    }
                  } else {
                    var6 = 1;
                    break L2;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("ne.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_19_0;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -84) {
            ne.a((byte) 82);
        }
        field_a = null;
        field_b = null;
    }

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_b = (int[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_c) {
              break L2;
            } else {
              if ((this.field_c.length ^ -1) >= -1) {
                break L2;
              } else {
                stackIn_6_0 = this.field_c[-1 + this.field_c.length].field_c - this.field_c[0].field_a;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        pi var4 = null;
        int var5 = fleas.field_A ? 1 : 0;
        if (param1 != -1) {
            return 33;
        }
        for (var3 = 0; var3 < this.field_c.length; var3++) {
            var4 = this.field_c[var3];
            if (param0 < var4.field_d.length) {
                return var3;
            }
            param0 = param0 - (var4.field_d.length + -1);
        }
        return this.field_c.length;
    }

    final int b(byte param0) {
        int var2;
        pi[] var3;
        int var4;
        pi var5;
        int var7;
        int var6;
        L0: {
          var7 = fleas.field_A ? 1 : 0;
          if (param0 == 97) {
            break L0;
          } else {
            this.a(false);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (this.field_c != null) {
            var3 = this.field_c;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b((byte) -42);
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
          } else {
            break L1;
          }
        }
        return var2;
    }

    final int a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        pi var6;
        int var7;
        int var8;
        L0: {
          var8 = fleas.field_A ? 1 : 0;
          if (null == this.field_c) {
            break L0;
          } else {
            if (this.field_c.length == 0) {
              break L0;
            } else {
              if (this.field_c[0].field_a > param1) {
                break L0;
              } else {
                if (this.field_c[-1 + this.field_c.length].field_c < param1) {
                  return -1;
                } else {
                  if ((this.field_c.length ^ -1) != -2) {
                    var4 = 0;
                    if (param2 < -104) {
                      var5 = 0;
                      L1: while (true) {
                        if (var5 >= this.field_c.length) {
                          return -1;
                        } else {
                          L2: {
                            var6 = this.field_c[var5];
                            if (var6.field_a > param1) {
                              break L2;
                            } else {
                              if (param1 > var6.field_c) {
                                break L2;
                              } else {
                                var7 = var6.a(6759, param0);
                                if ((var7 ^ -1) != 0) {
                                  return var4 - -var7;
                                } else {
                                  return -1;
                                }
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_d.length);
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      return -97;
                    }
                  } else {
                    return this.field_c[0].a(6759, param0);
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final int c(int param0, int param1) {
        int var4 = 0;
        pi var5 = null;
        int var6 = fleas.field_A ? 1 : 0;
        pi[] var7 = this.field_c;
        pi[] var3 = var7;
        if (param0 != -1) {
            field_a = (rh) null;
        }
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (param1 < var5.field_d.length) {
                return var5.field_d[param1];
            }
            param1 = param1 - (-1 + var5.field_d.length);
        }
        return 0;
    }

    static {
        field_b = new int[256];
        field_d = new fh(0, 2, 2, 1);
    }
}
