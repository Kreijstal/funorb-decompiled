/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    static String field_d;
    static bd field_f;
    static String[] field_a;
    static bd field_b;
    static int[] field_e;
    static int field_c;

    final static bd[] a(gb param0, int param1, int param2, boolean param3) {
        if (param3) {
            return null;
        }
        if (!rl.a(2884, param0, param1, param2)) {
            return null;
        }
        return pa.h(14);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -12586) {
            return;
        }
        field_d = null;
        field_e = null;
        field_a = null;
        field_f = null;
    }

    final static void a(p param0, int param1, int param2, int param3) {
        si.f(param1, param2, param0.field_e * 2 - -3, 65280, 128 - param0.field_e * 4);
        si.f(param1, param2, param0.field_e + 2, 16776960, 128 + -(4 * param0.field_e));
        si.f(param1, param2, param0.field_e / param3 + 1, 16777215, 128 - param0.field_e * 4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Checking";
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_c = 0;
    }
}
