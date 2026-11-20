/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ObjectiveMarker {
    static llb field_b;
    static llb field_d;
    Object target;
    int markerType;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        if (param0 != 30089) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    static {
        field_z = "qsa.A(";
    }
}
