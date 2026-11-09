/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SnowParticleSpriteData {
    static SpriteData spriteData;
    private static String field_z;

    public static void releaseStatics(int param0) {
        spriteData = null;
        if (param0 <= 70) {
          SnowParticleSpriteData.releaseStatics(34);
        }
    }

    static {
        field_z = "wf.A(";
    }
}
