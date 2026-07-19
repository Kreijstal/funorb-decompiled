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
        if (param0) {
            nsa.a(false);
        }
    }

    final nsa a(int param0) {
        if (param0 != -2707) {
          this.field_j = 95;
          return new nsa(this.field_k, this.field_m, this.field_g, this.field_b, this.field_a, this.field_j);
        } else {
          return new nsa(this.field_k, this.field_m, this.field_g, this.field_b, this.field_a, this.field_j);
        }
    }

    final void a(nsa param0, byte param1) {
        try {
            this.field_g = param0.field_g;
            this.field_k = param0.field_k;
            this.field_m = param0.field_m;
            int var3_int = 44 % ((64 - param1) / 55);
            this.field_j = param0.field_j;
            this.field_a = param0.field_a;
            this.field_b = param0.field_b;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nsa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    nsa(int param0) {
        this.field_m = 128;
        this.field_g = 128;
        this.field_k = param0;
    }

    private nsa(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_m = 128;
        this.field_g = 128;
        this.field_a = param4;
        this.field_k = param0;
        this.field_m = param1;
        this.field_b = param3;
        this.field_j = param5;
        this.field_g = param2;
    }

    static {
        field_d = 500;
        field_f = "Points";
    }
}
