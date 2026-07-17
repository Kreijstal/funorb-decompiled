/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    int field_i;
    short[] field_s;
    static eg field_l;
    int[] field_g;
    int field_R;
    short[] field_w;
    int[] field_y;
    int[] field_j;
    short[] field_D;
    static ll field_M;
    int[] field_p;
    short[] field_b;
    short[] field_S;
    short[] field_U;
    short field_f;
    int[] field_E;
    short[] field_z;
    short[] field_L;
    short[] field_q;
    short[] field_e;
    short[] field_T;
    int field_k;
    short[] field_O;
    byte field_F;
    short[] field_Q;
    short[] field_u;
    short[] field_h;
    static String field_t;
    private boolean field_m;
    byte[] field_H;
    int[] field_o;
    static int[] field_c;
    static long field_K;
    int field_v;
    int[] field_x;
    int field_P;
    short[] field_r;
    short[] field_B;
    short field_A;
    int[] field_a;
    static String field_n;
    short field_G;
    short[] field_d;
    int[] field_J;
    int field_N;

    final static void a() {
        int discarded$5 = 1;
        if (!(td.e())) {
            return;
        }
        if (vn.field_d == 71) {
            if (!(mj.field_p <= 0)) {
                df.a((byte) 65, mj.field_p - 1);
            }
        }
        if (vn.field_d == 72) {
            if (mj.field_p < 7) {
                df.a((byte) -125, mj.field_p + 1);
            }
        }
        if (vn.field_d == 33) {
            if (!(0 >= ed.field_Cb)) {
                ed.field_Cb = ed.field_Cb - 1;
            }
        }
        if (vn.field_d == 34) {
            if (!(ed.field_Cb >= 8)) {
                ed.field_Cb = ed.field_Cb + 1;
            }
        }
        if (!(vn.field_d != 35)) {
            ed.field_Cb = 6;
        }
        int var1 = -36;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        int var5 = -13 % ((-60 - param1) / 62);
        for (var6 = 0; var6 < ((vg) this).field_f; var6++) {
            ((vg) this).field_b[var6] = (short)(((vg) this).field_b[var6] + param3);
            ((vg) this).field_B[var6] = (short)(((vg) this).field_B[var6] + param0);
            ((vg) this).field_L[var6] = (short)(((vg) this).field_L[var6] + param2);
        }
        this.a(false);
    }

    public static void a(int param0) {
        field_M = null;
        field_t = null;
        field_c = null;
        field_l = null;
        field_n = null;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    private final void a(boolean param0) {
        ((vg) this).field_m = false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        for (var6 = param1; ((vg) this).field_f > var6; var6++) {
            ((vg) this).field_b[var6] = (short)(param4 * ((vg) this).field_b[var6] / param2);
            ((vg) this).field_B[var6] = (short)(param0 * ((vg) this).field_B[var6] / param2);
            ((vg) this).field_L[var6] = (short)(param3 * ((vg) this).field_L[var6] / param2);
        }
        this.a(false);
    }

    final void b(byte param0) {
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
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        if (((vg) this).field_m) {
          return;
        } else {
          ((vg) this).field_m = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= ((vg) this).field_f) {
              if (param0 == 62) {
                ((vg) this).field_R = var3;
                ((vg) this).field_v = var6;
                ((vg) this).field_P = var4;
                ((vg) this).field_k = var2;
                ((vg) this).field_N = var7;
                ((vg) this).field_i = var5;
                return;
              } else {
                return;
              }
            } else {
              L1: {
                var9 = ((vg) this).field_b[var8];
                var10 = ((vg) this).field_B[var8];
                if (var9 <= var5) {
                  break L1;
                } else {
                  var5 = var9;
                  break L1;
                }
              }
              L2: {
                var11 = ((vg) this).field_L[var8];
                if (var2 > var9) {
                  var2 = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var3 <= var10) {
                  break L3;
                } else {
                  var3 = var10;
                  break L3;
                }
              }
              L4: {
                if (var6 < var10) {
                  var6 = var10;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var11 < var4) {
                  var4 = var11;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var11 > var7) {
                var7 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    vg() {
        ((vg) this).field_m = false;
        ((vg) this).field_F = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Try changing the '<%0>' setting.";
        field_c = new int[]{39, 40, 41};
        field_n = "This item can be purchased with Orb<nbsp>Coins in the Orb Downloads section of the website.";
    }
}
