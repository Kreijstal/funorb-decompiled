/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cea {
    static UiComponent field_a;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 > -112) {
          field_a = (UiComponent) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_z = "cea.A(";
    }
}
