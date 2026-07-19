/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sja {
    static int field_g;
    static int field_b;
    sja field_e;
    static String field_d;
    int field_a;
    int field_l;
    static int field_i;
    static int field_c;
    int field_f;
    static String field_j;
    aja field_k;
    int field_h;

    final void a(int param0, sja param1, int param2, aja param3, int param4, int param5, int param6) {
        try {
            this.field_e = param1;
            this.field_k = param3;
            if (param4 != 4096) {
                sja.a((byte) 30);
            }
            this.field_h = param6;
            this.field_f = param5;
            this.field_a = param2;
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "sja.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -46 / ((param0 - 64) / 44);
        field_j = null;
        field_d = null;
    }

    static {
        field_b = 2;
        field_g = 0;
        field_d = "You have been removed from <%0>'s game.";
        field_i = 4096;
        field_j = "The account name you use to access RuneScape and other Jagex.com games";
        field_c = -1;
    }
}
