/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends hf {
    gd field_i;
    static int field_p;
    int field_y;
    int field_l;
    int field_k;
    int field_w;
    int field_q;
    static int field_f;
    int field_g;
    vl field_z;
    int field_E;
    int field_s;
    kl field_u;
    int field_m;
    int field_t;
    int field_h;
    static int field_C;
    int field_B;
    int field_r;
    int field_o;
    int field_j;
    int field_D;
    int field_n;
    static int field_v;
    t field_x;

    final static void a(byte param0) {
        int var1 = 0;
        var1 = -125 / ((param0 - 56) / 54);
        jk.a((byte) -90);
        if (null == f.field_kb) {
          kj.c(-11099);
          hc.b(true);
          dk.a((byte) -121);
          if (vh.g(-88)) {
            fj.field_q.a(1, (byte) -27);
            cm.a(-1, 0);
            jl.a((byte) -126);
            return;
          } else {
            jl.a((byte) -126);
            return;
          }
        } else {
          nb.a(-2, f.field_kb);
          kj.c(-11099);
          hc.b(true);
          dk.a((byte) -121);
          if (!vh.g(-88)) {
            jl.a((byte) -126);
            return;
          } else {
            fj.field_q.a(1, (byte) -27);
            cm.a(-1, 0);
            jl.a((byte) -126);
            return;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        if (param1) {
            field_C = 99;
            fe.field_d = param0;
            return;
        }
        fe.field_d = param0;
    }

    final void b(int param0) {
        ((pc) this).field_u = null;
        ((pc) this).field_x = null;
        if (param0 != -1) {
          field_f = 41;
          ((pc) this).field_i = null;
          ((pc) this).field_z = null;
          return;
        } else {
          ((pc) this).field_i = null;
          ((pc) this).field_z = null;
          return;
        }
    }

    pc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_f = -1;
    }
}
