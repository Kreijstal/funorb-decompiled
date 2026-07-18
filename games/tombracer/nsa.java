/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nsa {
    int field_a;
    int field_h;
    int field_l;
    static int field_d;
    int field_m;
    int field_b;
    int field_c;
    int field_e;
    int field_j;
    int field_g;
    int field_k;
    static String field_f;
    static iv field_i;
    int field_n;

    public static void a(boolean param0) {
        field_f = null;
        field_i = null;
    }

    final nsa a(int param0) {
        if (param0 != -2707) {
          ((nsa) this).field_j = 95;
          return new nsa(((nsa) this).field_k, ((nsa) this).field_m, ((nsa) this).field_g, ((nsa) this).field_b, ((nsa) this).field_a, ((nsa) this).field_j);
        } else {
          return new nsa(((nsa) this).field_k, ((nsa) this).field_m, ((nsa) this).field_g, ((nsa) this).field_b, ((nsa) this).field_a, ((nsa) this).field_j);
        }
    }

    final void a(nsa param0, byte param1) {
        try {
            ((nsa) this).field_g = param0.field_g;
            ((nsa) this).field_k = param0.field_k;
            ((nsa) this).field_m = param0.field_m;
            int var3_int = 44 % ((64 - param1) / 55);
            ((nsa) this).field_j = param0.field_j;
            ((nsa) this).field_a = param0.field_a;
            ((nsa) this).field_b = param0.field_b;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nsa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    nsa(int param0) {
        ((nsa) this).field_m = 128;
        ((nsa) this).field_g = 128;
        ((nsa) this).field_k = param0;
    }

    private nsa(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((nsa) this).field_m = 128;
        ((nsa) this).field_g = 128;
        ((nsa) this).field_a = param4;
        ((nsa) this).field_k = param0;
        ((nsa) this).field_m = param1;
        ((nsa) this).field_b = param3;
        ((nsa) this).field_j = param5;
        ((nsa) this).field_g = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 500;
        field_f = "Points";
    }
}
