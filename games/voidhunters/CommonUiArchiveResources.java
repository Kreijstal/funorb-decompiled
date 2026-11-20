/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CommonUiArchiveResources {
    static ResourceArchive commonUiArchive;
    static BufferedFile[] cacheIndexFiles;
    static String gameAlreadyStartedText;
    static boolean field_a;
    private static String field_z;

    public static void clearSharedReferences(byte param0) {
        commonUiArchive = null;
        gameAlreadyStartedText = null;
        cacheIndexFiles = null;
        if (param0 != 94) {
          gameAlreadyStartedText = (String) null;
        }
    }

    static {
        field_z = "btb.A(";
        gameAlreadyStartedText = "<%0> cannot join; the game has started.";
        field_a = true;
    }
}
