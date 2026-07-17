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
                field_l = null;
            }
            int discarded$0 = 1;
            wj.b();
            ki.a(param0.field_B, param0.field_x, param0.field_q);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "bc.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, boolean param7) {
        try {
            ((bc) this).field_m = param3;
            ((bc) this).field_i = param2;
            ((bc) this).field_o = param0;
            ((bc) this).field_g = param6;
            if (param7) {
                Object var10 = null;
                bc.a((hl) null, -47);
            }
            ((bc) this).field_n = param1;
            ((bc) this).field_k = param5;
            ((bc) this).field_f = param4;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "bc.C(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public static void b() {
        field_h = null;
        field_j = null;
        field_l = null;
    }

    bc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"By rating", "By win percentage"};
        field_l = "Proxima liberated<br><br>FREE GAME COMPLETE<br><br>CONGRATULATIONS<br><br>Final score: ";
    }
}
