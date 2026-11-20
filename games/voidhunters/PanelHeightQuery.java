/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PanelHeightQuery {
    static int field_b;
    static int incomingLagMillis;
    static String field_a;

    public static void clearSharedReferences(int param0) {
        if (param0 != 5) {
          PanelHeightQuery.getMaximumPanelHeight(true);
          field_a = null;
          return;
        }
        field_a = null;
    }

    private PanelHeightQuery() throws Throwable {
        throw new Error();
    }

    final static int getMaximumPanelHeight(boolean param0) {
        if (!param0) {
          field_a = (String) null;
          return GetLagStandardDeviationIn.field_r.getMaximumPanelHeight(-2147483648);
        }
        return GetLagStandardDeviationIn.field_r.getMaximumPanelHeight(-2147483648);
    }

    static {
        field_b = 5;
        incomingLagMillis = 0;
        field_a = "Create random message";
    }
}
