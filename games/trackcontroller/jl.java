/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    private int[] field_i;
    private int field_d;
    int field_g;
    int field_k;
    private int field_c;
    private int field_b;
    int field_a;
    private int[] field_j;
    private int field_e;
    private int field_f;
    private int field_h;

    final void a() {
        ((jl) this).field_b = 0;
        ((jl) this).field_e = 0;
        ((jl) this).field_h = 0;
        ((jl) this).field_c = 0;
        ((jl) this).field_d = 0;
    }

    final int a(int param0) {
        if (((jl) this).field_d >= ((jl) this).field_b) {
            int fieldTemp$0 = ((jl) this).field_e;
            ((jl) this).field_e = ((jl) this).field_e + 1;
            ((jl) this).field_c = ((jl) this).field_j[fieldTemp$0] << 15;
            if (((jl) this).field_e >= ((jl) this).field_f) {
                ((jl) this).field_e = ((jl) this).field_f - 1;
            }
            ((jl) this).field_b = (int)((double)((jl) this).field_i[((jl) this).field_e] / 65536.0 * (double)param0);
            if (((jl) this).field_b > ((jl) this).field_d) {
                ((jl) this).field_h = ((((jl) this).field_j[((jl) this).field_e] << 15) - ((jl) this).field_c) / (((jl) this).field_b - ((jl) this).field_d);
            }
        }
        ((jl) this).field_c = ((jl) this).field_c + ((jl) this).field_h;
        ((jl) this).field_d = ((jl) this).field_d + 1;
        return ((jl) this).field_c - ((jl) this).field_h >> 15;
    }

    final void b(be param0) {
        ((jl) this).field_k = param0.h(16383);
        ((jl) this).field_a = param0.e((byte) 113);
        ((jl) this).field_g = param0.e((byte) 113);
        ((jl) this).a(param0);
    }

    final void a(be param0) {
        int var2 = 0;
        ((jl) this).field_f = param0.h(16383);
        ((jl) this).field_i = new int[((jl) this).field_f];
        ((jl) this).field_j = new int[((jl) this).field_f];
        for (var2 = 0; var2 < ((jl) this).field_f; var2++) {
            ((jl) this).field_i[var2] = param0.d((byte) -62);
            ((jl) this).field_j[var2] = param0.d((byte) -102);
        }
    }

    jl() {
        ((jl) this).field_f = 2;
        ((jl) this).field_i = new int[2];
        ((jl) this).field_j = new int[2];
        ((jl) this).field_i[0] = 0;
        ((jl) this).field_i[1] = 65535;
        ((jl) this).field_j[0] = 0;
        ((jl) this).field_j[1] = 65535;
    }
}
