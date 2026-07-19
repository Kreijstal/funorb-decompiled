/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends uf {
    static String field_l;
    byte[] field_h;
    static ci[] field_i;
    int field_k;
    static String field_j;

    public static void c(byte param0) {
        if (param0 != -17) {
          field_j = (String) null;
          field_l = null;
          field_i = null;
          field_j = null;
          return;
        } else {
          field_l = null;
          field_i = null;
          field_j = null;
          return;
        }
    }

    cc(byte[] param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "T E R R A P H O E N I X";
        field_j = null;
    }
}
