/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu {
    static int field_d;
    static lu field_a;
    String field_e;
    boolean field_c;
    String field_b;

    public static void a(boolean param0) {
        kv[] var2 = null;
        if (!param0) {
          var2 = (kv[]) null;
          gu.a(40, true, -118, (po) null, -87, (String) null, -19, false, (kv[]) null, -15, -124, -124, (kv[]) null, -26, 29);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2, po param3, int param4, String param5, int param6, boolean param7, kv[] param8, int param9, int param10, int param11, kv[] param12, int param13, int param14) {
        if (param2 != 6106) {
            return;
        }
        try {
            nda.a(param0, new lda(param12), ge.field_I, param6, wk.field_f, param3, param3, new lda(param8), param14, false, raa.field_I, ru.field_c, param10, param6, wo.field_j, param4, param11, param4, mt.field_v, param9);
            qb.a(param13, param7, param5, param2 ^ -6107, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gu.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ',' + (param12 != null ? "{...}" : "null") + ',' + param13 + ',' + param14 + ')');
        }
    }

    static {
    }
}
