/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends bw {
    static int field_g;
    int field_j;
    int field_f;
    int field_l;
    static java.security.SecureRandom field_i;
    int field_n;
    static String[] field_m;
    int field_k;
    int field_h;
    int[] field_o;

    public static void c(byte param0) {
        field_m = null;
        field_i = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, byte param6, int param7) {
        try {
            ((fj) this).field_f = param7;
            if (param6 != -92) {
                field_g = -102;
            }
            ((fj) this).field_l = param0;
            ((fj) this).field_h = param2;
            ((fj) this).field_j = param3;
            ((fj) this).field_o = param5;
            ((fj) this).field_k = param4;
            ((fj) this).field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    fj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"Normal", "Poison", "Stun", "Protect", "HP down", "Speed down", "Attack down", "Special attack down", "Immobilise", "Disarm", "Fatigue", "Ignoring orders", "Strong poison", "Spiky", "Regen", "Knockback", "HP up", "Speed up", "Attack up", "Special attack up", "Zerk", "double duration of effects", "triple duration of effects", "pull forward", "", "", "", "", "cap speed", "sleep", "50% damage reduction", "martyr", "levitate", "invincible", "disable", "zombie", "stuck", "smitten", "speed down over time", "jellied", "fear", "reset buffs", "rage", "", "", "knockback2", "knockback3", "push aside", "switch", "create pit", "create block", "confuse", "panic"};
        field_g = 2;
    }
}
