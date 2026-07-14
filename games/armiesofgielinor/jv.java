/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv {
    static boolean field_a;
    static int field_c;
    static int[][] field_d;
    static wk[] field_b;
    static String field_e;

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0) {
            return -40;
        }
        for (var2 = 0; var2 < wp.field_H.length; var2++) {
            for (var3 = 0; var3 < wp.field_H[var2].length; var3++) {
                if (!(wp.field_H[var2][var3] != param1)) {
                    return var2;
                }
            }
        }
        return 0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != 36) {
            Object var2 = null;
            te discarded$0 = jv.a((sn) null, -72, 76, (byte) 115);
        }
    }

    final static te a(sn param0, int param1, int param2, byte param3) {
        if (param3 <= 26) {
            field_b = null;
        }
        return ne.a(-92, aa.a(param0, 100, param2, param1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_e = "The cannon cannot be built on a structure";
    }
}
