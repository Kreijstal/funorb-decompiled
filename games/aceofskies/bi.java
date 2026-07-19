/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends wt {
    byte[] field_n;
    static String field_o;

    bi(byte[] param0) {
        try {
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "bi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_o = (String) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        field_o = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
