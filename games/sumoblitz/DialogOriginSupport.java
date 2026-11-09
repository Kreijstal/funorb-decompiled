/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogOriginSupport {
    private static String field_z;

    final static void setDialogOrigin(int parentX, int parentY, int guard) {
        PasswordInputRenderer.displayDialogX = parentX;
        int var3 = -72 / ((18 - guard) / 39);
        JaggrabDownloader.displayDialogY = parentY;
    }

    static {
        field_z = "cf.A(";
    }
}
