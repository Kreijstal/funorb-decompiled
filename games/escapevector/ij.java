/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends IntrusiveNode {
    boolean field_l;
    String[][] field_m;
    int field_h;
    int field_n;
    static int field_i;
    int[][] field_o;
    int field_j;
    long[][] field_k;
    static Sprite field_g;
    private static String field_z;

    ij() {
    }

    public static void releaseStatics(int guard) {
        if (guard >= -67) {
          ij.releaseStatics(-72);
          field_g = null;
          return;
        }
        field_g = null;
    }

    static {
        field_z = "ij.A(";
        field_i = 9;
    }
}
