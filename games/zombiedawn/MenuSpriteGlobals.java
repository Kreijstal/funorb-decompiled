/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuSpriteGlobals {
    static Sprite[] field_c;
    static String[] field_a;
    static Sprite[][] field_b;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 < 30) {
          return;
        }
        field_b = (Sprite[][]) null;
        field_c = null;
    }

    static {
        field_z = "ob.A(";
        field_b = new Sprite[10][];
        field_a = new String[]{"All scores", "My scores", "Best each"};
    }
}
