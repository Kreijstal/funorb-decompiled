/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ajb extends ksa {
    int[] field_k;
    int field_j;
    int field_h;
    int field_g;
    static clb field_f;
    int field_i;
    int field_d;
    int field_e;

    final static void a(byte param0, String param1) {
        try {
            vda.field_o = param1;
            if (param0 != -74) {
                String var3 = (String) null;
                ajb.a((byte) 76, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ajb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_f = null;
        if (param0 != 44) {
            ajb.c((byte) 98);
        }
    }

    final void a(int param0, int[] param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_g = param2;
            this.field_e = param5;
            this.field_d = param6;
            this.field_k = param1;
            if (param3 >= -84) {
                this.field_j = -65;
            }
            this.field_i = param0;
            this.field_h = param4;
            this.field_j = param7;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ajb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    ajb() {
    }

    static {
        field_f = new clb();
    }
}
