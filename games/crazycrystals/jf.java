/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static volatile int field_a;
    static dl[] field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_a = 1;
        }
    }

    final static wm a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = kh.field_c;
        if (param2 != 0) {
            return (wm) null;
        }
        int var6 = kh.field_b;
        int var7 = kh.field_g;
        if (!(param3 <= var7)) {
            param3 = var7;
        }
        if (var5 > param1) {
            param1 = var5;
        }
        if (var6 > param4) {
            param4 = var6;
        }
        int var8 = kh.field_j;
        if (var8 < param0) {
            param0 = var8;
        }
        if (param1 >= param3) {
            return null;
        }
        if (!(param0 <= param4)) {
            kh.d(param1, param4, param3, param0);
            return new wm(var5, var6, var7, var8);
        }
        return null;
    }

    static {
        field_a = 0;
    }
}
