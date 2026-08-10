/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static String field_d;
    static ak field_e;
    static dj field_a;
    static String field_b;
    static String field_c;

    final static void a(int param0, tf param1) {
        try {
            jf.field_a = param1;
            if (param0 >= -45) {
                sk.a((byte) -101);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "sk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
        field_a = null;
        int var1 = -34 % ((40 - param0) / 58);
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, int param6, byte param7, boolean param8, int param9, boolean param10, int param11, boolean param12, int param13) {
        tf var15;
        up.field_o = null;
        ug.a(2586);
        param12 = bq.a((byte) -124, param2, param6, param12, param13, param11, param5);
        i.a(param5, param10, param8, param0, param3, param1, -28362, param12, param4, param9);
        oh.a(param0, 0, param4);
        bd.a((byte) -64, param12, param4, param11);
        if (param7 > -112) {
          var15 = (tf) null;
          sk.a(75, (tf) null);
          return;
        } else {
          return;
        }
    }

    static {
        field_d = "This entry doesn't match";
        field_b = "Return to game";
        field_c = "From <%0>: ";
        field_a = new dj();
    }
}
