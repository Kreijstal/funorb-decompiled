/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static int[] field_d;
    static int field_a;
    static gk field_f;
    static gk field_g;
    static int field_c;
    static dm field_b;
    static String field_e;

    final static void b(int param0, int param1) {
        lj.field_a = param1 * param0 / 50;
        fj.field_o = param0 * 4 / 50;
    }

    final static boolean a(int param0, int param1) {
        if (0 != (param0 ^ -1)) {
            int var2 = 43 / ((24 - param1) / 50);
            return (field_a & 1 << param0) != 0 ? true : false;
        }
        return true;
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 987210721;
        param1 = param1 | param1 >>> -1646334462;
        if (param0 > 88) {
            param1 = param1 | param1 >>> 635733380;
            param1 = param1 | param1 >>> 573600264;
            param1 = param1 | param1 >>> -415367664;
            return param1 - -1;
        }
        return -15;
    }

    final static void a(boolean param0, int param1) {
        j.field_lb = t.field_k[param1];
        ri.field_c = tf.field_e[param1];
        vc.field_g = le.field_b[param1];
        if (!param0) {
            field_d = (int[]) null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
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
        field_e = "Email is valid";
        field_c = 0;
    }
}
