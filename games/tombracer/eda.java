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
        if (param0 == 0) {
            var3 = baa.field_e;
            var2 = ska.field_r;
            kh.a(true, var2, var3);
            return;
        }
        if (param0 == 1) {
            var3 = tia.field_d;
            var2 = ska.field_r;
            kh.a(true, var2, var3);
            return;
        }
        if (param0 != 4) {
            if (2 == param0) {
                var2 = vk.field_d;
                var3 = baa.field_e;
                kh.a(true, var2, var3);
                return;
            }
            if (param0 == 3) {
                var2 = vk.field_d;
                var3 = tia.field_d;
                kh.a(true, var2, var3);
                return;
            }
            var3 = kva.field_s;
            var2 = vk.field_d;
            kh.a(true, var2, var3);
            return;
        }
        var3 = kva.field_s;
        var2 = ska.field_r;
        kh.a(true, var2, var3);
    }

    public static void a(int param0) {
        field_f = null;
    }

    static {
    }
}
