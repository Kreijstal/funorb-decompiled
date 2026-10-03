/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_b;
    static PcmSample[] gameSoundSamples;
    static Sprite spaceForegroundSprite;
    private static String field_z;

    public static void a(int param0) {
        spaceForegroundSprite = null;
        if (param0 != 33) {
            fl.a(76);
            gameSoundSamples = null;
            field_b = null;
            return;
        }
        gameSoundSamples = null;
        field_b = null;
    }

    static {
        field_z = "fl.A(";
        gameSoundSamples = new PcmSample[33];
    }
}
