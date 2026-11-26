/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IndexedSpriteState {
    int field_c;
    int field_j;
    static String field_f;
    static int field_e;
    int field_k;
    int field_b;
    static boolean field_i;
    static AccountRequestState field_h;
    int field_g;
    static Sprite field_d;
    int field_a;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        field_h = null;
        int var1 = -32 / ((51 - param0) / 54);
        field_d = null;
        field_f = null;
    }

    abstract void draw(int param0, int param1);

    abstract void drawAlpha(int param0, int param1, int param2);

    static {
        field_z = "fd.B(";
        field_f = "Waiting for fonts";
    }
}
