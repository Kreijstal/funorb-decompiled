/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    int field_G;
    int field_m;
    int field_c;
    int field_J;
    byte[] field_z;
    int[][] field_r;
    int field_p;
    int field_u;
    int field_i;
    int[] field_k;
    static String field_n;
    int[] field_x;
    int field_t;
    byte[] field_A;
    static e field_o;
    int field_F;
    int field_E;
    byte[] field_I;
    byte field_B;
    int field_d;
    int field_e;
    byte[] field_C;
    int[] field_g;
    static String field_b;
    boolean[] field_y;
    byte[] field_D;
    int[] field_s;
    int field_h;
    int field_v;
    int[][] field_l;
    byte[] field_H;
    byte[][] field_w;
    boolean[] field_a;
    int field_f;
    static String field_j;
    int[][] field_q;

    final static void a(byte param0) {
        L0: {
          if (vg.field_Z != null) {
            vg.field_Z.h((byte) -3);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (ui.field_c != null) {
            ui.field_c.i((byte) 127);
            break L1;
          } else {
            break L1;
          }
        }
        ei.h((byte) -107);
        if (param0 >= -99) {
          eb.a((byte) -85);
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 <= 12) {
            return;
        }
        field_b = null;
        field_o = null;
        field_j = null;
        field_n = null;
    }

    eb() {
        ((eb) this).field_p = 0;
        ((eb) this).field_m = 0;
        ((eb) this).field_C = new byte[256];
        ((eb) this).field_I = new byte[18002];
        ((eb) this).field_g = new int[6];
        ((eb) this).field_k = new int[256];
        ((eb) this).field_r = new int[6][258];
        ((eb) this).field_s = new int[16];
        ((eb) this).field_x = new int[257];
        ((eb) this).field_y = new boolean[256];
        ((eb) this).field_H = new byte[4096];
        ((eb) this).field_D = new byte[18002];
        ((eb) this).field_a = new boolean[16];
        ((eb) this).field_w = new byte[6][258];
        ((eb) this).field_l = new int[6][258];
        ((eb) this).field_q = new int[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new e(7, 0, 1, 1);
        field_b = null;
        field_j = "The alien inhabitants have some highly advanced#technology - but unlike us, they have yet#to master long-distance space travel.";
    }
}
