/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ji extends ng {
    private String field_c;
    static eh field_d;
    private long field_e;

    sb b(byte param0) {
        if (param0 >= -57) {
            return (sb) null;
        }
        return pg.field_b;
    }

    public static void c(byte param0) {
        field_d = null;
        int var1 = 39 / ((-41 - param0) / 51);
    }

    final void a(boolean param0, wi param1) {
        try {
            if (param0) {
                this.field_c = (String) null;
            }
            param1.a(252186072, this.field_e);
            param1.b(this.field_c, (byte) -118);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ji.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ji(long param0, String param1) {
        try {
            this.field_e = param0;
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ji.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new eh(8, 0, 4, 1);
    }
}
