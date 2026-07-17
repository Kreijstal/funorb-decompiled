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
        int var1 = 114 % (param0 / 55);
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
          if (param0 != ((hs) this).field_a[var5].field_a) {
            var6 = 0;
            L1: while (true) {
              if (var6 >= 11) {
                break L0;
              } else {
                var7 = (double)this.a((byte) -95, param0);
                var9 = (double)(param0 - ((hs) this).field_a[var5].field_a);
                var16 = ((hs) this).field_e.field_f[var6][var5].a(var9 / var7, 81);
                var15.field_g[var6].field_h = var16.field_c;
                var15.field_g[var6].field_l = var16.field_a;
                var17 = ((hs) this).field_e.field_d[var6][var5].a(var9 / var7, 72);
                var15.field_g[var6].field_d = var17.field_c;
                var15.field_g[var6].field_e = var17.field_a;
                var12 = ((hs) this).field_e.field_b[var6][var5].a((int)var9, (byte) -52);
                var15.field_g[var6].field_j = var12;
                var6++;
                continue L1;
              }
            }
          } else {
            var14.a(((hs) this).field_a[var5], true);
            break L0;
          }
        }
        return var15;
    }

    private final int a(byte param0, int param1) {
        int var3 = 0;
        L0: {
          var3 = this.a(param1, 376);
          if (null == ((hs) this).field_a[var3]) {
            break L0;
          } else {
            if (null != ((hs) this).field_a[var3 + 1]) {
              return ((hs) this).field_a[var3 + 1].field_a + -((hs) this).field_a[var3].field_a;
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((hs) this).field_a.length) {
            return 0;
          } else {
            if (((hs) this).field_a[var3] != null) {
              if (((hs) this).field_a[var3].field_a > param0) {
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
    }

    final static boolean a(char param0) {
        if (param0 >= 32) {
            if (param0 <= 126) {
                return true;
            }
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
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 8) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (param1[var2_int] != 0) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  var2_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("hs.G(").append(0).append(44);
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    hs(int param0, int param1, cda[] param2, int param3) {
        try {
            ((hs) this).field_a = param2;
            ((hs) this).field_b = param3;
            ((hs) this).field_d = param1;
            ((hs) this).field_e = new su(((hs) this).field_a);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hs.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public static void a() {
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Cleared!";
    }
}
