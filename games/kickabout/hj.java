/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends js {
    static String field_g;
    static hd field_h;

    final void a(int param0, boolean param1) {
        on.a(0, 0, 640, 480, 65793);
        if (param0 != -5) {
            field_h = null;
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = -97 % ((38 - param0) / 60);
    }

    final boolean a(int param0, int param1, char param2) {
        if (param1 > -5) {
            hj.a(114);
            return false;
        }
        return false;
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        if (param2 > -28) {
            hj.a(-50);
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 <= 32) {
            return;
        }
        field_g = null;
    }

    hj() {
        super(-4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Start Game";
    }
}
