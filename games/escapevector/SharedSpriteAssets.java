/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SharedSpriteAssets {
    static Sprite field_b;
    static boolean field_d;
    static String field_c;
    static int[] field_e;
    static Sprite field_a;
    static int[] field_f;
    private static String field_z;

    public static void releaseStatics(byte guard) {
        if (guard <= -6) {
          field_f = null;
          field_b = null;
          field_e = null;
          field_c = null;
          field_a = null;
          return;
        }
        SharedSpriteAssets.releaseStatics((byte) 111);
        field_f = null;
        field_b = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    static {
        field_z = "uj.A(";
        field_c = "More suggestions";
        field_d = false;
        field_e = new int[]{11, 25, 29};
        field_f = new int[]{127, 255};
    }
}
