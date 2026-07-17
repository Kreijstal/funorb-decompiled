/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends dl {
    static String field_C;
    byte[] field_x;
    ah field_A;
    static int field_y;
    int field_B;
    static int field_z;
    static int field_D;

    final int f(int param0) {
        if (param0 != 8651) {
            field_C = null;
            if (!(!((qh) this).field_q)) {
                return 0;
            }
            return 100;
        }
        if (!(!((qh) this).field_q)) {
            return 0;
        }
        return 100;
    }

    final static String i() {
        return fg.field_m;
    }

    public static void b() {
        field_C = null;
    }

    final static void a(boolean param0, boolean param1) {
        ib.field_g = 0;
        ql.field_o = 0;
        bf.field_b = 0;
        td.field_i = hd.field_c;
        ul.field_G = new pl(2);
        ul.field_G.a(em.a(kc.field_b, false, ag.field_f), -1, param0, -81);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(param1 != 0)) {
            return 0;
        }
        if (param1 > 0) {
            var2 = 1;
            if (!(param1 <= 65535)) {
                var2 += 16;
                param1 = param1 >> 16;
            }
            if (!(255 >= param1)) {
                var2 += 8;
                param1 = param1 >> 8;
            }
            if (!(param1 <= 15)) {
                param1 = param1 >> 4;
                var2 += 4;
            }
            if (!(3 >= param1)) {
                param1 = param1 >> 2;
                var2 += 2;
            }
            if (param1 > 1) {
                param1 = param1 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (!(-65536 <= param1)) {
            param1 = param1 >> 16;
            var2 += 16;
        }
        if (param1 < -256) {
            var2 += 8;
            param1 = param1 >> 8;
        }
        if (param1 < -16) {
            param1 = param1 >> 4;
            var2 += 4;
        }
        if (!(param1 >= -4)) {
            param1 = param1 >> 2;
            var2 += 2;
        }
        if (param1 < -2) {
            var2++;
            param1 = param1 >> 1;
        }
        return var2;
    }

    final byte[] g(int param0) {
        if (!(!((qh) this).field_q)) {
            throw new RuntimeException();
        }
        if (param0 != 100) {
            return null;
        }
        return ((qh) this).field_x;
    }

    final static boolean j() {
        if (null == sg.field_h) {
            return false;
        }
        if (fh.field_b != rh.field_k) {
            return false;
        }
        return true;
    }

    final static boolean c(byte param0) {
        if (param0 < 31) {
            field_z = 27;
            return ci.field_f;
        }
        return ci.field_f;
    }

    qh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Log in / Create account";
        field_z = 0;
    }
}
