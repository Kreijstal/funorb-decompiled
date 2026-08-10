/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static String field_a;

    final static void a(boolean param0, tc param1, int param2, int param3, java.awt.Component param4, int param5, int param6, qg param7) {
        try {
            vn.a(param2, param0, 10);
            int var8_int = 6 % ((-86 - param5) / 39);
            ub.field_n = vn.a(param7, param4, 0, param3);
            hm.field_n = vn.a(param7, param4, 1, param6);
            wa.field_j = new mb();
            kc.field_U = param6;
            hm.field_n.a(wa.field_j);
            ek.field_b = param1;
            ek.field_b.a(ql.field_d, 256);
            ub.field_n.a(ek.field_b);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "af.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_a = (String) null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0) {
        int[] var4 = null;
        int[] var1 = null;
        int[] var5 = null;
        int var6 = 0;
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        if (co.field_G == null) {
            return;
        }
        try {
            co.field_G = null;
            bd.field_f = 0;
            if (param0 < 5) {
                af.a(37);
            }
            if (gh.field_f) {
                ik.field_e.c();
                gh.field_f = false;
                nf.field_A = false;
                ik.field_e = null;
            }
            if (wa.field_a) {
                ll.field_i = new md();
                var4 = gj.field_c;
                var1 = var4;
                for (var2 = 0; var2 < 8; var2++) {
                    var4[var2] = 0;
                }
                var5 = bp.field_e;
                var1 = var5;
                var6 = 0;
                var2 = var6;
                while (-9 < (var6 ^ -1)) {
                    var5[var6] = 0;
                    var6++;
                }
                wa.field_a = false;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "af.B(" + param0 + ')');
        }
    }

    static {
        field_a = "Monster";
    }
}
