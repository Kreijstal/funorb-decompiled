/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeModelIntTriple {
    int firstValue;
    int secondValue;
    static String field_c;
    int thirdValue;

    public static void clearSharedReferences(byte param0) {
        if (param0 >= -115) {
          return;
        }
        field_c = null;
    }

    private NativeModelIntTriple() throws Throwable {
        throw new Error();
    }

    static {
        field_c = "Destroy the enemy team with blueprint ships. No respawns.";
    }
}
