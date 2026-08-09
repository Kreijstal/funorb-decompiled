/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    final static void a(int param0) {
        pha var3 = null;
        int var2 = TombRacer.field_G ? 1 : 0;
        qa.field_o = false;
        uu.field_a = null;
        ifa.field_n = null;
        if (param0 > -94) {
            return;
        }
        try {
            if (null != uma.field_b) {
                uma.field_b.d(8);
                uma.field_b = null;
            }
            fua.field_a = null;
            if (asa.field_j != null) {
                asa.field_j.d(8);
                asa.field_j = null;
            }
            jb.field_K = null;
            if (!(null == qha.field_g)) {
                qha.field_g.d(8);
                qha.field_g = null;
            }
            tc.field_d = null;
            if (fua.field_a != null) {
                var3 = (pha) ((Object) fua.field_a.b(-91));
                while (var3 != null) {
                    var3.c(-7975);
                    var3 = (pha) ((Object) fua.field_a.a((byte) -112));
                }
                fua.field_a = null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ig.B(" + param0 + ')');
        }
    }

    final static void a(int param0, od param1, od param2) {
        try {
            if (null != param1.field_f) {
                param1.c(-7975);
            }
            int var3_int = -105 % ((-33 - param0) / 48);
            param1.field_g = param2.field_g;
            param1.field_f = param2;
            param1.field_f.field_g = param1;
            param1.field_g.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ig.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
