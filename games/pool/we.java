/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    String field_a;
    int field_n;
    static char keycharTheCharacterUnderQuestionmark;
    static volatile int field_l;
    static String offline;
    String field_i;
    static IntrusiveDeque field_c;
    String field_b;
    static Sprite field_k;
    static int[][] field_m;
    di field_h;
    static boolean field_e;
    static int[] field_g;
    static vh field_f;

    public static void a(byte param0) {
        field_k = null;
        field_m = (int[][]) null;
        field_g = null;
        field_c = null;
        field_f = null;
        offline = null;
        if (param0 > -78) {
          we.a((byte) -76);
        }
    }

    private we() throws Throwable {
        throw new Error();
    }

    static {
        keycharTheCharacterUnderQuestionmark = '/';
        field_l = -1;
        offline = "Offline";
        field_c = new IntrusiveDeque();
    }
}
