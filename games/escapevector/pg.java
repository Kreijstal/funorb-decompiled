/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pg {
    static int field_d;
    static String field_e;
    static boolean field_b;
    static String field_f;
    vl[] field_a;
    static pj field_c;

    final int a(int param0, int param1) {
        int var3 = 0;
        vl var4 = null;
        int var5 = EscapeVector.field_A;
        for (var3 = param1; var3 < this.field_a.length; var3++) {
            var4 = this.field_a[var3];
            if (param0 < var4.field_b.length) {
                return var3;
            }
            param0 = param0 - (var4.field_b.length + -1);
        }
        return this.field_a.length;
    }

    final int c(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (this.field_a == null) {
                break L1;
              } else {
                if ((this.field_a.length ^ -1) < -1) {
                  stackOut_6_0 = this.field_a[-1 + this.field_a.length].field_a + -this.field_a[0].field_d;
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
          return -63;
        }
    }

    final int a(byte param0) {
        java.awt.Container discarded$2 = null;
        int var2 = 0;
        vl[] var3 = null;
        int var4 = 0;
        vl var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          if (param0 == -112) {
            break L0;
          } else {
            discarded$2 = pg.a(72);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (this.field_a != null) {
            var3 = this.field_a;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b(119);
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

    final int a(int param0, int param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 == -21446) {
                break L1;
              } else {
                this.field_a = (vl[]) null;
                break L1;
              }
            }
            var5_int = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L2: while (true) {
              if (var7 <= var8) {
                if (var5_int > 0) {
                  stackOut_17_0 = (param3 + -param1 << -389338296) / var5_int;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  return 0;
                }
              } else {
                L3: {
                  var9 = param2.charAt(var8);
                  if (var9 != 60) {
                    if (62 == var9) {
                      var6 = 0;
                      break L3;
                    } else {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L3;
                        } else {
                          var8++;
                          continue L2;
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
            stackOut_19_0 = (RuntimeException) (var5);
            stackOut_19_1 = new StringBuilder().append("pg.K(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_d = -128;
        }
        field_e = null;
        field_c = null;
        field_f = null;
    }

    final static java.awt.Container a(int param0) {
        if (param0 != -1) {
            return (java.awt.Container) null;
        }
        if (qj.field_i != null) {
            return (java.awt.Container) ((Object) qj.field_i);
        }
        return (java.awt.Container) ((Object) oc.d((byte) -119));
    }

    final int a(byte param0, int param1) {
        vl var5 = null;
        int var4 = 0;
        int var6 = EscapeVector.field_A;
        vl[] var7 = this.field_a;
        vl[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (param1 < var5.field_b.length) {
                return var5.field_b[param1];
            }
            param1 = param1 - (var5.field_b.length + -1);
        }
        var4 = 79 % ((60 - param0) / 62);
        return 0;
    }

    final int a(byte param0, int param1, int param2) {
        int discarded$2 = 0;
        int var4 = 0;
        int var5 = 0;
        vl var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = EscapeVector.field_A;
          if (null == this.field_a) {
            break L0;
          } else {
            if (-1 == (this.field_a.length ^ -1)) {
              break L0;
            } else {
              if (this.field_a[0].field_d > param2) {
                break L0;
              } else {
                if (this.field_a[this.field_a.length - 1].field_a < param2) {
                  return -1;
                } else {
                  if (1 == this.field_a.length) {
                    return this.field_a[0].a((byte) 52, param1);
                  } else {
                    L1: {
                      var4 = 0;
                      if (param0 >= 8) {
                        break L1;
                      } else {
                        discarded$2 = this.a((byte) 53, -122, 65);
                        break L1;
                      }
                    }
                    var5 = 0;
                    L2: while (true) {
                      if (this.field_a.length <= var5) {
                        return -1;
                      } else {
                        L3: {
                          var6 = this.field_a[var5];
                          if (param2 < var6.field_d) {
                            break L3;
                          } else {
                            if (param2 > var6.field_a) {
                              break L3;
                            } else {
                              var7 = var6.a((byte) 52, param1);
                              if (-1 == var7) {
                                return -1;
                              } else {
                                return var7 + var4;
                              }
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_b.length);
                        var5++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    static {
        field_f = "Unpacking graphics";
        field_e = null;
    }
}
