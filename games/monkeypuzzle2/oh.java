/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String field_a;
    static int field_c;
    static volatile boolean field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 4) {
            Object var2 = null;
            oh.a(-36, (byte) -57, -3, (java.awt.Canvas) null);
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 <= 50) {
            field_a = null;
            gk.field_e = param1;
            oi.field_f = param0;
            return;
        }
        gk.field_e = param1;
        oi.field_f = param0;
    }

    final static void a(int param0, byte param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        try {
            if (param1 < 11) {
                field_c = 89;
            }
            var4 = param3.getGraphics();
            ac.field_a.a(param2, 7, var4, param0);
            var4.dispose();
        } catch (Exception exception) {
            param3.repaint();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading music";
        field_b = false;
    }
}
