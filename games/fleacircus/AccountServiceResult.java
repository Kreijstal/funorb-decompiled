/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountServiceResult {
    boolean success;
    static String field_c;
    static long field_e;
    boolean field_g;
    String message;
    static String field_a;
    static int field_h;
    int statusCode;
    static qc field_d;
    static uj field_i;
    String[] suggestions;

    public static void clearStaticReferences(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 <= 85) {
          field_i = (uj) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    AccountServiceResult(boolean param0) {
        this.success = param0 ? true : false;
    }

    static {
        field_c = "Fullscreen";
        field_i = new uj(2);
    }
}
