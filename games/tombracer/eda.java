/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eda {
    int field_a;
    int field_b;
    static da field_f;
    static int field_e;
    int field_c;
    int field_d;

    final static void a(int param0, boolean param1) {
        kea var3 = null;
        kia var2 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (-1 == (param0 ^ -1)) {
            var3 = baa.field_e;
            var2 = ska.field_r;
            if (var4 == 0) {
                kh.a(param1, var2, var3);
                return;
            }
        }
        if (-2 == (param0 ^ -1)) {
            var3 = tia.field_d;
            var2 = ska.field_r;
            if (var4 == 0) {
                kh.a(param1, var2, var3);
                return;
            }
        }
        if ((param0 ^ -1) != -5) {
            if (2 == param0) {
                var2 = vk.field_d;
                var3 = baa.field_e;
                if (var4 == 0) {
                    kh.a(param1, var2, var3);
                    return;
                }
            }
            if (-4 == (param0 ^ -1)) {
                var2 = vk.field_d;
                var3 = tia.field_d;
                if (var4 == 0) {
                    kh.a(param1, var2, var3);
                    return;
                }
            }
            var3 = kva.field_s;
            var2 = vk.field_d;
            if (var4 == 0) {
                kh.a(param1, var2, var3);
                return;
            }
        }
        var3 = kva.field_s;
        var2 = ska.field_r;
        kh.a(param1, var2, var3);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 < 24) {
            field_e = 15;
        }
    }

    static {
    }
}
