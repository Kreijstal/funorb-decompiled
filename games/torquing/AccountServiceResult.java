/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountServiceResult {
    static ResourceArchive field_i;
    String[] suggestions;
    int statusCode;
    boolean field_g;
    static String[] field_f;
    static String field_c;
    boolean success;
    static int field_h;
    String message;

    AccountServiceResult(boolean param0) {
        this.success = param0 ? true : false;
    }

    public static void clearStaticReferences(byte param0) {
        field_c = null;
        if (param0 != 10) {
          return;
        }
        field_i = null;
        field_f = null;
    }

    static {
        field_c = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
