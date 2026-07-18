/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static int[] field_b;
    static String field_d;
    static int[] field_a;
    static String field_c;
    static int field_e;

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null != pm.field_l) {
          var1 = (Object) (Object) pm.field_l;
          synchronized (var1) {
            L0: {
              pm.field_l = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[12];
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_d = "Main Menu";
        field_c = "Players";
    }
}
