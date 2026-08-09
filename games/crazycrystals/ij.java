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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_6_0 = var3;
                break L0;
              } else {
                var3 = (long)dg.a(param1.charAt(var5), 17176) + -var3 + (var3 << 36304645);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("ij.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, int param2, f[][] param3) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
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
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("ij.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
            ij.d(31);
        }
        field_f = null;
    }

    final void a(int param0) {
        if (!(null != this.field_g)) {
            return;
        }
        this.field_g.field_j = this.field_j;
        this.field_j.field_g = this.field_g;
        if (param0 != 1) {
            this.a(37);
        }
        this.field_j = null;
        this.field_g = null;
    }

    protected ij() {
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_f = new long[256];
            var2 = 0;
            L0: while (true) {
              if ((var2 ^ -1) <= -257) {
                field_h = false;
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= 8) {
                    field_f[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((var0 & 1L ^ -1L) != -2L) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1937250497 ^ -3932672073523589310L;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
