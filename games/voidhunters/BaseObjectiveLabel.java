/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BaseObjectiveLabel {
    static String text;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        text = null;
        if (param0 != -18013) {
          BaseObjectiveLabel.clearSharedReferences(124);
        }
    }

    static {
        field_z = "cib.A(";
        text = "base";
    }
}
