/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends ot {
    static kv field_i;
    static String[] field_h;
    static int[][] field_l;
    static int field_j;
    static int field_m;
    static String field_k;

    final wba a(byte param0) {
        if (param0 != -106) {
            wba discarded$0 = ((bd) this).a((byte) 64);
            return jda.field_g;
        }
        return jda.field_g;
    }

    bd(long param0, String param1) {
        super(param0, param1);
    }

    public static void c(byte param0) {
        field_l = null;
        field_i = null;
        field_k = null;
        if (param0 >= -119) {
            bd.c((byte) 21);
            field_h = null;
            return;
        }
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = -1;
        field_h = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
