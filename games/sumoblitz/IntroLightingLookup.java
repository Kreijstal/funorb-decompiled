/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroLightingLookup {
    static FontMetrics field_b;
    static int[] highlightIntensity;
    private static String field_z;

    public static void releaseStatics(int param0) {
        highlightIntensity = null;
        field_b = null;
        if (param0 >= -79) {
          IntroLightingLookup.releaseStatics(62);
        }
    }

    static {
        field_z = "sq.A(";
    }
}
