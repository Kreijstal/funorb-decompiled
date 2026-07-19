/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_e;
    static int field_c;
    static String field_a;
    static String field_b;
    static int[] field_f;
    static String field_d;

    final static void a(qb[] param0, int param1, int param2, int param3, qb[] param4, dj param5, int param6, int param7, int param8, int param9, int param10) {
        try {
            int var11_int = -49 % ((13 - param10) / 58);
            fk.d(-11);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ah.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_b = (String) null;
          field_a = null;
          field_e = null;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    static {
        field_a = "Invite";
        field_e = "These living islands offer much in the way of places to hide, but watch out, as the ancient magics guarding the area will start raining comets down!";
        field_f = new int[]{7, 8, 9, 10, 11, 12, 55, 58, 56};
        field_d = "Find opponent";
    }
}
