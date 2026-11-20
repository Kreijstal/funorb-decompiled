/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PanelWidthQuery extends tb {
    static int field_c;
    static int field_e;
    static String field_d;

    public static void clearSharedReferences(byte param0) {
        if (param0 < 15) {
          return;
        }
        field_d = null;
    }

    final static int getMaximumPanelWidth(int param0) {
        int var1 = 95 % ((-69 - param0) / 48);
        return GetLagStandardDeviationIn.field_r.getMaximumPanelWidth(-101);
    }

    static {
        field_d = "Advertising websites";
    }
}
