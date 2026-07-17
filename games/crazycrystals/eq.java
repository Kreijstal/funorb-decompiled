/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends rl {
    static int[] field_l;
    static dl field_k;
    static int field_j;

    final pb b(byte param0) {
        if (param0 > -127) {
            eq.b(68, -24);
            return (pb) (Object) new gd();
        }
        return (pb) (Object) new gd();
    }

    public static void f(int param0) {
        field_k = null;
        if (param0 != 1) {
            int discarded$0 = eq.c(-34, (byte) 28);
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static int c(int param0, byte param1) {
        int var2 = 0;
        L0: {
          var2 = 0;
          if (param0 < 0) {
            var2 += 16;
            param0 = param0 >>> 16;
            break L0;
          } else {
            if (param0 < 65536) {
              break L0;
            } else {
              L1: {
                var2 += 16;
                param0 = param0 >>> 16;
                if (param0 < 256) {
                  break L1;
                } else {
                  var2 += 8;
                  param0 = param0 >>> 8;
                  break L1;
                }
              }
              if (param1 == 100) {
                L2: {
                  if (param0 < 16) {
                    break L2;
                  } else {
                    param0 = param0 >>> 4;
                    var2 += 4;
                    break L2;
                  }
                }
                L3: {
                  if (param0 >= 4) {
                    param0 = param0 >>> 2;
                    var2 += 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0 >= 1) {
                    var2++;
                    param0 = param0 >>> 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return param0 + var2;
              } else {
                L5: {
                  eq.f(80);
                  if (param0 < 16) {
                    break L5;
                  } else {
                    param0 = param0 >>> 4;
                    var2 += 4;
                    break L5;
                  }
                }
                L6: {
                  if (param0 >= 4) {
                    param0 = param0 >>> 2;
                    var2 += 2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param0 >= 1) {
                    var2++;
                    param0 = param0 >>> 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return param0 + var2;
              }
            }
          }
        }
        L8: {
          if (param0 < 256) {
            break L8;
          } else {
            var2 += 8;
            param0 = param0 >>> 8;
            break L8;
          }
        }
        if (param1 != 100) {
          L9: {
            eq.f(80);
            if (param0 < 16) {
              break L9;
            } else {
              param0 = param0 >>> 4;
              var2 += 4;
              break L9;
            }
          }
          L10: {
            if (param0 >= 4) {
              param0 = param0 >>> 2;
              var2 += 2;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (param0 >= 1) {
              var2++;
              param0 = param0 >>> 1;
              break L11;
            } else {
              break L11;
            }
          }
          return param0 + var2;
        } else {
          L12: {
            if (param0 < 16) {
              break L12;
            } else {
              param0 = param0 >>> 4;
              var2 += 4;
              break L12;
            }
          }
          L13: {
            if (param0 >= 4) {
              param0 = param0 >>> 2;
              var2 += 2;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            if (param0 >= 1) {
              var2++;
              param0 = param0 >>> 1;
              break L14;
            } else {
              break L14;
            }
          }
          return param0 + var2;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        pd.field_g[param1] = pd.field_g[param1] + 10 * param2;
        if (!param0) {
            eq.b(43, -88);
        }
    }

    final static void b(int param0, int param1) {
        md var2 = tp.field_f;
        var2.d(param0 ^ 10, param1);
        var2.a(true, 1);
        var2.a(true, param0);
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object stackIn_2_0 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var6_int = -6 + (int)(Math.random() * 12.99);
            if (!param0) {
              var7 = (int)(100.0 * Math.pow(2.0, (double)var6_int / 12.0));
              tb.field_d.a(qp.field_i, var7, 48 * gi.field_m, param3);
              ph.a(10, (byte) 107, param1, param4);
              stackOut_3_0 = bm.field_g;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (f) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("eq.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    eq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[]{1, 2, 3, 5, 10, 1, 3, 5, 1, 2, 5, 10, 5, 2, 5, 10, 1};
        field_k = new dl(270, 70);
    }
}
