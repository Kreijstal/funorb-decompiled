/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static String field_a;

    final static void a(int param0) {
        Object var1_ref_Object = null;
        int var1 = 0;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == sf.field_c) {
          var1 = 36 / ((68 - param0) / 48);
          return;
        } else {
          var1_ref_Object = (Object) (Object) sf.field_c;
          synchronized (var1_ref_Object) {
            L0: {
              sf.field_c = null;
              break L0;
            }
          }
          var1 = 36 / ((68 - param0) / 48);
          return;
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -14755) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play free version";
    }
}
