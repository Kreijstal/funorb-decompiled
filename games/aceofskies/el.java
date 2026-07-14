/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends nr {
    int field_q;
    int field_o;
    float field_r;
    float field_p;

    el(wl param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7) {
        super(param0, 3553, param1, param4, param5);
        ((el) this).field_q = param2;
        ((el) this).field_o = param3;
        ((el) this).a(0, param6, 0, true, 0, -34038, param3, 0, param7, param2);
        ((el) this).field_r = (float)param2 / (float)param4;
        ((el) this).field_p = (float)param3 / (float)param5;
        ((el) this).a(false, 11779, false);
    }

    el(wl param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, 3553, 6408, param3, param4);
        ((el) this).field_o = param2;
        ((el) this).field_q = param1;
        ((el) this).a(param1, 0, param2, true, 0, param5, 0, (byte) 0, 0);
        ((el) this).field_r = (float)param1 / (float)param3;
        ((el) this).field_p = (float)param2 / (float)param4;
        ((el) this).a(false, 11779, false);
    }

    el(wl param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, true);
        ((el) this).field_o = param4;
        if (((el) this).field_f != 34037) {
            ((el) this).field_p = 1.0f;
            ((el) this).field_r = 1.0f;
        } else {
            ((el) this).field_p = (float)param4;
            ((el) this).field_r = (float)param3;
        }
        ((el) this).field_q = param3;
    }

    el(wl param0, int param1, int param2, int param3, boolean param4, int[] param5, int param6, int param7) {
        super(param0, param1, 6408, param2, param3, param4, param5, param6, param7, true);
        ((el) this).field_o = param3;
        ((el) this).field_q = param2;
        if (-34038 == (((el) this).field_f ^ -1)) {
            ((el) this).field_r = (float)param2;
            ((el) this).field_p = (float)param3;
        } else {
            ((el) this).field_p = 1.0f;
            ((el) this).field_r = 1.0f;
        }
    }

    static {
    }
}
