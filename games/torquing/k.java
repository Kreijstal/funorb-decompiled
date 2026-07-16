/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    int field_g;
    int field_a;
    static int field_e;
    static String field_h;
    static java.awt.Canvas field_d;
    static byte[] field_c;
    static String[] field_b;
    static String field_f;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int b(int param0) {
        int var1 = -3 % ((64 - param0) / 36);
        return po.field_w;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param1 != 1) {
            return;
        }
        if (ia.a(-22426, 0)) {
            param0 = 6;
        }
        if (param0 == 7) {
            ph.a(1, 1, 638, 239, 723726, 2303291);
            ph.a(1, 240, 638, 70, 2303291, 3487838);
            ph.a(1, 310, 638, 50, 3487838, 4739447);
            ph.a(1, 360, 638, 40, 4739447, 6712964);
            ph.a(1, 400, 638, 35, 6712964, 10063235);
            ph.a(1, 435, 638, 25, 10063235, 14721899);
            ph.a(1, 460, 638, 19, 14721899, 16359760);
        } else {
            var2 = 1208736;
            var3 = 13426923;
            if (4 == param0) {
                var2 = 1207964;
                var3 = 402741;
            }
            if (!((param0 ^ -1) != -7)) {
                var3 = 1207964;
                var2 = 402741;
            }
            ph.a(1, 1, 638, 478, var2, var3);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_d = null;
        field_c = null;
        int var1 = 1 % ((param0 - 18) / 53);
        field_f = null;
    }

    k(int param0, int param1, int param2, int param3) {
        ((k) this).field_g = param0;
        ((k) this).field_a = param3;
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = Torquing.field_u;
        int var3 = 1;
        while (param2 > 1) {
            if (0 != (param2 & 1)) {
                var3 = var3 * param1;
            }
            param2 = param2 >> 1;
            param1 = param1 * param1;
        }
        if (param0 != 25518) {
            return 43;
        }
        if (param2 == 1) {
            return param1 * var3;
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        int var2 = 0;
        field_h = "Unpacking graphics";
        field_e = 0;
        field_b = new String[]{"Junior Explorer", "Expert Explorer", "Master Explorer", "Extreme Explorer", "Survivor", "Master Survivor", "Junior Torquester", "Torquester", "Hoarder", "Expert Hoarder", "Master Hoarder", "Virtuoso Hoarder", "Diviner of Secrets", "Order of the Golden Torque", "Knife-edge Skillster", "Skin Artist", "Ghostlit"};
        int var0 = 0;
        field_c = new byte[32896];
        for (var1 = 0; (var1 ^ -1) > -257; var1++) {
            for (var2 = 0; var2 <= var1; var2++) {
                int incrementValue$0 = var0;
                var0++;
                field_c[incrementValue$0] = (byte)(int)(255.0 / Math.sqrt((double)((float)(var2 * var2 + var1 * var1 + 65535) / 65535.0f)));
            }
        }
        field_f = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
