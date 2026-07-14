/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static int field_g;
    private String field_e;
    static int[] field_c;
    static String field_a;
    static dl field_b;
    static int field_f;
    static boolean field_d;

    final static void a(ca param0, int param1, int param2) {
        gn.field_Q.b(param2, (jb) (Object) param0);
        nh.a(param1, (byte) -94, param0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(boolean param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(param0);
        param1.addKeyListener((java.awt.event.KeyListener) (Object) uf.field_c);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) uf.field_c);
    }

    final boolean a(int param0, String param1) {
        Object var4 = null;
        if (param0 != 1) {
          var4 = null;
          boolean discarded$2 = ((mb) this).a(-109, (String) null);
          return ((mb) this).field_e.equals((Object) (Object) param1);
        } else {
          return ((mb) this).field_e.equals((Object) (Object) param1);
        }
    }

    mb(String param0) {
        ((mb) this).field_e = param0;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 11458) {
            Object var2 = null;
            mb.a(false, (java.awt.Component) null);
        }
    }

    final void a(int param0, java.applet.Applet param1) {
        ab.a(param1, 31536000L, "jagex-last-login-method", param0 + -53, ((mb) this).field_e);
        if (param0 != 1) {
            ((mb) this).field_e = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{0, 1, 2, 3, 0, 1, 2, 3, 3, 1, 0, 3, 2, 1, 0, 3, 1, 0, 0, 0, 0, 0, 0};
        field_a = "You cannot play these levels yet.";
    }
}
