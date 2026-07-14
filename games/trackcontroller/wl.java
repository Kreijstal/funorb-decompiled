/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends fc {
    static kk field_l;
    byte[] field_k;
    static int field_j;
    static wj field_i;

    final static void a(long param0, boolean param1) {
        if (!param1) {
          if (0L < param0) {
            if ((param0 % 10L ^ -1L) == -1L) {
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
        } else {
          wl.d(78);
          if (0L < param0) {
            if ((param0 % 10L ^ -1L) == -1L) {
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
    }

    wl(byte[] param0) {
        ((wl) this).field_k = param0;
    }

    public static void d(int param0) {
        int var1 = 11 % ((-39 - param0) / 40);
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
