/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConnectionLostText {
    static String text;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        text = null;
        int var1 = -128 / ((param0 + 22) / 43);
    }

    static {
        field_z = "nka.A(";
        text = "Connection lost. <%0>";
    }
}
