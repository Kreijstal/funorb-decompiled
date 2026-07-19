/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static cd field_c;
    static float field_d;
    static Boolean field_a;
    static int field_b;

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 == -19495) {
          if (null == ji.field_c) {
            return;
          } else {
            var1 = ji.field_c;
            synchronized (var1) {
              L0: {
                ji.field_c = null;
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        int var1 = -112 % ((-73 - param0) / 51);
        field_c = null;
        field_a = null;
    }

    static {
        field_c = new cd();
    }
}
