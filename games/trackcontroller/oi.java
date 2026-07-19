/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String field_d;
    static int field_b;
    static String field_c;
    static bl field_a;
    static String field_e;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, qj[] param1, int param2, oh param3, oh param4, int param5, int param6, int param7, int param8, qj[] param9, int param10, boolean param11, int param12, int param13, int param14) {
        try {
            pi.a(param12, param6, param5, 480, (qj[]) null, param7, 0, sl.field_n, param9, param14, db.field_db, param0, param1, param2, param4, param13, param8, param10 ^ param10, 0, param3, j.field_a);
            wj.a((byte) 116, param11);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "oi.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_d = null;
        field_a = null;
        int var1 = -122 % ((param0 - 69) / 38);
    }

    static {
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = "Quit";
        field_a = new bl("");
        field_e = "Service unavailable";
    }
}
