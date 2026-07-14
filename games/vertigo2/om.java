/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends ml {
    static int field_B;
    static int field_D;
    static String field_C;

    om(int param0) {
        this(qc.field_x, param0);
    }

    private om(cc param0, int param1) {
        super(param0, param1);
    }

    final static void a(String param0, byte param1) {
        int var2 = -48 / ((-83 - param1) / 39);
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final String a(byte param0, iq param1) {
        if (param0 != -90) {
            field_D = -38;
        }
        return rh.a((byte) -95, param1.field_w.length(), '*');
    }

    final static int a(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var4 = -1;
        for (var5 = param1; var5 < param0; var5++) {
            var4 = var4 >>> 417678216 ^ hn.field_r[(param2[var5] ^ var4) & 255];
        }
        if (param3 != 255) {
            om.c((byte) 93);
        }
        var4 = var4 ^ -1;
        return var4;
    }

    public static void c(byte param0) {
        if (param0 < 76) {
            Object var2 = null;
            om.a((String) null, (byte) -77);
        }
        field_C = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Unable to connect to the data server. Please check any firewall you are using.";
        field_B = 84;
    }
}
