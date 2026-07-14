/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ob {
    static rf field_a;
    static ed[] field_b;
    static hh field_d;
    static String field_c;

    public static void a(byte param0) {
        field_b = null;
        int var1 = -26 / ((param0 - 63) / 44);
        field_c = null;
        field_a = null;
        field_d = null;
    }

    abstract byte[] a(byte param0, int param1);

    abstract f a(int param0);

    abstract int a(int param0, int param1);

    final static ed[] a(int param0, int param1, int param2, int param3, int param4) {
        ed[] var6 = new ed[9];
        ed[] var5 = var6;
        var6[6] = of.a(param0, (byte) -87, param3);
        var5[3] = of.a(param0, (byte) -87, param3);
        var5[2] = of.a(param0, (byte) -87, param3);
        var5[param2] = of.a(param0, (byte) -87, param3);
        var5[0] = of.a(param0, (byte) -87, param3);
        var6[8] = of.a(param1, (byte) 104, param3);
        var5[7] = of.a(param1, (byte) 104, param3);
        var5[5] = of.a(param1, (byte) 104, param3);
        if (!(param4 == 0)) {
            var6[4] = of.a(param4, (byte) 97, 64);
        }
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ed[17];
        field_a = new rf();
        field_c = "Extra thrust";
    }
}
