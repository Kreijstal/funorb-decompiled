/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bkb {
    static java.applet.Applet field_b;
    static String field_a;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        int var1 = -115 / ((param0 - -34) / 45);
    }

    final static hkb a(int param0) {
        pe var10 = new pe(1);
        var10.a(var10.g((byte) -122) / 2, (byte) -66);
        var10.e(var10.m(1) / 2, 0);
        var10.b(-1, (byte) 23);
        int var2 = 131072;
        int var3 = var2;
        int var4 = 4096;
        cq var5 = new cq(-var4 + (-var2 + var10.g((byte) -122) / 2), -(var10.m(1) / 2) + var4);
        var5.field_e = var2;
        var5.field_d = var3;
        var10.a(5706, var5);
        var10.a((byte) -64, new rdb(var2 / 2 + var5.field_f, var3 / 2 + var5.field_g, 1));
        var10.a((byte) -95, new rdb(-(var2 / 2) + var5.field_f, var3 / 2 + var5.field_g, 1));
        var10.a((byte) -120, new rdb(var5.field_f + var2 / 2, var3 / 2 + var3 + var5.field_g, 1));
        var10.a((byte) -120, new rdb(-(var2 / 2) + var5.field_f, var5.field_g + (var3 - -(var3 / 2)), 1));
        cq var6 = new cq(var4 + -(var10.g((byte) -122) / 2), -var4 + (-var3 + var10.m(1) / 2));
        var6.field_e = var2;
        var6.field_d = var3;
        var10.a(5706, var6);
        var10.a((byte) -65, new rdb(var2 / 2 + var6.field_f, var6.field_g + var3 / 2, param0));
        var10.a((byte) -106, new rdb(var2 / 2 + var2 + var6.field_f, var3 / 2 + var6.field_g, 0));
        var10.a((byte) -54, new rdb(var6.field_f - -(var2 / 2), -var3 + var6.field_g - -(var3 / 2), 0));
        var10.a((byte) -54, new rdb(var2 / 2 + var2 + var6.field_f, -var3 + var6.field_g + var3 / 2, 0));
        bba var7 = new bba();
        var7.a((byte) -114, (wm) (Object) new iia(-1, 1));
        var7.a((rna) (Object) new lrb(-1, 0), true);
        var10.a(var7, -38);
        bba var8 = new bba();
        var8.a((byte) -124, (wm) (Object) new iia(-1, 0));
        var8.a((rna) (Object) new lrb(-1, 1), true);
        var10.a(var8, -38);
        hkb var9 = new hkb(var10);
        return var9;
    }

    protected bkb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
    }
}
