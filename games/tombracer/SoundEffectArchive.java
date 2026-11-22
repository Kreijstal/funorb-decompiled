/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEffectArchive {
    static boolean field_a;
    static ResourceArchive archive;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        archive = null;
        if (param0 <= 16) {
          archive = (ResourceArchive) null;
        }
    }

    static {
        field_z = "qoa.A(";
        field_a = false;
    }
}
