/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static int[] field_d;
    static int field_a;
    static gk field_f;
    static gk field_g;
    static int field_c;
    static Sprite field_b;
    static String createEmailValidText;

    final static void configureMenuPointerRepeat(int rateScale, int baseInitialDelay) {
        lj.menuPointerInitialRepeatDelay = baseInitialDelay * rateScale / 50;
        fj.menuPointerRepeatInterval = rateScale * 4 / 50;
    }

    final static boolean a(int param0, int param1) {
        if (param0 != -1) {
            int var2 = 43 / ((24 - param1) / 50);
            return (field_a & 1 << param0) != 0 ? true : false;
        }
        return true;
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        if (param0 > 88) {
            param1 = param1 | param1 >>> 4;
            param1 = param1 | param1 >>> 8;
            param1 = param1 | param1 >>> 16;
            return param1 + 1;
        }
        return -15;
    }

    final static void a(boolean param0, int param1) {
        j.field_lb = InstrumentEnvelope.field_k[param1];
        ri.field_c = IntrusiveDeque.field_e[param1];
        vc.field_g = PointerInputListener.field_b[param1];
        if (!param0) {
            field_d = (int[]) null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        createEmailValidText = null;
        if (param0 == 50) {
            field_d = null;
            field_g = null;
            field_f = null;
            return;
        }
        field_d = (int[]) null;
        field_d = null;
        field_g = null;
        field_f = null;
    }

    static {
        field_d = new int[4];
        field_a = 0;
        field_f = new gk();
        field_g = new gk();
        createEmailValidText = "Email is valid";
        field_c = 0;
    }
}
