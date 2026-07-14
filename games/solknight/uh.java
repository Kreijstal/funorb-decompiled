/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static o[] field_l;
    int field_E;
    short field_F;
    int[] field_M;
    static String field_r;
    short[] field_s;
    int field_Q;
    int[] field_h;
    int[] field_u;
    short[] field_n;
    byte field_j;
    int[] field_i;
    short field_y;
    short[] field_J;
    short[] field_B;
    short[] field_e;
    static String field_P;
    short field_b;
    int field_G;
    int field_m;
    short[] field_D;
    int[] field_I;
    short[] field_K;
    int[] field_x;
    private boolean field_f;
    short[] field_A;
    int field_t;
    short[] field_a;
    int[] field_p;
    short[] field_w;
    byte[] field_k;
    int field_N;
    short[] field_z;
    short[] field_v;
    short[] field_q;
    short[] field_o;
    short[] field_g;
    int[] field_L;
    short[] field_c;
    short[] field_C;
    int[] field_O;
    short[] field_H;
    static int field_d;

    private final void a(boolean param0) {
        ((uh) this).field_f = param0 ? true : false;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        if (!((uh) this).field_f) {
          ((uh) this).field_f = true;
          var2 = param0;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (((uh) this).field_y <= var8) {
              ((uh) this).field_Q = var5;
              ((uh) this).field_t = var3;
              ((uh) this).field_m = var6;
              ((uh) this).field_N = var7;
              ((uh) this).field_E = var2;
              ((uh) this).field_G = var4;
              return;
            } else {
              L1: {
                var9 = ((uh) this).field_n[var8];
                var10 = ((uh) this).field_q[var8];
                if (var10 < var3) {
                  var3 = var10;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var11 = ((uh) this).field_z[var8];
                if (var6 >= var10) {
                  break L2;
                } else {
                  var6 = var10;
                  break L2;
                }
              }
              L3: {
                if (var9 <= var5) {
                  break L3;
                } else {
                  var5 = var9;
                  break L3;
                }
              }
              L4: {
                if (var9 >= var2) {
                  break L4;
                } else {
                  var2 = var9;
                  break L4;
                }
              }
              L5: {
                if (var7 < var11) {
                  var7 = var11;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -18662) {
            field_d = -118;
        }
        field_l = null;
        field_r = null;
        field_P = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = SolKnight.field_L ? 1 : 0;
        if (param0 != 8292) {
            this.a(false);
        }
        for (var6 = 0; var6 < ((uh) this).field_y; var6++) {
            ((uh) this).field_n[var6] = (short)(param2 * ((uh) this).field_n[var6] / param1);
            ((uh) this).field_q[var6] = (short)(param4 * ((uh) this).field_q[var6] / param1);
            ((uh) this).field_z[var6] = (short)(param3 * ((uh) this).field_z[var6] / param1);
        }
        this.a(false);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = SolKnight.field_L ? 1 : 0;
        int var5 = 0;
        if (param1 != -32768) {
            ((uh) this).a(56, -36, 64, 112, -90);
        }
        while (((uh) this).field_y > var5) {
            ((uh) this).field_n[var5] = (short)(((uh) this).field_n[var5] + param0);
            ((uh) this).field_q[var5] = (short)(((uh) this).field_q[var5] + param2);
            ((uh) this).field_z[var5] = (short)(((uh) this).field_z[var5] + param3);
            var5++;
        }
        this.a(false);
    }

    uh() {
        ((uh) this).field_f = false;
        ((uh) this).field_j = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "This password contains repeated characters, and would be easy to guess";
    }
}
