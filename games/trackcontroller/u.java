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
          var2 = ((u) this).field_n;
          var3 = 0;
          if (param0 == 18132) {
            break L0;
          } else {
            field_l = null;
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
                  if (var5 < 0) {
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
                    var6.d(-(var6.field_s / 2) + ((u) this).field_j, -(var6.field_v / 2) + ((u) this).field_m, var7);
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
        Object stackIn_7_0 = null;
        oi stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        oi stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                stackOut_9_0 = fh.field_e;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var4 = param0.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (oi) (Object) stackIn_7_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("u.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 1 + 41);
        }
        return stackIn_10_0;
    }

    public static void a(byte param0) {
        field_k = null;
        field_l = null;
    }

    u(int param0, int param1) {
        ((u) this).field_m = param1;
        ((u) this).field_j = param0;
    }

    final boolean e(int param0) {
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        int fieldTemp$0 = ((u) this).field_n;
        ((u) this).field_n = ((u) this).field_n + 1;
        int var2 = fieldTemp$0;
        for (var3 = param0; var3 < v.field_g.length; var3++) {
            var2 = var2 - v.field_g[var3];
            if (var2 < 0) {
                return true;
            }
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = -1;
        field_l = new int[8192];
        field_k = ": ";
    }
}
