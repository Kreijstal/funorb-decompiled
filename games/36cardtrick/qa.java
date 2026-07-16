/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static oh field_b;
    static int field_c;
    private String field_a;

    final static int a(boolean param0, String param1, String param2, int param3, String param4, boolean param5, int param6) {
        jk var7 = new jk(param1);
        if (!param5) {
            field_b = null;
        }
        jk var8 = new jk(param2);
        return pa.a(param4, var7, var8, param6, param3, 18, param0);
    }

    final static oe a(int param0, int param1, int param2, int param3, le param4, int param5) {
        if (param3 != 17651) {
            int discarded$0 = qa.a(-42, -119);
        }
        java.awt.Frame var8 = ej.a(param2, -3428, param4, param5, param0, param1);
        java.awt.Frame var6 = var8;
        if (var8 == null) {
            return null;
        }
        oe var7 = new oe();
        var7.field_c = var8;
        java.awt.Component discarded$1 = var7.field_c.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, 0, param5, param1);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    qa(String param0) {
        ((qa) this).field_a = param0;
    }

    final static int[] a(int param0, short[] param1) {
        int var3 = 0;
        int var4 = Main.field_T;
        int[] var6 = new int[param1.length];
        int[] var2 = var6;
        if (param0 > -32) {
            Object var5 = null;
            int discarded$0 = qa.a(false, (String) null, (String) null, -53, (String) null, true, -83);
        }
        for (var3 = 0; var3 < param1.length; var3++) {
            var6[var3] = bc.a(65535, (int) param1[var3]);
        }
        return var2;
    }

    final void a(java.applet.Applet param0, int param1) {
        uh.a(31536000L, 126, "jagex-last-login-method", ((qa) this).field_a, param0);
        if (param1 != 0) {
            ((qa) this).field_a = null;
        }
    }

    public static void a(byte param0) {
        if (param0 != -31) {
            field_b = null;
        }
        field_b = null;
    }

    final boolean a(boolean param0, String param1) {
        if (!param0) {
            int discarded$0 = qa.a(8, 57);
        }
        return ((qa) this).field_a.equals((Object) (Object) param1);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!((7 & param0) == 0)) {
            var2 = -(7 & param0) + 8;
        }
        int var3 = var2 + param0;
        if (param1 != 8) {
            field_b = null;
        }
        return var3;
    }

    final static void a(java.awt.Component param0, byte param1) {
        int var2 = -45 % ((46 - param1) / 47);
        param0.addMouseListener((java.awt.event.MouseListener) (Object) wc.field_B);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wc.field_B);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) wc.field_B);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
