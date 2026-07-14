/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hrb {
    static int field_a;
    static boolean field_b;
    private static String field_z;

    final int a(boolean param0, long param1) {
        long var4 = 0L;
        if (param0) {
          return 36;
        } else {
          L0: {
            var4 = ((hrb) this).a((byte) -81);
            if (0L < var4) {
              gdb.b(-96, var4);
              break L0;
            } else {
              break L0;
            }
          }
          return ((hrb) this).a(0, param1);
        }
    }

    abstract long a(byte param0);

    abstract void a(int param0);

    abstract int a(int param0, long param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "hrb.C(";
        field_a = 92;
    }
}
