/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String field_e;
    static String field_g;
    static int[] field_c;
    static int field_d;
    static int field_a;
    static oh[][] field_b;
    static fg field_f;

    final static void b() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (vi.field_a != null) {
          var1 = (Object) (Object) vi.field_a;
          synchronized (var1) {
            L0: {
              vi.field_a = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a() {
        field_e = null;
        field_b = null;
        field_g = null;
        field_f = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Game";
        field_g = "Loading music";
    }
}
