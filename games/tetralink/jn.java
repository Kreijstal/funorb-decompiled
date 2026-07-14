/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    float field_f;
    int[] field_c;
    static String field_d;
    int field_b;
    static String field_a;
    int field_e;

    final static void a(ah param0, boolean param1, ah param2) {
        lj.field_c = param2;
        if (!param1) {
            return;
        }
        nn.field_T = param0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 != 122) {
            field_a = null;
        }
    }

    jn(bh param0) {
        ((jn) this).field_b = param0.e(127);
        int discarded$0 = param0.d((byte) -99);
        int var2 = param0.d((byte) -99);
        if (var2 != 1) {
            throw new RuntimeException();
        }
        ((jn) this).field_e = param0.e(127);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Your game";
        field_a = "Only show private chat from my friends and opponents";
    }
}
