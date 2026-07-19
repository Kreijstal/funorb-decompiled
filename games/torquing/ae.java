/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends w {
    int field_kb;
    static la field_mb;
    String field_ob;
    String field_jb;
    static ei field_nb;
    static boolean field_ib;
    static String field_lb;

    ae() {
        super(0L, (w) null);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            sb.field_p = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            ni.a((byte) 81, param0, var3, var4, var2);
            int var6 = 114 % ((param1 - 66) / 33);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ae.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        field_lb = null;
        field_mb = null;
        if (param0 != 112) {
            field_lb = (String) null;
            field_nb = null;
            return;
        }
        field_nb = null;
    }

    static {
        field_nb = new ei();
        field_lb = "ALL";
    }
}
