/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static long field_b;
    static String field_d;
    static go field_c;
    static uf field_a;

    public static void a(int param0) {
        int var1 = 2;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static byte[] a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        da var6 = new da(64);
        var6.i((byte) 0);
        var6.a(-90, 1, nd.field_e ? 1 : 0);
        var6.a(103, 1, ij.field_l ? 1 : 0);
        var6.a(81, 1, !on.field_s ? 0 : 1);
        int var2 = hk.field_d + ao.field_b * 4;
        var6.a(93, 4, var2);
        for (var3 = 1; 4 > var3; var3++) {
            ac.a(-110, var3, 0, var6);
        }
        for (var3 = 1; var3 < 4; var3++) {
            for (var4 = 0; 4 > var4; var4++) {
                ac.a(-98, var4, var3, var6);
            }
        }
        for (var3 = 0; var3 < 4; var3++) {
            dm.a(var6, var3, 255);
        }
        var6.h((byte) 0);
        return var6.field_i;
    }

    static {
    }
}
