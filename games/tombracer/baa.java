/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class baa {
    static String field_f;
    static GraphicsQuality field_e;
    static ToolkitSelector field_d;
    static SpriteData field_g;
    static int[] field_b;
    static float field_c;
    static String field_a;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_g = null;
        field_b = null;
        field_d = null;
        field_f = null;
        field_e = null;
        if (param0 >= 17) {
          field_a = null;
          return;
        }
        field_c = -0.049238987267017365f;
        field_a = null;
    }

    static {
        field_z = "baa.A(";
        field_f = "The following settings need to be changed:  ";
        field_e = new GraphicsQuality();
        field_a = "Snake pits";
    }
}
