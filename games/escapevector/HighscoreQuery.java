/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscoreQuery extends IntrusiveNode {
    boolean complete;
    String[][] stringColumns;
    int field_h;
    int boardId;
    static int field_i;
    int[][] intColumns;
    int field_j;
    long[][] longColumns;
    static Sprite field_g;
    private static String field_z;

    HighscoreQuery() {
    }

    public static void releaseStatics(int guard) {
        if (guard >= -67) {
          HighscoreQuery.releaseStatics(-72);
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
