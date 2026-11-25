/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MapGenerationException extends Exception {
    static boolean field_a;
    static int field_b;
    private static String field_z;

    MapGenerationException(String param0) {
        super(param0);
    }

    final static void a(int param0) {
        if (param0 != 11615) {
          return;
        }
        if (UiSpriteSupport.field_b >= 224) {
          DiskArchiveRequest.setMusicVolume(-78, 256);
          return;
        }
        int var1 = UiSpriteSupport.field_b % 32;
        DiskArchiveRequest.setMusicVolume(124, UiSpriteSupport.field_b + (32 - var1));
    }

    static {
        field_z = "jn.A(";
    }
}
