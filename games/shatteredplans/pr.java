/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr {
    static int[] field_d;
    static String field_e;
    static bi field_a;
    static qr field_c;
    static String field_b;
    static int field_g;
    static String field_f;

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) im.field_c);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) im.field_c);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "pr.C(" + (param0 != null ? "{...}" : "null") + 44 + -9194 + 41);
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        field_f = null;
    }

    final synchronized static long a(int param0) {
        long var1 = 0L;
        if (param0 == 14274) {
          var1 = System.currentTimeMillis();
          if (lh.field_z > var1) {
            wd.field_N = wd.field_N + (-var1 + lh.field_z);
            lh.field_z = var1;
            return var1 + wd.field_N;
          } else {
            lh.field_z = var1;
            return var1 + wd.field_N;
          }
        } else {
          var1 = System.currentTimeMillis();
          if (lh.field_z <= var1) {
            lh.field_z = var1;
            return var1 + wd.field_N;
          } else {
            wd.field_N = wd.field_N + (-var1 + lh.field_z);
            lh.field_z = var1;
            return var1 + wd.field_N;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Visit the Account Management section on the main site to view.";
        field_e = "You appear to be telling someone your password - please don't!";
        field_f = "Connection restored.";
    }
}
