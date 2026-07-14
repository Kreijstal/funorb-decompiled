/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static ha[] field_e;
    static boolean field_h;
    int field_g;
    boolean field_a;
    static int[][] field_b;
    String field_f;
    static String field_d;
    String[] field_c;
    boolean field_i;

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var8 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = Confined.field_J ? 1 : 0;
        if ((param0 ^ -1) >= -1) {
            var4 = param1;
        } else {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; var5_int < param2; var5_int++) {
                var8[var5_int] = param1[param0 + var5_int];
            }
        }
        fd var5 = new fd();
        if (param3 != -26879) {
            return null;
        }
        var5.b((byte) -78);
        var5.a((long)(param2 * 8), param3 ^ -26871, var4);
        byte[] var6 = new byte[64];
        var5.a(var6, 0, (byte) 3);
        return var6;
    }

    final static int a(int param0, byte[] param1, int param2) {
        if (param2 >= -80) {
            return 80;
        }
        return ah.a(param1, 0, param0, (byte) -124);
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        int var1 = -37 / ((param0 - -64) / 46);
        field_b = null;
    }

    in(boolean param0) {
        ((in) this).field_a = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_e = new ha[255];
        field_h = false;
        for (var0 = 0; var0 < field_e.length; var0++) {
            field_e[var0] = new ha();
        }
        field_d = "Accept";
    }
}
