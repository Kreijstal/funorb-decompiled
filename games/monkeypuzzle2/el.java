/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    static String field_c;
    static int[][] field_b;
    static int field_a;

    public static void a(boolean param0) {
        if (!param0) {
            field_a = 21;
            field_b = (int[][]) null;
            field_c = null;
            return;
        }
        field_b = (int[][]) null;
        field_c = null;
    }

    final static void a(boolean param0, int param1) {
        aa.field_a = param1;
        if (!param0) {
            el.a(false);
        }
    }

    static {
        field_c = "Create a free account to start using this feature";
        field_a = 1;
        field_b = new int[][]{new int[]{73, 89}, new int[]{178, 47}, new int[]{493, 145}, new int[]{197, 342}};
    }
}
