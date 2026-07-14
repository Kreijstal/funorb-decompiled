/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hs {
    private static int[] field_a;
    static String field_b;
    static float field_c;
    static String field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0, Class param1) {
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          L1: {
            var2 = -35 / ((param0 - 32) / 47);
            if (param1 == Integer.TYPE) {
              break L1;
            } else {
              if (param1 == Short.TYPE) {
                break L1;
              } else {
                if (Long.TYPE == param1) {
                  break L1;
                } else {
                  if (Byte.TYPE == param1) {
                    break L1;
                  } else {
                    if (Float.TYPE == param1) {
                      break L1;
                    } else {
                      if (Double.TYPE != param1) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L0;
        }
        return stackIn_9_0 != 0;
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 109 / ((-1 - param1) / 54);
        if (!(era.field_d == null)) {
            bea.d(bea.field_b, bea.field_h, -bea.field_b + bea.field_d, -bea.field_h + bea.field_k);
            era.field_d.b(64, param0);
        }
    }

    public static void a(int param0) {
        if (param0 != 32768) {
            hs.a(false, (byte) -65);
        }
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_a = new int[98304];
        for (var0 = 92682; (var0 ^ -1) <= -46342; var0--) {
            var6 = (long)(1 + (var0 << 275828993));
            var4 = (long)(-1 + (var0 << 1684793089));
            var2 = (int)((var4 * var4 >> -212534126) + -32768L);
            var3 = (int)((var6 * var6 >> -99973230) + -32768L);
            if (!(var3 < field_a.length)) {
                var3 = -1 + field_a.length;
            }
            for (var1 = (var2 ^ -1) > -1 ? 0 : var2; var1 <= var3; var1++) {
                field_a[var1] = var0;
            }
        }
        field_b = "Inviting <%0>";
        field_d = "Quick Chat lobby";
    }
}
