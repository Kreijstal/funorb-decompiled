/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReportReasonGlobals {
    static ReportReason field_b;
    static long field_a;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 > -53) {
          ReportReasonGlobals.releaseStatics(-49);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_z = "ej.A(";
        field_b = new ReportReason(1, 2, 2, 0);
    }
}
