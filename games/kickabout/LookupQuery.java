/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LookupQuery extends IntrusiveNode {
    static String field_g;
    int[] resultValues;
    int tableId;

    public static void releaseStatics(byte param0) {
        field_g = null;
        int var1 = -50 % ((param0 - 23) / 48);
    }

    private LookupQuery() throws Throwable {
        throw new Error();
    }

    static {
        field_g = "Email is valid";
    }
}
