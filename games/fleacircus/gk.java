/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static String field_G;
    boolean[] field_a;
    int field_p;
    int field_j;
    int field_q;
    int field_z;
    int[] field_d;
    byte[] field_s;
    boolean[] field_F;
    byte[] field_g;
    int[][] field_h;
    byte[] field_c;
    int field_D;
    int field_o;
    int[] field_x;
    int[] field_b;
    byte[] field_B;
    static String[] field_e;
    int field_I;
    int field_k;
    static int field_A;
    int[][] field_m;
    int field_H;
    int field_E;
    int field_n;
    int field_y;
    int field_t;
    byte[] field_f;
    int[][] field_w;
    byte[][] field_v;
    int field_u;
    byte field_C;
    byte[] field_r;
    int field_l;
    int[] field_i;

    public static void a(boolean param0) {
        int discarded$0 = 0;
        field_G = null;
        field_e = null;
        if (!param0) {
            discarded$0 = gk.a(-115, true, 120);
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        int discarded$2 = 0;
        int var3 = 0;
        if (!param1) {
          discarded$2 = gk.a(-119, true, -99);
          var3 = param0 - 1 & param2 >> 1223197663;
          return (param2 + (param2 >>> -2079428609)) % param0 + var3;
        } else {
          var3 = param0 - 1 & param2 >> 1223197663;
          return (param2 + (param2 >>> -2079428609)) % param0 + var3;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        id.field_h[oe.field_a] = param3;
        uf.field_e[oe.field_a] = param0;
        ci.field_c[oe.field_a] = param4;
        fg.field_u[oe.field_a] = param2;
        ok.field_s[oe.field_a] = 0;
        oe.field_a = oe.field_a + 1;
        if (param1 <= 122) {
            field_G = (String) null;
        }
    }

    final static String a(int param0) {
        if (ib.field_k < 2) {
            return cl.field_a;
        }
        if (!(il.field_a == null)) {
            if (!(il.field_a.b((byte) -98))) {
                return sg.field_a;
            }
            return mk.field_a;
        }
        if (!(rl.field_d.b((byte) -117))) {
            return bf.field_f;
        }
        if (!rl.field_d.a("commonui", -114)) {
            return li.field_e + " - " + rl.field_d.a(param0 + 1851, "commonui") + "%";
        }
        if (param0 != -1917) {
            return (String) null;
        }
        if (!oa.field_l.b((byte) -100)) {
            return de.field_j;
        }
        if (!oa.field_l.a("commonui", param0 + 1793)) {
            return rg.field_q + " - " + oa.field_l.a(param0 ^ 1851, "commonui") + "%";
        }
        if (!kc.field_d.b((byte) -108)) {
            return li.field_h;
        }
        if (!(kc.field_d.a(-75))) {
            return ob.field_b + " - " + kc.field_d.a((byte) -43) + "%";
        }
        return ja.field_L;
    }

    gk() {
        this.field_s = new byte[256];
        this.field_p = 0;
        this.field_d = new int[257];
        this.field_B = new byte[18002];
        this.field_a = new boolean[16];
        this.field_w = new int[6][258];
        this.field_F = new boolean[256];
        this.field_g = new byte[18002];
        this.field_x = new int[6];
        this.field_b = new int[16];
        this.field_m = new int[6][258];
        this.field_h = new int[6][258];
        this.field_f = new byte[4096];
        this.field_v = new byte[6][258];
        this.field_i = new int[256];
        this.field_u = 0;
    }

    static {
        field_e = new String[]{"Showing by rating", "Showing by win percentage"};
        field_G = "Waiting for levels";
    }
}
