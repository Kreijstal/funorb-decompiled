/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static int field_a;

    od(uq param0, int param1, int param2, int param3) {
    }

    final static int a(boolean param0, mj param1) {
        if (!param0) {
            return 25;
        }
        if (mj.field_g == param1) {
            return 5120;
        }
        if (param1 == mj.field_i) {
            return 5122;
        }
        if (mj.field_c == param1) {
            return 5124;
        }
        if (mj.field_f == param1) {
            return 5121;
        }
        if (mj.field_e == param1) {
            return 5123;
        }
        if (mj.field_a == param1) {
            return 5125;
        }
        if (mj.field_b == param1) {
            return 5131;
        }
        if (!(param1 != mj.field_d)) {
            return 5126;
        }
        throw new IllegalArgumentException("");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
