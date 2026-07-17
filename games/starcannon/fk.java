/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    int field_s;
    int[][] field_d;
    byte[] field_m;
    int field_x;
    static String field_v;
    int[] field_F;
    int field_t;
    int field_z;
    int[][] field_p;
    int field_l;
    static int field_a;
    int field_j;
    int field_E;
    int field_c;
    int[] field_u;
    boolean[] field_y;
    byte[] field_I;
    static ue field_k;
    byte[] field_D;
    int[] field_n;
    int field_g;
    byte[] field_G;
    byte[][] field_B;
    byte[] field_q;
    byte field_H;
    byte[] field_f;
    int field_o;
    int field_i;
    boolean[] field_C;
    int[] field_e;
    int field_r;
    int[][] field_w;
    int field_b;
    int field_A;
    int field_h;

    final static int a(int param0, int param1, byte param2) {
        int var3 = param0 >> 16;
        int var4 = param0 & 65535;
        int var5 = param1 >> 16;
        int var6 = 65535 & param1;
        return (var4 * var6 >> 16) + (var4 * var5 + param1 * var3);
    }

    public static void a(int param0) {
        field_k = null;
        field_v = null;
        if (param0 != -4918) {
            field_v = null;
        }
    }

    final static boolean a(boolean param0) {
        L0: {
          if (il.field_g != -1) {
            break L0;
          } else {
            if (!ag.a(126, 1)) {
              return false;
            } else {
              il.field_g = se.field_p.j(7909);
              se.field_p.field_g = 0;
              break L0;
            }
          }
        }
        if (-2 == il.field_g) {
          if (!ag.a(125, 2)) {
            return false;
          } else {
            il.field_g = se.field_p.i(-1174051992);
            se.field_p.field_g = 0;
            return ag.a(125, il.field_g);
          }
        } else {
          return ag.a(125, il.field_g);
        }
    }

    fk() {
        ((fk) this).field_p = new int[6][258];
        ((fk) this).field_I = new byte[256];
        ((fk) this).field_u = new int[16];
        ((fk) this).field_F = new int[6];
        ((fk) this).field_j = 0;
        ((fk) this).field_C = new boolean[256];
        ((fk) this).field_f = new byte[18002];
        ((fk) this).field_n = new int[257];
        ((fk) this).field_B = new byte[6][258];
        ((fk) this).field_D = new byte[4096];
        ((fk) this).field_r = 0;
        ((fk) this).field_e = new int[256];
        ((fk) this).field_q = new byte[18002];
        ((fk) this).field_d = new int[6][258];
        ((fk) this).field_y = new boolean[16];
        ((fk) this).field_w = new int[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Go Back";
        field_a = 0;
    }
}
