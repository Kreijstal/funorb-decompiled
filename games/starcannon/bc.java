/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends rf {
    int field_f;
    int field_k;
    int field_i;
    static String[] field_h;
    int field_n;
    int[] field_m;
    static ef field_j;
    static String field_l;
    int field_g;
    int field_o;

    final static void a(hl param0, int param1) {
        try {
            if (param1 != 26095) {
                field_l = (String) null;
            }
            wj.b(true);
            ki.a(param0.field_B, param0.field_x, param0.field_q);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "bc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, boolean param7) {
        try {
            this.field_m = param3;
            this.field_i = param2;
            this.field_o = param0;
            this.field_g = param6;
            if (param7) {
                hl var10 = (hl) null;
                bc.a((hl) null, -47);
            }
            this.field_n = param1;
            this.field_k = param5;
            this.field_f = param4;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "bc.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void b(byte param0) {
        field_h = null;
        if (param0 > -127) {
            return;
        }
        field_j = null;
        field_l = null;
    }

    bc() {
    }

    static {
        field_h = new String[]{"By rating", "By win percentage"};
        field_l = "Proxima liberated<br><br>FREE GAME COMPLETE<br><br>CONGRATULATIONS<br><br>Final score: ";
    }
}
