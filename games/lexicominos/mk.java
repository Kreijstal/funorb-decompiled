/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends kd {
    int field_i;
    static String field_l;
    static volatile long field_j;
    static int field_m;
    ij field_k;
    static cd field_h;

    final static void a(int param0) {
        if (!qg.field_d) {
          throw new IllegalStateException();
        } else {
          if (param0 != 14891) {
            return;
          } else {
            u.field_tb = true;
            q.a((byte) -69, true);
            ta.field_g = 0;
            return;
          }
        }
    }

    public static void a() {
        int var1 = 0;
        field_l = null;
        field_h = null;
    }

    mk(int param0, ij param1) {
        try {
            ((mk) this).field_i = param0;
            ((mk) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "mk.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Type your email address again to make sure it's correct";
        field_j = 0L;
    }
}
