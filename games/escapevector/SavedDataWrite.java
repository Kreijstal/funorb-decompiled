/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SavedDataWrite extends IntrusiveNode {
    static long field_k;
    static int[] bzip2Transform;
    int crc32;
    static String field_m;
    static BufferedRandomAccessFile field_h;
    byte[] payload;
    static String field_g;

    public static void releaseStatics(int guard) {
        field_m = null;
        field_h = null;
        if (guard >= -45) {
          return;
        }
        field_g = null;
        bzip2Transform = null;
    }

    SavedDataWrite(byte[] payload) {
        try {
          this.payload = payload;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "bd.<init>(" + (payload != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Service unavailable";
        field_g = "Waiting for sound effects";
    }
}
