/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fi {
    static String field_a;
    static int field_d;
    static bf field_e;
    static boolean field_b;
    static rk field_c;
    static hl[] field_g;
    static boolean field_h;
    static ue field_f;

    abstract int a(byte param0, long param1);

    final static void c(byte param0) {
        int var3 = 0;
        int var4 = StarCannon.field_A;
        if (param0 != -96) {
            field_g = null;
        }
        hl var1 = new hl(540, 140);
        bc.a(var1, 26095);
        gl.b();
        ki.b();
        qb.field_h = 0;
        nc.a(-1196777214);
        hl var2 = var1.c();
        for (var3 = 0; (var3 ^ -1) > -16; var3++) {
            var2.b(-2, -2, 16777215);
            ki.a(4, 4, 0, 0, 540, 140);
        }
        ak.field_f.e();
        var1.a(0, 0);
        wf.a(-71);
    }

    final static int a(boolean param0, int param1, String param2, String param3, int param4, String param5, byte param6) {
        ma var7 = new ma(param2);
        ma var8 = new ma(param5);
        if (param6 != -3) {
            return 63;
        }
        return bf.a(param4, param0, param3, (byte) 6, var8, var7, param1);
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        if (param0 != 0) {
            fi.c((byte) -66);
        }
        field_g = null;
        field_f = null;
        field_c = null;
    }

    final int a(long param0, int param1) {
        int var4 = 55 / ((param1 - -30) / 48);
        long var5 = ((fi) this).a((byte) -51);
        if (!(0L >= var5)) {
            uc.a(-104, var5);
        }
        return ((fi) this).a((byte) 109, param0);
    }

    abstract void b(byte param0);

    abstract long a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_a = "Collect power orbs to upgrade the Nova Ray's systems.";
        field_b = false;
        field_c = new rk();
    }
}
