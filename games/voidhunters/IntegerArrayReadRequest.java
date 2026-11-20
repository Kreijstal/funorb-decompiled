/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerArrayReadRequest extends IntrusiveNode {
    int recordType;
    static lkb field_f;
    int[] values;

    private IntegerArrayReadRequest() throws Throwable {
        throw new Error();
    }

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          IntegerArrayReadRequest.clearSharedReferences(true);
          field_f = null;
          return;
        }
        field_f = null;
    }

    static {
        field_f = new lkb();
    }
}
