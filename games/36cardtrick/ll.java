/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static String field_a;
    static String field_b;
    static String[] field_f;
    static String field_g;
    static qk field_e;
    static int field_c;
    static int field_d;

    final static void a(int param0, byte param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param2.getGraphics();
            gf.field_e.a(var4, param3, param0, (byte) 123);
            if (param1 != 115) {
                Object var5 = null;
                ll.a(95, (byte) 7, (java.awt.Canvas) null, 48);
            }
            var4.dispose();
        } catch (Exception exception) {
            param2.repaint();
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_f = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Password is valid";
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_c = 0;
        field_d = 0;
        field_b = "to return to the normal view.";
    }
}
