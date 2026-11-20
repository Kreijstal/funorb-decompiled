/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeModelIntValue {
    static String field_b;
    int value;

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        if (param0 != 110) {
          field_b = (String) null;
        }
    }

    private NativeModelIntValue() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Continue";
    }
}
