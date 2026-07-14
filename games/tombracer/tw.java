/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tw {
    int field_B;
    int field_M;
    private sfa field_z;
    static String field_g;
    pna field_u;
    boolean field_h;
    static byte[][] field_f;
    int field_L;
    Runnable field_b;
    int field_D;
    boolean field_J;
    boolean field_n;
    int[] field_p;
    ww field_e;
    int[] field_a;
    int[] field_l;
    ww field_t;
    int field_o;
    float[] field_d;
    int[] field_s;
    int[] field_G;
    ww field_r;
    int[] field_k;
    int[] field_c;
    ww field_K;
    iua field_v;
    ww field_C;
    ww field_E;
    int[] field_I;
    int[] field_A;
    int[] field_i;
    int[] field_j;
    int field_y;
    int field_H;
    ww field_F;
    ww field_x;
    ww field_w;
    ww field_m;
    int[] field_q;

    final static hja[] a(byte param0, String param1, String param2, cn param3) {
        int var4 = param3.b(param2, -7768);
        int var6 = 86 % ((param0 - 78) / 45);
        int var5 = param3.a(true, param1, var4);
        return rea.a(param3, var4, var5, (byte) 42);
    }

    final void a(Runnable param0, byte param1) {
        ((tw) this).field_b = param0;
        if (param1 <= 25) {
            ((tw) this).field_B = 90;
        }
    }

    final void a(int param0) {
        ((tw) this).field_v = new iua(((tw) this).field_z, (tw) this);
        int var2 = -88 % ((param0 - 32) / 60);
    }

    public static void b(int param0) {
        if (param0 <= 111) {
            field_g = null;
            field_g = null;
            field_f = null;
            return;
        }
        field_g = null;
        field_f = null;
    }

    tw(sfa param0) {
        int var2 = 0;
        ((tw) this).field_M = 0;
        ((tw) this).field_D = 0;
        ((tw) this).field_L = 0;
        ((tw) this).field_h = false;
        ((tw) this).field_n = true;
        ((tw) this).field_u = new pna();
        ((tw) this).field_p = new int[ww.field_q];
        ((tw) this).field_d = new float[2];
        ((tw) this).field_G = new int[ww.field_q];
        ((tw) this).field_I = new int[10];
        ((tw) this).field_a = new int[ww.field_q];
        ((tw) this).field_c = new int[ww.field_q];
        ((tw) this).field_A = new int[ww.field_q];
        ((tw) this).field_q = new int[10];
        ((tw) this).field_s = new int[10];
        ((tw) this).field_k = new int[ww.field_q];
        ((tw) this).field_i = new int[10];
        ((tw) this).field_j = new int[ww.field_q];
        ((tw) this).field_z = param0;
        ((tw) this).field_B = -255 + ((tw) this).field_z.field_U;
        ((tw) this).field_v = new iua(param0, (tw) this);
        ((tw) this).field_C = new ww(((tw) this).field_z);
        ((tw) this).field_t = new ww(((tw) this).field_z);
        ((tw) this).field_m = new ww(((tw) this).field_z);
        ((tw) this).field_K = new ww(((tw) this).field_z);
        ((tw) this).field_x = new ww(((tw) this).field_z);
        ((tw) this).field_E = new ww(((tw) this).field_z);
        ((tw) this).field_w = new ww(((tw) this).field_z);
        ((tw) this).field_F = new ww(((tw) this).field_z);
        ((tw) this).field_e = new ww(((tw) this).field_z);
        ((tw) this).field_r = new ww(((tw) this).field_z);
        ((tw) this).field_l = new int[ww.field_G];
        var2 = 0;
        L0: while (true) {
          if (ww.field_G <= var2) {
          } else {
            ((tw) this).field_l[var2] = -1;
            var2++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Staff impersonation";
        field_f = new byte[250][];
    }
}
