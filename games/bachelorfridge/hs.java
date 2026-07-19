/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hs {
    int field_d;
    int field_b;
    private cda[] field_a;
    static String field_c;
    private su field_e;

    final static boolean a(int param0) {
        if (!(lna.field_q)) {
            return false;
        }
        int var1 = 114 % ((param0 - 0) / 55);
        if (gk.field_d == 0) {
            return true;
        }
        return false;
    }

    final nla a(int param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var12 = 0;
        int var13 = 0;
        nla var14 = null;
        nla var15 = null;
        dha var16 = null;
        dha var17 = null;
        L0: {
          var13 = BachelorFridge.field_y;
          var14 = new nla();
          var15 = var14;
          var4 = -13 / ((param1 - 34) / 41);
          var5 = this.a(param0, 376);
          if (param0 != this.field_a[var5].field_a) {
            var6 = 0;
            L1: while (true) {
              if (var6 >= 11) {
                break L0;
              } else {
                var7 = (double)this.a((byte) -95, param0);
                var9 = (double)(param0 - this.field_a[var5].field_a);
                var16 = this.field_e.field_f[var6][var5].a(var9 / var7, 81);
                var15.field_g[var6].field_h = var16.field_c;
                var15.field_g[var6].field_l = var16.field_a;
                var17 = this.field_e.field_d[var6][var5].a(var9 / var7, 72);
                var15.field_g[var6].field_d = var17.field_c;
                var15.field_g[var6].field_e = var17.field_a;
                var12 = this.field_e.field_b[var6][var5].a((int)var9, (byte) -52);
                var15.field_g[var6].field_j = var12;
                var6++;
                continue L1;
              }
            }
          } else {
            var14.a(this.field_a[var5], true);
            break L0;
          }
        }
        return var15;
    }

    private final int a(byte param0, int param1) {
        nla discarded$2 = null;
        int var3 = 0;
        L0: {
          if (param0 == -95) {
            break L0;
          } else {
            discarded$2 = this.a(-51, (byte) 112);
            break L0;
          }
        }
        L1: {
          var3 = this.a(param1, 376);
          if (null == this.field_a[var3]) {
            break L1;
          } else {
            if (null != this.field_a[var3 + 1]) {
              return this.field_a[var3 + 1].field_a + -this.field_a[var3].field_a;
            } else {
              break L1;
            }
          }
        }
        return -1;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param1 == 376) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= this.field_a.length) {
              return 0;
            } else {
              if (this.field_a[var3] != null) {
                if (this.field_a[var3].field_a > param0) {
                  return -1 + var3;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return 113;
        }
    }

    final static boolean a(char param0, int param1) {
        if (param0 >= 32) {
            if (param0 <= 126) {
                return true;
            }
        }
        if (param1 != 376) {
            return false;
        }
        if (param0 >= 160) {
            if (param0 <= 255) {
                return true;
            }
        }
        if (param0 != 8364) {
            if (338 != param0) {
                if (8212 != param0) {
                    if (param0 != 339) {
                        if (376 != param0) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    final static boolean a(boolean param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = 0;
            if (!param0) {
              L1: while (true) {
                if ((var2_int ^ -1) <= -9) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-1 != (param1[var2_int] ^ -1)) {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var2_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("hs.G(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    hs(int param0, int param1, cda[] param2, int param3) {
        try {
            this.field_a = param2;
            this.field_b = param3;
            this.field_d = param1;
            this.field_e = new su(this.field_a);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hs.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -127) {
            field_c = (String) null;
        }
    }

    static {
        field_c = "Cleared!";
    }
}
