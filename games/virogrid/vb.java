/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static int field_h;
    static ck field_c;
    static int[] field_j;
    String field_k;
    int field_m;
    String field_e;
    static String field_g;
    eh field_f;
    String field_b;
    static int[] field_a;
    static String field_i;
    static String field_d;
    static mg field_l;

    final static lc a(byte param0, int param1) {
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        lc[] var5 = cc.a((byte) -104);
        lc[] var2 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
            if (var5[var3].field_a == param1) {
                return var5[var3];
            }
        }
        if (param0 == 0) {
            return null;
        }
        return (lc) null;
    }

    final static void a(byte param0) {
        he.field_Xb = null;
        int var1 = -40 % ((param0 - 23) / 51);
    }

    public static void b(byte param0) {
        field_i = null;
        field_a = null;
        field_d = null;
        field_j = null;
        int var1 = -23 % ((61 - param0) / 41);
        field_c = null;
        field_g = null;
        field_l = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 != 90) {
            return;
        }
        ag.field_e = param4;
        vc.field_bb = param0;
        re.field_m = param2;
        mi.field_c = param3;
    }

    private vb() throws Throwable {
        throw new Error();
    }

    final static void b(int param0, byte param1, int param2, int param3, int param4) {
        ej.field_L = param0;
        bn.field_b = param3;
        if (param1 != -127) {
            vb.b((byte) 0);
        }
        di.field_o = param2;
        eg.field_l = param4;
    }

    static {
        int var0 = 0;
        field_g = "Cancel";
        field_j = new int[256];
        field_a = new int[256];
        for (var0 = 0; 256 > var0; var0++) {
            field_a[var0] = var0 * 1 - -(65536 * (var0 / 4)) - -(var0 / 4 * 256);
        }
        for (var0 = 0; 256 > var0; var0++) {
            field_j[var0] = var0 / 2 * 256 + 1 * (var0 / 2) - -(var0 / 2 * 65536);
        }
        field_i = "Zoom out";
        field_d = "Show all lobby chat";
    }
}
