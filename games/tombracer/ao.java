/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends dg {
    static String field_m;

    ao(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    ao(int param0) {
        super(param0);
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        if (((ao) this).field_h == null) {
            return;
        }
        try {
            var6_int = ((ao) this).field_h.c(-53) / 2;
            int var8 = -77 / ((param4 - -38) / 47);
            var7 = ((ao) this).field_h.a((byte) 55) / 2;
            oq.a(-var6_int + param2, -var7 + param1, param3, 160, var6_int + param2, 16777215, var7 + param1, true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ao.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ao.E(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public static void i(int param0) {
        if (param0 > -113) {
            ao.i(100);
            field_m = null;
            return;
        }
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Add <%0> to friend list";
    }
}
