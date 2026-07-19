/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static String field_b;
    jn field_d;
    static hr field_c;
    static int field_a;
    int field_e;

    final static String a(int param0, boolean param1, int param2) {
        if (!param1) {
          vl.a((byte) -39);
          return param0 + "/" + param2;
        } else {
          return param0 + "/" + param2;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 113) {
            return;
        }
        field_b = null;
    }

    vl(jn param0, int param1) {
        try {
            this.field_d = param0;
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "vl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Account created successfully!";
    }
}
