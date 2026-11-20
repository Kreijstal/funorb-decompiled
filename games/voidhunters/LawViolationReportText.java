/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LawViolationReportText {
    static String lawViolationText;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        if (param0 != -12407) {
          lawViolationText = (String) null;
          lawViolationText = null;
          return;
        }
        lawViolationText = null;
    }

    static {
        field_z = "bda.A(";
        lawViolationText = "Breaking real-world laws";
    }
}
