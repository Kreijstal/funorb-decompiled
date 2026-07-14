/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends pu {
    static sga field_n;
    static long[] field_l;
    static String field_m;
    static sna field_o;

    final static void c(int param0) {
        int var2 = -3 / ((param0 - 19) / 61);
        gb var1 = (gb) (Object) ja.field_s.b((byte) 90);
        if (var1 == null) {
            vc.a((byte) -72);
            return;
        }
        pf var3 = ig.field_m;
        int discarded$0 = var3.f(-64);
        int discarded$1 = var3.f(48);
        int discarded$2 = var3.f(-108);
        int discarded$3 = var3.f(111);
        var1.a(false);
    }

    final static void a(int param0, byte[] param1, int param2) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        int var3 = param2;
        int[] var4 = new int[256];
        for (var5 = 0; (var5 ^ -1) > -257; var5++) {
            var3++;
            var4[var5] = dda.a(255, (int) param1[var3]);
        }
        // wide iinc 3 256
        int var7 = 0;
        var5 = var7;
        while (-257 < (var7 ^ -1)) {
            param1[var3] = (byte)(param1[var3] + -param0);
            var3 = var3 + var4[var7];
            var7++;
        }
    }

    public static void b(int param0) {
        field_m = null;
        if (param0 != 0) {
            p.b(111);
        }
        field_l = null;
        field_n = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new long[1000];
        field_m = "Ask to join <%0>'s game";
    }
}
