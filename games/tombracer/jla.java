/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jla extends rj {
    static vna field_z;
    static String field_B;

    jla(String param0, qc param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_w = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private jla(String param0, isa param1, qc param2) {
        super(param0, param1, param2);
        try {
          this.field_r = afa.field_c.field_d;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_B = null;
        field_z = null;
        if (param0 != -23884) {
          field_B = (String) null;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.field_w = !this.field_w ? true : false;
        if (param3 <= -40) {
          super.b(param0, param1, param2, -71);
          return;
        }
        field_B = (String) null;
        super.b(param0, param1, param2, -71);
    }

    private jla(String param0, qc param1) {
        this(param0, afa.field_c.field_u, param1);
        try {
          this.field_r = afa.field_c.field_d;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_B = "Name is available";
    }
}
