/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tf {
    static int field_a;
    static int field_b;
    private static String field_z;

    abstract long a(boolean param0);

    final int a(long param0, byte param1) {
        long var4 = 0L;
        int var6 = 0;
        var4 = ((tf) this).a(false);
        var6 = -1 % ((param1 - -69) / 33);
        if (0L < var4) {
          wf.a(var4, false);
          return ((tf) this).a(param0, 0);
        } else {
          return ((tf) this).a(param0, 0);
        }
    }

    abstract void a(int param0);

    abstract int a(long param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "tf.A(";
        field_a = 0;
    }
}
