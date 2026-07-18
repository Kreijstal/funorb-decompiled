/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends fc {
    static kk field_l;
    byte[] field_k;
    static int field_j;
    static wj field_i;

    final static void a(long param0) {
        if (0L < param0) {
          if (param0 % 10L == 0L) {
            pf.a(3, -1L + param0);
            pf.a(3, 1L);
            return;
          } else {
            pf.a(3, param0);
            return;
          }
        } else {
          return;
        }
    }

    wl(byte[] param0) {
        try {
            ((wl) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "wl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d() {
        int var1 = 0;
        field_i = null;
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 5;
    }
}
