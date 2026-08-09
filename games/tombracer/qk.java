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
            if ((this.field_e ^ -1) != -34038) {
                this.field_v = 1.0f;
                this.field_r = 1.0f;
            } else {
                this.field_v = (float)param3;
                this.field_r = (float)param2;
            }
            this.field_t = param2;
            this.field_s = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    qk(cka param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, true);
        try {
            this.field_s = param4;
            if ((this.field_e ^ -1) != -34038) {
                this.field_r = 1.0f;
                this.field_v = 1.0f;
            } else {
                this.field_r = (float)param3;
                this.field_v = (float)param4;
            }
            this.field_t = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    qk(cka param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7) {
        super(param0, 3553, param1, param4, param5);
        try {
            this.field_t = param2;
            this.field_s = param3;
            this.a(0, 0, param3, 0, 0, param6, -24575, param2, param7, true);
            this.field_r = (float)param2 / (float)param4;
            this.field_v = (float)param3 / (float)param5;
            this.a(false, false, -3554);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    public static void j(int param0) {
        field_u = null;
        field_w = null;
        if (param0 < 80) {
            qk.h(-13);
        }
    }

    qk(cka param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, 3553, 6408, param3, param4);
        try {
            this.field_s = param2;
            this.field_t = param1;
            this.a(0, 0, param2, param1, 0, param5, (byte) 68, true, 0);
            this.field_r = (float)param1 / (float)param3;
            this.field_v = (float)param2 / (float)param4;
            this.a(false, false, -3554);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, ha param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            if (param3 < 34) {
                qk.h(-73);
            }
            cha.a(param7, 2, param1, param6, param2, param5, param0, 1, param4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qk.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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
        if (param0 != 250) {
            return true;
        }
        return tl.field_r > 250 ? true : false;
    }

    static {
        field_w = new double[]{0.5, 3.0, 3.0, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 2.0, 0.5};
    }
}
