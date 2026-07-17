/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends rt {
    static jpa field_u;
    static double[] field_w;
    float field_v;
    int field_t;
    int field_s;
    float field_r;

    qk(cka param0, int param1, int param2, int param3, boolean param4, int[] param5, int param6, int param7) {
        super(param0, param1, 6408, param2, param3, param4, param5, param6, param7, true);
        try {
            if (((qk) this).field_e != 34037) {
                ((qk) this).field_v = 1.0f;
                ((qk) this).field_r = 1.0f;
            } else {
                ((qk) this).field_v = (float)param3;
                ((qk) this).field_r = (float)param2;
            }
            ((qk) this).field_t = param2;
            ((qk) this).field_s = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 44 + param7 + 41);
        }
    }

    qk(cka param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, true);
        try {
            ((qk) this).field_s = param4;
            if (((qk) this).field_e != 34037) {
                ((qk) this).field_r = 1.0f;
                ((qk) this).field_v = 1.0f;
            } else {
                ((qk) this).field_r = (float)param3;
                ((qk) this).field_v = (float)param4;
            }
            ((qk) this).field_t = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 41);
        }
    }

    qk(cka param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7) {
        super(param0, 3553, param1, param4, param5);
        try {
            ((qk) this).field_t = param2;
            ((qk) this).field_s = param3;
            ((qk) this).a(0, 0, param3, 0, 0, param6, -24575, param2, param7, true);
            ((qk) this).field_r = (float)param2 / (float)param4;
            ((qk) this).field_v = (float)param3 / (float)param5;
            ((qk) this).a(false, false, -3554);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 41);
        }
    }

    public static void j(int param0) {
        field_u = null;
        field_w = null;
        if (param0 < 80) {
            kn discarded$0 = qk.h(-13);
        }
    }

    qk(cka param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, 3553, 6408, param3, param4);
        try {
            ((qk) this).field_s = param2;
            ((qk) this).field_t = param1;
            ((qk) this).a(0, 0, param2, param1, 0, param5, (byte) 68, true, 0);
            ((qk) this).field_r = (float)param1 / (float)param3;
            ((qk) this).field_v = (float)param2 / (float)param4;
            ((qk) this).a(false, false, -3554);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, ha param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            if (param3 < 34) {
                kn discarded$0 = qk.h(-73);
            }
            cha.a(param7, 2, param1, param6, param2, param5, param0, 1, param4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qk.K(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static kn h(int param0) {
        int var1 = 119 % ((63 - param0) / 41);
        if (!(joa.field_c != null)) {
            joa.field_c = new kn();
            joa.field_c.a(mj.field_J, true);
            joa.field_c.field_b = 4;
            joa.field_c.field_o = 14;
            joa.field_c.field_c = 2763306;
            joa.field_c.field_f = 5;
            joa.field_c.field_q = eka.field_o;
            joa.field_c.field_i = 6;
            joa.field_c.field_a = 7697781;
            joa.field_c.field_t = 0;
        }
        return joa.field_c;
    }

    final static boolean i(int param0) {
        return tl.field_r > 250;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new double[]{0.5, 3.0, 3.0, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 2.0, 0.5};
    }
}
