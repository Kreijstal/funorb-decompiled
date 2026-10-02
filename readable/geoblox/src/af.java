/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static sk field_b;
    static Sprite debugOverviewRaster;
    static sk field_d;
    static int avatarFrameStepTicks;
    private static String field_z;

    public static void a(byte param0) {
        debugOverviewRaster = null;
        field_b = null;
        field_d = null;
        if (param0 > -86) {
            field_d = (sk) null;
        }
    }

    static {
        field_z = "af.A(";
        avatarFrameStepTicks = 0;
        debugOverviewRaster = new Sprite(320, 240);
    }
}
