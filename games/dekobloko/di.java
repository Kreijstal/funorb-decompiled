/*
 * Decompiled by CFR-JS 0.4.0.
 */
class di extends a {
    static String field_A;
    static String field_D;
    private static int[] field_B;
    static String field_E;
    static String field_C;
    static String field_G;
    static long field_F;

    public static void c(int param0) {
        field_A = null;
        field_G = null;
        field_D = null;
        field_E = null;
        field_B = null;
        field_C = null;
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        if (param0) {
            ke.a(param4.field_u + param1, param2 + param4.field_D, param4.field_t, param4.field_y, (byte) 112);
        }
        if (param3 > -60) {
            return;
        }
        try {
            super.a(param0, param1, param2, (byte) -120, param4);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "di.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0) {
        if (null == qc.field_s) {
            return false;
        }
        if (!ph.field_xb.b(22277)) {
            return false;
        }
        return true;
    }

    di(mm param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_R, -1, 2147483647, false);
    }

    di(int param0) {
        this(hh.field_e, param0);
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_D = "Solid shapes are sent to the next player!";
        field_A = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_C = "Accept invitation to <%0>'s game";
        field_E = "Set up new unrated game";
        field_B = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var4 = (long)(-1 + (var0 << 1));
            var6 = (long)(1 + (var0 << 1));
            var3 = (int)(-32768L + (var6 * var6 >> 18));
            var2 = (int)((var4 * var4 >> 18) - 32768L);
            if (!(field_B.length > var3)) {
                var3 = field_B.length - 1;
            }
            for (var1 = var2 < 0 ? 0 : var2; var3 >= var1; var1++) {
                field_B[var1] = var0;
            }
        }
        field_G = "Names should contain a maximum of 12 characters";
    }
}
