/*
 * Decompiled by CFR-JS 0.4.0.
 */
class us extends oib {
    static int field_f;
    private long field_g;
    static pfb field_d;
    private String field_e;

    public static void b() {
        field_d = null;
    }

    dka a(byte param0) {
        int var2 = -127 % ((param0 - -7) / 56);
        return noa.field_p;
    }

    us(long param0, String param1) {
        try {
            ((us) this).field_g = param0;
            ((us) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "us.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ds param0, int param1) {
        try {
            if (param1 != -26216) {
                field_f = 54;
            }
            param0.a(((us) this).field_g, 90);
            param0.a((byte) -53, ((us) this).field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "us.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 8;
        field_d = new pfb(64);
    }
}
