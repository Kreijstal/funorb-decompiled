/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientUiResourceState {
    static String field_c;
    static UiComponent field_f;
    static String createAlertPasscontainsemail;
    static int field_g;
    static boolean field_a;
    static int field_e;
    static JaggrabDownloader field_d;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 == 19545) {
          field_d = null;
          field_f = null;
          field_c = null;
          createAlertPasscontainsemail = null;
          return;
        }
        createAlertPasscontainsemail = (String) null;
        field_d = null;
        field_f = null;
        field_c = null;
        createAlertPasscontainsemail = null;
    }

    static {
        field_z = "l.A(";
        createAlertPasscontainsemail = "This password contains your email address, and would be easy to guess";
        field_e = 204;
        field_g = NameEntryPopup.multiplyFixed16(6429081, false, field_e);
    }
}
