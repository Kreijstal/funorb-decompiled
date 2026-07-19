/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends fc {
    private int field_m;
    private int field_j;
    static boolean field_i;
    static String field_k;
    static int[] field_l;
    private int field_n;
    static int field_o;

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qj var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TrackController.field_F ? 1 : 0;
          var2 = this.field_n;
          var3 = 0;
          if (param0 == 18132) {
            break L0;
          } else {
            field_l = (int[]) null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var3 >= v.field_g.length) {
              break L2;
            } else {
              var2 = var2 - v.field_g[var3];
              if (0 > var2) {
                var4 = 64;
                var5 = 3;
                L3: while (true) {
                  if (-1 < (var5 ^ -1)) {
                    break L2;
                  } else {
                    L4: {
                      var6 = hk.field_a[var5 + 4 * var3];
                      var7 = Math.min(255, (1 + var5) * var4);
                      if (v.field_g.length + -1 != var3) {
                        break L4;
                      } else {
                        var7 = var7 + (1 + var2) * var4 / v.field_g[var3];
                        break L4;
                      }
                    }
                    var6.d(-(var6.field_s / 2) + this.field_j, -(var6.field_v / 2) + this.field_m, var7);
                    var5--;
                    continue L3;
                  }
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
          return;
        }
    }

    final static oi a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        oi stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oi stackOut_11_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1) {
                break L1;
              } else {
                field_l = (int[]) null;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= var2_int) {
                stackOut_11_0 = fh.field_e;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = param0.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L2;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("u.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (oi) ((Object) stackIn_9_0);
        } else {
          return stackIn_12_0;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 36) {
            return;
        }
        field_k = null;
        field_l = null;
    }

    u(int param0, int param1) {
        this.field_m = param1;
        this.field_j = param0;
    }

    final boolean e(int param0) {
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        int var2 = fieldTemp$0;
        for (var3 = param0; var3 < v.field_g.length; var3++) {
            var2 = var2 - v.field_g[var3];
            if (-1 < (var2 ^ -1)) {
                return true;
            }
        }
        return false;
    }

    static {
        field_o = -1;
        field_l = new int[8192];
        field_k = ": ";
    }
}
