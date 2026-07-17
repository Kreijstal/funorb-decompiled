/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static String field_e;
    static int field_c;
    static int field_a;
    static String field_b;
    static int[][][][] field_d;

    public static void b() {
        field_b = null;
        field_e = null;
        field_d = null;
    }

    final static String a(byte param0) {
        if (gj.field_a == qc.field_i) {
            return uf.field_j;
        }
        if (param0 < 124) {
            String discarded$0 = a.a((byte) -113);
            return ja.field_b;
        }
        return ja.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Highscores";
        field_c = -1;
        field_b = "Names cannot contain consecutive spaces";
        field_d = new int[][][][]{new int[7][][], new int[7][][], new int[7][][]};
    }
}
