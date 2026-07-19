/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static ng field_a;
    static boolean field_c;
    static String[] field_b;

    public static void a(int param0) {
        if (param0 != -15699) {
            field_a = (ng) null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(String param0, byte param1) {
        try {
            int var2_int = -48 / ((0 - param1) / 37);
            si.field_q = param0;
            ni.a(-124, 12);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "jl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_a = new ng();
    }
}
