/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static bd field_c;
    static int field_a;
    static b field_b;
    static byte[] field_d;

    final static int a(int[] param0, byte param1) {
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        int var2 = 0;
        for (var3 = 0; var3 < param0.length; var3++) {
            var2 = var2 + pa.b((byte) -19, param0[var3]);
        }
        if (param1 != 19) {
            field_d = null;
        }
        return var2;
    }

    final static void a(int param0, int param1, boolean param2, vm param3, int param4, int param5, String param6) {
        int var8 = HostileSpawn.field_I ? 1 : 0;
        int var7 = -1 + param6.length();
        if (param2) {
            return;
        }
        while (var7 >= 0) {
            param4 = param4 - param0;
            param3.a(param6.charAt(var7), param4, param1, param5);
            var7--;
        }
    }

    final static void a(byte param0, boolean param1) {
        hk.field_q = param1 ? true : false;
        if (param0 != -123) {
            return;
        }
        if (!hk.field_q) {
            jh.field_fb = gb.field_b;
            bh.field_b = 97;
            aa.field_a = be.field_i;
            fj.field_Jb = 99;
            ln.field_q = 98;
            la.field_g = ql.field_c;
            ha.field_v = 96;
            fj.field_Ob = m.field_h;
        } else {
            jh.field_fb = 99;
            la.field_g = 98;
            aa.field_a = 96;
            fj.field_Ob = 97;
            ln.field_q = ql.field_c;
            fj.field_Jb = gb.field_b;
            ha.field_v = be.field_i;
            bh.field_b = m.field_h;
        }
    }

    final static hm a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        hm var8 = new hm(param7, param5, param6, param0, param4, param1);
        ih.field_x.a((am) (Object) var8, 119);
        ci.a(param3, 2, var8);
        if (!param2) {
            field_d = null;
        }
        return var8;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 != 99) {
            field_c = null;
        }
    }

    final static void b(int param0) {
        if (param0 != -21931) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = null;
        field_d = new byte[520];
    }
}
