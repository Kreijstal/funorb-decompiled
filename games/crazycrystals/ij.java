/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ij extends jb {
    long field_k;
    ij field_g;
    ij field_j;
    private static long[] field_f;
    static boolean field_i;
    static boolean field_h;

    final static long a(boolean param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        long stackIn_6_0 = 0L;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_5_0 = 0L;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0L;
              var5 = 0;
              if (param0) {
                break L1;
              } else {
                field_h = false;
                break L1;
              }
            }
            L2: while (true) {
              if (var2_int <= var5) {
                stackOut_5_0 = var3;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var3 = (long)dg.a(param1.charAt(var5), 17176) + -var3 + (var3 << 5);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("ij.H(").append(param0).append(44);
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
          throw dn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, int param2, f[][] param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            var4_int = -2 + -param2 + param3.length;
            L1: while (true) {
              if (1 + param2 > var4_int) {
                var4_int = param3.length - param2 + param1;
                L2: while (true) {
                  if (var4_int < 1 + param2) {
                    var4_int = param2 + 1;
                    L3: while (true) {
                      if (var4_int >= -1 + -param2 + param3.length) {
                        ja.a(param2, param3, param0, true, 1);
                        break L0;
                      } else {
                        var5 = 1 + param0;
                        L4: while (true) {
                          if (param3[0].length + -param0 + -1 <= var5) {
                            var4_int++;
                            continue L3;
                          } else {
                            param3[var4_int][var5] = param3[var4_int][var5].a(var4_int, param3, false, var5).c(-1);
                            var5++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var5 = param0 - -1;
                    L5: while (true) {
                      if (var5 >= param3[0].length - param0 - 1) {
                        var4_int--;
                        continue L2;
                      } else {
                        param3[var4_int][var5].a(param3, var5, var4_int, -100);
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var5 = 1 + param0;
                L6: while (true) {
                  if (-1 + -param0 + param3[0].length <= var5) {
                    var4_int--;
                    continue L1;
                  } else {
                    param3[var4_int][var5] = param3[var4_int][var5].a(110, var4_int, param3, var5);
                    var5++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("ij.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
            ij.d(31);
        }
        field_f = null;
    }

    final void a(int param0) {
        if (!(null != ((ij) this).field_g)) {
            return;
        }
        ((ij) this).field_g.field_j = ((ij) this).field_j;
        ((ij) this).field_j.field_g = ((ij) this).field_g;
        if (param0 != 1) {
            ((ij) this).a(37);
        }
        ((ij) this).field_j = null;
        ((ij) this).field_g = null;
    }

    protected ij() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_f = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            field_h = false;
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_f[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L) != 1L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
