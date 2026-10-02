/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static boolean field_d;
    static IntrusiveDeque field_b;
    static java.awt.Frame field_a;
    static IndexedSprite germsBackgroundSprite;
    static byte[][][] field_c;
    static String field_f;
    private static String field_z;

    public static void a(int param0) {
        germsBackgroundSprite = null;
        if (param0 == -13575) {
            field_f = null;
            field_a = null;
            field_b = null;
            field_c = (byte[][][]) null;
            return;
        }
        sg.a(-7);
        field_f = null;
        field_a = null;
        field_b = null;
        field_c = (byte[][][]) null;
    }

    static {
        field_z = "sg.A(";
        field_b = new IntrusiveDeque();
        field_f = "Bubble Bonus!";
    }
}
