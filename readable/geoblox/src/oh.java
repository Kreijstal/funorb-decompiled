/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static AudioOutput field_a;
    static String unpackingGraphicsText;
    static ng field_b;

    final static void a(int param0, int param1, BitmapFont param2, int param3, int param4, int param5) {
        try {
            kd.b((byte) 107);
            int var6_int = 72 % ((param4 + 78) / 44);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "oh.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        unpackingGraphicsText = null;
        field_b = null;
        field_a = null;
        if (param0 > -73) {
            field_b = (ng) null;
        }
    }

    static {
        unpackingGraphicsText = "Unpacking graphics";
    }
}
