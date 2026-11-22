/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerCountDisplay {
    static UiComponent widget;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 > -112) {
          widget = (UiComponent) null;
          widget = null;
          return;
        }
        widget = null;
    }

    static {
        field_z = "cea.A(";
    }
}
