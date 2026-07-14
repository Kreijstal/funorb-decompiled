/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class za extends ms {
    static int field_k;
    static int[] field_l;

    final static void a(byte[] param0, int[] param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        for (var5 = param3; rg.field_C.length > var5; var5++) {
            param2 = rg.field_C[var5];
            var6 = var5 << 428529956;
            while (true) {
                param2--;
                if (param2 == 0) {
                    break;
                }
                var6++;
                param4 = Sumoblitz.field_G[var6];
                param1[param0[param4]] = param1[param0[param4]] + 1;
                Sumoblitz.field_G[param1[param0[param4]]] = param4;
            }
            var5++;
        }
    }

    public static void a(byte param0) {
        if (param0 > -93) {
            field_l = null;
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static int c(boolean param0) {
        if (param0) {
            field_l = null;
            return ht.field_h;
        }
        return ht.field_h;
    }

    protected za() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = -1;
        field_l = new int[13];
    }
}
