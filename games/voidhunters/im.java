/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im extends aia {
    float field_o;
    static faa field_q;
    int field_p;
    int field_m;
    float field_n;
    boolean field_l;

    im(qfa param0, int param1, int param2, int param3, boolean param4, int[] param5, int param6, int param7) {
        super(param0, param1, 6408, param2, param3, param4, param5, param6, param7, true);
        ((im) this).field_m = param2;
        if (((im) this).field_b == 34037) {
            ((im) this).field_o = (float)param3;
            ((im) this).field_n = (float)param2;
            ((im) this).field_l = false;
        } else {
            ((im) this).field_l = true;
            ((im) this).field_n = 1.0f;
            ((im) this).field_o = 1.0f;
        }
        ((im) this).field_p = param3;
    }

    im(qfa param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7) {
        super(param0, 3553, param1, param4, param5);
        ((im) this).field_p = param3;
        ((im) this).field_m = param2;
        ((im) this).a(param3, param7, 0, param6, 0, param2, 0, 0, true, 1);
        ((im) this).field_o = (float)param3 / (float)param5;
        ((im) this).field_l = false;
        ((im) this).field_n = (float)param2 / (float)param4;
        ((im) this).a(false, false, 10497);
    }

    im(qfa param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, true);
        ((im) this).field_m = param3;
        if (-34038 == (((im) this).field_b ^ -1)) {
            ((im) this).field_o = (float)param4;
            ((im) this).field_l = false;
            ((im) this).field_n = (float)param3;
        } else {
            ((im) this).field_n = 1.0f;
            ((im) this).field_o = 1.0f;
            ((im) this).field_l = true;
        }
        ((im) this).field_p = param4;
    }

    im(qfa param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, 3553, 6408, param3, param4);
        ((im) this).field_m = param1;
        ((im) this).field_p = param2;
        ((im) this).a((byte) 32, 0, param1, 0, param2, 0, 0, true, param5);
        ((im) this).field_n = (float)param1 / (float)param3;
        ((im) this).field_o = (float)param2 / (float)param4;
        ((im) this).field_l = false;
        ((im) this).a(false, false, 10497);
    }

    im(qfa param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param3, param4);
        ((im) this).field_m = param3;
        ((im) this).field_p = param4;
        if ((((im) this).field_b ^ -1) == -34038) {
            ((im) this).field_l = false;
            ((im) this).field_o = (float)param4;
            ((im) this).field_n = (float)param3;
        } else {
            ((im) this).field_n = 1.0f;
            ((im) this).field_l = true;
            ((im) this).field_o = 1.0f;
        }
    }

    public static void c(byte param0) {
        if (param0 != 105) {
            return;
        }
        field_q = null;
    }

    im(qfa param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, 3553, param1, param4, param5);
        ((im) this).field_o = (float)param3 / (float)param5;
        ((im) this).field_n = (float)param2 / (float)param4;
        ((im) this).field_p = param3;
        ((im) this).field_m = param2;
        ((im) this).field_l = false;
        ((im) this).a(false, false, 10497);
    }

    static {
    }
}
